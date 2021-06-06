
import java.time.LocalTime;

public class ThreadClass2 extends Thread{
    public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try { Thread.sleep(5000); }
            catch(InterruptedException e) { System.out.println(e); }
        }
    }
}
