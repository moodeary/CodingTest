package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 백준 11005 문제
 * 문제 : 진법 변환 2
 * 10진법 수 N이 주어지고, 이 수를 B진법으로 바꿔 출력하는 프로그램을 생성
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있는데, 이런 경우는 알파벳 대문자를 사용한다.
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 *
 * 첫째줄에는 N과 B가 주어진다.
 * (2 ≤ B ≤ 36)
 * N은 10억보다 작거나 같은 자연수이다.
 */
public class palindrome {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        ArrayList<Integer> inputList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<Integer> originList = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 8));

        System.out.println("수열을 입력하시오.");
        String input = br.readLine();
        String[] split = input.split(",");
        for (String s : split) {
            inputList.add(Integer.parseInt(s));
        }

        result.append("입력 값 =").append(inputList).append("\n");
        result.append("필요 값 =").append(originList).append("\n");

        for (int i = 0; i < 6; i++) {
            int iValue = originList.get(i) - inputList.get(i);
            answerList.add(i,iValue);
        }

        result.append("결과 값 =").append(answerList);
        System.out.println(result);
    }
}
