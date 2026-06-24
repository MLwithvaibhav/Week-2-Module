import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        // Taking input for number of values
        int n = sc.nextInt();

        // Initialising the array
        int arr[] = new int[n];


        // Taking input for the array
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Taking input for target
        int target = sc.nextInt();


        // Initialising (low and high) variables
        int low = 0;
        int high = n-1;

        while(low <= high) {
            int mid = (low+high)/2;

            if(target == arr[mid]){
                System.out.println("Fraud Transaction found");
                return;

            } else if(target > arr[mid]){
                low = mid+1;
            }else if (target < arr[mid]){
                high = mid-1;
            }
            
        }
        System.out.println("No fraud transaction are there");
    
        


    }
    
}
