package backstep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 평균 조작
 * 정답과의 상대/절대 오차는 10^-2, 0.01까지 허용한다
 * 입력받은 값중 최대값 M을 사용해서 모든 점수에
 * (점수/M)*100으로 연산하고 새로운 평균을 구해야한다.
 */
public class N1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++) {
            sum +=((arr[i]/arr[arr.length-1]) * 100);
        }
        System.out.print(sum/arr.length);
    }
}
