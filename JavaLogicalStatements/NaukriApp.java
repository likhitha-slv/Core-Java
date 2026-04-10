package JavaLogicalStatements;
import java.util.Scanner;

public class NaukriApp 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int choice;
        char cont;
		do
        {
            System.out.println("\n===== NAUKRI APP MENU =====");
            System.out.println("1. View Jobs");
            System.out.println("2. Apply for Job");
            System.out.println("3. Upload Resume");
            System.out.println("4. Check Application Status");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
         
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    System.out.println("\n--- Available Jobs ---");
                    System.out.println("1. Software Developer");
                    System.out.println("2. Data Analyst");
                    System.out.println("3. Web Designer");
                    break;

                case 2:
                    System.out.print("Enter job ID to apply: ");
                    int jobId = sc.nextInt();
                    System.out.println("Applied successfully for Job ID: " + jobId);
                    break;

                case 3:
                    System.out.println("Resume uploaded successfully!");
                    break;

                case 4:
                    System.out.println("Your application is under review.");
                    break;

                case 5:
                    System.out.println("Thank you for using Naukri App");
                    break;

                default:
                    System.out.println("Invalid choice!");
            
            }
            System.out.println("Do u want to continue  (y/n)");
            cont = sc.next().charAt(0);
        }
          
        while(cont == 'y');
                 System.out.println("Thank You");
        sc.close();
}
    		
} 		
    		