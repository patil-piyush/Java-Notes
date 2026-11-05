package Arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n/2; i++){
            // swaping two numbers using inbuilt function
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.print("Reversed array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
        
    }
}
