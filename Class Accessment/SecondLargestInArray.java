import java.util.Scanner;

public class SecondLargestInArray {

public static void main(String... makaveli) {

Scanner input = new Scanner(System.in);

int[] number = new int[6];

System.out.println("Enter a number");
number[0] = input.nextInt();

System.out.println("Enter a number");
number[1] = input.nextInt();

int largest = number[0];
int smallest = number[0];
int secondLargest = number[1];

for (int i = 1; i <= 4; i++) {
System.out.println("Enter a number");
number[2] = input.nextInt();
	if (number[2] > largest) {
		secondLargest = largest;
		 largest = number[2];
	} else if (number[1] < smallest) {
		smallest = number[2];
	}

	if (number[2] > smallest && number[2] < largest) {
		secondLargest = number[2];
	} else if (number[2] < smallest && number[2] > largest) {

		secondLargest = number[2];
	}
}
System.out.println("Second largest is: " + secondLargest);
}
}