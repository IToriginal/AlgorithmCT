package solvedAc.class1;

import java.io.*;
import java.util.*;

public class _3052_Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numList = new ArrayList<>();
        int testCase = 10;
        int standard = 42;

        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            numList.add(num % standard);
        }

        HashSet<Integer> result = new HashSet<>(numList);
        System.out.println(result.size());
    }
}
