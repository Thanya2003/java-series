
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class rand {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println((int) (Math.random() * 20 ));
        System.out.println(ThreadLocalRandom.current().nextInt());
        System.out.println(ThreadLocalRandom.current().nextDouble());
        System.out.println(ThreadLocalRandom.current().nextBoolean());
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextInt(100));
    }
    
}
