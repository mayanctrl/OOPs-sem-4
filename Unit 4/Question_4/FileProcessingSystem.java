/*14. File Processing System
Create a class FileProcessingSystem. Simulate file reading using
try-catch. Use finally block to display cleanup message.
Output: &#39;Reading file...&#39; and &#39;Closing file resources&#39;*/
class FileProcessingSystem {

    public static void main(String[] args) {

        try {
            // Simulating file reading
            System.out.println("Reading file...");
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            // Cleanup message
            System.out.println("Closing file resources");
        }
    }
}