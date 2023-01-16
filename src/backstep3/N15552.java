package backstep3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 빠른 A+B - 시간 제한이 존재 (1.5s == 1500ms 이내)
 * 주의사항
 * Scanner 및 System.out.println 사용 시 시간 초과
 * 문제는 최대 100만개의 테스트 케이스가 주어진다는 가정이다. 이는 System.out.println이나 Scanner를 사용한다면
 * 각 테스트 케이스 마다 호출하여야 하기 때문에 횟수가 증가하여 시간이 지연될 수 밖에 없다.
 * 해결 방법
 * BufferedReader, BufferedWriter 사용
 * 테스트 케이스에서 주어지는 정수는 문자열 분리를 위해 매 반복마다 StringTokenizer을 생성과 동시에 문자를 입력 받는다.
 */
public class N15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer stz; // 반복문 내에 작성하면 N 만큼 반복해야 하므로 비효율적이다.
        for(int i=0; i<N; i++){
            stz = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(stz.nextToken()) + Integer.parseInt(stz.nextToken())) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
/**
 * 시간 : 848ms
 */
