package backstep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 구구단
 * 공백을 주의하자
 * 언어 학습시 기본적으로 나오는 예제문이다.
 * 반복문을 사용하여 곱한 값을 출력한다.
 */
public class N2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();

        for(int i=1; i<10; i++){
            System.out.println(a+" * "+i+" = "+(a*i));
        }
    }
}
