package string;

import java.util.Scanner;

/**
 * 문제 : 두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때
 * 두 단어를 서로 애너그램 관계에 있다고 한다.
 * ex) occurs, succor 은 서로 애너그램 관계에 있다.
 *
 * dared 와 bread 는 서로 애너그램 관계에 있지 않지만, b와 d를 제거하면 서로 애너그램 관계에 있게되는데,
 * 단어 두개가 주어졌을 떄 서로 애너그램 관계가 되도록 만들기 위해 최소 몇개의 문자를 제거해야 하는지 구하시오
 */
public class Anagram {

    public static void main(String[] args) {

        String oneWord = "";
        String twoWord = "";
        int deleteCount = 0;
        int allCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번 째 문자열을 입력하세요");
        oneWord = scanner.nextLine();

        System.out.println("두번 째 문자열을 입력하세요");
        twoWord = scanner.nextLine();

        allCount = oneWord.length() + twoWord.length();

        System.out.println("전체 단어 개수" + allCount);

        for (int i =0; i<oneWord.length(); i++) {
            char c = oneWord.charAt(i);
            int index = twoWord.indexOf(c);
            if (index != -1) {

                // 포함되어 있다면 두 문자열에서 해당 문자를 제거
                oneWord = oneWord.substring(0, i) + oneWord.substring(i + 1);
                twoWord = twoWord.substring(0, index) + twoWord.substring(index + 1);

                // 다시 현재 인덱스부터 시작하기 위해 인덱스를 감소시킴
                i--;
            }
        }
        // 남아 있는 문자들의 개수를 카운트
        deleteCount += oneWord.length() + twoWord.length();

        System.out.println("제거해야 할 문자의 개수: " + deleteCount);
    }
}
