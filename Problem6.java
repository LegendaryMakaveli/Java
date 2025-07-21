import java.util.Scanner;

public class Problem6 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter driving distance: ");
double distance = problem.nextDouble();

System.out.print("Enter miles per gallon: ");
double miles = problem.nextDouble();

System.out.print("Enter price per gallon: ");
double price = problem.nextDouble();

double calculate = (distance / miles) * price;


System.out.print("The cost of driving is: " + calculate);
}
}

/* formular for this calculation is "distance divided by miles multiply by price" */