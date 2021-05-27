import java.util.function.Supplier;

public class ReverseInteger {


    public static void main(String[] args) {

        Supplier<String> supplier = () -> "test";
        System.out.println(supplier.get());

    }
}
