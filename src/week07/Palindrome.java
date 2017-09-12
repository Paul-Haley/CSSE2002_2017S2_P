package week07;

public class Palindrome {
    public static boolean palindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        return s.charAt(0) == s.charAt(s.length() - 1) ? 
                palindrome(s.substring(1, s.length() - 1)) : false;
    }
    
    public static boolean palindromeIterative(String s) {
        for (int i = 0; i < s.length()/2; ++i) {
            if (s.charAt(0) != s.charAt(s.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
