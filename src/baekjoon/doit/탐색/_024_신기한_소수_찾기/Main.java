package baekjoon.doit.탐색._024_신기한_소수_찾기; // BOJ2023 - G5

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static int n;
    public static List<Integer> result;

    private boolean isPrime(int number) {
        return number >= 2 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(i -> number % i != 0);
    }

    private void DFS(int number, int jarisu) {
        if (jarisu == 0 && isPrime(number)) {
            result.add(number);
            return;
        }

        if (jarisu > 0) {
            IntStream.rangeClosed(0, 9)
                    .mapToObj(i -> number * 10 + i)
                    .filter(this::isPrime)
                    .forEach(next -> DFS(next, jarisu - 1));
        }
    }

    public List<Integer> solution() {
        result = new ArrayList<>();
        DFS(0, n);
        return result;
    }

    public void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        m.solution().forEach(System.out::println);
    }

}
