package week02;

public class MyMath {//though

    public static void main(String[] args) { //main method
        System.out.println(MyMath.abs(-10));
        
        System.out.println("factorials 5!");
        System.out.println(MyMath.factorial(5));
        System.out.println(MyMath.factorialLoop(5));
        
        System.out.println("Fibonnacci number 6th");
        System.out.println(MyMath.fibonacci(6));
        System.out.println(MyMath.fibonacciLoop(6));
        System.out.println("Golden ratio ~= " + MyMath.goldenRatioApprox(7));
    }

    /**
     * Returns the absolute value
     * @param a number to have absolute value returned
     * @return  absolute value of a
     */
    private static int abs(int a) {
        if (a >= 0) {
            return a;
        }
        return -a;
        //return Math.abs(a);
    }
    
    private static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
    
    private static int factorialLoop(int n) {
        int total = n--;
        for (; n > 0; --n) {
            total *= n;
        }
        return total;
    }
    
    /**
     * 
     * @param n nth number
     * @return
     */
    private static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    private static int fibonacciLoop(int n) {//1,1,2,3,5,8,13,21
        if (n <= 2) return 1; 
        int oneAgo; // f(n - 1)
        int twoAgo = 1; // f(n - 2)
        int next = 0;;
        while (n > 0) {
            oneAgo = next;
            next = twoAgo + oneAgo;
            twoAgo = oneAgo;
            --n;
        }
        return next;
    }
    
    private static float goldenRatioApprox(int n) {
        float upper = fibonacci(n + 1);
        float lower = fibonacci(n);
        return upper/lower;
    }
}
