package intermediate;

public class ThreadExam {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        // ! Thread 동작 시킬 때 오버라이드 한 run을 동작시키는 것이 아니라, start()를 호출한다.
        t1.start(); // main과 thread로 run으로 흐름이 나뉜다.
        t2.start(); // 2번째 스레드 스타트 해서 3개

        System.out.println("main end !!!");
        // main 스레드가 종료되었다고 프로그램이 종료되는 것이 아니라 다른 모든 스레드가 종료되어야 프로그램이 종료된다.


    }
}
