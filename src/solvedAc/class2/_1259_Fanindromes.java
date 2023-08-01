package solvedAc.class2;

import java.io.*;

public class _1259_Fanindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String input = br.readLine();
            boolean flag = true;

            if (input.equals("0")) {
                break;
            }

            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    flag = false;
                }
            }

            if (flag) {
                result.append("yes").append("\n");
            } else {
                result.append("no").append("\n");
            }
        }
        System.out.println(result);
    }
}
