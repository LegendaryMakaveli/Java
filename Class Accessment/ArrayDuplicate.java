import java.util.Scanner;
import java.util.Arrays;

public class ArrayDuplicate {

public static int [] UniqueNumberInArray(int [] value) {

int [] uniqueValue = new int [value.length];
int count = 0;
for (int i = 0; i < value.length; i++) {
	int counter = 0;
	int number = value[i];

for (int j = i+1 ; j < value.length; j++) {
	int numberTwo = value[j];
	if (number == numberTwo) {
                     counter++;
		}
	if (i == j) {
		continue;
		}


	}
	if (counter < 1) {
		uniqueValue[count] = number;
		count ++;
		}
	
	}
      	return uniqueValue ;
}

public static void main(String... makaveli) {
int request [] = {1,3,3,7,4};

System.out.println(Arrays.toString(UniqueNumberInArray(request)));
}



































}