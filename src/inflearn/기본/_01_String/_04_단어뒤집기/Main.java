package inflearn.기본._01_String._04_단어뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int n;
    private static String[] words;

    private String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private String[] solution() {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = reverseString(words[i]);
        }
        return result;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        Arrays.stream(m.solution())
                .forEach(System.out::println);
    }
}
