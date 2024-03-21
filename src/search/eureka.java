package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 백준 10448 문제
 * 문제 : 유레카 이론
 * 가우스 식의 합으로 주어진 자연수의 값이 표현될 수 있는지 없는지
 * 단 가우스식의 정확히 3개의 합으로만 표현되어야 한다.
 * n(n+1)/2
 *
 */
public class eureka {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int totalCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < totalCnt; i++) {

            ArrayList<Integer> resultList = new ArrayList<>();
            ArrayList<Integer> minusList = new ArrayList<>();
            int number = Integer.parseInt(br.readLine());
            int MaxIndex = 0;
            int result = 0;

            for (int j = 1; j < number + 1; j++) {
                boolean check = false;
                int answerNum = j * (j + 1) / 2;
                resultList.add(answerNum);
                if (number >= answerNum) {
                    MaxIndex = j;
                }
            }

            System.out.println(resultList);
            int maxCnt = 3;

            for (int k = MaxIndex - 1; k >= 0; k--) {

                int nowNum = resultList.get(k);

                if (nowNum <= number && maxCnt > 0) {
                    minusList.add(nowNum);
                    number -= nowNum;
                    maxCnt--;
                }

                if (nowNum <= number && maxCnt > 0) {
                    minusList.add(nowNum);
                    number -= nowNum;
                    maxCnt--;
                }

                int sum = number+nowNum;
                System.out.println(number +" = " + sum +" - " + nowNum + "남은 카운트 =" + maxCnt);


                if (number == 0) {
                    result = 1;
                    break;
                }

                if (maxCnt == 0) {
                    break;
                }


            }

            System.out.println("뺀 숫자 리스트" + minusList);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
