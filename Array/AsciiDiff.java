// import java.util.Scanner;
// public class AsciiDiff 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter first character: ");
//         char ch1 = sc.next().charAt(0);
//         System.out.print("Enter second character: ");
//         char ch2 = sc.next().charAt(0);
//         int diff = (ch1 > ch2) ? (ch1 - ch2) : (ch2 - ch1);
//         System.out.println("ASCII difference: " + diff);

//         if (isPalindrome(diff)) 
//         {
//             System.out.println("The difference is a palindrome.");
//         } 
//         else 
//         {
//             System.out.println("The difference is NOT a palindrome.");
//         }
//         sc.close();
//     }
//     public static boolean isPalindrome(int num) 
//     {
//         int original = num;
//         int reverse = 0;
//         while (num > 0) 
//         {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num /= 10;
//         }
//         return original == reverse;
//     }
// }