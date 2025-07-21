import java.util.Scanner;

public class Makaveli {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter Student Names In Full:  ");
String nameOne = input.nextLine();
String nameTwo = input.nextLine();
String nameThree = input.nextLine();

System.out.println("Enter Student Scores For Each Name Respectively:  ");
int numberOne = input.nextInt();
int numberTwo = input.nextInt();
int numberThree = input.nextInt();

if (numberOne > numberTwo && numberOne > numberThree) {
  System.out.println("The first student is :  " + nameOne +  " " + "with the score: " + numberOne);
} else if (numberTwo > numberOne && numberTwo > numberThree) {
  System.out.println("The first student is:  " + nameTwo + " " + "with the score:" + numberTwo);
} else if (numberThree > numberTwo && numberThree > numberOne) {
  System.out.println("The first student is: "+ nameThree  + " " + "with the score:" + numberThree);
}

if (numberOne < numberTwo && numberOne > numberThree) {
  System.out.println("The second student is: " + nameOne + " " + "with the score:" + numberOne);
} else if (numberOne > numberTwo && numberOne < numberThree) {
  System.out.println("The second student is: " + nameOne + " " + "with the score:" + numberOne);
} else if (numberTwo < numberThree && numberTwo > numberOne) {
  System.out.println("The second student is: " + nameTwo + " " + "with the score:" + numberTwo);
} else if (numberTwo > numberThree && numberTwo < numberOne) {
  System.out.println("The second student is: " + nameTwo + " " + "with the score:" + numberTwo);
} else if (numberThree < numberOne && numberThree > numberTwo) {
   System.out.print("The second student is: " + nameThree + " " + "with the score:" + numberThree);
} else if (numberThree > numberOne && numberThree < numberOne) {
   System.out.print("The second student is: " + nameThree + " " + "with the score:" + numberThree);
}

if (numberOne < numberTwo && numberOne < numberThree) {
  System.out.println("The last student is: " + nameOne  + " " +"with the score:" + numberOne);
} else if (numberTwo < numberThree && numberTwo < numberOne) {
  System.out.println("The last student is: " + nameTwo +  " " + "with the score:" + numberTwo);
} else if (numberThree < numberOne && numberThree < numberTwo) {
  System.out.println("The last student is: " + nameThree + " " + "with the score" + numberThree);
}
}
}