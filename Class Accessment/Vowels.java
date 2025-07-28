import java.util.Scanner;

public class Vowels {

public static void main(String... makaveli) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a sentence");
String sentence = input.nextLine();
String again;
int vowelCount= 0;

for(int count = 0; i < sentence.length(); count++) {
again = sentence.toLowerCase();
char letter = again.charAt(count);
if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
	vowelCount++;
	}
}
System.out.println("The total vowel count is: " + vowelCount);
}
}