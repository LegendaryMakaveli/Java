import java.util.Scanner;
import java.util.Arrays;

public class ArrayKata {

public static void main(String... makaveli) {

int [] numbers = {3,4,2,5,6,7,2,3,2,8,8,9,20};

System.out.println("The maximum number is: " + KataArrays.maximumInArrays(numbers));

System.out.println("The minimum number is: " + KataArrays.minimumInArrays(numbers));

System.out.println("The sum of the array is: " + KataArrays.sumOfArray(numbers));

System.out.println("The sum of even number is : " + KataArrays.sumOfEvenNumbersInArray(numbers));

System.out.println("The sum of odd number is: " + KataArrays.sumOfOddNumbersInArray(numbers));

System.out.println("The maximum and minimum of the array are: " + Arrays.toString(KataArrays.maximumAndMinimumOfArray(numbers)));

System.out.println("The total of even numbers in  the array are: " + KataArrays.numberOfEvenNumbersInArray(numbers));

System.out.println("The total of odd numbers in  the array are: " + KataArrays.numberOfOddNumbersInArray(numbers));

System.out.println("The  even numbers in  the array are: " + Arrays.toString(KataArrays.evenNumberInArray(numbers)));

System.out.println("The  odd numbers in  the array are: " + Arrays.toString(KataArrays.oddNumberInArray(numbers)));

System.out.println("The  Square of the numbers in the array are: " + Arrays.toString(KataArrays.squareNumbersInArray(numbers)));
}
}