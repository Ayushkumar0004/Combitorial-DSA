// // package LinkedList;
// import java.util.*;
// class Node
// {
//     int data;
//     Node next;
//     Node(int data)
//     {

//         this.data = data;
//         this.next = null;
//     }
// }
// public class Task1 
// {
//     Node head;
//     public void add(int data)
//     {
//         Node newNode = new Node(data);
//         if(head == null)
//         {
//             head = newNode;
//         }
//         else
//         {
//             Node temp = head;
//             while(temp.next != null)
//             {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//     }
//     public void display()
//     {
//         Node temp = head;
//         while(temp.next != null)
//         {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("NULL");
//     }

//     public static void main(String[] args) 
//     { 
//         Scanner sc = new Scanner(System.in);
//         Task1 t1 = new Task1();
//         System.out.println("Enter the number of nodes: ");
//         int n = sc.nextInt();
//         System.out.println("Enter the elements :");
//         for(int i = 0; i < n; i++)
//         {
//             int ele = sc.nextInt();
//             t1.add(ele);
//         }
//         System.out.println("Linked List is: ");
//         t1.display();
//         sc.close();
//     }
// }