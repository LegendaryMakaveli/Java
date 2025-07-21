import java.util.Scanner;

public class AlmightyFormula {

public static void main(String[] args) {

Scanner quadratic = new Scanner(System.in);

System.out.print("Enter input A");
double a = quadratic.nextDouble();

System.out.print("Enter input B");
double b = quadratic.nextDouble();

System.out.print("Enter input C");
double c = quadratic.nextDouble();

double unknow = (b * b) - 4 * a * c;

double almost = (-b + Math.sqrt(unknow)) / (2 * a);

double x = (-b - Math.sqrt(unknow)) / (2 * a);

if( unknow >= 0) {

System.out.printf("Your Answer is %.2f%n ", almost);
System.out.printf("Your Answer is %.2f ", x);
} else {
System.out.println("There is no root");
}
}
}