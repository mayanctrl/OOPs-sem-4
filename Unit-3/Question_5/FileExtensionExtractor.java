/*5. Define a class FileExtensionExtractor.
 Accept a file name (example: &quot;report.pdf&quot;).
 Extract file extension using substring() method.
 Display extracted extension.*/
import java.util.Scanner;

class FileExtensionExtractor {

    String fileName;

    void extractExtension() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        fileName = sc.nextLine();

        // Find position of last dot
        int index = fileName.lastIndexOf('.');

        // Extract extension using substring()
        if (index != -1 && index != fileName.length() - 1) {
            String extension = fileName.substring(index + 1);
            System.out.println("File Extension: " + extension);
        } else {
            System.out.println("No valid file extension found");
        }
    }

    public static void main(String[] args) {
        FileExtensionExtractor obj = new FileExtensionExtractor();
        obj.extractExtension();
    }
}