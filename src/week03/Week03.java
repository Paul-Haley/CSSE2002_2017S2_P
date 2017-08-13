package week03;

import java.util.HashSet;
import java.util.Set;

public class Week03 {
    public static void main(String[] args) {
        // 1
        //int answer = fib(50);
        //System.out.println(answer);
        
        // 2
        Date date = new Date(14,2,1969);
        System.out.println(date);
    }
    
    /**
     * Calculates nth fib number
     * @param n nth number
     * @return 
     */
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
    
    public static int fac(int n) {
        return (n <= 2) ? 2 : n * fac(n-1);
    }
    
    public static boolean duplicates(int[] a) {
        //Set<Integer> count = new HashSet<Integer>();
        //for (int number : a) {
        //    if (!count.add(number)) { 
        //        return true;
        //    }
        //}
        //return false;
 
        // 1 2 4 5 7 9
        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean palindrome(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) == str.charAt(str.length() -1)) {
            return palindrome(str.substring(1, str.length() -2));
        } else {
            return false;
        }
    }
}
