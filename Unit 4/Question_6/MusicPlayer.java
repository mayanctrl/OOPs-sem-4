/*16. Music Player Application
Create a class MusicPlayer. Create thread using Thread class.
Display song progress using sleep.
Output: Playing song...
Progress 1
Progress 2
Progress 3.*/
class MusicPlayer implements Runnable {

    public void run() {

        System.out.println("Playing song...");

        try {
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000); // 1 second delay
                System.out.println("Progress " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {

        // Create object of Runnable class
        MusicPlayer obj = new MusicPlayer();

        // Pass it to Thread
        Thread t = new Thread(obj);

        // Start thread
        t.start();
    }
}