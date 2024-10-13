import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Entertainment entertainment = new Entertainment();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) { 
            System.out.println("1. Add new movie");
            System.out.println("2. Find movie by title");
            System.out.println("3. Find movies by rating range"); 
            System.out.println("4. Change movie details");
            System.out.println("5. Print all movies");  
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) { 
                case 1:
                    entertainment.addToList();
                    break;
                case 2:
                    entertainment.findStringValue();
                    break;
                case 3:
                    entertainment.findPrimitiveValue(); 
                    break;
                case 4:
                    entertainment.changeValue();
                    break;
                case 5:
                    entertainment.printAll();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
