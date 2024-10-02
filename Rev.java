import java.util.*;
public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rem,res=0;
        while(n>0){
            rem = n%10;
            res = (res*10) +rem;
            n=n/10;
        }

        System.out.println("Reverse of the number "+n+ " is given by "+ res);
    }
}
