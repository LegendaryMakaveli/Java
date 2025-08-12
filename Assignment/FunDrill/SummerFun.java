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










































public static void main(String... makaveli) {
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
}
}