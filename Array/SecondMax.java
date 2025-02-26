// import java.util.Scanner;
// public class SecondMax 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int n = sc.nextInt();
//         if (n < 2) 
//         {
//             System.out.println("Array must contain at least two elements.");
//             return;
//         }
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) 
//         {
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         int second_max = arr[0];
//         for (int i = 1; i < n; i++) 
//         {
//             if (arr[i] > max) {
//                 second_max = max;
//                 max = arr[i];
//             } 
//             else if (arr[i] > second_max && arr[i] != max) 
//             {
//                 second_max = arr[i];
//             }
//         }
//         if (max == second_max) {
//             System.out.println("No second maximum found.");
//         } else {
//             System.out.println("Second max element: " + second_max);
//         }
//         sc.close();
//     }
// }