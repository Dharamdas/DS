package linklist;

public class CloneLinkedListPointingtoNextAndRandomNode {

    Node orignalList;
    Node clonedList;
    int size;

    CloneLinkedListPointingtoNextAndRandomNode(){}


    public void addNode(Object data)
    {

        if(orignalList==null)  // adding first node
        {
            orignalList=createNode(data);
            size++;
        }else{
            Node tmp =orignalList;
            while(tmp.next!=null)
            {
                tmp=tmp.next;
            }
            tmp.next=createNode(data);
            size++;
        }
    }

    public void cloneListAndPointToRandomNodes(){

        Node orignalNode = orignalList;

        while (orignalNode!=null)
        {
           if(clonedList==null)
           {
               clonedList = createNode(orignalNode.data);

           }else{

                Node cloneNode=clonedList;
                while(cloneNode.next!=null)
                {
                    cloneNode=cloneNode.next;
                }
                Node newNode=createNode(orignalNode.data);
                cloneNode.next= newNode;
                cloneNode.random=assignPointerToRandomNode(orignalList,newNode);
           }
            orignalNode = orignalNode.next;
        }

    }

    public Node assignPointerToRandomNode(Node node,Node newNode){

        double nodeNo = getRandomValue();
        for(int i=1;i<=nodeNo || node.next!=null;i++)
        {
            node=node.next;
        }
        newNode.random=node;
        return newNode;
    }

    public double getRandomValue(){
        return Math.random()*size;
    }

    public void printList(){
        Node node = orignalList;
        System.out.println();
        while(node!=null)
        {
            System.out.print(" "+node.data);
            node=node.next;
        }
    }

    public void printCloneList(){
        Node node = clonedList;
        System.out.println();
        while(node!=null)
        {
            System.out.println(" Next-> "+node.data+" random -> "+node.random.data);
            node=node.next;
        }
    }

    public Node createNode(Object data)
    {
        Node node = new Node(data);
        return node;
    }

}


class Node{
    Object data;
    Node next,random;

    Node(Object data)
    {
        this.data=data;
        this.next=null;
        this.random=null;
    }
}
