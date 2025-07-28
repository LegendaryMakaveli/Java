import java.util.Scanner; // This is a java import

public class chapterTwo{  // This is class declaration
 public static void main(String[] args){  // main method for execution
  Scanner ikka = new Scanner(System.in);  // 
   System.out.println("Enter an integer"); // prompt a user
    int one = ikka.nextInt();   // declaring a method

     System.out.println("Enter an integer"); // second prompt
     int two = ikka.nextInt();
  int sum = one * two;  // performing the product of int one and int two
System.out.print(sum);  // Print out the value of int one and int two.
} 
}