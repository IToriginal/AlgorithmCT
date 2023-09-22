package inflearn.기본._06_Sorting_Searching._06_장난꾸러기;

import java.util.*;

public class Answer {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) answer.add(i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(n, arr)) System.out.println(x + " ");
    }
}
