
// streamAPI
import java.util.*;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(10);
        a1.add(25);
        a1.add(37);
        a1.add(40);
        System.out.println(a1);
        // stream for processing collection
        a1.stream()
                .forEach(System.out::println);
        List<String> names = Arrays.asList("Sakshi", "Khushi", "Aditya");
        names.stream().forEach(System.out::println);

        List list = names.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> even = a1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> doubled = a1.stream().map(n -> n * 2).collect(Collectors.toUnmodifiableList());
        System.out.println(doubled);

        List<String> names1 = Arrays.asList("Sakshi", "Aditya", "Khushi");
        List names12 = names1.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(names12);

    }
}
