package intermediate;

public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) {
            try{
                System.out.println("b가 완료될 때까지 기다립니다. ");
                b.wait(); // 이때 메인 스레드가 정지, 다섯번 더한 뒤 다른 스레드가 노티파이가 호출될 때 까지 정지.
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is : " + b.total);
        }
    }
}
