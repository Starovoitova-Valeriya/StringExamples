import java.util.ArrayList;

public class Exr2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Иванов");
        array.add("Петров");
        array.add("Сидоров");
        array.add("Мартинович");
        array.add("Добриков");
        array.add("Мололедов");
        array.add("Лимузинов");
        array.add("Лимонадов");
        array.stream().filter(a -> a.charAt(0) == 'М').forEach(a -> System.out.println(a));
    }
}
