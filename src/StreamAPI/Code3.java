package StreamAPI;
import java.util.*;


public class Code3 {
    public static void main(String[] args) {
        List<String> products=Arrays.asList("Laptop","Phone","TV","Mouse","keyboard");

        products.stream()
                .filter(p->p.startsWith("P"))
                .forEach(System.out::println);
    }
}
