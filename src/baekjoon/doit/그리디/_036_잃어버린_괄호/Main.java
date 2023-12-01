package baekjoon.doit.그리디._036_잃어버린_괄호; // BOJ1541 - S2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static String[] str;

    private int mySum(String s) {
        int sum = 0;
        String[] temp = s.split("[+]");
        for (String string : temp) {
            sum += Integer.parseInt(string);
        }
        return sum;
    }

    private int solution() {
        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        return answer;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split("-");
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
