import java.util.Scanner;

public class Parlidium {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer: ");
int pall = input.nextInt();


int numberOne = pall / 1000;
int numberTwo = (pall % 1000) / 100;
int numberThree = (pall % 100) / 10;
int numberFour = pall % 10;

if(numberTwo == numberFour && pall < 1000 ){
   System.out.print("Number is a palledium");
   } else if(numberOne == numberFour && numberTwo == numberThree) {
     System.out.print("Number is a palledium");
   } else if (numberThree == numberFour && pall < 100) {
     System.out.print("Number is a palledium");
   } else {
     System.out.print("Number is not a palledium");
  } 
}
}