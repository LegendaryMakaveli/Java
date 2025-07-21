import java.util.Scanner;

public class Factoral {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter a number to get the factoral: ");
int number = input.nextInt();

int total = 1;
while (number >= 1) {
   total *= number;
number--;
}
System.out.println(total + " "  +  "is the factoral");
}
}