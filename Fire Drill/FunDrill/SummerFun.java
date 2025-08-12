import java.util.Scanner;
import java.util.Arrays;

public class SummerFun {


public static void greetOwner() {
Scanner input = new Scanner(System.in);

System.out.print("Enter your name:  ");
String name = input.nextLine();

if (name.equalsIgnoreCase("Alex")) {
		System.out.println("Hello, friend!");
	} else {
		System.out.println("Hi, stranger!");
	}

}

public static void petChooser() {
Scanner input = new Scanner(System.in);
System.out.print("Enter a pet name:   ");
String petName = input.nextLine();

if (petName.equalsIgnoreCase("dog")) {
		System.out.println("Woof! Dogs are awesome!");
	} else {
		System.out.println("Cool choice, but i love dogs!");
	}

}

public static void getFavoriteNumber() {
Scanner input = new Scanner(System.in);
int FAVORITENUMBER = 7;
System.out.print("Take a guess of my fav number:  ");
int number = input.nextInt();

if (number ==  FAVORITENUMBER) {
	System.out.println("That's my favorite number!");
	} else {
	System.out.println("Nice try, guess again!");
	}
}

public static void countToFive() {
	for(int count = 1; count <=5 ; count++) {
		int number = count;
	System.out.println("Number" + " " +  count);
	}
}

public static boolean checkEvenOrOdd(int number) {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer:  ");
int numbers  = input.nextInt();

if (numbers % 2 == 0) {
		return true;
	} else {
		return false;
	}
}

public static void multipleOfThree() {

for (int count = 3; count < 15; count+=3) {
	int number = count;
	System.out.print(number + ",");
	}

}


public static void passwordChecker() {
Scanner input = new Scanner(System.in);
String PASSWORD = "secure123";
System.out.print("Enter your password:  ");
String userInput = input.nextLine();

if (userInput.equalsIgnoreCase(PASSWORD)) {
	System.out.println("Access granted! Welcome!");
	} else {
		System.out.println("Access denied!");
	}

}


public static void countDown() {

for (int count = 10; count >=1; count--) {
	int number = count;
	System.out.println(number);
	}

}


public static void trafficLight() {
Scanner input = new Scanner(System.in);
System.out.print("Enter the traffic light color at the moment:  ");
String userInput = input.nextLine();

if (userInput.equalsIgnoreCase("Green")) {
		System.out.println("Go!");
	} else if (userInput.equalsIgnoreCase("Red")) {
		System.out.println("Stop!");
	}else if (userInput.equalsIgnoreCase("Yellow")) {
		System.out.println("Wait!");
	} else {
		System.out.println("you dey craze!");
	}

}


public static int [] squareNumber(int [] number) {
	int [] newArray = new int [number.length];
for (int count = 0; count < number.length; count++) {
	newArray[count] = number[count] + number[count];
}
return newArray;

}


public static void positiveOrNegative() {
Scanner input = new Scanner(System.in);
System.out.print("Enter an integer:  ");
int userInput = input.nextInt();

if (userInput > 0) {
		System.out.println("Positive!");
	} else if (userInput < 0) {
		System.out.println("Negative!");
	} else {
		System.out.println("Zero!");
	}

}

public static void loopingStars() {
int counter = 0;
for (int count = 1; count <= 5; count++) {
	System.out.println("*");
for (int index = 1; index <= 5; index++) {
		counter++;
	}
}
System.out.println("Total star is: " + counter);


}


public static void ageRestriction() {
Scanner input = new Scanner(System.in);
System.out.print("Enter your age:  ");
int userInput = input.nextInt();

if (userInput >=10) {
		System.out.println("Welcome to the show!");
	} else {
		System.out.println("Dey go house, you are too young!");
	}

}

public static int countNumber(int number) {
int counter = 0;
for (int count = 1; count <= number; count++) {
	counter+=count;
}
return counter;


}

public static void guessTheAnimak() {
Scanner input = new Scanner(System.in);
System.out.print("Guess an animal:  ");
String userInput = input.nextLine();

if (userInput.equalsIgnoreCase("dog")) {
		System.out.println("Correct! it's a dog!");
	} else {
		System.out.println("Nope, it's a dog");
	}

}

public static void countByTwo() {
for (int count = 1; count <= 10; count++) {
	 if (count % 2 == 0) {
			System.out.print(count + ", ");
		}
	}
}


public static void temperatureCheck() {
Scanner input = new Scanner(System.in);
System.out.print("Enter today's temperature:  ");
int userInput = input.nextInt();

if (userInput > 30) {
		System.out.println("Hot!");
	} else if (userInput < 15) {
		System.out.println("Cold");
	} else if (userInput >= 15 && userInput <= 30){
		System.out.println("Nice!");
	}

}

public static void printYourName() {
Scanner input = new Scanner(System.in);
System.out.print("Enter your name:  ");
String userInput = input.nextLine();

for (int user = 1; user <= 3; user++) {
		System.out.println(userInput);
	}
}


public static void magicNumber() {
Scanner input = new Scanner(System.in);
System.out.print("Guess the magic number:  ");
int userInput = input.nextInt();

if (userInput == 42) {
		System.out.println("You found the magic number!");
	} else {
		System.out.println("Keep looking!");
	}
}


public static void countingUp() {
for (int count = 1; count <= 7; count++) {
		System.out.print(count + ", ");
	}
}


public static void guessNumber() {
Scanner input = new Scanner(System.in);
int  userInput;
do{
System.out.print("Enter a number:  ");
userInput = input.nextInt();

if (userInput != 8) {
	System.out.println("Try again");
} else {
	System.out.println("Correct!");
	}

}while (userInput !=  8);

}

public static void multiplicationTable() {
int number = 5;
int sum = 1;
for (int count = 1; count <= 10; count++) {
sum = number * count;
}
System.out.print(sum);
}


public static void gradeCalculator() {
Scanner input = new Scanner(System.in);
System.out.print("Enter student score (1-100):  ");
int userInput = input.nextInt();

if (userInput >= 90) {
		System.out.println("A");
	} else if (userInput >= 80 && userInput < 90) {
		System.out.println("B");
	} else if (userInput >= 70 && userInput < 80){
		System.out.println("C");
	} else {
		System.out.println("F");
	}

}

 
public static int [] nestedEvenChecker(int [] number) {

int [] newArray = new int [number.length];
int [] overAll = new int [number.length];

for (int count = 0; count < number.lenght; count++) {
	newArray = number[count];
	if (newArray % 2 == 0) {
		overall = newArray;

	}
}
return overAll;
}


public static void PasswordRetry() {
Scanner input = new Scanner(System.in);
String CORRECT = "python";

for (int count = 1; count < 4; count++) {
System.out.print("Enter correct password:  ");
String userInput = input.nextLine();

if (userInput == CORRECT) {
	System.out.println("Success!")
}else {
		System.out.println("Try Again!");
	}
if (count == 3) {
		System.out.println("Locked Out");
	}
}
}

public static int starTriangle(int number) {
for (count = 1; count <= number; count++) {
for (counter = count; counter <= number; counter++) {
	System.out.println("*");
	}
	System.out.println(" ");
	}

}

public static int divisibleByThreeAndFive(int number) {
for (int count = 1; count <= number; count++) {
	if (count % 3 == 0 && count % 5 == 0) {
		System.out.println(count);
	}
}


}











public static void main(String... makaveli) {
	 gradeCalculator();
	//multiplicationTable();
	//guessNumber();
	//countingUp();
	//magicNumber();
	//greetOwner();
	//petChooser();
	//getFavoriteNumber();
	//multipleOfThree();
	//passwordChecker();
	//int [] number = {3,5,4,3,5,6,7,5,7};
	//System.out.print(Arrays.toString(squareNumber(number)));
	//countToFive();
	//countDown();
	 //trafficLight();
	//positiveOrNegative();
	//loopingStars();
	//ageRestriction();
	//System.out.print(countByTwo(10));
	//guessTheAnimak();
	//countByTwo();
	//temperatureCheck();
	 //printYourName();
}
}