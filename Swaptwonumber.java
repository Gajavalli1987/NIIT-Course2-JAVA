import java.util.Scanner;
class Swaptwonumber{
    public static void main(String[] args) {
    int num1,num2;
    Scanner inputscanner = new Scanner(System.in);
    System.out.println("Enter a first number (num1):");
    num1 = inputscanner.nextInt();
    inputscanner.nextLine();
    System.out.println("Enter a second number (num2):");
    num2 = inputscanner.nextInt();
    inputscanner.nextLine();
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    System.out.println("After Swapping : \n" );
    System.out.println("First number  (num1) :" + num1 + "\n");
    System.out.println("Second number (num2) :" + num2);
    
    
     }
}