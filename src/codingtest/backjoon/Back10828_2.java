package codingtest.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Back10828_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        while (N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){

                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (stack.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(stack.pop()).append('\n');
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');
                    break;

                case "empty":
                    sb.append(stack.isEmpty()? 1:0).append('\n');
                    break;

                case "top":
                    if (stack.isEmpty()){
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(stack.peek()).append('\n');
                    break;


            }
        }

        System.out.println(sb);
    }
}
