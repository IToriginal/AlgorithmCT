package backstep3;

import java.io.*;

/**
 * 별찍기(1) - N번째 줄에 N개의 별을 찍기
 * BufferedReader, BufferedWriter 사용하여 문제 풀이
 * 이중 for문
 */
public class N2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                bw.write('*');
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
