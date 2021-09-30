package intermediate;

public class WrapperExam {

    public static void main(String[] args) {
        // i는 기본형이므로, 객체가 아니다 참조형이 아니다.
        // 기본형 정수는 스택 메모리에 값을 저장,
        // 참조형 변수는 힙 메모리에 값을 저장, 스택 메모리에 힙 메모리 값의 포인터를 저장
        int i = 5;
        // wrapper class란 기본형을 객체로 만들어주는 클래스
        Integer i2 = new Integer(5);

        // 오토박싱: 기본->객체 타입으로 자동 형변환
        Integer i3 = 5;

        int i4 = i3.intValue();

        // 오토언박싱
        int i5 = i3;
    }
}
