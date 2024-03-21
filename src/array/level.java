package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        boolean isSymmetric = false;

        for (int i = 0; i < input.length()/2; i++) {
            int lastIndex = input.length() - 1 - i;
            if (input.charAt(i) != input.charAt(lastIndex)) {
                isSymmetric = true;
                break;
            }
        }

        if (isSymmetric) {
            sb.append(0);
        } else {
            sb.append(1);
        }

        System.out.println(sb);
    }
}
