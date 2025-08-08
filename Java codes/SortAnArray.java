import java.util.Arrays;

public class SortAnArray {

public static int [] findTheSmallestNumberIndex(int [] numbers) {

int smallest = numbers[0];
int smallestIndex = 0;
for (int count = 0; count < numbers.length; count++) {
	if (numbers[count] < smallest) {
		 smallest = numbers[count];
		smallestIndex = count;
	}
	}
return new int [] {smallestIndex};
}

public static int [] sortTheArray(int [] numbers) {
int [] newArray = {numbers.length};
for (int count = 0; count < numbers.length; count++) {
	int smallest = findTheSmallestNumberIndex(numbers);
	newArray.add(numbers.remove(smallest));
}
return newArray;
}



public static void main(String... makaveli) {

int [] array = {4,2,5,3,6,2,1,7,8,9};

System.out.println(Arrays.toString( sortTheArray(array)));
}
}