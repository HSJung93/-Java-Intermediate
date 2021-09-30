package intermediate;

public class MathExam {

    public static void main(String[] args) {
        // Math 패키지는 private으로 선언되어 new 연산자로 만들 수 없다.\
        // 모든 메소드랑 속성가 static이기에 객체를 사용하지 않고도 사용할 수 있다.

        int value1 = Math.max(5, 30);
        System.out.println(value1);
        int value2 = Math.min(5, 30);
        System.out.println(value2);

        System.out.println(Math.abs(-10));

        System.out.println(Math.random());

        System.out.println(Math.sqrt(25));
    }
}
