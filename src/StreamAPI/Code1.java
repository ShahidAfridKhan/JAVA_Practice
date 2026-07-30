package StreamAPI;
import java.util.*;

import java.util.stream.*;
public class Code1 {
    public static void main(String[] args) {
        List<Integer> Shahid=Arrays.asList(10,20,30,40,50);

        Shahid.stream()
                .forEach(System.out::println);


    }
}
