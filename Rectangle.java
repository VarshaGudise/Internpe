import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the Length and Breadth values of Rectangle:");
   System.out.println("Enter the Length:");
float a = input.nextFloat();
System.out.println("Enter the Breadth:");
float b = input.nextFloat();
float c = a*b;
System.out.println("The area of the Rectangle is: "+ c);
float d = 2*(a+b);
System.out.println("The Perimeter of the Rectangle is: "+ d);
//System.out.println(d);
}
    
}
