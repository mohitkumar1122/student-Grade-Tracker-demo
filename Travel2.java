import java.util.Scanner;
class Travel2 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

           System.out.print("Enter destination: ");
           String destination = scanner.nextLine();

           System.out.print("Enter start date (YYYY-MM-DD): ");
           String startDate = scanner.nextLine();

           System.out.print("Enter end date (YYYY-MM-DD): ");
           String endDate = scanner.nextLine();

           System.out.print("Enter your preferences: ");
           String preferences = scanner.nextLine();
 
           // Call function to generate travel plan based on user inputs
           show(destination, startDate, endDate, preferences);
       }
       public static void show(String x,String y,String z,String p)
       {
            System.out.println(x+" "+y+" "+z+" "+p);
       }
}