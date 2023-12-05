package inflearn.기본._01_String._02_대소문자변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String[] input;

    private String solution() {
        StringBuilder result = new StringBuilder();
        for (String string : input) {
            char target = string.charAt(0);
            if (target == Character.toLowerCase(target)) {
                result.append(Character.toUpperCase(target));
            } else {
                result.append(Character.toLowerCase(target));
            }
        }
        return result.toString();
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine().split("");
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
