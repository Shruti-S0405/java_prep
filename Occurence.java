
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int target = sc.nextInt();

        int count = 0;

        while(n>0){
            int rem = n%10;

            if(rem==target){
                count++;
            }

            n = n/10;
        }

        System.out.println("The number of ocurrence of ", target, "is", count)
    }
}
