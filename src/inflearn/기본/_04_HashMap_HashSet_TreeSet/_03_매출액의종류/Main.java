package inflearn.기본._04_HashMap_HashSet_TreeSet._03_매출액의종류;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private int n, k;
    private int[] arr;

    private ArrayList<Integer> solution() {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k -1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int leftPointer = 0;
        for (int rightPointer = k - 1; rightPointer < n; rightPointer++) {
            map.put(arr[rightPointer], map.getOrDefault(arr[rightPointer], 0) + 1);
            answer.add(map.size());
            map.put(arr[leftPointer], map.get(arr[leftPointer]) - 1);
            if (map.get(arr[leftPointer]) == 0) {
                map.remove(arr[leftPointer]);
            }
            leftPointer++;
        }

        return answer;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");
        n = Integer.parseInt(line1[0]);
        k = Integer.parseInt(line1[1]);
        arr = Arrays.stream(line2)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        for (int num : m.solution()) {
            System.out.print(num + " ");
        }
    }

}
