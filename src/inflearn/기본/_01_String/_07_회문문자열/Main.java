package inflearn.기본._01_String._07_회문문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String str;

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private String soltuion() {
        String revStr = reverseString(str);
        if (revStr.equals(str)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().toLowerCase();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.soltuion());
    }

}
