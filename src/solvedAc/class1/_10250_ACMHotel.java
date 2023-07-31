package solvedAc.class1;

import java.io.*;

public class _10250_ACMHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] info = br.readLine().split(" ");

            int h = Integer.parseInt(info[0]);
            int w = Integer.parseInt(info[1]);
            int n = Integer.parseInt(info[2]);

            int floor;
            int dist;

            if (n % h == 0) {
                floor = h * 100;
                dist = n / h;
            } else {
                floor = (n % h) * 100;
                dist = (n / h) + 1;
            }

            int room = floor + dist;
            System.out.println(room);
        }
    }
}
