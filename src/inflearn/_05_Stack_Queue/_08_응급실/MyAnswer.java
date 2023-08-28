package inflearn._05_Stack_Queue._08_응급실;

import java.io.*;
import java.util.*;

/**
 * 2023. 08. 28 (월): 1차 구현 실패
 */

class Patient {
    int id;
    int risk;

    public Patient(int id, int risk) {
        this.id = id;
        this.risk = risk;
    }
}

public class MyAnswer {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Patient> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Patient(i, arr[i]));
        }

        while (!Q.isEmpty()) {
            Patient tmp = Q.poll();
            for (Patient p : Q) {
                if (p.risk > tmp.risk) {
                    Q.offer(tmp);
                    break;
                }
            }

            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" "); // 5 2
        String[] input2 = br.readLine().split(" "); // 60 50 70 80 90

        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }
        System.out.println(T.solution(n, m, arr));
    }
}
