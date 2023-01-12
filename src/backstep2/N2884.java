package backstep2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 알람 시계
 * 1일은 24H의 값을 가진다
 * 문제에서 주의할 점은 시간은 24시 표기로 한다.
 * 문제는 알람을 45분 일찍 맞추는 것이다.
 * 분의 값이 45보다 큰 경우는 뺄셈만 해주면 되지만 45 미만인 경우 시의 단위를 -- 해주어야 한다.
 * 또한 작은 값에서 뺄셈을 하게 되면 -로 올바르지 않을 것이다. 따라서 1시간은 60분으로 60에서 빼준다.
 */
public class N2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer stz = new StringTokenizer(str, " ");
        int timeHour = Integer.parseInt(stz.nextToken());
        int timeMin = Integer.parseInt(stz.nextToken());

        if(timeMin < 45) {
            timeHour--;
            timeMin = 60 - (45-timeMin);
            if (timeHour < 0){
                timeHour = 23;
            }
            System.out.println(timeHour + " " + timeMin);
        }else {
            System.out.println(timeHour + " " + (timeMin - 45));
        }
    }
}
