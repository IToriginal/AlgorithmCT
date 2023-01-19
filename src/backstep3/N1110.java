package backstep3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 더하기 사이클
 * https://st-lab.tistory.com/42
 * 처음 접하면 어려울 수 있는 문제이다.
 * 생각보다 코드를 보면 간단하다
 *
 * num 이라는 정수가 주어지면 num의 1의 자리 수가 10의 자리가 되고
 * 1의 자리 수와 10의 자리 수를 더한 값이 새로운 1의 자리가 된다
 * 여기서 만약 num이 한 자리의 정수라면 앞에 0을 붙여서 더하게 된다.
 *
 * 주어진 수가 num이고 새로운 수가 newNum 이라 가정하면
 * newNum = (num % 10) * 10
 * newNum의 10의 자리 수가 되는 것이다.
 *
 * 각 자릿수의 합인 1의 자리의 경우, 먼저 num의 10의 자리 수는
 * 나누기 10을 하게 될 경우 num이 한 자리 수라면 0, 그 외에는 십의 자리로
 * 반영하면 된다. 그리고 일의 자리 수는 나머지인 % 를 사용한다
 * newNum = ((num / 10) + (num % 10)) % 10
 * newNum의 1의 자리 수가 되는 것이다
 *
 * 즉, newNum의 식은
 * newNum = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10)
 */
public class N1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int cnt = 0;
        int newNum = num;

        do {
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            cnt ++;
        }while (newNum != num);
        System.out.println(cnt);
    }
}
