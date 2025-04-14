public class Task1
{
    public static int rec(int n)
    {
        if(n == 5)
        {
            return 5;
        }
        System.out.println(n);
        return rec(n + 1);
    }
    public static void main(String[] args) 
    {
        rec(1);
    }
}