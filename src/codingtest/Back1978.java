package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back1978 {
    private static boolean isPrime(int number){
        if(number == 1) return false;
        if(number == 2) return true;

        int upperBound = (int) Math.sqrt(number)+1;

        for (int i=2; i <= upperBound; i++){
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        for (int i = 0; i < N; i++){
            int number = Integer.parseInt(st.nextToken());
            if (isPrime(number)){
                count++;
            }
        }
        System.out.println(count);


    }
}
