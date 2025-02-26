// public class Swap 
// {
//     static void swapNum(int[] arr) 
//     {
//         arr[0] = arr[0] + arr[1];
//         arr[1] = arr[0] - arr[1];
//         arr[0] = arr[0] - arr[1];
//     }
//     public static void main(String[] args) 
//     {
//         int[] nums = {5, 10};
//         System.out.println("Before swapping: a = " + nums[0] + ", b = " + nums[1]);
//         swapNum(nums);
//         System.out.println("After swapping: a = " + nums[0] + ", b = " + nums[1]);
//     }
// }

// public class Swap 
// {
//     public static void main(String[] args) 
//     {
//         int a = 5; 
//         // 0101
//         int b = 10;
//         // 1010
//         System.out.println("Before swapping: a = " + a + ", b = " + b);
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;
//         System.out.println("After swapping: a = " + a + ", b = " + b);
//     }
// }