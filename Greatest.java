import java.util.*;


public class Greatest {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        if(num1>=num2 || num1>=num3) {
            System.out.println(num1 + " is the Greatest Number");
        }
        else if(num2>=num3){
            System.out.println(num2 + " is the Greatest Number");
        }

        else{
            System.out.println(num3 + " is the Greatest Number");
        }
    }
}
