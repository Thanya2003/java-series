package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class sumAtk {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static int KthSum(TreeNode root, int k){
        if(root==null){
            return 0;
        }
        Queue <TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            int levelsum=0;
        for(int i=0; i<size; i++){
            TreeNode curr= q.poll();
            if(level==k){
                levelsum+=curr.val;
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        if(level==k){
            return levelsum;
        }
          
        level++;
    }
    return 0;
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        int k=2;
        int sum=KthSum(root, k);
        System.out.println("Sum of the "+k+" level of the node is "+sum);
        
    }
}
