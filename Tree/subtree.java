package Tree;

public class subtree {
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
    public static boolean isIdentical(TreeNode root, TreeNode subtree){
        if(root==null && subtree==null){
            return true;
        }
        if(root==null || subtree==null){
            return false;
        }
        if(root.val==subtree.val){
            return isIdentical(root.left, subtree.left) && isIdentical(root.right, subtree.right);
        }
        return false;
    }
    public static boolean isSubtree(TreeNode root, TreeNode subtree){
        if(root==null){
            return false;
        }
        if(subtree==null){
            return  true;
        }
        if(root.val==subtree.val){
            if(isIdentical(root, subtree)){
                return true;
            }
        }
        return isSubtree(root.left, subtree) || isSubtree(root.right, subtree);
    }
    static int idx=-1;
    public static TreeNode buildTree(int[] nodes){
        idx++;
        if(idx>=nodes.length || nodes[idx]==-1){
            return null;
        }
        TreeNode newNode= new TreeNode(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
        

    }
    public static void main(String[] args) {
        int[] nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] subtrees={3, -1, 7, -1, -1};
        TreeNode root=buildTree(nodes);
        idx=-1;
        TreeNode subtre=buildTree(subtrees);

        System.out.println(isSubtree(root, subtre)?"Subtree Exists":"Subtree does not Exists");

    }
}
