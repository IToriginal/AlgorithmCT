package backstep2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 주사위 3개 - 3개의 주사위의 다중 비교
 * [1] 주사위 3개가 모두 같은 경우 (dice1 == dice2 == dice3)
 * [2] 주사위가 3개가 모두 다른 경우 (dice1 != dice2 != dice3)
 * [3] 주사위 3개에서 1개만 다른 경우  (dice1 == dice2 || dice2 == dice3 || dice1 == dice3)
 * [1] 과 [2] 의 비교는 dice1의 눈의 수를 기준으로 잡을 수 있다.
 * [3] 의 조건은 2가지의 눈의 기준으로 비교 조건을 가지고 있어 식을 나누어 주어야 한다
 * 1 :: dice1이 기준
 * 2 :: dice2가 기준
 * dice3은 1, 2 기준에 속하기 때문에 따로 기준을 잡을 필요가 없다
 */
public class N2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine(), " ");

        int dice1 = Integer.parseInt(stz.nextToken());
        int dice2 = Integer.parseInt(stz.nextToken());
        int dice3 = Integer.parseInt(stz.nextToken());

        // 모든 dice가 다른 경우
        if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3){
            int maxDiceNum = Math.max(dice1, Math.max(dice2, dice3));
            System.out.println(maxDiceNum * 100);
        }
        // dice1, 2, 3 모두 같은 경우
        else if (dice1 == dice2 && dice1 == dice3){
            System.out.println(10000 + dice1 * 1000);
        }
        // dice1이 dice2 나 dice3와 같은 경우
        else if (dice1 == dice2 || dice1 == dice3) {
            System.out.println(1000 + dice1 * 100);
        }
        // dice1만 다른 경우
        else {
            System.out.println(1000 + dice2 * 100);
        }
    }
}
