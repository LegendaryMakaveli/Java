import java.util.Scanner;

public class SplitString {

public static void main(String... makaveli) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a sentence and press enter");
String sentence = input.nextLine();
sentence = sentence.toUpperCase();

String[] lines= sentence.split(" ");

for (String line : lines) {
	System.out.println(line);
}


}
}