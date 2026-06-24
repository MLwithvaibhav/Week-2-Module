import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input from user for the number of arrays;
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking input from user for the array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Insertion Sort;

        for(int i = 1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key) {

                arr[j+1] = arr[j];
                j--;
                
            }
                arr[j+1] = key;
        }

        for(int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }

        
    
}
