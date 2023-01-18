package backstep3;


import java.io.*;

/**
 * 별찍기(2) - N번째 줄에 N개의 별을 찍기(오른쪽을 기준으로 정렬)
 * BufferedReader, BufferedWriter 사용하여 문제 풀이 => 문자가 많아질수록 성능에 차이가 많이 난다
 */
public class N2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N-i; j++) {
                bw.write(' ');
            }
            for(int k=1; k<=i; k++) {
                bw.write('*');
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
