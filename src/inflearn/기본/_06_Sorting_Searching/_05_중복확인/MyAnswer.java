package inflearn.기본._06_Sorting_Searching._05_중복확인;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public char solution(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        if (set.size() != arr.length) return 'D';
        else return 'U';
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);
        System.out.println(T.solution(arr));
    }
}
