package backstep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수의 합
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성
 */
public class N8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        int sum = 0;
        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
/**
 * [입력]
 * 3
 * [실행 결과]
 * 6
 */
