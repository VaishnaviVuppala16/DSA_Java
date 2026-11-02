// 1.  Time complexity and space complexity are O(n^2) and O(1) - (inplace code and order preserving of elements)

import java.util.*; // Imports Scanner and Arrays classes

class NegToEnd { // Creates a class

    public static void main(String[] args) { // Main method execution starts here

        Scanner sc = new Scanner(System.in); // Creates Scanner to take input

        int n = sc.nextInt(); // Reads the size of the array

        int[] arr = new int[n]; // Creates an integer array of size n

        for (int i = 0; i < n; i++) { // Iterates through the array
            arr[i] = sc.nextInt(); // Reads each array element
        }

        NegToEnd obj = new NegToEnd(); // Creates an object of NegToEnd class

        obj.negativeEnd(arr); // Calls the method to move negative elements to the end

        System.out.println(Arrays.toString(arr)); // Prints the modified array

        sc.close(); // Closes Scanner
    }

    public void negativeEnd(int[] arr) { // Method to move negative elements to the end

        int n = arr.length; // Stores the length of the array

        for (int i = 0; i < n; i++) { // Traverses the array from left to right

            if (arr[i] < 0) { // Checks whether the current element is negative

                int temp = arr[i]; // Stores the negative element temporarily

                for (int j = i; j < n - 1; j++) { // Starts shifting elements from current index
                    arr[j] = arr[j + 1]; // Moves the next element one position to the left
                }

                arr[n - 1] = temp; // Places the stored negative element at the last position

                i--; // Rechecks the same index because a new element shifted into it
            }
        }
    }
}




/*  2.  Time complexity and space complexity are O(n) and O(n) (shifting process and order preserving)
 
  
  import java.util.*; // Imports Scanner and Arrays classes

class NegToEnd {

    public static void main(String[] args) { // Main method starts execution

        Scanner sc = new Scanner(System.in); // Creates Scanner object

        int n = sc.nextInt(); // Reads array size

        int[] arr = new int[n]; // Creates an integer array of size n

        for (int i = 0; i < n; i++) { // Iterates through the array
            arr[i] = sc.nextInt(); // Reads each array element
        }

        negativeEnd(arr); // Directly calls the static method

        System.out.println(Arrays.toString(arr)); // Prints the modified array

        sc.close(); // Closes Scanner
    }

    public static void negativeEnd(int[] arr) { // Static method to move negatives to the end

        int n = arr.length; // Stores the length of the array

        int[] a = new int[n]; // Creates a temporary array of size n

        int j = 0; // Tracks the next available position in temporary array

        // Store positive and zero elements
        for (int i = 0; i < n; i++) { // Traverses the original array
            if (arr[i] >= 0) { // Checks if the element is positive or zero
                a[j] = arr[i]; // Copies the element into temporary array
                j++; // Moves to the next position
            }
        }

        // Store negative elements
        for (int i = 0; i < n; i++) { // Traverses the original array again
            if (arr[i] < 0) { // Checks if the element is negative
                a[j] = arr[i]; // Copies the negative element into temporary array
                j++; // Moves to the next position
            }
        }

        // Copy elements back to original array
        for (int i = 0; i < n; i++) { // Traverses the temporary array
            arr[i] = a[i]; // Copies elements back into the original array
        }
    }
}

*/
