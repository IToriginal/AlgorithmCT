package backstep5;

/**
 * 정수 N개의 합 - 함수
 * JAVA: long sum(int[] a);
 * a: 합을 구해야 하는 정수 n 개가 저장되어 있는 배열
 * 리턴값: a에 포함되어 있는 정수 n 개의 합
 * 즉, a 배열에 저장되어있는 정수들을 더해서 long형으로 리턴 시켜주는 문제
 */
public class N15596 {
    long sum(int[] a) {
        long sum = 0; //a 배열의 정수 합을 위한 변수 선언
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
