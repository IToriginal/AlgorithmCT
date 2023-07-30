package solvedAc.beginner;

import java.io.*;

public class _2744_ChangeCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String input = br.readLine();

        for (char x : input.toCharArray()) {
            if (Character.isLowerCase(x)){
                result.append(Character.toUpperCase(x));
            } else {
                result.append(Character.toLowerCase(x));
            }
        }
        System.out.println(result);
    }
}
