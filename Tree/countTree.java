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

        
        public static void main(String[] args) {
            int[] nodes={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            Bt tree= new Bt();
            Node root=tree.buildingTree(nodes);
           System.out.println(counNode(root));
    

        }

    }
