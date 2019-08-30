package palindrome;

/**
 * @author Rafał Sochacki s20047
 * @author Iwona Rymanowska s19330
 * <p>
 * Just a Palindrome checker
 */
public class Palindrome {

    private String palindrome;

    public void setPalindrome(String palindrome) {
        palindrome = palindrome.replace(" ", "");
        palindrome = palindrome.replace(",", "");
        palindrome = palindrome.replace(".", "");
        palindrome = palindrome.toLowerCase();
        this.palindrome = palindrome;
    }


    public boolean Checking() {
        for (int i = 0; i <= palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
