package trieDs;


public class trieDS {
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
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            String firstpart=key.substring(0,i);
            String secondpart=key.substring(i);
            if(search(firstpart) && wordBreak(secondpart)){
                return true;
            }
        }
        return false;
    }
    public static boolean startwith(String key){
        if(key.length()==0){
            return true;
        }
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx=key.charAt(i)-'a';
            if(curr.childern[idx]==null){
                return false;
            }
            curr=curr.childern[idx];

        }
        return true;
    }
    public static void main(String[] args) {
        String[] words={"app", "apple", "mango", "mobile"};
        String key="man";
        for (String word : words) {
            insert(word);
        }
      System.out.println(startwith(key));

        
    }
}
