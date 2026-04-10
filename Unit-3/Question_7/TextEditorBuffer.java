/*7. Define a class TextEditorBuffer.
 Create a string using StringBuffer.
 Append text to the string.
 Insert text at a specific position.
 Reverse the final string and display it.*/
class TextEditorBuffer {

    public static void main(String[] args) {

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");

        // Insert text at specific position
        sb.insert(5, " Java");

        // Display after append and insert
        System.out.println("After Append & Insert: " + sb);

        // Reverse the string
        sb.reverse();

        // Display reversed string
        System.out.println("Reversed String: " + sb);
    }
}