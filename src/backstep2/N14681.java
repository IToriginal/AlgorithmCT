package backstep2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사분면 고르기 (Quadrant n)
 * 조건
 * [1] : 입력 받는 X 값이 양수이고 Y 값도 양수이면 1 사분면인 "1" 을 출력
 * [2] : 입력 받는 X 값이 양수이고 Y 값이 음수이면 4 사분면인 "4" 을 출력
 * [3] : 입력 받는 X 값이 음수이고 Y 값이 양수이면 3 사분면인 "3" 을 출력
 * [4] : 입력 받는 X 값이 음수이고 Y 값도 음수이면 2 사분면인 "2" 을 출력
 */
public class N14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dotX = Integer.parseInt(br.readLine());
        int dotY = Integer.parseInt(br.readLine());

        if (dotX > 0){
            if(dotY > 0) {
                System.out.print(1);
            }else {
                System.out.print(4);
            }
        }else {
            if(dotY > 0){
                System.out.print(2);
            }else {
                System.out.print(3);
            }
        }
    }
}
