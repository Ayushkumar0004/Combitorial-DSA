import java.util.Scanner;
public class Binary_Search 
{
    public static void BinarySearch(int arr[] , int n, int key)
    {
        int start = 0;
        int end = n - 1;
        boolean found = false;
        while (start <= end) 
        {
            int mid = (start + end) / 2;
            if(arr[mid] == key)
            {
                System.out.println("Element found at index = " + mid);
                found = true;
                break;
            }    
            else if(arr[mid] < key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        if(!found)
        {
            System.out.println("Target is not present in the array!");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) 
        {
            for (int j = i; j > 0; j--) 
            {
                if (arr[j] < arr[j - 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        BinarySearch(arr, n, key);
        sc.close();
    }    
}
