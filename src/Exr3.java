import java.util.ArrayList;

public class Exr3 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(6);
        l.add(11);
        l.add(4);
        l.add(9);
        l.add(5);
        l.add(7);
        l.add(3);
        l.add(-1);
        System.out.println(l.stream().filter(a -> a%2 != 0).reduce((s1,s2) ->s1 + s2).get());


    }
}
