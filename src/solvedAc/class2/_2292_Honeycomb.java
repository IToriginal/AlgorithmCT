package solvedAc.class2;

import java.io.*;

public class _2292_Honeycomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 1;
        int i = 1;

        while (true) {
            if (n <= range) {
                System.out.println(count);
                break;
            }
            range += (6 * i);
            i++;
            count++;
        }
    }
}
