package codingtest.bank;

import java.util.*;

public class nhn_bfs {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;

    private static int bfs(int i, int j, int sizeOfMatrix, int[][] matrix){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i, j});
        int count = 1;

        while (!q.isEmpty()){
            int now[] = q.poll();
            int x = now[0];
            int y = now[1];

            for (int k = 0; k < 4; k++){
                int xNext = x + dx[k];
                int yNext = y + dy[k];

                if (xNext < 0 || yNext < 0 || xNext >= sizeOfMatrix || yNext >= sizeOfMatrix){
                    continue;
                }

                if (visited[xNext][yNext] || matrix[xNext][yNext] == 0){
                    continue;
                }

                q.add(new int[] {xNext, yNext});
                matrix[xNext][yNext] = 0;
                visited[xNext][yNext] = true;
                count++;
            }
        }

        return count;
    }

    private static void solution(int sizeOfMatrix, int[][] matrix){
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        visited = new boolean[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++){
            for(int j=0; j < sizeOfMatrix; j++){
                visited[i][j] = true;
                if (matrix[i][j] == 1){
                    arr.add(bfs(i, j, sizeOfMatrix, matrix));
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
