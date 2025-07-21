import java.util.Scanner;

public class Problem3 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter enter your weight(kilograms): ");
double weight = problem.nextDouble();

System.out.print("Enter your height(meters): ");
double height = problem.nextDouble();

double result = weight / (height * height);

System.out.print("BMI is: " + result);
}
}

/* formular for bmi  weightinKilogram divided 
   by the square root of heightinMeters.....

    or weightinPounds*730 divided by the square root of kilograminInches */