package backstep5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한 수
 * 등차수열(arithmetic sequence): 연속하는 두 항의 차이가 모두 일정한 수열
 */
public class N1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
    }
    public static int arithmetic_sequence (int num) {
        int cnt = 0; //한수 카운팅
        if(num < 100) {
            return num;
        } else {
            cnt = 99;
            for (int i=100; i<=num; i++) {
                int Num100 = i / 100; //백의 자리 수
                int Num10 = (i / 10) % 10; //십의 자리 수
                int Num1 = i % 10; //일의 자

                if((Num100 - Num10) == (Num10 - Num1)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
