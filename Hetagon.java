import java.util.Scanner;

public class Hetagon {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the side: ");
double side = input.nextDouble();

double firstCal = 3 * 1.732;
double secondCal = (firstCal) / 2;
double sum = secondCal * (side * side);

System.out.printf("The area of the hexagon is: %.4f", sum);
}
}