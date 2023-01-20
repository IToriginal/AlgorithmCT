package backstep4;

import java.io.*;
import java.util.Scanner;

/**
 * X 보다 작은 수
 * 배열에 입력받은 수열을 저장한 뒤에 반복문을 사용해서 배열을 순회하고
 * 조건문에 따라 출력 (X 값보다 작은 수)
 */
public class N10871 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int X = in.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for (int i=0; i<N; i++){
            if(arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
