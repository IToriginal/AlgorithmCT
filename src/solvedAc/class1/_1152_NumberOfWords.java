package solvedAc.class1;

import java.io.*;

public class _1152_NumberOfWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        String[] words = input.split(" ");

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(words.length);
        }
    }
}