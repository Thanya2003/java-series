package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BT{
        static int idx=-1;
        public static Node BulidTree(int[] nodes){
            idx++;
            if(idx>=nodes.length || nodes[idx]==-1){
                return null;
            }
            Node newnode= new Node(nodes[idx]);
            newnode.left=BulidTree(nodes);
            newnode.right=BulidTree(nodes);
            return newnode;

        }
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void PostOrder(Node root){
        if(root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        if(root==null){
            return;
        }
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data+" ");
                if(currNode.left!=null){
                    q.add()
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BT tree = new BT();
        Node Root=tree.BulidTree(nodes);
        PostOrder(Root);
    }
    
}
