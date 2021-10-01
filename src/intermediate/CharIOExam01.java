package intermediate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {
    public static void main(String[] args) {
        // 객체에 추가적인 요건(기능)을 동적으로 첨가하는 방식
        // 서브 클래스를 만드는 것을 통해 기능을 유연하게 확장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ! 변수는 선언된 블록까지 쓸수 있다.
        // null 로 바깥쪽에 선언하고 사용한다!
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);

    }

}
