package Tree;

import java.util.ArrayList;

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
    public static boolean search(TreeNode root, int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
    public static TreeNode delete(TreeNode root, int val){
        if(root.data>val){
            root.left= delete(root.left, val);
        }
        else if(root.data<val){
             root.right= delete(root.right, val);
        }
        else{
            // case1
        if(root.left==null && root.right==null){
            return null;
        }
        // case 2
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }

        // case 3
        TreeNode IS=InorderScuccessor(root.right);
        root.data=IS.data;
        root.right= delete(root.right, IS.data);
    }
    return root;
    }
    public static TreeNode InorderScuccessor(TreeNode root){
       while(root.left!=null){
        root =root.left;
       }
       return root;
    }
    public static void PrintInRange(TreeNode root, int x, int y){
        if(root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            PrintInRange(root.left, x, y);
            System.out.print(root.data+" ");
            PrintInRange(root.right, x, y);
        }
        else if(root.data>=y){
        PrintInRange(root.left, x, y);
        // System.out.print(root.data+" ");
        }
        else{
            PrintInRange(root.right, x, y);
            // System.out.print(root.data+" ");
        }
    }
    public static void PrintRoot2leaf(TreeNode root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }else{
            PrintRoot2leaf(root.left, path);
            PrintRoot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size()-1;i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] values={5, 1, 2, 3, 4, 6, 10, 7, 11, 9};
        TreeNode root=null;
        for(int i=0; i<values.length; i++){
            root=insert(root, values[i]);
        }
        Inorder(root);
        System.out.println();
        // root=delete(root, 10);
        // Inorder(root);
        PrintInRange(root, 5, 9);
        System.out.println();
        PrintRoot2leaf(root, new ArrayList<>());
    }
}
