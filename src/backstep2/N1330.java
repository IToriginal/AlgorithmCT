package backstep2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 두 수 비교하기 - 삼항 연산자 이용
 * readLine() 을 통해 입력 받아 연하는 경우, readLine() 은 한 행을 전부 읽기 때문에
 * 공백 단위로 입력해 준 문자열은 공백 단위로 분리해줘야 한다. - StringTokenizer 사용
 * stz.nextToken()은 문자열을 반환한다. 그러므로 Integer.parseInt()로 int 형으로 형 변환을 시켜준다
 */
public class N1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer stz = new StringTokenizer(str," ");
        int Num1 = Integer.parseInt(stz.nextToken()); // 문자열을 반환하여 integer 타입으로 형 변환
        int Num2 = Integer.parseInt(stz.nextToken());

        System.out.println((Num1 > Num2) ? ">" : ((Num1 < Num2) ? "<" : "=="));
    }
}
