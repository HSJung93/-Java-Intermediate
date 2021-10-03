package intermediate;

public class LambdaExam {
    public static void main(String[] args) {
        // 자바는 메서드만 매개변수로 전달할 방법이 없다! 오직 인스턴스만
        // 그래서 메서드를 하나만 가지고 있는 객체를 생성해서 (함수형 인터페이스)를 전달한다. 혹은
        // 그래서 람다 표현식(=익명 메소드)을 사용한다. 그러면
        // JVM이 자동으로 러너블을 구현하는 객체로 만들어서 매개변수로 넣어준다.
        new Thread(() -> {
            for(int i =0; i<10; i++){
                System.out.println("hello");
            }
        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0; i <10 ; i++){
//                    System.out.println("hello");
//                }
//            }
//        }).start();
    }
}
