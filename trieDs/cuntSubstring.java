package trieDs;

public class cuntSubstring {
    static  class Node{
        Node[] childern;
        Boolean eow;
        public Node(){
            childern= new Node[26];
            for(int i=0; i<26; i++){
                childern[i]=null;
            }
            eow=false;
        }
    }
    static Node root= new Node();
    public static void insert(String word){
        Node current = root;
        for(int i=0; i<word.length(); i++){
            int idx= word.charAt(i)-'a';
            if(current.childern[idx]==null){
                current.childern[idx]=new Node();
      }
      if(i==word.length()-1){
        current.childern[idx].eow=true;
      }
      current=current.childern[idx];
        }
    }
    public static boolean  search(String key){
        Node current = root;
        for(int i=0; i<key.length(); i++){
            int idx=key.charAt(i)-'a';
            Node node =current.childern[idx];
            if(node==null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }
            current=node;
        }
        return true;
    }
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0; i<26; i++){
            if(root.childern[i]!=null){
                count+=countNode(root.childern[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str ="thanya";
        for(int i=0; i<str.length(); i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
    }
}
