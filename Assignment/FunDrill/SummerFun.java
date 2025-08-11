import java.util.Scanner;

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






















































public static void main(String... makaveli) {
	greetOwner();
	petChooser();
	getFavoriteNumber();
}


}