import java.util.Arrays;
import java.util.Scanner;
public class NumberInArray {


public static int numberInArrays(int [] value, int number) {
int numberCount = 0;

for (int i = 0; i < value.length; i++) {
	if (value[i] == number) {
		numberCount++;
	}

}

return numberCount;


}


public static void main(String... makaveli) {
Scanner input = new Scanner(System.in);
int [] request = new int [10];
System.out.println("Enter  numbers:   ");
int num = 0;
for (int i = 0; i < 8; i++) {
request[i] = input.nextInt();
num = 2;
}

System.out.println("Count is:  " + numberInArrays(request, num));
}









}