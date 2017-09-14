package week08;

public class SelectionSort {

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {3, 2, 1};
        int [] c = {5, 3, 4};
        sort(a);
        sort(b);
        sort(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
    /**
     * @ensure elements of a are sorted from smallest to largest
     */
    static void sort(int [] a) {
        int low = 0;
        int small = 0;
        while (low < a.length) {
            for (int i = small; i <= a.length; i++) {
                if (a[i] <= a[small]) {
                    small = i;
                }
                
                int tmp = a[low];
                a[low] = a[small];
                a[small] = tmp;
                
                low++;
            }
        }
    }
}
