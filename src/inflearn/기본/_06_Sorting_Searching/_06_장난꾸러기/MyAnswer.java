package inflearn.기본._06_Sorting_Searching._06_장난꾸러기;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] cotains = arr.clone();
        Arrays.sort(cotains);

        for (int i = 0; i < arr.length; i++) {
            if (cotains[i] != arr[i]) list.add(i + 1);
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);
        for (int x : T.solution(arr)) System.out.print(x + " ");
    }
}
