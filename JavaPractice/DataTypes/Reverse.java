
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int x = sc.nextInt();
        int rev=0;
        while(x>0){
            int rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        System.out.println("Reverse: "+rev);
    }
}
