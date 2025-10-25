package Java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> getName= Optional.ofNullable(getNameByID(1));
        //Below all three are same
        getName.ifPresentOrElse(
                a-> System.out.println(a), //True Condition
                ()-> System.out.println("Not found") //False Condition , () means no parameter
        );
        getName.ifPresent( a-> System.out.println(a));
        if(getName.isPresent())
        {
            System.out.println(getName.get());
        }

        Optional<String> getNameByMethod2= getNameByIDUsingOptional(1);
        getNameByMethod2.ifPresent(System.out::println);

    }

    private static String getNameByID(int id) {
        if (id==0) return null;
        else return "Good";
    }

    private static Optional<String> getNameByIDUsingOptional(int id) {
        if (id==0) return Optional.empty();
        else return Optional.of("Good job");
    }
}
