import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> ArrayList= new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            ArrayList.add(random.nextInt(10));
         }
        System.out.println(ArrayList);
        System.out.println(ArrayList.stream().filter(a -> a % 2 == 0).count());
    }
}
