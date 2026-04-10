/*6. Create a class WordCounter.
 Accept a sentence from the user.
 Use StringTokenizer to count words.

 Display total number of words.*/
import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {

    String sentence;

    void countWords() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();

        // Create StringTokenizer object
        StringTokenizer st = new StringTokenizer(sentence);

        int count = st.countTokens();

        // Display total words
        System.out.println("Total number of words: " + count);
    }

    public static void main(String[] args) {
        WordCounter obj = new WordCounter();
        obj.countWords();
    }
}