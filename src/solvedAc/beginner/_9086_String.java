package solvedAc.beginner;

import java.io.*;

public class _9086_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String input = br.readLine();

        int testCase = Integer.parseInt(input);

        for (int i = 0; i < testCase; i++) {
            String testInput = br.readLine();
            String start = testInput.substring(0, 1);
            String end = testInput.substring(testInput.length() - 1);
            result.append(start).append(end).append("\n");
        }
        System.out.println(result);
    }
}
