package StreamAPI;
import java.util.*;

import java.util.stream.Collectors;
public class Code2 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,21,31,41,51);

        List<Integer> evenNumbers=numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
