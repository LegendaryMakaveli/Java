import java .util.Scanner;

public class Range {

public static void main(String... makaveli) {

Scanner input = new Scanner(System.in);

int [] numbers = new int [5];
System.out.println("Enter number");
numbers [0] = input.nextInt();

int largest = numbers [0];
int smallest = numbers [0];

for(int i = 1; i < numbers.length; i++) {
System.out.println("Enter number");
numbers [i] = input.nextInt();
	if (numbers[i] > largest) largest = numbers[i];
	if (numbers[i] < smallest) smallest = numbers[i];

}
int substractionOfTheArray = largest - smallest;
System.out.println("The range in  Array is: " + substractionOfTheArray);


/**
int [] firstArray = {2, 5, 4, 7, 1};
int subtractionOfFirstArray = firstArray[3] - firstArray[4];
System.out.println("The range in first Array is: " + sumOfFirstArray);

int [] secondArray = {12, 6, 4, 5, 9};
int subtractionOfSecondArray = secondArray[0] - secondArray[2];
System.out.println("The range in second Array is: " + sumOfSecondArray);
**/
}
}