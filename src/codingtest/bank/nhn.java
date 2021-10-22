package codingtest.bank;

import java.util.*;

public class nhn {

    private static void solution(int sizeOfMatrix, int[][] matrix){

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
