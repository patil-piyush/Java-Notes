import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // printing stuff
        // print number
        System.out.println(x);

        // print square of number
        System.out.println(x*x);

        // print cube of number
        System.out.println(x*x*x);

        // print if the number is even or not 
        if(x%2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        // print if number is positive or negative
        if(x >= 0) System.out.println("Positive");
        else System.out.println("Negative");
        
    }
}