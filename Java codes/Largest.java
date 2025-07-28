import java.util.Scanner;

public class Largest{

public static void main(String[] args){

Scanner code = new Scanner(System.in);

System.out.println("Enter the first integer");
int variableOne = code.nextInt();

System.out.println("Enter the Second integer");
int variableTwo = code.nextInt();

System.out.println("Enter the Third integer");
int variableThree = code.nextInt();

System.out.println("Enter the Fourth integer");
int variableFour = code.nextInt();


System.out.println("Enter the Fifth integer");
int variableFive = code.nextInt();

int largest = variableOne;
int smallest = variableOne;

if (variableTwo > largest) largest = variableTwo;
if (variableThree > largest) largest = variableThree;
if (variableFour > largest) largest = variableFour;
if (variableFive > largest) largest = variableFive;

if (variableTwo < smallest) smallest = variableTwo;
if (variableThree < smallest) smallest = variableThree;
if (variableFour < smallest) smallest = variableFour;
if (variableFive < smallest) smallest = variableFive;

System.out.println("The largest is: " + largest);
System.out.println("The smallest is: " + smallest);

}
}
