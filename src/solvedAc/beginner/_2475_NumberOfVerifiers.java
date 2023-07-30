package solvedAc.beginner;

import java.io.*;

public class _2475_NumberOfVerifiers {
    // 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");

        int result = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            result += (num * num);
        }
        System.out.println(result % 10);
    }
}
