package string;


import java.util.Scanner;

/**
 * 백준 2774 문제
 * 문제 : 소문자와 대문자로 이루어진 단어를 받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력
 * 입력 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 있다. 단어의 최대 길이는 100
 */
public class UppercaseToLowercase {
    public static void main(String[] args) {
        String question = "";
        String answer = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        question = scanner.nextLine();

        for (int i=0; i< question.length(); i++) {
            char c = question.charAt(i);

            System.out.println(Character.isUpperCase(c));
            if(Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println("최종 결과" + answer);
    }
}
