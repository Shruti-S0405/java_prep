import java.util.*;


public class Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String fruit = sc.next();

            switch(fruit){
                case "orange" -> System.out.println("SWEETTTT");
                case "apple" -> System.out.println("SWEETTTT");
                case "melon" -> System.out.println("SWEETTTT");
                case "berry" -> System.out.println("SWEETTTT");
                case "guava" -> System.out.println("SWEETTTT");
                default -> System.out.println("Invalid Input");
            }
        }
    }
}
