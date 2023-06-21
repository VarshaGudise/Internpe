import java.util.Scanner;

public class average {
    /**
     * @param args
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 3 values:");
    float a = input.nextInt();
    float b = input.nextInt();
    float c = input.nextInt();
    float d = (a+b+c)/3;
    System.out.println("The average of the Numbers is:");
    System.out.println(d);
  }
}
