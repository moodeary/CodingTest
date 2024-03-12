package string;

import java.util.Scanner;

import static java.lang.String.format;

/**
 * 백준 13223 문제
 * 문제 : 철수는 현재시각과 선생님이 언제 컵을 사용할 지 시간을 알고 있지만,
 * 수 계산에 정말 약해서 로봇팔에 입력해야할 시간 계산을 못한다.
 * 철수가 로봇팔에 알맞은 시간을 입력할 수 있도록 도와주자
 * */
public class SaltBomb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 시간을 입력해주세요");
        String[] current = scanner.next().split(":");

        System.out.println("실행 시간을 입력해주세요");
        String[] active = scanner.next().split(":");

        Integer CurrentToSec = timeToSec(current);
        Integer ActiveToSec = timeToSec(active);

        if (ActiveToSec - CurrentToSec < 0) {
            ActiveToSec += 3600*24;
        }

        int CalcTime = ActiveToSec - CurrentToSec;

        String resultTime = secToTime(CalcTime);
        System.out.println(resultTime);

    }

    private static String secToTime(Integer CalcTime) {
        int hh = CalcTime / 3600;
        int mm = (CalcTime % 3600)/60;
        int ss = CalcTime % 60;

        return hh +":"+mm+":"+ss;

    }

    private static Integer timeToSec(String[] Time) {
        int hourToSec = Integer.parseInt(Time[0]) * 3600;
        int minToSec = Integer.parseInt(Time[1]) * 60;
        int Sec = Integer.parseInt(Time[2]);

        int totalSecond = hourToSec+minToSec+Sec;

        System.out.println("계산된 시간" + totalSecond);
        return totalSecond;
    }
}
