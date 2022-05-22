import java.util.ArrayList;
import java.util.Random;

 import java.util.ArrayList;
        import java.util.Random;
import java.util.stream.Collectors;

public class Exr4{

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> ArrayList= new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            ArrayList.add(random.nextInt(10));
        }
        System.out.println(ArrayList);
        System.out.println(ArrayList.stream().filter(a -> a > 5 & a < 10).collect(Collectors.toList()));
    }
}
