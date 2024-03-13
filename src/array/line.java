package array;

import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * 백준 10431 문제
 * 문제 : 아이들을 데리고 키 순서대로 번호를 부여한다.
 * 키가 가장 작은 아이가 1번 그다음이 2번... 가장 큰 아이가 20번
 * 아이들은 총 20명, 같은 키를 가진 학생은 한명도 없다.
 * 1. 아무나 한명을 뽑아 맨 앞에 세운다
 * 2. 그 다음부터는 학생이 한명씩 줄을 선다.
 * 3. 자기 앞에 자기보다 키가 큰 학생이 없다면 그자리에 선다.
 * 4. 자기 앞에 자기보다 키가 큰 학생이 한명이상 있다면 그 중 가장 앞에있는 학생(A) 앞에 선다.
 * 5. 이 때 가장 앞에 있는 (A)뒤에 선 모든 학생들은 공간을 만들기 위해 한 발씩 뒤로 물러서게 된다.
 * 이 과정을 거치면 몇번 뒤로 물러서게 될까?
 * ------------------------------------------
 * 해결 방법
 * 1.
 */
public class line {

    public static void main(String[] args) {

//        int[] studentLine = {1, 2, 5, 4, 6, 5, 8, 7, 9, 10};
//        int[] studentLine = {919, 918, 917, 916, 915, 914, 913, 912, 911, 910, 909, 908, 907, 906, 905, 904, 903, 902, 901, 900};
        int[] studentLine = {918, 917, 916, 915, 914};

        int count = 0;


        // 서있는 순서대로 뒤에 선다.
        for (int i=1; i<studentLine.length; i++) {

            // 뒤에서고 앞을 바라본다. 그리고 나보다 키 큰 사람이 있다면, 그 앞에가서 선다.
            for (int j=0; j<i; j++) {
                if (studentLine[i] < studentLine[j]) {
                    count++;
                    break;
                }
            }
        }

        sort(studentLine);

        System.out.println(Arrays.toString(studentLine));
        System.out.println("총 움직인 횟수는 = " + count);
    }

}
