public class Palindrome {

    public boolean[] isPalindrome(String[] arrays) {
        boolean[] palindrome = new boolean[arrays.length];

        for (int count = 0; count < arrays.length; count++) {
            String word = arrays[count];
            String reversed = "";

            for (int counter = word.length() - 1; counter >= 0; counter--) {
                reversed += word.charAt(counter);
            }

            if (word.equalsIgnoreCase(reversed)) {
                palindrome[count] = true;
            } else {
                palindrome[count] = false;
            }
        }

        return palindrome;
    }
}
