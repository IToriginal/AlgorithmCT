package inflearn.기본._01_String._01_문자찾기;

import java.io.*;

public class 제출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] transfer = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            transfer[i] = input.charAt(i);
            if (Character.isLowerCase(transfer[i])) {
                transfer[i] = Character.toUpperCase(transfer[i]);
            }
        }

        char[] alphabet = br.readLine().toCharArray();
        int count = 0;

        if (Character.isLowerCase(alphabet[0])) {
            alphabet[0] = Character.toUpperCase(alphabet[0]);
        }

        for (char f : transfer) {
            if (alphabet[0] == f) {
                count++;
            }
        }
        System.out.println(count);
    }
}
