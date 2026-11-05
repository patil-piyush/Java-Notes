package Arrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of left rotations: ");
        int r = sc.nextInt();

        while(r-- > 0){
            int temp = arr[0];
            for(int i=0; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
            
        }
        System.out.print("Left rotated array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}