import java.util.Scanner;

public class Problem2 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter first triangle point: ");
double x1 = problem.nextDouble();

System.out.print("Enter second triangle point: ");
double y1 = problem.nextDouble();

System.out.print("Enter last triangle point: ");
double x2 = problem.nextDouble();

System.out.print("Enter last triangle point: ");
double y2 = problem.nextDouble();

System.out.print("Enter last triangle point: ");
double x3 = problem.nextDouble();

System.out.print("Enter last triangle point: ");
double y3 = problem.nextDouble();

double side1 =Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
double side2 =Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
double side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

double math = (side1 + side2 + side3) / 2;

double cal = (math - side1) * (math - side2) * (math - side3);

double side  = math * cal;

double area = Math.sqrt (side);

System.out.printf("The area of the triangle is: %.2f%n ",  area);
}
}

/* s = (side1 + side2 + side3) / 2
   
   area = ---------------------------------------------(this is a square root oo)
          s(side - side1)*(side - side2)*(side - side3);  */
       