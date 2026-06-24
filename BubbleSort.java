import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of unsorted array;
        int n = sc.nextInt();
        
        // Initialising the array;
        int arr[] =  new int[n];

        // Taking values of array as an input;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Sorting
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){

                if(arr[j]>arr[j+1]) {

                    int temp = arr[j];
                    arr[j]   = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }


    }
    
}
