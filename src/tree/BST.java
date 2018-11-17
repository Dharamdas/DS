package tree;

public class BST {
    TreeNode rootTreeNode;
    public static void main(String[] args) {
        TreeNode rootTreeNode=null;
        BST bst = new BST();
        bst.insert(40);
        bst.insert(10);
        bst.insert(50);
        bst.insert(20);
        bst.insert(70);
        bst.insert(5);
        bst.insert(7);
        bst.insert(4);
        bst.insert(3);
        bst.insert(2);
        bst.insert(16);
        bst.insert(30);
        System.out.println(bst.serach(90));
        bst.PreOrderTreeTraverser();
        System.out.println();
        bst.inOrderTreeTraverser();
        System.out.println();
        bst.postOrderTreeTraverser();

        bst.levelOrderTraversal();
        System.out.println("\n Is Binary Search Tree: "+bst.isBinarySearchTree());
        bst.findMaxNode();
        bst.findMinNode();
        bst.deleteNode(10);
        bst.inOrderTreeTraverser();
    }

    public void findMinNode(){
        TreeNode temp=minNode(rootTreeNode);
        System.out.println("Min Node From Root: "+temp.getData());
    }
    public void findMaxNode(){
       TreeNode temp= maxNode(rootTreeNode);
        System.out.println("Max Node From Root: "+temp.getData());
    }

    public void deleteNode(int data){
        deleteRec(rootTreeNode,data);
    }

    private TreeNode deleteRec(TreeNode rootTreeNode,int data){

        if(rootTreeNode==null)
            return rootTreeNode;
        if(data<rootTreeNode.getData())
           rootTreeNode.setLeft(deleteRec(rootTreeNode.getLeft(),data));
        else if(data>rootTreeNode.getData())
           rootTreeNode.setRight(deleteRec(rootTreeNode.getRight(),data));
        else // Found Data now ready to delete
        {
            // Case-1, No Child
            if(rootTreeNode.getLeft()==null && rootTreeNode.getRight()==null)
                rootTreeNode=null;
            else if(rootTreeNode.getLeft()==null) // only if Right child
            {
                TreeNode temp=rootTreeNode;
                rootTreeNode=temp.getRight();
                temp=null;
            }else if(rootTreeNode.getRight()==null) // only if Left Child
            {
                TreeNode temp=rootTreeNode;
                rootTreeNode=temp.getLeft();
                temp=null;

            }else // if Two child
                {
                    System.out.println("Its Two Case");
                TreeNode temp=minNode(rootTreeNode.getRight());
                    System.out.println("Min: "+temp.getData());
                rootTreeNode.setData(temp.getData());
                rootTreeNode.setRight(deleteRec(rootTreeNode.getRight(),temp.getData()));

            }

        }
        return rootTreeNode;
    }
    private TreeNode maxNode(TreeNode rootTreeNode){

        if(rootTreeNode.getRight()==null)
        {
            return rootTreeNode;
        }
        return maxNode(rootTreeNode.getRight());
    }
    private TreeNode minNode(TreeNode rootTreeNode){

        if(rootTreeNode.getLeft()==null)
        {
            return rootTreeNode;
        }
       return minNode(rootTreeNode.getLeft());

    }

    private boolean isBinarySearchTree(){
        CheckIsBinarySearchTree obj = new CheckIsBinarySearchTree();
        return obj.isBinarySearchTree(rootTreeNode,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private void levelOrderTraversal(){
        LevelOrderTraverser lot = new LevelOrderTraverser();
        System.out.println("Level Order Traverser:--");
        lot.levelOrderTraversal(rootTreeNode);
    }

    public void insert(int data)
    {
        rootTreeNode = insertRecursion(rootTreeNode,data);
    }
    private TreeNode insertRecursion(TreeNode rootTreeNode, int data){
               if(rootTreeNode==null)
               {
                   rootTreeNode=createNewNode(data);
               }else if(data < rootTreeNode.getData())
                   rootTreeNode.setLeft(insertRecursion(rootTreeNode.getLeft(),data));
               else
                   rootTreeNode.setRight(insertRecursion(rootTreeNode.getRight(),data));

               return rootTreeNode;
    }

    public boolean serach(int data){
        TreeNode tempTreeNode=rootTreeNode;
        return serachRecursion(tempTreeNode,data);
    }

    private boolean serachRecursion(TreeNode tempTreeNode,int data)
    {
        if(tempTreeNode==null)
            return false;
        else if(tempTreeNode.getData()==data)
            return true;
        else if(data<tempTreeNode.getData())
            return serachRecursion(tempTreeNode.getLeft(),data);
        else
            return serachRecursion(tempTreeNode.getRight(),data);

    }

    private TreeNode createNewNode(int data)
    {
        return new TreeNode(data);
    }



    public void PreOrderTreeTraverser(){
        preOrderTraverse(rootTreeNode);
    }

    private void preOrderTraverse(TreeNode root){
        if(root==null)
            return;
        System.out.print(" "+root.getData());
        preOrderTraverse(root.getLeft());
        preOrderTraverse(root.getRight());
    }

    public void inOrderTreeTraverser(){
        inOrderTraverse(rootTreeNode);
    }
    private void inOrderTraverse(TreeNode root){

        if(root==null)
            return;
        inOrderTraverse(root.getLeft());
        System.out.print(" "+root.getData());
        inOrderTraverse(root.getRight());
    }
    public void postOrderTreeTraverser(){
        postOrderTraverse(rootTreeNode);
    }
    private void postOrderTraverse(TreeNode root){

        if(root==null)
            return;
        postOrderTraverse(root.getLeft());
        postOrderTraverse(root.getRight());
        System.out.print(" "+root.getData());
    }


}
