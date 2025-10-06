/**
* Partner Lab 2 - Antics Methods
* This class has simple methods to check if a word is a palindrome or abecedarian.
*
* @author 
* Lenis Cheung (isPalindrome and isAbecedarian)
*/
public class Antics {

    // Checks if the text is a palindrome (same forward and backward)
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

 // Checks if the text is abecedarian
    public static boolean isAbecedarian(String text) {
        if (text == null) {
            return false;
        }

        text = text.replaceAll("[^a-z A-Z]", "").LowerCase();
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) > text.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}