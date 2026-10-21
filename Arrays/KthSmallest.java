import java.util.Scanner;
import java.util.Arrays;

class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");
        String input = sc.nextLine();

        String[] values = input.split(" ");
        int[] arr = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        System.out.println("Enter k value:");
        int k = sc.nextInt();

        Arrays.sort(arr);

        System.out.println(arr[k - 1]);

        sc.close();
    }
}
