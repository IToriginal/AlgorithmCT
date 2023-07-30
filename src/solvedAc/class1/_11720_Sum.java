package solvedAc.class1;

import java.io.*;

public class _11720_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = br.readLine().split("");

        int n = Integer.parseInt(input);

        if (n < numbers.length) {
            System.out.println("ERROR");
        } else {
            int result = 0;
            for (String number : numbers) {
                int intNumber = Integer.parseInt(number);
                result += intNumber;
            }
            System.out.println(result);
        }
    }
}
