package intermediate;

public class CompareExam {
    public static void exec(Compare compare){
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        // JVM은 이 람다식을 compare를 구현하는 익명 객체로 만들어서 exec로 전달한다.
        exec( (i,j) -> {
            return i-j;
        } );
    }
}
