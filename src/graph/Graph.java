package graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Neighbor {
    public int vertexNum;
    public Neighbor next;
    public Neighbor(int vertexNum,Neighbor neighbor){
        this.vertexNum=vertexNum;
        this.next=neighbor;
    }
}
class Vertext{
    public String name;
    public Neighbor adjList;
    public Vertext(String name,Neighbor neighbor)
    {
        this.name=name;
        this.adjList=neighbor;
    }
}

public class Graph{

    Vertext adjList[];

    public Graph(String file)throws FileNotFoundException{

        Scanner sc= new Scanner(new File("/Users/z001yb4/Documents/git-Dharamdas/DS/src/graph/"+file));
        String graphType=sc.next();
        boolean undirected=true;

        if(graphType.equals("directed"))
            undirected=false;

        //Reading Vertext length
        adjList=new Vertext[sc.nextInt()];
        System.out.println("Vertex Length: "+adjList.length);

        //Reading Vertexs
        for(int i=0;i<adjList.length;i++)
        {
            adjList[i]= new Vertext(sc.next(),null);
            System.out.println(adjList[i].name);
        }

        //Read Edges
        while (sc.hasNext())
        {
            int v1=indexForVertexName(sc.next());
            int v2=indexForVertexName(sc.next());
            System.out.println("V1 - "+v1+", V2 - "+v2);
            //add V1 & V2 infront of adjacency list

            adjList[v1].adjList=new Neighbor(v2,adjList[v1].adjList);
            if(undirected){
                adjList[v2].adjList=new Neighbor(v1,adjList[v2].adjList);
            }
        }

    }

    public int indexForVertexName(String vertexname){
        for(int v=0;v<adjList.length;v++)
        {
            if(adjList[v].name.equals(vertexname))
                return v;
        }
        return -1;
    }

    public void dfs(){
        boolean visited[]=new boolean[adjList.length];
        for(int v=0;v<visited.length;v++)
        {
            if(!visited[v]){
                System.out.println("Starting At:-  "+adjList[v].name);
                dfs(v,visited);
            }
        }
    }

    private void dfs(int v,boolean[] visited)
    {
        visited[v]=true;
        System.out.println("Visiting:- "+adjList[v].name);

        for(Neighbor nbr=adjList[v].adjList;nbr!=null;nbr=nbr.next)
        {
            if(!visited[nbr.vertexNum]){
                System.out.println("\n"+adjList[v].name +" --- "+adjList[nbr.vertexNum].name);
                dfs(nbr.vertexNum,visited);
            }
        }
    }

    public void print(){
        System.out.println();

        for(int v=0;v<adjList.length;v++)
        {
            System.out.print(adjList[v].name);
           for(Neighbor nbr=adjList[v].adjList;nbr!=null;nbr=nbr.next)
           {
               System.out.println("------- "+adjList[nbr.vertexNum].name);
           }
            System.out.println();
        }
    }


    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Graph input File Name: ");
        String fileName=sc.next();
        Graph graph=new Graph(fileName);
        graph.dfs();
    }
}

