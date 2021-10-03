package intermediate;

public class ThreadExam2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");

        // Thread는 start 메소드가 필요한데, Runnable에는 없다.
        // 그래서 Thread 객체를 하나 만든다.
        // Runnable 을 상속받은 인스턴스를 넣어준다.
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println("main end!!!");

    }
}
