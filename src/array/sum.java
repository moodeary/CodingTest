package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 백준 3273 문제
 * 문제 :
 * 1. 처음 N개 갯수가 나옴
 * 2. n개의 수열이 나옴
 * 3. x 자연수가 주어졌을 때, 수열 2개의 합으로 x를 만족하는 갯수를 구하시오
 */
public class sum {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int count = 0;

        System.out.println("n개의 숫자를 입력하시오.");
        int N = Integer.parseInt(br.readLine());

        System.out.println("수열을 입력하시오.");
        String inputArr = br.readLine();
        String[] splitArr = inputArr.split(",");

        System.out.println("x값을 입력하슈");
        int x = Integer.parseInt(br.readLine());

        int[] arr = new int[splitArr.length];
        for( int i =0; i< splitArr.length; i++) {
            arr[i] = Integer.parseInt(splitArr[i]);
        }

        Arrays.sort(arr);
        result.append("정렬된 arr :[").append(Arrays.toString(arr)).append("]\n");

        
        for( int i =0; i< arr.length-1; i++) {
            for( int j = i+1; j< arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == x) {
                    result.append("일치하는 숫자 쌍: [").append(arr[i]).append(", ").append(arr[j]).append("]\n");
                    count++;
                }
            }
        }

        result.append("최종 결과값: ").append(count);

        System.out.println(result);
    }
}
