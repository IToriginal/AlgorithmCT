package solvedAc.class1;

import java.io.*;

public class _2920_Scale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        String result = "";

        int[] scale = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            scale[i] = num;
        }

        for (int i = 0; i < scale.length - 1; i++) {
            if (scale[i + 1] == scale[i] + 1) {
                result = "ascending";
            } else if (scale[i + 1] == scale[i] - 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }
        System.out.println(result);
    }
}
