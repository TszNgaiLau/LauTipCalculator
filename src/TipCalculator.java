import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What is your tip percentage(0-100): ");
        int tip = scan.nextInt();
        scan.nextLine();
        while (cost != -1)  {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            double temp = scan.nextDouble();
            scan.nextLine();
            total += temp;
        }
        double perTip = (double) tip / 100;
        double totalTip = (total * tip);


    }
}
