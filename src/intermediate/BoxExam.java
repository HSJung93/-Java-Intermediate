package intermediate;

public class BoxExam {

    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//
//        // Obj타입의 자식 클래스라면 전부 들어올 수 있다.
//        box.setObj("hello");
//        // 기본으로는 Obj로 나오지만 형변환 String으로 받아야 메소드 사용가능
//        String str = (String) box.getObj();
//        System.out.println(str);
//
//        box.setObj(1);
//        int value = (int) box.getObj();
//
//        // 매번 형변환하는 분편함 -> 인스턴스를 만들 때 사용하는 타입을 지정하는 제너릭

        // object 타입을 받아들이도록 생성하겠다.
        // 전과 같음
        Box<Object> box = new Box<>();
        box.setObj(new Object());
        Object obj = box.getObj();

        // String만 받을 것이다.
        Box<String> box2 = new Box<>();
        box2.setObj("hello");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<>();
        // 오토박싱도 같이 이루어지는 경우
        box3.setObj(4);
        int v2 = box3.getObj();
    }
}
