// Kadane's Algorithm

import java.util.*; // Import Scanner and utility classes

class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button."); // Display a message

        Scanner sc = new Scanner(System.in); // Create Scanner object to read input

        int n = sc.nextInt(); // Read the size of the array

        int[] arr = new int[n]; // Create an array of size n

        for (int i = 0; i < n; i++) { // Iterate through the array
            arr[i] = sc.nextInt(); // Read each array element
        }

        int res = SumMax(arr, n); // Call SumMax method to find maximum subarray sum

        System.out.println(res); // Print the maximum subarray sum

        sc.close(); // Close Scanner
    }

    public static int SumMax(int[] arr, int n) {
        int ms = Integer.MIN_VALUE; // Store the maximum subarray sum
        int cs = 0; // Store the current subarray sum

        for (int i = 0; i < n; i++) { // Traverse the array elements
            cs = cs + arr[i]; // Add the current element to the current sum

            ms = Math.max(ms, cs); // Update maximum sum if current sum is greater

            if (cs < 0) { // Check if the current sum becomes negative
                cs = 0; // Reset current sum to zero
            }
        }

        return ms; // Return the maximum subarray sum
    }
}
