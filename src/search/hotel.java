package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 백준 10250 문제
 * 문제 : ACM 호텔
 * ----------------------------------------
 * 입력값 :
 * 첫째 줄 : 데이터 줄 갯수
 * 둘째 줄 : 층수 / 각방수 / 몇번째 손님
 * ----------------------------------------
 * 출력값 : 배정될 방 호수
 */
public class hotel {
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
