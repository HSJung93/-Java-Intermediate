package intermediate;

// 자바는 단일 상속만을 제공하기 때문에, 다른 상속을 하고 있는 경우 Thread를 상속할 수 없다. 그래서 Runnable 인터페이스가 필요하다.
public class MyThread2 implements Runnable{
    String str;
    public MyThread2 (String str){
        this.str = str;
    }
    @Override
    public void run() {
        for (int i=0; i < 10 ;i ++){
            System.out.println(str);
            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
