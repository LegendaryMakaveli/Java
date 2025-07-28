import java.util.Scanner;

 public class Smallest {

 public static void main(String[] args) {

 Scanner maka = new Scanner(System.in);

 System.out.println("Enter first integer");
 int one = maka.nextInt();

 System.out.println("Enter second integer");
 int two = maka.nextInt();

 System.out.println("Enter third integer");
 int three = maka.nextInt();

 int sum = one + two + three;
 int product = one * two * three;
 int average = (one  + two + three) /  three;
  
 System.out.println("The sum of the integers is:  "  + sum);
 System.out.println("The product of the integers is:  "  +  product);
 System.out.println("The average of the integers is: " + average);
 
 int smallest = one;
 
 if( smallest > two);
 smallest = two;

if (smallest > three);
smallest = three;

System.out.print("smallest is " + smallest);


}
}