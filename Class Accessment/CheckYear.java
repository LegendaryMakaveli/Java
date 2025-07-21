import java.util.Scanner;

public class CheckYear {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter a year: ");
int year = input.nextInt();

if (year > 999) {
   if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
   System.out.printf("%d is a leap year", year);
} else {
   System.out.printf("%d is not a leap year");
}
} else {
   System.out.println("Put better number");
}
}
}