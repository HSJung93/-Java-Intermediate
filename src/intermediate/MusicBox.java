package intermediate;

public class MusicBox {
    // 메서드에 싱크로나이즈드 키워드를 리턴 타입 앞에 넣으면
    // 여러 쓰레드들이 공유 객체의 메서드를 사용할 때 메서드에 싱크로나이즈드가 붙여지면
    // 모니터링 락이 생긴다.
    // wait 전까지는 락을 놓치 않는다.
    public synchronized void playMusicA() {
        for (int i = 0; i< 10 ; i++) {
            System.out.println("신나는 음악!!");

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB() {
        for (int i = 0; i< 10 ; i++) {
            System.out.println("슬픈 음악!!");

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicC() {
        for (int i = 0; i< 10 ; i++) {
            // 현재 객체 this가 모니터링 락을 가지게 하겠다.
            // A가 끝나면 락을 놓는데 블록에서 대기하던 스레드는 이때 실행된다.
            // 한 줄만 모니터링 락을 하니 다른 스레드가 더 잘 진입한다.
            synchronized (this) {
                System.out.println("카페 음악!!");
            }

            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
