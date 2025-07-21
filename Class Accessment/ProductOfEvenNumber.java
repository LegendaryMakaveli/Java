import java.util.Scanner;

public class ProductOfEvenNumber {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a number:  ");
int number = input.nextInt();

long product = 1;

for (long i =1; i <= number; i++) {
if ( i % 2 == 0) {
     product *= i;
}
}
if (number == 0)  product = 0;
  System.out.println("The product is:  " + product);
}
}