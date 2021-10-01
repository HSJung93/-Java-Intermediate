package intermediate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
바이트 단위 입출력 클래스는 클래스 이름이 inputStream outputStream으로 끝난다.
파일로 부터 한 바이트씩 읽어들여서 한 바이트씩 저장하는 클래스 작성
 */
public class ByteExam1 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/intermediate/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readData = -1 ;
            // FileInputStream의 read 메소드는 한 바이트 씩 읽는다.
            // read 메소드의 리턴 타입은 정수이다. 인트의 4 바이트의 마지막 바이트에 읽어들인 한 바이트 를 저장한다.
            // 바이트를 리턴하면 끝을 나타내는 값을 표현할 수 없어서 인트를 리턴한다.
            // 음수는 가장 좌측 비트가 1이다. 읽어들일 것이 있으면 항상 양수를 리턴한다.

            // -1이 바이트의 종료를 의미
            while((readData = fis.read())!=-1){
                fos.write(readData);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                fos.close();
            } catch(IOException e) {
                e.printStackTrace();
            }

            try {
                fis.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
}
