package backstep3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * A+B
 */

public class N10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;
        StringBuilder sb = new StringBuilder();

        while (true) {
            stz = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(stz.nextToken());
            int num2 = Integer.parseInt(stz.nextToken());

            if (num1 == 0 && num2 == 0) {
                break;
            }
            sb.append((num1 + num2)).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}
