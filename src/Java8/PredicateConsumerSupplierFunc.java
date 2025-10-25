package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateConsumerSupplierFunc {
    public static void main(String[] args) {
        Predicate<String> predicate = a->a.length()>2;
        Predicate<String> predicate2 = a->a.startsWith("A");
        System.out.println(predicate.and(predicate2).test("Bhunav"));
        System.out.println(predicate.or(predicate2).test("Bhunav"));

        Consumer<String> consumer = a-> {
            System.out.println("Test consumer "+ a);
        };
        Consumer<String> consumer2 = a-> {
            System.out.println("Test consumer2 "+ a);
        };
        consumer.andThen(consumer2).accept("Abhi");

        Function<Integer,Integer> function1 = a->a*a;
        Function<Integer,Integer> function2 = a->a+a;
        System.out.println(function1.andThen(function2).apply(5));

        Supplier<String> supplier = ()->"Abhinav";
        Supplier<String> supplier2 = ()->supplier.get()+"Srivastava"; // This is how we chain it
        System.out.println(supplier2.get());
    }
}
