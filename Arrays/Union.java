//1. Hash Set Code
import java.util.*;                         // Imports utility classes like HashSet and ArrayList

public class Union {                        // Class name matches the file name union.java

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {  // Method to find union of two arrays

        HashSet<Integer> set = new HashSet<>();  // Creates a HashSet to store unique elements

        for (int num : a) {                 // Traverses each element in array a
            set.add(num);                   // Adds element to HashSet; duplicates are ignored
        }

        for (int num : b) {                 // Traverses each element in array b
            set.add(num);                   // Adds element to the same HashSet
        }

        ArrayList<Integer> list = new ArrayList<>(); // Creates an empty ArrayList

        list.addAll(set);                   // Copies all HashSet elements into ArrayList

        return list;                        // Returns the ArrayList containing union elements
    }

    public static void main(String[] args) { // Main method: program execution starts here

        int[] a = {1, 2, 2, 3};             // Initializes the first array
        int[] b = {2, 3, 4, 5};             // Initializes the second array

        ArrayList<Integer> result = findUnion(a, b); // Calls findUnion() and stores the result

        System.out.println("Union: " + result); // Prints the union of both arrays
    }
}

// TreeSet Code - Used for the sorted output.

/*
import java.util.*;                         // Imports utility classes like TreeSet and ArrayList

public class union {                        // Class name matches the file name union.java

    public static ArrayList<Integer> findUnion(int[] a, int[] b) { // Method to find union of two arrays

        TreeSet<Integer> set = new TreeSet<>(); // Creates a TreeSet to store unique elements in sorted order

        for (int num : a) {                 // Traverses each element in array a
            set.add(num);                   // Adds element to TreeSet; duplicates are ignored
        }

        for (int num : b) {                 // Traverses each element in array b
            set.add(num);                   // Adds element to the same TreeSet
        }

        ArrayList<Integer> list = new ArrayList<>(); // Creates an empty ArrayList

        list.addAll(set);                   // Copies all TreeSet elements into ArrayList in sorted order

        return list;                        // Returns the ArrayList containing union elements
    }

    public static void main(String[] args) { // Main method: program execution starts here

        int[] a = {1, 2, 2, 3};             // Initializes the first array
        int[] b = {2, 3, 4, 5};             // Initializes the second array

        ArrayList<Integer> result = findUnion(a, b); // Calls findUnion() and stores the result

        System.out.println("Union: " + result); // Prints the union of both arrays
    }
}
*/
