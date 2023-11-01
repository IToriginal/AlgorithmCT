package softeer.level2._8단변속기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int TRANSMISSION = 8;
    private static final String UPWARD_SHIFT = "ascending";
    private static final String DOWNWARD_SHIFT = "descending";
    private static final String MIXED_SHIFT = "mixed";

    public String solution(int[] numbers) {
        boolean isAcsending =  true;
        boolean isDescending = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                isDescending = false;
            } else if (numbers[i] > numbers[i + 1]){
                isAcsending = false;
            }
        }

        if (isAcsending) {
            return UPWARD_SHIFT;
        } else if (isDescending) {
            return DOWNWARD_SHIFT;
        } else {
            return MIXED_SHIFT;
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[TRANSMISSION];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < TRANSMISSION; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        System.out.print(T.solution(numbers));
    }

}
