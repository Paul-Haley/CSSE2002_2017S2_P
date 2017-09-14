package week08;

import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
    
    // Black box tests
    @Test
    public void blackBoxEmpty() {
     // BASE CASE, EMPTY ARRAY
        int[] empty1 = {};
        int[] empty2 = {};
        SelectionSort.sort(empty1);
        Assert.assertArrayEquals(empty2, empty1);
    }
    
    @Test
    public void blackBoxOneElement() {       
        // BASE CASE, SINGLE ELEMENT ARRAY, 
        int[] a1 = {1};
        int[] a2 = {1};
        SelectionSort.sort(a1);
        Assert.assertArrayEquals(a2, a1);
        
    }
    
    @Test
    public void blackBoxTypical1() {       
        // NORMAL SIZE ARRAY, NOT SORTED, NO REPEATS
        int[] a1 = {3, 2, 1};
        int[] a2 = {1, 2, 3};
        SelectionSort.sort(a1);
        Assert.assertArrayEquals(a2, a1);
        
    }
 
    @Test
    public void blackBoxTypical2() {       
        // NORMAL SIZE ARRAY, SORTED, NO REPEATS
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        SelectionSort.sort(a1);
        Assert.assertArrayEquals(a2, a1);
        
    }
    
    @Test
    public void blackBoxTypical3() {       
        // NORMAL SIZE ARRAY, NOT SORTED, REPEATS
        int[] a1 = {3, 2, 3, 1};
        int[] a2 = {1, 2, 3, 3};
        SelectionSort.sort(a1);
        Assert.assertArrayEquals(a2, a1);
    }
    
    @Test
    public void blackBoxTypical4() {       
        // NORMAL SIZE ARRAY, SORTED, REPEATS
        int[] a1 = {1, 2, 3, 3};
        int[] a2 = {1, 2, 3, 3};
        SelectionSort.sort(a1);
        Assert.assertArrayEquals(a2, a1);
    }
    
    // White box tests
    @Test
    public void whiteBoxTests() {
        // Not entering while loop
        int[] a1 = {};
        int[] a2 = {};
        SelectionSort.sort(a1);
        Assert.assertArrayEquals(a2, a1);
        
        // Enter loops, enter if statement (would enter both loops and if in other implementation)
        int[] b1 = {1};
        int[] b2 = {1};
        SelectionSort.sort(b1);
        Assert.assertArrayEquals(b2, b1);
        
        // Enter loops, enter if statement, then not enter on next iteration (path coverage)
        int[] c1 = {4, 2, 3};
        int[] c2 = {2, 3, 4};
        SelectionSort.sort(c1);
        Assert.assertArrayEquals(c2, c1);
    }
}
