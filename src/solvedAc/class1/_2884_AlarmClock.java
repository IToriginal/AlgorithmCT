package solvedAc.class1;

import java.io.*;

public class _2884_AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] times = br.readLine().split(" ");

        int hour = Integer.parseInt(times[0]);
        int min = Integer.parseInt(times[1]);

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min - 45));
        }
    }
}
