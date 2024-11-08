package trieDs;

public class longSubstring {
    static  class Node{
        Node[] childern;
        boolean eow;
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
    static String ans="";
    public static void longestprefix(Node root, StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.childern[i]!=null && root.childern[i].eow){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestprefix(root.childern[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String[] str={"a", "ap","app","appl","banana","apply","apple"};
        for (String str1 : str) {
            insert(str1);
        }
        longestprefix(root, new StringBuilder(""));
        System.out.println(ans);

    }
}
