package Tree;

public class countTree {
    static class Node{
        int data;
         Node left;
         Node right;
                Node(int data) {
                this.data=data;
                this.left=null;
                this.right=null;
                }    
            }
            static class Bt{
                static int idx=-1; 
                public static Node buildingTree(int[] nodes){
                    idx++;
                    if(idx>=nodes.length || nodes[idx]==-1){
                        return null;
                    }
                    Node newnode= new Node(nodes[idx]);
                    newnode.left=buildingTree(nodes);
                    newnode.right=buildingTree(nodes);
                    return  newnode;
                }
            }
                public static int counNode(Node root){
                    if(root==null){
                        return 0;
                    }
                    int leftNode=counNode(root.left);
                    int rightNode=counNode(root.right);
                    return leftNode+rightNode+1;
        }
        public static int sunNode(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=sunNode(root.left);
            int rightsum= sunNode(root.right);
            return leftsum+rightsum+root.data;
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int leftheight=height(root.left);
            int rightheight=height(root.right);

            return Math.max(leftheight, rightheight)+1;
        }
        public static int daimeter(Node root){
            if(root==null){
                return 0;
            }
            int dai1=daimeter(root.left);
            int dai2=daimeter(root.right);
            int dai3=height(root.left)+height(root.right)+1;

            return Math.max(dai3, Math.max(dai1, dai2));
        }
      static  class TreeNode{
            int dai;
            int ht;
            TreeNode(int dai, int ht){
                this.dai=dai;
                this.ht=ht;
            }
        }
        public static TreeNode diameter1(Node root){
            if(root==null){
                return new TreeNode(0, 0);
            }
            TreeNode left=diameter1(root.left);
            TreeNode right=diameter1(root.right);
            int myheght=Math.max(left.ht, right.ht)+1;
            
            int dai1=left.dai;
            int dai2=right.dai;
            int dai3=left.ht+right.ht+1;

            int mydai=Math.max(Math.max(dai1, dai2), dai3);

            TreeNode mytree = new TreeNode(mydai, myheght);
            return mytree;

        }
        
        public static void main(String[] args) {
            int[] nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Bt tree= new Bt();
            Node root=tree.buildingTree(nodes);
           System.out.println(counNode(root));
           System.out.println(sunNode(root));
            System.out.println(height(root));
            System.out.println(daimeter(root));
            System.out.println(diameter1(root).dai);

        }

    }
