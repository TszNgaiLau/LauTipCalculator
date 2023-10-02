import java.util.Scanner;
import java.util.ArrayList;
public class TipCalculator {
    public static void main(String[] args)  {
        ArrayList items = new ArrayList();
        Scanner scan = new Scanner(System.in);
        //All the initial information needed to continue the code is taken from here.
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What is your tip percentage(0-100): ");
        int tip = scan.nextInt();
        scan.nextLine();
        System.out.print("Perfect, how many of you would be covering the tips for the other guest(If no one does so, please enter your party size again): ");
        people = scan.nextInt();
        scan.nextLine();
        double cost = 0;
        double total = 0;
        String item;
        // A while loop is use here to take in the total amount of money spent, and as well as a option to enter the item each price correlates to.
        while (cost != -1)  {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
            scan.nextLine();
            total += cost;
            // i learned how to implement an arraylist from here: https://www.youtube.com/watch?v=pTAda7qU4LY
            if (cost != -1) {
                System.out.print("Enter the item: ");
                item = scan.nextLine();
                items.add(item);
            }
        }
        //All the calculations done to find the values need.
        total++;
        double perTip = (double) tip / 100;
        double totalTip = total * perTip;
        //I learned how to round from here: https://www.youtube.com/watch?v=Qp_831lIzjE
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        double totalBillWithTip = totalTip + total;
        totalBillWithTip = Math.round(totalBillWithTip * 100.0) / 100.0;
        double perPersonCostBeforeTip = total / people;
        perPersonCostBeforeTip = Math.round(perPersonCostBeforeTip * 100.0) / 100.0;
        double tipPerPerson = totalTip / people;
        tipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        double totalCostPerPerson = perPersonCostBeforeTip + tipPerPerson;
        totalCostPerPerson = Math.round(totalCostPerPerson * 100.0) / 100.0;

//Everything is printed here.
        System.out.println("---------------------------------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + totalTip);
        System.out.println("Total bill with tip: $" + totalBillWithTip);
        System.out.println("Per person cost before tip: $" + perPersonCostBeforeTip);
        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total cost per person: $" + totalCostPerPerson);
        System.out.println("---------------------------------------------------");
        System.out.println("Items ordered:");
        //I learned how to iterate my list from here: https://www.youtube.com/watch?v=ZNpavInRoXA&t=181s
        for(int i=0;i<items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
