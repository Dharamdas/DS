package gp;

public class FindPossiblePathUsing2DArray {
    public static void main(String[] args){
        int arr[][] = {
                {1,1,1,1},
                {1,0,0,1},
                {1,0,0,1},
                {1,1,1,1}};

        System.out.println(findPaths(arr,3,3,0));
    }
    public static int findPaths(int[][] arr,int m,int n,int count){

        if(0 == m && 0 == n){
            count++;
            return count;
        }
        if(n > 0 && arr[m][n-1] != 0){
            count = findPaths(arr,m,n-1,count);
        }
        if(m>0 && arr[m-1][n] != 0){
            count = findPaths(arr,m-1,n,count);
        }
        return count;
    }
}
