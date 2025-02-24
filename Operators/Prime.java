import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        if (num <= 1) 
        {
            System.out.println("The number is not prime!");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) 
        {
            if (num % i == 0) 
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime) 
        {
            System.out.println("The number is prime!");
        } else {
            System.out.println("The number is not prime!");
        }
    }
}