package string;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 백준 1157 문제
 * 문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대소문자는 구분하지 않음
 * 만약에 가장 많이 사용한 단어가 여러개 존재하는 경우, ? 를 출력한다.
 * */
public class WordStudy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String word = scanner.nextLine();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0) + 1);
        }


        Character result = checkBoolean(frequencyMap);
        System.out.println("결과 값 = " + result);
    }

    private static Character checkBoolean(HashMap<Character, Integer> frequencyMap) {
        char maxChar = '?';
        int maxCount = 0;

        for (char c : frequencyMap.keySet()) {
            int count = frequencyMap.get(c);
            if (count > maxCount) {
                maxChar = c;
                maxCount = count;
            } else if (count == maxCount) {
                maxChar = '?';
            }
        }
        return maxChar;
    }
}
