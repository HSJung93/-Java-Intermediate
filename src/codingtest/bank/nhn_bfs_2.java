package codingtest.bank;

import java.util.*;

public class nhn_bfs_2 {

    static int[][] moves = {{-1, 0},{1,0},{0,-1},{0,1}};

    static boolean[][] visited;

    static class Point{
        Point(int r, int c, int d){
            x = r; y= c; dist = d;
        }
        int x, y, dist;
    }

    private static int bfs(int i, int j, int N, int[][] matrix){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(i, j, 0));

        // 영역은 새로운 노드 이동 시 마다 count를 올려서 구한다.
        // 거리는 노드와 같이 이동하며 mx를 구하면서 구한다.
        int count = 1;
        int mx = 1;

        while (!q.isEmpty()){
            Point now = q.poll();
            int x = now.x;
            int y = now.y;
            mx = Math.max(mx, now.dist);

            for (int k = 0; k < 4; k++){
                int xNext = x + moves[k][0] , yNext= y + moves[k][1];

                if (xNext >= 0 && yNext >= 0 && xNext < N && yNext < N && !visited[xNext][yNext] && matrix[xNext][yNext] != 0){
                    q.add(new Point(xNext, yNext, now.dist+1));
                    matrix[xNext][yNext] = 0;
                    visited[xNext][yNext] = true;
                    count++;
                }
            }
        }
        System.out.println("count is" + count);
        System.out.println("mx is "+ mx);

        return count;
    }

    private static void solution(int sizeOfMatrix, int[][] matrix){
        int cnt = 0;
        int N = sizeOfMatrix;
        List<Integer> arr = new ArrayList<>();
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++){
            for(int j=0; j < N; j++){
                visited[i][j] = true;
                if (matrix[i][j] == 1){
                    arr.add(bfs(i, j, N, matrix));
                    cnt++;
                }
            }
        }

        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append('\n');

        for (int i = 0; i < cnt ; i++){
            sb.append(arr.get(i)).append(' ');
        }

        System.out.println(sb);
    }

    private static class InputData {
        int sizeOfMatrix;
        int[][] matrix;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];

            for (int i = 0; i < inputData.sizeOfMatrix; i++){
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.sizeOfMatrix; j++){
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch(Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();
        solution(inputData.sizeOfMatrix, inputData.matrix);
    }
}
