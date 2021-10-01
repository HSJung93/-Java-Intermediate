package intermediate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
파일로 부터 512 바이트씩 읽어들여서 512 바이트씩 저장하는 클래스 작성
어차피 OS에서 512 바이트씩 읽는다.
 */
public class ByteExam2 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/intermediate/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1 ;

            byte[] buffer = new byte[512];

            while((readCount = fis.read(buffer))!=-1){
                fos.write(buffer, 0 , readCount);
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
