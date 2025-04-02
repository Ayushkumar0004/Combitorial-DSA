import java.util.Scanner;

public class Prime_Product 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int arr[] = new int[n];  
        int count = 0;
        for (int i = 2; i <= n; i++) 
        {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) 
            { 
                if (i % j == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) 
            {
                arr[count] = i;
                count++;
            }
        }
        long product = 1;
        for (int i = 0; i < count; i++) 
        {
            product *= arr[i];
        }
        System.out.println("Product of prime numbers is: " + product);
        sc.close();
    }
}