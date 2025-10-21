import java.util.ArrayList;

public class CloseBracket {
    public boolean checkForUncloseBracket(String brackets) {
        if (brackets.isEmpty()) throw new IllegalArgumentException("Input string cannot be empty");
        char[] openingBrackets = {'{', '(', '[', '<'};
        char[] closingBrackets = {'}', ')', ']', '>'};
        ArrayList<Boolean> bool = new ArrayList<>();

        for (int count = 0; count < openingBrackets.length; count++) {
            int openingCount = 0;
            int closingCount = 0;
            for (int counter = count; counter < brackets.length(); counter++) {
                if (openingBrackets[count] == brackets.charAt(counter)) openingCount++;
                if (closingBrackets[count] == brackets.charAt(counter)) closingCount++;
            }
            bool.add(openingCount == closingCount);
        }

        return !bool.contains(false);
    }
}
