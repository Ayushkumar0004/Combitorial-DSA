// import java.util.*;
// public class Factor_Search 
// {
//     public static boolean isFactor(int num) 
//     {
//         return num % 3 == 0;
//     }
//     public static int Linear_Search(int arr[], int target) 
//     {
//         for (int i = 0; i < arr.length; i++) 
//         {
//             if (arr[i] == target) 
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < n; i++) 
//         {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the target value:");
//         int target = sc.nextInt();
//         int index = Linear_Search(arr, target);
//         if (index != -1) 
//         {
//             if (isFactor(arr[index])) 
//             {
//                 System.out.println("YES");
//             } 
//             else 
//             {
//                 System.out.println("NO");
//             }
//         } 
//         else 
//         {
//             System.out.println("Element not found");
//         }
//         sc.close();
//     }
// }