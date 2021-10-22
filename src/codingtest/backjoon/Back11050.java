package codingtest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back11050 {

    static int[][] dp;

    static int combiMemo(int n, int k){
        if (dp[n][k] > 0) {
            return dp[n][k];
        }
        if (k==0 || n==k){
            return dp[n][k] = 1;
        }
        return dp[n][k] = combiMemo(n-1, k-1) + combiMemo(n-1, k);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new int[N+1][K+1];

        System.out.println(combiMemo(N, K));
    }
}
