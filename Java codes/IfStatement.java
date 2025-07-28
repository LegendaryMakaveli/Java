import java.util.Scanner;

 class IfStatement {

  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  System.out.print("Enter the student grade");
  int studentGrade = input.nextInt();
   

   if(studentGrade >=90){
   System.out.println("A");
   System.out.println("Excellent score");
 }
  else if(studentGrade >=80){
   System.out.println("B+");
   System.out.println("Perfect score");
 }
   else if(studentGrade >=70){
    System.out.println("B");
   System.out.println("Good score");
 }
   else if(studentGrade >=60){
    System.out.println("C");
   System.out.println("You can still do better");
 }
   else if(studentGrade >=50){
    System.out.println("D");
  System.out.println("Don't try this nonsense next term");
}
else if(studentGrade >=40) {
System.out.println("D");
System.out.println("Come with your parent on the day of resumption");
}
  else{
  System.out.println("F");
System.out.println("Repeat the class/level dullhead!");
 }
}
}
