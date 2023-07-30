package solvedAc.beginner;

import java.io.*;
public class _11718_SameOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input == null || input.isEmpty()) {
                break;
            }
            result.append(input).append("\n");
        }
        System.out.println(result);
    }
}
