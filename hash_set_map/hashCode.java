// package hash_set_map;

// import java.lang.classfile.components.ClassPrinter;
// import java.util.*;

// public class hashCode {
//     public class hashmap<k, v>{
//         private class Node{
//             k key;
//             v value;
            
//             public Node(k key, v value){
//                 this.key=key;
//                 this.value=value;
//             }
//         }
//         private  int n;
//         private  int N;
//         private LinkedList <Node>[] BucketList;

//         public hashmap() {
//             this.n=4;
//             this.BucketList=new LinkedList[4];
//             for(int i=0; i<4; i++){
//                 this.BucketList[i]= new LinkedList<>();
//             }
//         }
//         private int hashFunction(k key){
//             int bi=key.hashCode();
//             return Math.abs(bi) % N;
           
//         }
//         private int searchinll(k key, int bi){
//             LinkedList<Node> ll = BucketList[bi];
//             for(int i=0; i<ll.size(); i++){
//                 if(ll.get(i).key==key){
//                     return i;
//                 }
//             }
//             return -1;
//         }
//         private void rehash(){
//             LinkedList <Node> oLdbuck[]=BucketList;
//             BucketList=new LinkedList[N*2];
//         }
//         public void put(k key, v value){
//             int bi=hashFunction(key);
//             int di=searchinll(key, bi);
//             if(di==-1){
//                 BucketList[bi].add(new Node(key, value));
//             }else{
//                 Node node= BucketList[bi].get(di);
//                 node.value=value;
//             }
//             double lambda= double (n/N);
//             if(lambda>2.0){
//                 rehash();
//             }
//         }
//     }
// }
