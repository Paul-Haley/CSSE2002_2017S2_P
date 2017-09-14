package week08;

public class SelectionSortFixed {

    public static void main(String[] args) {
        
        int [] a = {5, 3, 4};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("\n");
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        
    }
    
    /**
     * @ensure elements of a are sorted from smallest to largest
     */
    static void sort(int [] a) {
        int small; // smallest found in cycle
        /* the while loop can be seen as a for loop with the variable made 
         * above and the ++ at the bottom.
         */
        for (int i = 0; i < a.length - 1; i++) { 
            small = i;
            for (int j = i + 1; j < a.length; ++j) {
                if (a[j] < a[small]) {
                    small = j;
                }
            }
            int tmp = a[i];
            a[i] = a[small];
            a[small] = tmp;
        }
    }
}
