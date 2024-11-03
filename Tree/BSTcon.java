package Tree;

public class BSTcon {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }
    public static TreeNode insert(TreeNode root, int val ){
        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(root.data>val){
           root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void Inorder(TreeNode root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    pu
    public static void main(String[] args) {
        int[] values={5,1, 2, 3, 4, 6, 7};
        TreeNode root=null;
        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }
        Inorder(root);
        System.out.println();
    }
}
