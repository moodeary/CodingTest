package time;

import java.util.Scanner;

/**
 * 백준 10158 문제
 * 문제 : 개미가 45도로 움직인다. 그리고 반사되어 간다.
 * 
 */
public class ant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("x축 크기?");
        int max_x = scanner.nextInt();

        System.out.println("y축 크기?");
        int max_y = scanner.nextInt();

        System.out.println("x축 현재 위치?");
        int position_x = scanner.nextInt();

        System.out.println("y축 현재 위치?");
        int position_y = scanner.nextInt();

        System.out.println("총 이동거리 시간은?");
        int duringTime = scanner.nextInt();

        int direction_x = position_x != 0 ? 1 : -1;
        int direction_y = position_y != 0 ? 1 : -1;

        System.out.println("전체 크기는 = " + "[" + max_y + "," +max_x + "]");
        System.out.println("현재 위치는 = " + "[" + position_y + "," + position_x + "]");
        System.out.println("총 이동시간은 = " + duringTime);


        // 38 ~ 53 경과시간 찍기

        long startTime = System.currentTimeMillis();
        int double_y = max_y * 2;
        int double_x = max_x * 2;
        int answerY = (position_y + duringTime) % double_y;
        int answerX = (position_x + duringTime) % double_x;


        if (answerY > max_y) {
            answerY = double_y - answerY;
        }

        if (answerX > max_x) {
            answerX = double_x - answerX;
        }

        // 종료 시간 측정
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("코드 실행에 걸린 시간: " + elapsedTime + "밀리초");

        System.out.println("Answer 현재 위치는 = " + "[" + answerY + "," + answerX + "]");

        // 55 ~ 70 까지 경과시간 찍기
        startTime = System.currentTimeMillis();

        for(int i=0; i<duringTime; i++) {
            // y축이 max or 0인 경우
            if(position_y == 0 || position_y == max_y) {
                direction_y *= -1;
            }

            // x축이 max or 0인 경우
            if(position_x == 0 || position_x == max_x) {
                direction_x *= -1;

            }
            position_y += direction_y;
            position_x += direction_x;
        }

        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("코드 실행에 걸린 시간: " + elapsedTime + "밀리초");
        System.out.println("position 현재 위치는 = " + "[" + position_y + "," + position_x + "]");
    }
}
