import java.util.Scanner;

public class RandomNumberGuessing {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int guessing = (int) (Math.random ( ) * Integer.MAX_VALUE);

int count = 1;
while (count <= 50) {
System.out.println("Guess a number");
int number = input.nextInt();

if (number > guessing) {
	System.out.println("Number too high");
} else if (number < guessing) {
	System.out.println("Number too low");
} else if (number == guessing) {
System.out.println("You are correct"); break;
}
count++;

}
}

}