package backstep3;

import java.util.Scanner;

/**
 * A + B 문제 - 반복문 for
 * 입력 받는 첫줄에는 Test case의 수이다. - 배열 사용
 * 공백으로 구분되어 있다.
 */
public class N10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int ar[] = new int[c];

        for(int i=0; i< c; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            ar[i] = a + b;
        }
        in.close();
        for (int k : ar){
            System.out.println(k);
        }
    }
}
