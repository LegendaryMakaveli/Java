import java.util.Scanner;

public class FirstArray {

public static void main(String... args) {

Scanner input = new Scanner(System.in);
int i = 0;
int [] number = new int[10];
while (i < 10) {
System.out.println("Enter  a number");
number[i] = input.nextInt();

i++;
}
System.out.println("I want array index 3: " + number[8]);
}
}