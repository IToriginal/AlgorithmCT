package backstep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 영수증
 * 총 금액을 입력 한다
 * 총 품목의 수를 입력 한다
 * 각 아이템의 금액 과 수량을 입력한다
 * 각 아이템의 금액과 수량의 합과 총 금액을 비교
 * 맞으면 'Yes'
 * 틀리면 'No'
 */
public class N25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPayment = Integer.parseInt(br.readLine());
        int itemQty = Integer.parseInt(br.readLine());
        int sum = 0;
        while (itemQty-- > 0) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            int payment = Integer.parseInt(stz.nextToken());
            int qty = Integer.parseInt(stz.nextToken());
            sum+=payment*qty;
        }
        System.out.println(sum==totalPayment?"Yes":"No");
    }
}
