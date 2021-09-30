package intermediate;

import java.util.Objects;

public class Student {

    // equals/ hasCode/ toString은 가장 상위의 클래스인 object의 메소드이다
    // 상위 클래스에서 쓰임새에 맞게 오버라이딩해서 사용한다.
    // birthYear만을 같은 기준으로 사용하는 코드 예시
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return birthYear == student.birthYear;
    }

    // object의 hashCode는 객체별 주소값이다
    // birthYear만으로 해쉬를 만드는 것으로 오버라이딩했다.
    @Override
    public int hashCode() {
        return Objects.hash(birthYear);
    }

    String name;
    String number;
    int birthYear;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "정회성";
        s1.number = "12345";
        s1.birthYear = 1993;

        Student s2 = new Student();
        s2.name = "정회성";
        s2.number = "12345";
        s2.birthYear = 1993;

        if(s1.equals(s2))
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 변수를 프린트하면 자동으로 toString 메소드를 사용하는 것
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
