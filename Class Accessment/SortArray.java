import java.util.Scanner;
import java.util.Arrays;

public class SortArray {

public static int [] sortArray(int [] scores) {

for (int rows = 0; rows < scores.length - 1; rows++) {
for (int column = rows ; column < scores.length ; column++) {
	if (scores[rows] < scores[column]) {
int temp = scores[rows];
scores[rows] = scores[column];
scores[column] = temp;

	if (scores[rows] > scores[column]) {
int anotherNumber = scores[column];
scores[column] = scores [rows];
scores[rows] = anotherNumber;
}
}
}

}
return scores;
}
public static void main(String... makaveli) {
int [] number = {40,35,49,57,61,44};

System.out.println(Arrays.toString(sortArray(number)));
}
}










