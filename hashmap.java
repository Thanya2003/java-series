
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer, String> fruit = new HashMap<>();
        fruit.put(1, "orange");
        fruit.put(2, "grapes");
        fruit.put(3, "apple");
        fruit.put(4, "mango");

        keysiter(fruit);
        iterators(fruit);
        entrysetmap(fruit);
        Streams(fruit);
        foreachloop(fruit);

    }

    private static void foreachloop(Map<Integer, String> fruit) {
        fruit.forEach((key, Value)->
        {
            System.out.println("key="+key+" : value="+Value );

        });
        throw new UnsupportedOperationException("Unimplemented method 'foreachloop'");
    }

    private static void Streams(Map<Integer, String> fruit) {
        fruit.entrySet().stream().forEach(e -> {
            System.out.println("key="+e.getKey()+" : value="+e.getValue());
        });
        throw new UnsupportedOperationException("Unimplemented method 'Streams'");
    }

    private static void entrysetmap(Map<Integer, String> fruit) {
        for(Map.Entry<Integer, String> ent : fruit.entrySet()){
            System.out.println("key="+ent.getKey()+" : value="+ ent.getValue());
        }
        throw new UnsupportedOperationException("Unimplemented method 'entrysetmap'");
    }

    private static void iterators(Map<Integer, String> fruit) {
     Iterator<Map.Entry<Integer, String>> Iter = fruit.entrySet().iterator();

        while(Iter.hasNext()){
            Map.Entry<Integer, String> entry =Iter.next();
            System.out.println("Iterator method");
            System.out.println("key="+entry.getKey()+" : value="+ entry.getValue());
        }
        throw new UnsupportedOperationException("Unimplemented method 'iterators'");
    }

    private static void keysiter(Map<Integer, String> fruit) {
        System.out.println("KeysIteration method");
        
        for(Integer fruiId: fruit.keySet()){
            System.out.println("key="+fruiId+" : value="+fruit.get(fruiId));
        }
        // throw new UnsupportedOperationException("Unimplemented method 'keysiter'");
    }
}
