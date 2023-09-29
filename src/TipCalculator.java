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
        double cost = 0;
        double total = 0;
        while (cost != -1)  {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            total += cost;
        }
        total++;
        double perTip = (double) tip / 100;
        double totalTip = (total * perTip) - total;
        double totalBillWithTip = totalTip + total;
        double perPersonCostBeforeTip = total / people;
        double tipPerPerson = totalTip / people;
        double totalCostPerPerson = perPersonCostBeforeTip + tipPerPerson;
        System.out.println("---------------------------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + totalBillWithTip);
        System.out.println("Per person cost before tip: $" + perPersonCostBeforeTip);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + totalCostPerPerson);


    }
}
