import java.util.Scanner;

public class Alphabet {

public static void main(String[] args) {

Scanner alphabet = new Scanner(System.in);

System.out.println("Enter an alphabet");
char letters = alphabet.next().charAt(0);

if(Character.isLetter(letters)) {

if(letters == 'a'  || letters == 'A') {
  System.out.printf("%c is a vowel", letters);
} else if(letters == 'e' || letters == 'E') {
 System.out.printf ("%c is a vowel", letters);
} else if(letters == 'i' || letters == 'I') {
System.out.printf("%c is a vowel", letters);
} else if(letters == 'o' || letters == 'O') {
 System.out.printf("%c is a vowel", letters);
} else if(letters == 'u' || letters == 'U') {
 System.out.printf("%c is a vowel", letters);
} else {
System.out.printf("%c is a consonant", letters);
}
}else {
System.out.println("Don't you know the diff between alphabet and digit?....MUMU");
}
}
}