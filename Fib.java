import java.util.*;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0, n1=0, n2=1;
        int n = sc.nextInt();

        // System.out.println(sum);
        for(int i=1; i<=n; i++){
            System.out.println(sum);

            n1=n2;
            n2=sum;

            sum=n1+n2;
        }

        System.out.println("Fibnacci of n is "+ sum);
    }}
