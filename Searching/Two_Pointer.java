import java.util.Arrays;
import java.util.Scanner;

public class Two_Pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sortedArr[] = new int[n];  // Copy for sorting

        // Input array elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i];  // Copy elements to sortedArr
        }

        // Sorting the copied array
        Arrays.sort(sortedArr);

        // Input target value
        System.out.println("Enter the target value: ");
        int key = sc.nextInt();
        sc.close();

        // Two-pointer search in sorted array
        int start = 0, end = n - 1;
        int num1 = -1, num2 = -1;  // To store the numbers found
        while (start < end) {
            int sum = sortedArr[start] + sortedArr[end];

            if (sum == key) {
                num1 = sortedArr[start]; 
                num2 = sortedArr[end]; 
                break;
            } else if (sum < key) {
                start++;
            } else {
                end--;
            }
        }

        // If no pair found
        if (num1 == -1) {
            System.out.println("No such pair exists.");
            return;
        }

        // Find the original indices of num1 and num2 in arr
        int index1 = -1, index2 = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num1 && index1 == -1) {
                index1 = i;  // First occurrence of num1
            } else if (arr[i] == num2 && i != index1) {  // Ensure different index
                index2 = i;
                break;
            }
        }

        // Ensure the indices are in ascending order
        if (index1 > index2) {
            int temp = index1;
            index1 = index2;
            index2 = temp;
        }

        // Print the original indices
        System.out.println("Target found at original indices: " + index1 + " and " + index2);
    }
}
