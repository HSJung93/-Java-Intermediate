package intermediate;

public class DaemonThread implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("데몬 쓰레드 실행 중");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonThread());
        thread.setDaemon(true);
        thread.start();

        // 데몬 스레드는 모든 스레드가 종료되면 같이 종료된다.

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드 종료");
    }
}
