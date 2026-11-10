
import java.util.*; // Imports utility classes like Scanner and Arrays

class RotateByOne{
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button."); // Prints a message

        Scanner sc = new Scanner(System.in); // Creates Scanner object to take input

        int n = sc.nextInt(); // Reads the size of the array

        int[] arr = new int[n]; // Creates an integer array of size n

        for (int i = 0; i < n; i++) { // Loops through all array positions
            arr[i] = sc.nextInt(); // Reads each array element
        }

        rev(arr, 0, n - 1); // Reverses the entire array from index 0 to n-1

        rev(arr, 1, n - 1); // Reverses the array from index 1 to n-1

        System.out.println(Arrays.toString(arr)); // Prints the rotated array
    }

    public static void rev(int[] arr, int i, int j) { // Method to reverse a portion of the array

        while (i <= j) { // Continues until the two pointers cross

            int temp = arr[i]; // Stores the left-side element temporarily

            arr[i] = arr[j]; // Places the right-side element at the left position

            arr[j] = temp; // Places the stored left-side element at the right position

            i++; // Moves the left pointer one position forward

            j--; // Moves the right pointer one position backward
        }
    }
}
