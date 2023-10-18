package solvedAc.class3.회의실배정_1931;

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<int[]> time = new ArrayList<>();
    public int solution(int n) {
        int answer = 0, prev_end_time = 0;

        Collections.sort(time, (a, b) -> {
            int compareValue = Integer.compare(a[1], b[1]);
            if (compareValue == 0) return Integer.compare(a[0], b[0]);
            return compareValue;
        });

        for (int i = 0; i < n; i++) {
            if (prev_end_time <= time.get(i)[0]) {
                prev_end_time = time.get(i)[1];
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // n = 회의의 수
        for (int i = 0; i < n; i++) {
            String[] meetingTime = br.readLine().split(" ");
            int s_time = Integer.parseInt(meetingTime[0]);
            int e_time = Integer.parseInt(meetingTime[1]);
            time.add(new int[] {s_time, e_time});
        }
        System.out.println(T.solution(n));
    }
}
