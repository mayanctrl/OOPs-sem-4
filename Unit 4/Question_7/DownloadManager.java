/*17. Download Manager
Create a class DownloadManager. Create multiple threads using
Runnable interface. Each thread represents file download.
Output: Downloading messages.*/
class DownloadManager implements Runnable {

    String fileName;

    // Constructor
    DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName + "...");
    }

    public static void main(String[] args) {

        // Create multiple threads
        Thread t1 = new Thread(new DownloadManager("File1.mp4"));
        Thread t2 = new Thread(new DownloadManager("File2.pdf"));
        Thread t3 = new Thread(new DownloadManager("File3.zip"));

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}