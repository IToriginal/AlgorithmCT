package solvedAc.class3.리모컨_1107;

import java.io.*;

public class Main {

    static int MAX_LOOP = 999999;

    public int solution(int n, int[] arr) {
        int answer = Math.abs(n - 100);
        boolean[] broken = new boolean[10];
        for (int i = 0; i < arr.length; i++) {
            int button = arr[i];
            broken[button] = true;
        }

        for (int i = 0; i < MAX_LOOP; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for (int j = 0; j < len; j++) {
                if (broken[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }

            if (!isBreak) {
                int min = Math.abs(n - i) + len;
                answer = Math.min(min, answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 이동하려는 채널
        int m = Integer.parseInt(br.readLine()); // 고장난 버튼의 개수
        int[] arr = new int[m];
        String[] brokenButton = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(brokenButton[i]);
        }
        System.out.println(T.solution(n, arr));
    }

}
