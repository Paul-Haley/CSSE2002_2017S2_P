package week02;

public class WordSet {
    public static void main(String[] args) {
        WordSet ws = new WordSet();
        ws.addWord("cat");
        System.out.println(ws.size());
        String s = "cat"; // these are not ==, but they are .equal()
        String d = "cat";
        System.out.println("Is cat in words?" + ws.contains("cat"));
        System.out.println("Is dog in words?" + ws.contains("dog"));
        
        //String s = new String("hello");

    }
    
    // Class variable
    private static int MAX_WORDS = 50;
    
    //instance variables
    private String[] words;
    private int size;
    
    // Creates a new WordSEt object, allocating space for String array and 
    // initialising size
    public WordSet() {
        this.words = new String[MAX_WORDS];
        this.size = 0;
    }

    public void addWord(String word) {
        if (size < MAX_WORDS) {
            words[size++] = word;
        }
    }
    
    public int size() {
        return size;
    }

    public boolean contains(String word) {
        for (int i = 0; i < size; i++) {
            if (words[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}
