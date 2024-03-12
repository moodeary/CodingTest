package string;

import java.util.Scanner;

/**
 * 백준 1543 문제
 * 문제 : 영어로만 이루어진 어떤 문서를 검색하는 함수를 만들려고 하는데, 이 함수는 어떤 단어가 몇 번 등장하는지 세려고 한다.
 * 그러나, 세준이의 함수는 중복되어 세는것은 빼고 세야한다.
 * */
public class SearchDocument {
    public static void main(String[] args) {
        boolean isInclude = true;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 입력해주세요");
        String word = scanner.nextLine();

        System.out.println("검색어를 입력해주세요");
        String search = scanner.nextLine();

        count = countOccurrences(word, search);
        System.out.println("검색어 '" + search + "'가 문서에 등장한 횟수: " + count);

    }

    private static int countOccurrences(String word, String search) {
        int count = 0;
        int index = word.indexOf(search);

        while (index != -1) {
            count++;
            // 이전 등장 위치 이후부터 검색
            index = word.indexOf(search, index + search.length());
        }

        return count;
    }
}
