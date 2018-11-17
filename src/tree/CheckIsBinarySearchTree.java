package tree;

public class CheckIsBinarySearchTree {

    //Time complexcity: O(N)
    //Time Compexcity: O(1) -BEST CASE, O(n) for perfect Binarny Tree
    public boolean isBinarySearchTree(TreeNode rootNode,int minValue,int maxValue)
    {
        if(rootNode==null)
            return true;
            if(rootNode.getData()>maxValue
                && rootNode.getData()<minValue
                && isBinarySearchTree(rootNode.getLeft(),minValue,rootNode.getData())
                && isBinarySearchTree(rootNode.getRight(),rootNode.getData(),maxValue))
            return true;
        else
            return false;
    }

    //Time complexcity: O(N2)
    //Time Compexcity: O(1) -BEST CASE, O(n) for perfect Binarny Tree
    public boolean isBinarySearchTree(TreeNode rootNode)
    {
        if(rootNode==null)
            return true;
        if(isSubTreeLesser(rootNode,rootNode.getData())
                && isSubTreeGreator(rootNode,rootNode.getData())
                && isBinarySearchTree(rootNode.getLeft())
                && isBinarySearchTree(rootNode.getRight()))
            return true;
            else
            return false;
    }

    private boolean isSubTreeLesser(TreeNode rootNode, int data)
    {
        if(rootNode==null)
            return true;
        if(rootNode.getData()<data
                && isSubTreeLesser(rootNode.getLeft(),data)
                && isSubTreeGreator(rootNode.getRight(),data))
            return true;
        else
            return false;
    }

    private boolean isSubTreeGreator(TreeNode rootNode,int data){


        if(rootNode==null)
            return true;
        if(rootNode.getData()>data
                && isSubTreeLesser(rootNode.getLeft(),data)
                && isSubTreeGreator(rootNode.getRight(),data))
            return true;
        else
            return false;
    }
}
