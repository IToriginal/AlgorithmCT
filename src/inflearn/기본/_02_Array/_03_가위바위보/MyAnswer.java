package inflearn.기본._02_Array._03_가위바위보;

import java.io.*;

public class MyAnswer {
    public String[] solution(int N, String str1, String str2) {

        String[] A = str1.split(" ");
        int[] PLAYER_A = new int[N];
        for (int i = 0; i < N; i++) {
            PLAYER_A[i] = Integer.parseInt(A[i]);
        }

        String[] B = str2.split(" ");
        int[] PLAYER_B = new int[N];
        for (int i = 0; i < N; i++) {
            PLAYER_B[i] = Integer.parseInt(B[i]);
        }

        String[] result = new String[N];
        for (int i = 0; i < N; i++) {
            if (PLAYER_A[i] == 1 && PLAYER_B[i] == 3) result[i] = "A";
            else if (PLAYER_A[i] == 2 && PLAYER_B[i] == 1) result[i] = "A";
            else if (PLAYER_A[i] == 3 && PLAYER_B[i] == 2) result[i] = "A";
            else if (PLAYER_A[i] == PLAYER_B[i]) result[i] = "D";
            else result[i] = "B";
        }

        return result; // { A, B, A, B, D }
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 게임 횟수(N): 5
        String inputA = br.readLine(); // A가 낸 가위, 바위, 보 정보(inputA) : 2 3 3 1 3
        String inputB = br.readLine(); // B가 낸 가위, 바위, 보 정보(inputB) : 1 1 2 2 3

        for (String s : T.solution(N, inputA, inputB)) {
            System.out.println(s);
        }
    }
}
