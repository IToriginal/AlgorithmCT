package softeer.level2._GBC;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    private static int[] setSectionInfo(List<int[]> sectionInfo) {
        int[] sectionArr = new int[101];
        int endPoint = 0;
        for (int[] info : sectionInfo) {
            int sectionLimit = info[0];
            int velocityLimit = info[1];
            for (int i = endPoint + 1; i <= endPoint + sectionLimit; i++) {
                sectionArr[i] = velocityLimit;
            }
            endPoint += sectionLimit;
        }
        return sectionArr;
    }
    public int solution(List<int[]> stdList, List<int[]> ansList) {
        int[] standard = setSectionInfo(stdList);
        int[] answer = setSectionInfo(ansList);

        int[] result = new int[101];
        for (int i = 1; i <= 100; i++) {
            result[i] = Math.max(0, answer[i] - standard[i]);
        }
        return IntStream.of(result).max().getAsInt();
    }

    private static List<int[]> readSectionInfo(BufferedReader br, int count) throws IOException {
        List<int[]> sectionInfo = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int length = Integer.parseInt(input[0]);
            int velocity = Integer.parseInt(input[1]);
            int[] info = new int[]{length, velocity};
            sectionInfo.add(info);
        }
        return sectionInfo;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // 표준 제한 구간 정보의 수 n >= 1
        int m = Integer.parseInt(input[1]); // 테스트 구간 정보의 수 m <= 100

        List<int[]> standard = readSectionInfo(br, n);
        List<int[]> test = readSectionInfo(br, m);

        System.out.println(T.solution(standard, test));
    }

}
