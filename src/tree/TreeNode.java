package tree;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public int getData() {
        return data;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
