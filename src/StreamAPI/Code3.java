package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
public class Code3 {
    public static void main(String[] args) {
        List<String> products=Arrays.asList("Laptop","Phone","TV","Mouse","keyboard","Shahid");

        products.stream()
                .filter(p->p.startsWith("S"))
                .forEach(System.out::println);

        List<Integer> marks=Arrays.asList(45,90,78,85,60);

        marks.stream()
                .filter(m->m>80)
                .forEach(System.out::println);


        marks.stream()
                .filter(n->n>10)
                .filter(n->n%2==0)
                .forEach(System.out::println);


        List<Integer> integer=Arrays.asList(1,2,3,4,5,6,7);

        integer.stream()
                .map(x->x*x)
                .forEach(System.out::println);


        List<Integer> numbers=Arrays.asList(1,2,3,4,5,5,6,7,7,8,9,10);

       List <Integer> EvenNumbers = numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println(EvenNumbers);

        List<Integer> OddNumbers=numbers.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());

        System.out.println(OddNumbers);

        List<Integer> Square=numbers.stream()
                .map(n->n*n)
                .collect(Collectors.toList());

        System.out.println(Square);

        List<Integer> MinusSquare=Square.stream()
                .map(n->n-100)
                .collect(Collectors.toList());

        System.out.println(MinusSquare);

        List<Integer> Duplicate=numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(Duplicate);

        List<Integer> Sorting=numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(Sorting);

        List<Integer> Ascending=numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(Ascending);

        numbers.stream()
                .max(Integer::compare)
                .get();

        int sum=numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);

        long count=numbers.stream().count();
        System.out.println(count);


        numbers.stream()
                .findFirst()
                .get();






    }
}
