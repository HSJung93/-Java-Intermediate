package intermediate;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {
    public static void main(String[] args) {
        // 자바 IO 객체는 인스턴스를 만들고 모두 사용하면 close 메소드를 호출해야한다.
        // 이를 try-with-resources로 자동화한다.
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
                ) {
            // 4 바이트
            out.writeInt(100);
            // 1 바이트
            out.writeBoolean(true);
            // 8 바이트
            out.writeDouble(50.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
