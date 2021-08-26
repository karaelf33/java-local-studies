package generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;

public class Test {


    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a", "b", "c", "d");
        String witch = "b";
        String tail = "lack";
        witch = witch.concat(tail);
        System.out.println(witch);

    }


}
