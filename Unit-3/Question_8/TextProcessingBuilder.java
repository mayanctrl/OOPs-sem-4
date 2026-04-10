/*8. Create a class TextProcessingBuilder.
 Use StringBuilder to create a string.
 Append additional text.
 Display modified string.
 Write a comment comparing StringBuilder and
StringBuffer.*/

class TextProcessingBuilder {

    public static void main(String[] args) {

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append additional text
        sb.append(" Java Programming");

        // Display modified string
        System.out.println("Modified String: " + sb);

        /*
        Difference between StringBuilder and StringBuffer:

        1. StringBuffer is thread-safe (synchronized), but slower.
        2. StringBuilder is not thread-safe, but faster.
        3. StringBuffer is used in multi-threaded environments.
        4. StringBuilder is preferred in single-threaded programs.
        */
    }
}