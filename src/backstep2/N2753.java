package backstep2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 윤년
 * 4의 배수는 윤년 "1"을 출력하지만 100의 배수일 경우 윤년이 아니라서 "0"을 출력
 * 하지만, 400의 배수일 경우는 윤년임
 * 1. 4의 배수 : 4로 나눈 나머지는 "0" - if(year%4==0)
 * 2. 4의 배수이면서 400의 배수 : 400으로 나눈 나머지가 "0" - if(year%400==0)
 * 3. 4의 배수이면서 100의 배수 : 100의로 나눈 나머지가 "0" - else if(year%100==0)
 */
public class N2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        if(year%4==0){
            if(year%400==0) System.out.println("1");
            else if(year%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}
