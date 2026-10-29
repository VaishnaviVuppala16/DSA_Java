import java.util.*; // Imports Scanner and Arrays classes

class SortColors { // Defines the class named SortColors

    public void sort012(int[] arr) { // Function to sort an array of 0s, 1s, and 2s
        int l = 0, m = 0; // l = pointer for 0s, m = pointer for current element
        int h = arr.length - 1; // h = pointer for 2s at the end of the array

        while (m <= h) { // Continue until the middle pointer crosses the high pointer
            if (arr[m] == 0) { // If the current element is 0
                int temp = arr[m]; // Store the current element in temp
                arr[m] = arr[l]; // Move the element at l to position m
                arr[l] = temp; // Place 0 at position l
                l++; // Move the low pointer forward
                m++; // Move to the next element
            } 
            else if (arr[m] == 1) { // If the current element is 1
                m++; // 1 is already in the correct region, so move forward
            } 
            else { // If the current element is 2
                int temp = arr[m]; // Store the current element in temp
                arr[m] = arr[h]; // Move the element at h to position m
                arr[h] = temp; // Place 2 at position h
                h--; // Move the high pointer backward
                // Do not increment m because the swapped element must be checked
            }
        }
    }

    public static void main(String[] args) { // Main method: program execution starts here
        Scanner sc = new Scanner(System.in); // Creates a Scanner to read input

        int n = sc.nextInt(); // Reads the size of the array
        int[] arr = new int[n]; // Creates an integer array of size n

        for (int i = 0; i < n; i++) { // Loops through every array position
            arr[i] = sc.nextInt(); // Reads an integer into the array
        }

        SortColors obj = new SortColors(); // Creates an object of the SortColors class
        obj.sort012(arr); // Calls the function to sort the array

        System.out.println(Arrays.toString(arr)); // Prints the sorted array
        sc.close(); // Closes the Scanner
    }
}
