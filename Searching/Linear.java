// // package Searching;
// import java.util.*;
// public class Linear 
// {
//     static int Linear_Search(int arr[], int target)
//     {
//         for(int i = 0; i < arr.length; i++)
//         {
//             if(arr[i] == target)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements:");
//         for(int i = 0 ;i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the target value: ");
//         int target = sc.nextInt();
//         System.out.println("Value found at index : " + Linear_Search(arr, target));
//         sc.close();
//     }
// }
