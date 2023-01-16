package backstep3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A+B를 출력하는 프로그램
 * N15552번과 크게 다를 것 없다.
 */
public class N11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer stz;
        for(int i=1; i<=num; i++){
            stz=new StringTokenizer(br.readLine(), " ");
            bw.write("Case #" + i + ": ");
            bw.write(Integer.parseInt(stz.nextToken()) + Integer.parseInt(stz.nextToken()) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
/**
 * 실행 시간 : 148 ms
 */