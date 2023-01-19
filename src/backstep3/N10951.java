package backstep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A+B
 * End of File : 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료
 * EOF 입력 방법 : Mac "Cmd" + "d"
 * 문제 Hint
 * 입력되는 정수는 반드시 ( 0< A,B < 10 ) 이다. 즉, 한자릿수 정수만 입력받는다.
 * 공백(" ")의 위치도 항상 고정된 위치
 * charAt() 사용
 * chatAt()은 해당 문자의 아스키코드 값을 반환하기 때문에 반드시 -48을 하여 정수로 변경해야한다
 */
public class N10951 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while( (str=br.readLine()) != null ){
            int a = str.charAt(0) - 48;
            //charAt(1)은 공백으로 고정
            int b = str.charAt(2) - 48;
            sb.append(a+b).append("\n");
        }
        System.out.print(sb);
    }
}
