package intermediate;

public class StringExam2 {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        // 실제로 + 연산은 StringBuffer와 append로 구현된다.
        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        // 반복문의 경우
        // 100 번 String 객체를 new 연산자로 만들기에 느리다.
        // ! 문자열을 반복문 안에서 사용하지 말자
        String str5 = "";
        for (int i = 0; i<100; i++){
            str5 = str5 + "*";
        }
        System.out.println(str5);

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<100; i++){
            sb.append("*");
        }
        // 마지막에 한번만
        String str6 = sb.toString();
        System.out.println(str6);

    }
}
