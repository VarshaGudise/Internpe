import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scan.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        DecimalFormat decimalFormat = new DecimalFormat("#.##############");
        String formattedArea = decimalFormat.format(area);
        String formattedPerimeter = decimalFormat.format(perimeter);

        System.out.println("The area of the circle is: " + formattedArea);
        System.out.println("The perimeter of the circle is: " + formattedPerimeter);
    }
}

