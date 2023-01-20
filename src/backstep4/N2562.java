package backstep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 최댓값
 * BufferedReader 사용
 */
public class N2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int index = 0;
        int count = 0;

        for(int value:arr){
            count++;
            if(value>max){
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
