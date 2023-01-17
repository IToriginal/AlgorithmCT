package backstep3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A+B
 * BufferedReader 와 BufferedWriter를 사용해서 문제 풀이
 * readLine()은 한 행을 전부 읽음
 * 공백 단위 입력을 위해 문자열을 공백 단위로 분리 시켜 주어야 함 - StringTokenizer 사용
 * BufferedWriter 메소드는 단독 int 형 값만 넣을 경우에 아스키 코드 값으로 인식한다.
 * 이를 방지하기 위해서는 문자열과 int형을 함께 넣어주어야 한다.
 * 출력 결과 공백칸 주의
 */
public class N11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseQty = Integer.parseInt(br.readLine());
        int num1, num2;

        StringTokenizer stz;
        for(int i=1; i<=caseQty; i++){
            stz = new StringTokenizer(br.readLine(), " ");
            num1 = Integer.parseInt(stz.nextToken());
            num2 = Integer.parseInt(stz.nextToken());
            //출력 결과 예제 : Case #1: 1 + 1 = 2
            bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1+num2) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
