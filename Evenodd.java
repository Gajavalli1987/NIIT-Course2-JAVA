import java.util.Scanner;
class Evenodd{
    public static void main(String[] args) {
        
    int num1;
    Scanner inputscanner = new Scanner(System.in);
    System.out.println("Enter a number :");
    num1 = inputscanner.nextInt();
    System.out.println(num1 + " is an " + (num1 % 2 == 0 ? "even" : "odd") + " number");
 
     }
}