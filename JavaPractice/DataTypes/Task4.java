
import java.util.Scanner;

public class Task4 {

    public static boolean isPalindrome(int x){
        int rev = 0;
        int temp = x;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp /= 10;
        }
        return rev == x;
    }

    public static boolean isArmstrong(int x){
        int originalNum = x;
        int sum = 0;
        int digits = String.valueOf(x).length();

        for (; x != 0; x /= 10) {
            int remainder = x % 10;
            sum += Math.pow(remainder, digits);
        }

        return sum == originalNum;
    }

    public static boolean isPrime(int x){
        int i=2;
        while(i<x){
            if(x%i == 0) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(isPalindrome(x)) System.out.println(x + " is a Palindrome");
        else System.out.println(x + " is not a Palindrome");

        if(isPrime(x)) System.out.println(x + " is a Prime number");
        else System.out.println(x + " is not a Prime number");

        if(isArmstrong(x)) System.out.println(x + " is a Armstrong number");
        else System.out.println(x + " is not a Armstrong number");
        sc.close();
    }
}
