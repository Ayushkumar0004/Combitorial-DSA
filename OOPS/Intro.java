// import java.util.Scanner;
// class Animal {
//     int legs;
//     String voice;
//     int height;
//     boolean bite;
//     String name;
//     public void Walk() 
//     {
//         System.out.println("No. of legs: " + legs);
//     }
//     public void Presence() 
//     {
//         System.out.println("Voice is: " + voice);
//     }
//     public void Height() 
//     {
//         System.out.println("The height is: " + height);
//     }
//     public void isBite() 
//     {
//         System.out.println("Does it bite: " + bite);
//     }
//     public void AnimalName() 
//     {
//         System.out.println("The name of the animal is: " + name);
//     }
// }

// class Intro 
// {
//     public static void main(String[] args) 
//     {  
//         Scanner sc = new Scanner(System.in);
//         Animal a = new Animal();
//         System.out.print("Enter the number of legs: ");
//         a.legs = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Enter the type of voice: ");
//         a.voice = sc.nextLine();
//         System.out.print("Enter the height: ");
//         a.height = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Enter Yes/No (Does it bite?): ");
//         a.bite = sc.nextLine().equals("Yes");
//         System.out.print("Enter the name of the animal: ");
//         a.name = sc.nextLine();
//         a.Walk();
//         a.Presence();
//         a.Height();
//         a.isBite();
//         a.AnimalName();
//         sc.close();
//     }
// }