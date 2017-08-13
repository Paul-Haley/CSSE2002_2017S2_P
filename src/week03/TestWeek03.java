package week03;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.*;

public class TestWeek03 {
    
    @Test
    public void testFac() {
        //Assert.assertEquals(1, Week03.fac(1));
        Assert.assertEquals(120, Week03.fac(5));
    }
    
    @Test
    public void testDuplicate() {
       int[] a = {}; //base case, no elements; result = false
       int[] b = {1};
       int[] c = {0, 1};
       int[] d = {1, 1};
       int[] e = {1, 2, 3, 4, 5};
       int[] f = {1, 2, 3, 3, 5};
       Assert.assertFalse(Week03.duplicates(a));
       Assert.assertFalse(Week03.duplicates(b));
       Assert.assertFalse(Week03.duplicates(c));
       Assert.assertTrue(Week03.duplicates(d));
    }
    
    @Test
    public void testPalindrome() {
        String a = ""; //base case, empty; true
        String b = "b"; //base case, 1 char; true
        String c = "ab";
        String d = "aa";// base case, 2 char, same; true
        String e = "racecar";
        String f = "doggy";
        String g = "stanley yelnats";//holes
    }

}
