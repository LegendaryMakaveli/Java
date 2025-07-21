public class Kata {

public static int isEven (int evenNumber) {
	
	if ( evenNumber % 2 == 0) {
		System.out.println("True");
	} else {
		System.out.println("False");
}
  return evenNumber;
}


public static int isPrime (int primeNumber) {

	if (primeNumber % 2 == 1) {
		System.out.println("True");
	} else if (primeNumber == 2) {
		System.out.println("True");
	} else {
		System.out.println("False");
}
  return primeNumber;
}

public static int subSolution(int numberOne, int numberTwo) {

		int sum = numberOne - numberTwo;
System.out.println("Sum is: " + sum);
  return sum;
}

public static float divSolution (int numberOne, int numberTwo) {

		float total =(int) numberOne / numberTwo;
	if (numberTwo == 0.0f) total = 0;

	System.out.println("Total is: " + total);

   return total;
}

public static int isFactor(int factorNumber) {

for (int i = 1; i <= factorNumber; i++) {
	
	if ( factorNumber % i == 0) {
		System.out.print(i + " ");

}
}
 return factorNumber;
}

public static int isSquare (int squareNumber) {

	int root = (int) Math.sqrt (squareNumber);
		if (root * root == squareNumber) {
			System.out.println("True");
	} else {
			System.out.println("False");
}
 return root;
}

public static int isParlindrome (int parlindromeNumber) {

int numberOne = (parlindromeNumber / 10000) % 10;
int numberTwo = (parlindromeNumber / 1000) % 10;
int numberThree = (parlindromeNumber / 100) % 10;
int numberFour = (parlindromeNumber / 10) % 10;
int numberFive = parlindromeNumber % 10;

if (numberFive == numberOne && numberTwo == numberFour) {
	System.out.println("True");
} else {
	System.out.println("False");
}
 return parlindromeNumber;
}

public static long isFactorial (int factoralNumber) {

 int total = 1;
while (factoralNumber >= 1) {
   total *= factoralNumber;
factoralNumber--;
}
System.out.println(total + " "  +  "is the factoral");

return total;
}


public static long isSquareOf (int sqaureOf) {

int sum = sqaureOf * sqaureOf;

System.out.println(sum + " " + "is the square");

 return sum;
}
}