package Arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max2 = max;
                max = arr[i];
            }
            else if(max2<arr[i] && arr[i] < max){
                max2 = arr[i];
            }
        }

        System.out.println("Second largest element: " + max2);
    }
}
