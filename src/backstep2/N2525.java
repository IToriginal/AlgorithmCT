package backstep2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 오븐 시계 - 시간의 덧셈
 * 분을 기준으로 맞추어 문제를 풀어 나간다.
 * 1. 시의 값을 분의 값으로 변경한다
 * 2. 추가 분을 더한다
 * 3. 분을 시간 분 단위로 나누어 출력한다
 */
public class N2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(stz.nextToken()); // 현재 시각 A 시
        int B = Integer.parseInt(stz.nextToken()); // 현재 시각 B 분
        int C = Integer.parseInt(br.readLine()); // 필요한 시각 C분

        int min = 60 * A + B; // "시간"을 "분"으로 환산
        min += C;

        int timeHour = (min/60) % 24;
        int timeMin = min % 60;

        System.out.println(timeHour + " " + timeMin);
    }
}
