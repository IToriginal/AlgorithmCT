package inflearn.기본._01_String._05_특정문자뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static char[] chs;

    private String solution() {
        int start = 0, end = chs.length - 1;
        while (start < end) {
            if (!Character.isAlphabetic(chs[start])) start++;
            else if (!Character.isAlphabetic(chs[end])) end--;
            else {
                char tmp = chs[start];
                chs[start] = chs[end];
                chs[end] = tmp;
                start++;
                end--;
            }
        }
        return String.valueOf(chs);
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        chs = br.readLine().toCharArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
