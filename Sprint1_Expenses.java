import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        
    float total_expense,expense1,expense2,expense3;
    String description1,description2,description3;
    System.out.println("Welcome to Expense Tracker!");
    Scanner inputscanner = new Scanner(System.in);
    System.out.println("Enter the first expense amount (in Rs.):");
    expense1 = inputscanner.nextFloat();
    inputscanner.nextLine();
    System.out.println("Enter the description:");
    description1 = inputscanner.nextLine();
    System.out.println("Enter the second expense amount (in Rs.):");
    expense2 = inputscanner.nextFloat();
    inputscanner.nextLine();
     System.out.println("Enter the description:");
    description2 = inputscanner.nextLine();
    System.out.println("Enter the third expense amount (in Rs.):");
    expense3 = inputscanner.nextFloat();
    inputscanner.nextLine();
    System.out.println("Enter the description:");
    description3 = inputscanner.nextLine();
    
    System.out.println("Expenses Recorded:");
    System.out.println("1:" + expense1  +"   on "  + description1);
    System.out.println("2:" + expense2 + "   on " + description2);
    System.out.println("3:" + expense3 + "   on " + description3);
    total_expense = expense1+expense2+expense3;
    System.out.println("Total Expenses :" + total_expense);
    if(total_expense >1000)
        System.out.println("High expense recorded!");
    else 
        System.out.println("Within budget!");
    
     }
}