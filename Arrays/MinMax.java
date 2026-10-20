import java.util.Scanner;       // Imports Scanner to take input from the user.
import java.util.ArrayList;     // Imports ArrayList to store elements dynamically.

class MinMax{                    // Defines the Main class.
    public static void main(String[] args) {  // Main method: program execution starts here.

        Scanner sc = new Scanner(System.in);  // Creates a Scanner object to read input.
        int n = sc.nextInt();                 // Reads the number of elements.
        int[] arr = new int[n];               // Creates an integer array of size n.

        ArrayList<Integer> a = new ArrayList<>(); // Creates an ArrayList to store min and max.

        for (int i = 0; i < n; i++) {         // Loops n times to read array elements.
            arr[i] = sc.nextInt();            // Reads an element and stores it at index i.
        }

        int min = Integer.MAX_VALUE;          // Initializes min with the largest int value.
        int max = Integer.MIN_VALUE;          // Initializes max with the smallest int value.

        for (int i = 0; i < n; i++) {         // Traverses the array to find min and max.

            if (arr[i] < min) {               // Checks whether the current element is smaller than min.
                min = arr[i];                 // Updates min if a smaller element is found.
            }

            if (arr[i] > max) {               // Checks whether the current element is greater than max.
                max = arr[i];                 // Updates max if a greater element is found.
            }
        }

        a.add(min);                           // Adds the minimum value to the ArrayList.
        a.add(max);                           // Adds the maximum value to the ArrayList.

        System.out.println(a);                // Prints the minimum and maximum as a list.

        sc.close();                           // Closes the Scanner.
    }
}
