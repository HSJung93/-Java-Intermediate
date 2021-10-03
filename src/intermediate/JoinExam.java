package intermediate;

public class JoinExam {
    public static void main(String[] args) {
        MyThread5 thread = new MyThread5();
        thread.start();

        System.out.println("시작");

        // 스레드가 멈출 때 까지 기다리게 해주는 메소드이다.
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("종료");
    }
}
