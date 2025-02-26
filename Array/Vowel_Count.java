// // package Array;

// public class Vowel_Count 
// {
//     public static void main(String[] args) 
//     {
//         String str = "HelloWorld";
//         int count = 0;
//         for (int i = 0; i < str.length(); i++)
//         {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
//             {
//                 count++;
//             }
//         }
//         System.out.println("Number of Vowels in a string: " + count);
//     } 
// }

// public class Vowel_Count {
//     public static void main(String[] args) 
//     {
//         String str = "HelloWorld".toLowerCase();
//         String str1 = "HelloWorld".toUpperCase();
//         int count = 0;
//         for (char ch : str.toCharArray()) 
//         {
//             if ("aeiou".indexOf(ch) != -1) count++;
//         }
//         // for (char ch : str1.toCharArray()) 
//         // {
//         //     if ("AEIOU".indexOf(ch) != -1) count++;
//         // }
//         System.out.println("Number of Vowels in a string: " + count);
//     }
// }