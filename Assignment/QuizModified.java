import java.util.Scanner;
import java.util.Random;

public class QuizModified {

public static void main(String... args) {

Scanner input = new Scanner(System.in);
Random myRandom = new Random();

int totalPass = 0;
int totalFail = 0;
int generator;
int numberOne;
int numberTwo;
int userInput;

for (int i = 1; i <= 10; i++) {
numberOne =  myRandom.nextInt(100);
numberTwo =  myRandom.nextInt(100);
generator = myRandom.nextInt(4);

if (generator == 0) {
System.out.print("What is" + "  " +  numberOne + "  " + "+" +  "  " + numberTwo + "  " + "=" + "  "  );
userInput = input.nextInt();
	if (numberOne + numberTwo == userInput) {
		System.out.println("You sabi book");
		totalPass = totalPass + 1;
	} else {
		System.out.println("Oga you nur sabi book");
		totalFail = totalFail + 1;
	}
}

if (generator == 1) {
System.out.print("What is" + "  " +  numberOne + "  " + "*" +  "  " + numberTwo + "  " + "=" + "  "  );
userInput = input.nextInt();
	if (numberOne * numberTwo == userInput) {
		System.out.println("You sabi book");
		totalPass = totalPass + 1;
	} else {
		System.out.println("Oga you nur sabi book");
		totalFail = totalFail + 1;	
	}
}

if (generator == 2) {
System.out.print("What is" + "  " +  numberOne + "  " + "/" +  "  " + numberTwo + "  " + "=" + "  "  );
userInput = input.nextInt();
//if (numberTwo == 0) 
	if (numberOne / numberTwo == userInput) {
		System.out.println("You sabi book");
		totalPass = totalPass + 1;
	} else {
		System.out.println("Oga you nur sabi book");
		totalFail = totalFail + 1;	
	}
}

if (generator == 3) {
System.out.print("What is" + "  " +  numberOne + "  " + "-" +  "  " + numberTwo + "  " + "=" + "  "  );
userInput = input.nextInt();
	if (numberOne - numberTwo == userInput) {
		System.out.println("You sabi book");
		totalPass = totalPass + 1;
	} else {
		System.out.println("Oga you nur sabi book");
		totalFail = totalFail + 1;	
	}
}
}
}
}