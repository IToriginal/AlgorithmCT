package inflearn.기본._04_HashMap_HashSet_TreeSet._05_K번째큰수;

import java.util.*;

public class Answer {
    public int solution(int[] arr, int n, int k) {
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args){
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(arr, n, k));
    }
}
