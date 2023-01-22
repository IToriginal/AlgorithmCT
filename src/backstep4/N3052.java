package backstep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 나머지
 * HashSet - Set의 파생 클래스
 * set을 집합이라고 생각하면 된다.
 * 중복되는 원소를 넣을 경우 하나만 저장한다. 즉 중복원소를 허용하지 않는다
 * HashSet은 순서의 개념이 없다. 따라서 Collection.sort() 메서드를 사용할 수 없다
 * 정렬을 원하는 경우 리스트로 변환 후 정렬이 필요하다.
 * 나머지 값에서 서로 다른 개수를 세면 되는 것
 * HashSet을 이용해 나머지 값이 HashSet원소에 이미 저장되어 있어 중복일 경우 저장이 되지 않고
 * 없으면 저장한다.
 * 저장하면서 들어간 원소의 개수는 HashSet의 사이즈, 결국 이는 서로 다른 나머지가 되는 것이다.
 */
public class N3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();


        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.print(h.size());
    }
}
