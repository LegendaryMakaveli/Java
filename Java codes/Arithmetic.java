import java.util.Scanner;
  public class Arithmetic{
  public static void main(String[] args){
  Scanner ikka = new Scanner(System.in);

  System.out.println("Enter first integer");
  int first = ikka.nextInt();

  System.out.println("Enter second integer");
  int second = ikka.nextInt();

 int third = first * first;
 int fourth = second * second;

int sub = third + fourth;

int total = third - fourth;


System.out.println("The answer is: " + total);
}
}