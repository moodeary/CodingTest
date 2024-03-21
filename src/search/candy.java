package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 3058 문제
 * 문제 : 사탕 게임
 * 7개의 자연수가 주어질 때, 이들 중 짝수인 자연수들을 모두 골라 그 합을 구하고, 고른 짝수들 중 최솟값을 찾는 프로그램을 작성하시오.
 *
 * 배열 하나 선언
 * 배열에 들어온 숫자만큼 배열 생성
 * 각 배열마다 연산
 * 1. %2 로 나누어서 0이 되는 값들만 새로운 배열에 등록
 * 2. 새로운 배열을 모두 더한값, 그 중에서 가장 작은값을 꺼냄
 * 3. 그리고 각각 log 호출
 */
public class candy {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int listCnt = Integer.parseInt(br.readLine());

        for(int j=0; j<listCnt; j++) {
            int minimum = 0;
            int sum = 0;
            String[] strArr = br.readLine().split(" ");

            for (String s : strArr) {
                int number = Integer.parseInt(s);
                if (number % 2 == 0) {
                    if (minimum == 0 || minimum > number) {
                        minimum = number;
                    }
                    sum += number;
                }
            }
            sb.append(sum).append(" ").append(minimum).append("\n");
        }
        System.out.println(sb);
    }
}
