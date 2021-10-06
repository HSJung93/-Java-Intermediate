package synch;

public class ThreadSynchronizedTest {

    public static void main(String[] args) {

//        Task task = new Task();
        TaskSynch task = new TaskSynch();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("t1-Thread");
        t2.setName("t2-Thread");

        t1.start();
        t2.start();
    }

}
