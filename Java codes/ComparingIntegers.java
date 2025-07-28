import java.util.Scanner;
 public class ComparingIntegers{
 public static void main(String[] args){
 Scanner Scanner = new Scanner(System.in);
 
 System.out.println("Enter integer");
 int one = Scanner.nextInt();

 int two = one * one;


if (two != 100 ){ 
System.out.println(two + " "  + "is not equal to 100");
} else{
  System.out.println(two + " " + "is equal to 100");
}
 if (two > 100 || two == 100)  {
System.out.println(two + " " + "is greater than 100");
} else  {
System.out.println(two + " " + "is lesser than 100");
}
if (two < 100) {
System.out.println(two + " " + "is small to 100");
} else {
System.out.println(two + " " + "is bigger than 100");
}
} 
}