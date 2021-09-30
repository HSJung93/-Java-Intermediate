package intermediate;

public class StringBufferExam {

    public static void main(String[] args) {
        // String은 불변 클래스, StringBuffer는 가변
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");

        // append 메소드에서는 자기자신인 this가 반환된다.
        // 자기자신인 메소드를 호출해가면서 자신을 바꾸는 것이 가능하다.
        // 메소드 체이닝: 자기자신을 리턴하여 계속하여 자신의 메소드를 호출하는 방식
        if (sb2 == sb3)
            System.out.println("sb == sb3");

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);

    }
}
