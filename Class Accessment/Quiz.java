import java.util.Scanner;
//import java.util.random;

public class Quiz {

public static void main(String... args) {

Scanner input = new Scanner(System.in);
//Random myRandom = new Random();

int totalPasses = 0;
int totalFailure = 0;

int count = 1;
while (count <= 5) {
 int randomOne = (int) (Math.random() * 100);
int randomTwo = (int) (Math.random() * 50);
//int generator = myRandom.nextInt();
System.out.print("What is" + "  " +  randomOne + "  " + "+" +  "  " + randomTwo + "  " + "=" + "  "  );
int  answer = input.nextInt();

if (randomOne + randomTwo == answer) {
	System.out.println("Correct answer");
	totalPasses = totalPasses + 1;
} else {
	System.out.println("Wrong answer, you nur sabi book but try again sha !!");
	totalFailure = totalFailure + 1;

randomOne = (int) (Math.random() * 100);
randomTwo = (int) (Math.random() * 50);

System.out.print("What is" + "  " +  randomOne + "  " + "+" +  "  " + randomTwo + "  " + "=" + "  "  );
answer = input.nextInt();

if (randomOne + randomTwo == answer) {
	System.out.println("Correct answer");
	totalPasses = totalPasses + 1;
} else {
	System.out.println("Wrong answer, you nur sabi book but try again sha !!");
	totalFailure = totalFailure + 1;

}
}count++;
}
int sum = totalFailure++;
int sum2 = totalPasses++;
System.out.println("The sum of passes is: " + sum2);
System.out.println("The sum of failures is: " + sum);

}
}