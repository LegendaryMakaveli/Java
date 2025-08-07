import java.util.Scanner;

public class VowelCount {

public static void main(String... makaveli) {

int [] array = {78,5,3,6,8,2,7,4};

int largest = 0;
int secondLargest = 0;
int smallest = 0;

for(int count = 0; count < array.length; count++) {

	if (array[count] > largest) {
	largest = array[count];
	}
}

for (int counter = 0; counter < array.length; counter++) {
	if (largest == array[counter]) {
		continue;
	} else if (array[counter] > secondLargest) {
		secondLargest = array[counter];
	}
}

for (int count = 0; count < array.length; count++) {
	if (array[count] == largest || array[count] == secondLargest) {
		continue;
	} else if (array[count] < secondLargest) {
		smallest = array[count];
	}

}
System.out.println("Largest is: " + largest);
System.out.println("Second Largest is: " + secondLargest);
System.out.println("Smallest is: " + smallest);
}
}