package backstep4;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 개수 세기
 * 입력으로 정수의 개수 N개가 주어지고,
 * 두 번째 Line에서 정수가 공백으로 나누어져 주어진다.
 * 마지막 세 번째 Line에서 찾으려는 정수 v가 주어진다.
 * 찾으려는 정수 v가 몇 개가 있는지를 출력한다.
 */
public class N10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer stz = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(stz.nextToken());
        }

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i=0; i<N; i++){
            if(arr[i] == v)
                cnt ++;
        }
        bw.write(cnt + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
