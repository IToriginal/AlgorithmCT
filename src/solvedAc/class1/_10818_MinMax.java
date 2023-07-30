package solvedAc.class1;

import java.io.*;

public class _10818_MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = br.readLine().split(" ");

        int n = Integer.parseInt(input);
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        if (n < numbers.length) {
            System.out.println("ERROR");
        } else {
            for (String number : numbers) {
                int intNumber = Integer.parseInt(number);

                if (intNumber < min) {
                    min = intNumber;
                }
                if (intNumber > max) {
                    max = intNumber;
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
