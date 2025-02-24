import java.util.*;
class Intro 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        int rev = 0, ori = a;
        while (a != 0) 
        {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a /= 10;
        }
        System.out.println("Reversed Number: " + rev);
        if (ori == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
} 