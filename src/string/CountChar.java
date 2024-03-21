package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 문자열이 랜덤으로 들어왔을 때, 대소문자 관계 없이 's', 'v'가 들어간 카운트하기
 * 's' 랑 'v'가 하나도 안들어갔을 경우 true
 * s랑 v가 같아도 true 그렇지 않으면 false
 * */
public class CountChar {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int s_count = 0;
        int v_count = 0;
        boolean result = false;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 's') s_count++;
            if (c == 'v') v_count++;
        }

        if (s_count == 0 && v_count == 0) {
            result = true;
        } else if (s_count == v_count) {
            result = true;
        }

        sb.append("s_count = ").append(s_count).append("\n");
        sb.append("v_count = ").append(v_count).append("\n");
        System.out.println(sb);
    }
}
