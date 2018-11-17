package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverser {

    //Time complexcity: O(N)
    //Time Compexcity: O(1) -BEST CASE, O(n) for perfect Binarny Tree
    public void levelOrderTraversal(TreeNode rootNode){

        if(rootNode==null)
            return;
        Queue<TreeNode> q = new LinkedList();
        q.add(rootNode);
        while (!q.isEmpty()){
            TreeNode temp = q.remove();
            System.out.print(" "+temp.getData());
            if(temp.getLeft()!=null)
                q.add(temp.getLeft());
            if(temp.getRight()!=null)
                q.add(temp.getRight());
        }

    }
}
