import java.util.Scanner;

public class LinearSearch {

    
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // Number of transactions
            int n = sc.nextInt();

            // Array creation
            int arr[] = new int[n];

            // Taking transaction IDs as input
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            // Suspicious Transaction ID 
            int target = sc.nextInt();

            for(int i = 0; i<n; i++){
                if (arr[i] == target) {
                    System.out.println("Fraud Transaction Founded");
                    return;
                } 
    }
            System.out.println("No Fraud Transaction founded");
            

    
}

}
