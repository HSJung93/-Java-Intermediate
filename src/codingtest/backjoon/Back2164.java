    package codingtest.backjoon;

    import java.util.Scanner;

    public class Back2164 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int square = 2;

            while (true) {
                if (N == 1 || N==2){
                    System.out.println(N);
                    break;
                }
                square *= 2;
                if (square >= N){
                    System.out.println((N-(square/2))*2);
                    break;
                }

            }
        }
    }
