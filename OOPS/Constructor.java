import java.util.Scanner;

class Animal {
    int legs;
    String voice;
    int height;
    boolean bite;
    String name;

    // Corrected Constructor
    Animal(int legs, String voice, boolean bite) {
        this.legs = legs;
        this.voice = voice;
        this.bite = bite;
    }

    // Methods to display information
    public void Walk() {
        System.out.println("No. of legs: " + legs);
    }

    public void Presence() {
        System.out.println("Voice is: " + voice);
    }

    public void Height() {
        System.out.println("The height is: " + height);
    }

    public void isBite() {
        System.out.println("Does it bite: " + bite);
    }

    public void AnimalName() {
        System.out.println("The name of the animal is: " + name);
    }
}

class Constructor {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        // Collect user input for constructor values
        System.out.print("Enter the number of legs: ");
        int legs = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter the type of voice: ");
        String voice = sc.nextLine();

        System.out.print("Enter Yes/No (Does it bite?): ");
        boolean bite = sc.nextLine().equalsIgnoreCase("Yes");

        // Creating an object using the constructor
        Animal a = new Animal(legs, voice, bite);

        // Continue collecting other values
        System.out.print("Enter the height: ");
        a.height = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter the name of the animal: ");
        a.name = sc.nextLine();

        // Display all details
        a.Walk();
        a.Presence();
        a.Height();
        a.isBite();
        a.AnimalName();

        sc.close();
    }
}
