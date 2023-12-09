package inflearn.기본._04_HashMap_HashSet_TreeSet._05_K번째큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private int n, k;
    private int[] arr;


    private int solution() {
        int answer = -1;

        Set<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tree.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int sum : tree) {
            cnt++;
            if (cnt == k) {
                answer = sum;
                break;
            }
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
        System.out.println(m.solution());
    }

}
