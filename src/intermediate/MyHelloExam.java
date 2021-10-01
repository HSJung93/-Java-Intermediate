package intermediate;

import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) {
        MyHello hello = new MyHello();

        // getClass() 메소드는 object의 메소드로, 해당 인스턴스를 만들 때 사용한 클래스의 정보를 리턴한다.
        // hello라는 이름의 메소드에 대한 정보를 읽어오라는 것
        try {
            Method method = hello.getClass().getDeclaredMethod("hello");

            if(method.isAnnotationPresent(Count100.class)){
                for (int i = 0; i< 100; i++){
                    hello.hello();
                }
            } else{
                hello.hello();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
