package intermediate;

public class MusicBoxExam1 {
    public static void main(String[] args) {
        MusicBox box = new MusicBox();
        MusicPlayer kang = new MusicPlayer(1, box);
        MusicPlayer kim = new MusicPlayer(2, box);
        MusicPlayer lee = new MusicPlayer(3, box);

        // Thread가 시작되면 러너블 상태와 러닝 상태를 오간다.
        // Thread의 sleep나 object 의 wait 메소드가 호출되면 스레드는 block 상태가 된다.
        // wait 메서드로 blocked 상태가 된 스레드는, 다른 스레드가 notify 메소드를 호출하기 전에는 블록 상태에서 빠져나올 수 없다.
        // wait이 호출되면 모니터링 락을 놓아서 대기중인 다른 스레드가 실행된다.
        // yield 메소드를 사용하면 다른 스레드에 자원을 양보한다.
        // join 메소드를 사용하면 해당 스레드가 종료될 때 까지 기다린다.
        kang.start();
        kim.start();
        lee.start();

    }
}
