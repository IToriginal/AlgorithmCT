package inflearn.기본._01_String._12_암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int n;
    private static String str;
    private static final int BINARY_LENGTH = 7;

    private char[] solution() {
        char[] password = new char[n];
        for (int i = 0; i < n; i++) {
            String transfer = str.substring(i * BINARY_LENGTH, (i + 1) * BINARY_LENGTH)
                    .replace('#', '1')
                    .replace('*', '0');
            int binary = Integer.valueOf(transfer, 2);
            password[i] = (char) binary;
        }
        return password;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); // 4
        str = br.readLine(); // #****###**#####**#####**##**
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
