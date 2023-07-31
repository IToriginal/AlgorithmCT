package solvedAc.class1;

import java.io.*;
import java.util.Arrays;

public class _2577_NumberOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String calc = String.valueOf(a * b * c);

        char[] calcArr = calc.toCharArray();
        int[] result = new int[10];
        Arrays.fill(result, 0);

        int[] calcIntArr = new int[calcArr.length];
        for (int i = 0; i < calcArr.length; i++) {
            calcIntArr[i] = Integer.parseInt(String.valueOf(calcArr[i]));
        }

        for (int i = 0; i < calcIntArr.length; i++) {
            result[calcIntArr[i]]++;
        }

        for (int num : result) {
            System.out.println(num);
        }
    }
}
