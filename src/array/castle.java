package array;

import java.util.Scanner;

/**
 * 백준 1236 문제
 * 문제 : 직사각형 모양의 성이 있다. 1층은 몇명의 경비원에 의해서 보호되고 있는데, 모든 행과 모든 열에 한 명 이상의 경비원이 있어야 한다.
 * 성의 크기와 경비원이 어디 있는지 주어졌을 때, 몇명의 경비원을 최소로 추가해야 위 문제를 해결할 수 있는지 구하는 프로그램 작성
 * ------------------------------------------
 * 해결 방법
 * 1. 행을 기준으로 경비원이 있는지 여부 체크
 * 2. 열을 기준으로 경비원이 있는지 여부 체크
 * 3. (1) 2자리 비어있음, (2) 2자리 비어있음
 * 4. 둘 중에 큰 숫자를 넣으면 됨!
 */
public class castle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("행의 개수를 입력하세요:");
        int rows = scanner.nextInt();

        System.out.println("열의 개수를 입력하세요:");
        int cols = scanner.nextInt();

        int[][] castleMap = generateCastle(rows, cols);

        int rowGuards = getRowGuards(rows, cols, castleMap);
        int colGuards = getColGuards(cols, rows, castleMap);

        int totalGuards = Math.max(rowGuards, colGuards);
        System.out.println("최소 추가해야 할 경비원의 수: " + totalGuards);
    }

    private static int[][] generateCastle(int rows, int cols) {
        int[][] castleMap = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                castleMap[i][j] = (int) (Math.random() * 2); // 0 또는 1 랜덤으로 할당
            }
        }
        drawCastle(rows, cols, castleMap);
        return castleMap;
    }


    private static int getRowGuards(int rows, int cols, int[][] castleMap) {
        int rowGuards = rows;
        for (int i = 0; i< rows; i++) {
            for (int j = 0; j< cols; j++) {
                if (castleMap[i][j] == 1) {
                    rowGuards--;
                    break;
                }
            }
        }
        return rowGuards;
    }

    private static int getColGuards(int cols, int rows, int[][] castleMap) {
        int colGuards = cols;
        for (int i = 0; i< cols; i++) {
            for (int j = 0; j< rows; j++) {
                if (castleMap[j][i] == 1) {
                    colGuards--;
                    break;
                }
            }
        }
        return colGuards;
    }

    private static void drawCastle(int rows, int cols, int[][] castleMap) {
        System.out.println("입력 받은 성의 구조:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(castleMap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
