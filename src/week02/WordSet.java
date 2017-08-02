package week02;

public class WordSet {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static int MAX_WORDS = 50;
    private String[] words;
    private int size;
    
    // Creates a new WordSEt object, allocating space for String array and 
    // initialising size
    public WordSet() {
        words = new String[MAX_WORDS];
        size = 0;
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
        for (String current : words) {
            if (current.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
