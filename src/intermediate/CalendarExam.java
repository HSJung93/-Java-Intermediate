package intermediate;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        // Calendar는 추상클래스이다. 미완성된 메소드를 가지고 있는 클래스
        // new로 인스턴스를 생성할 수 없다. 자기자신을 만들어서 리턴할 수 없다.
        // Calendar의 자식 클래스가 리턴될 수 있다.
        // 사실은 Gregorian Calendar라는 자식 클래스의 인스턴스를 리턴하는 getInstance 메소드
        // new Gregorian을 하지 않고 숨긴다. 왜? 미래에 새로운 형식의 표준 달력이 되는 경우 버전 업을 염두해두었다.
        Calendar cal = Calendar.getInstance();
        // Calendar 안의 상수로 가져올 수 있다.
        System.out.println(cal.get(Calendar.YEAR));
        // 자바는 0월부터
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));

        cal.add(Calendar.HOUR, 5);

        System.out.println(cal.get(Calendar.YEAR));
        // 자바는 0월부터
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));


    }
}
