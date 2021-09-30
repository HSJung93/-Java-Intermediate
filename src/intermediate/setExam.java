package intermediate;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExam {
    public static void main(String[] args) {
        // Set은 인터페이스 HashSet으로 구현
        Set<String> set1 = new HashSet<>();
        // return 값이 boolean 셋이 중복값이 없는지 있는지
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        System.out.println(set1.size());

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        // 부모 클래스인 collection이 가지고 있는
        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()){
            // 값을 꺼내주고 다음 값을 참조하는 메소드
            String str = iter.next();
            System.out.println(str);
        }

    }
}
