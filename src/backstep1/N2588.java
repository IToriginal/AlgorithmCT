package backstep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 세자리 수 곱셈 - "BufferedReader" 사용
 * ----------------------------------------------------------------------------
 * BufferedReader는 Scanner 와 유사하지만 선언하는데 있어 주의할 점이 있다
 * 1. readLine();으로 입력을 받는데, 리턴 값이 String으로 고정되기 때문에
 * String이 아닌 다른 타입의 입력을 위해 형변환이 필요하다.
 * 2. 예외처리를 꼭 해주어야 한다.
 * readLine을 사용할 때 try&catch를 활용해서 예외처리를 해줄수 있지만,
 * throws IOException (예외 발생시 클래스 밖으로 나옴)을 통해서 예외를 처리한다.
 * 3. Buffer를 입력받으면서 Buffer를 사용하였기 때문에 반드시 close()를 호출해 닫아 주어야 한다.
 * 4. BufferedReader에는 자동 개행 기능이 없어 따로 처리해주어야 한다.
 */
public class N2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int Num1 = Integer.parseInt(bufferedReader.readLine());
        int Num2 = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        StringBuilder strBuilder = new StringBuilder();

        //10으로 나눈 나머지 값 = 숫자 1의 자리 반환
        strBuilder.append(Num1*(Num2%10));
        strBuilder.append('\n');

        //100으로 나눈 나머지 값에 10을 나눈 값 = 숫자 10의 자리 반환
        strBuilder.append(Num1*((Num2%100)/10));
        strBuilder.append('\n');

        //100으로 나눈 값 = 숫자 100의 자리 반환
        strBuilder.append(Num1*(Num2/100));
        strBuilder.append('\n');

        strBuilder.append(Num1 * Num2);
        System.out.print(strBuilder);
    }
}
