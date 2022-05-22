import java.sql.SQLOutput;
import java.util.ArrayList;
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("яблоко");
        array.add("мороженое");
        array.add("свинка");
        array.add("лапа");
        array.add("лапша");
        array.add("мороз");
        array.add("город");
        array.add("мир");
        System.out.println(array);
        System.out.println(array.stream().reduce((s1,s2) -> s1 + " , " + s2).get());
    }
}