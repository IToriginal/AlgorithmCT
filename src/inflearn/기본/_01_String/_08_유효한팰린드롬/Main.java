package inflearn.기본._01_String._08_유효한팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String str;

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private String solution() {
        StringBuilder onlyAlphabets = new StringBuilder();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                onlyAlphabets.append(c);
            }
        }
        String revStr = reverseString(onlyAlphabets.toString());
        return onlyAlphabets.toString().equals(revStr) ? "YES" : "NO";
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
