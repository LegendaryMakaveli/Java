import java.util.Scanner;

public class FlipGame {

public static void main(String[] args) {

Scanner input = new Scanner (System.in);

int flipCoin = (int) (Math.random ( ) * 2);
 
System.out.println("Guess number between 0 and 1: ");
int number = input.nextInt();

if(number == 1 || number == 0) {
     if (number == flipCoin) {
     System.out.print("Head!");
    } else if(number != flipCoin) {
     System.out.println("Tail  but take another chance");
    int newNumber = input.nextInt();

  if (number != flipCoin) {
     System.out.print("Incorrect!");
    }
}
} else  {
  System.out.print("As how nah!... Guess from 0 and 1 bruh!");
}
}
}