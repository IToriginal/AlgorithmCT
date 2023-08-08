package solvedAc.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1676_팩토리얼0의개수  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n >= 5) {
            cnt += n / 5;
            n /= 5;
        }
        System.out.println(cnt);
    }
}
