import java.util.Scanner;

public class LargestAndSmallesWithLoop {

public static void main(String... args) {

Scanner input = new Scanner(System.in);

int number = 0;
int largest = 0;
int smallest = 0;

while (number != -1) {

System.out.println("Enter a number");
 number = input.nextInt();

if (number > largest) largest = number;
if (number < smallest) smallest = number;
}
System.out.println("Largest is: " + largest);
System.out.println("Smallest is: " + smallest);
}
}