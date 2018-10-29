import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        Student st1 = new Student("st1", 42);


        String name1 = "Vasja";
        String name2 = "Alex";
        String name3 = "Wania";
        HashMap<Student, String> map = new HashMap<>();
        map.put(st1, name1);


        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.get(1));

    }
}
