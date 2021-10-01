package intermediate;

import java.io.*;

public class CharIOExam02 {
    public static void main(String[] args) {

        // try 블럭 안에 선언된 부분이 들어가면 외부에서 사용될 수 없기 때문에 선언과 exception 처리 부분을 분리하는게 좋다.
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("src/intermediate/CharIOExam02.java"));
            // 현재는 PrintWriter를 데코레이터로 사용하지 않아도 된다.
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            while ((line = br.readLine())!= null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 닫아야지만 작성이 완료된다.
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
