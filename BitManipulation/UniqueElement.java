public class UniqueElement {
    public static int findUnique(int[] nums) 
    {
        int result = 0;
        for (int num : nums) 
        {
            result ^= num; // XOR operation
        }
        return result;
    }
    public static void main(String[] args) 
    {
        int[] nums = {4, 3, 4, 2, 3};
        System.out.println("Unique element: " + findUnique(nums)); // Output: 2
    }
}
