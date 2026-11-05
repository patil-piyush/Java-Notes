package Arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        double avg = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("Print :  ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +  " ");
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            sum+=arr[i];
        }
        avg = sum/n;
        System.out.println("");
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);


    }
}
