package backstep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 최소, 최대
 * Array + BufferedReader
 * hasMoreTokens() 는 StringTokenizer 에 토큰이 남아있으면 true, 비어있으면 false를 반환한다
 */
public class N10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        /**
         * Option1: Array + BufferedReader
         */
        int index = 0;
        int arr[] = new int[N];
        while (st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N-1]);

        /**
         * Option2: BufferedReader
         */
        /*
        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if(val>max) {
                max = val;
            }
            if(val<min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);
        */
    }
}
