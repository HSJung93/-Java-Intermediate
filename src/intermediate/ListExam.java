package intermediate;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        // list는 인터페이스 ArrayList가 클래스
        List<String> list = new ArrayList<>();
        list.add("jung");
        list.add("kang");
        list.add("jung");

        System.out.println(list.size());

        for (int i = 0 ; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
