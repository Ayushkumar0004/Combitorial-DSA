import java.util.*;
public class Stack1
{
    public static String reverseString(String input) 
    {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) 
        {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) 
        {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) 
    {
        String ip = "AYUSH";
        String reversed = reverseString(ip);
        System.out.println("Original: " + ip);
        System.out.println("Reversed: " + reversed);
    }
}