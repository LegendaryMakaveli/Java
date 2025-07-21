import java.util.Scanner;

public class Accessment {

public static void main(String[] args){

Scanner accessment = new Scanner(System.in);

System.out.print("Enter first number");
int first = accessment.nextInt();

System.out.print("Enter second number");
int second = accessment.nextInt();

System.out.print("Enter third number");
int third = accessment.nextInt();

System.out.print("Enter fourth number");
int fourth = accessment.nextInt();

System.out.print("Enter fifth number");
int fifth = accessment.nextInt();

int biggest = first;
int smallest = second;

if(second > biggest) biggest = second;
if(third > biggest) biggest = third;
if(fourth > biggest) biggest = fourth;
if(fifth > biggest) biggest = fifth;

if(first < smallest) smallest = first;
if(third < smallest) smallest = third;
if(fourth < smallest) smallest = fourth;
if(fifth < smallest) smallest = fifth;

System.out.println("The largest number is: " + biggest);
System.out.print("The smallest number is: " + smallest);
}
}