import java.util.Arrays;

public class NumberInMyArray {

public static int countNumberInArray(int number, int [] items) {

int count = 0;
for (int i = 0; i < items.length; i++) {
if (number == items[i]) {
	count++;
	}
}
return count;
}

public static void ma'''in(String... makaveli) {
int [] expectedNumber = {2,3,3,3,4,5,3,2,3,4,8,8,8,9,2,2,};
int findNumber = 8 ;

System.out.println("count is: " + countNumberInArray(findNumber, expectedNumber));
}


}