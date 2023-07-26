package programmers.level2;
/**
 * 2023. 07. 26 (수)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42578">의상</a>
 */
import java.util.*;
class Clothes {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>(); // 의상의 종류와 개수를 저장하기 위해 'map' 선언

        // String[] str = new String[clothes.length]; // 각 의상의 종류를 저장할 문자열 배열 'str'을 선언
        //
        // for (int i = 0; i < clothes.length; i++) {
        //     str[i] = clothes[i][1]; // clothes 배열의 i번째 요소의 두 번째 원소(의상 종류)를 'str' 배열에 저장
        //     if (map.get(clothes[i][1]) == null) { // 'map'에 현재 의상 종류를 키로 가지는 값(의상 개수)이 없으면 (즉, 해당 종류의 의상이 처음 등장한 경우) 새로운 키-값 쌍을 'map'에 추가
        //         map.put(clothes[i][1], 1);
        //     } else {
        //         int x = map.get(clothes[i][1]);
        //         map.put(clothes[i][1], x + 1);
        //     }
        // }
        //
        // // 중복을 제거한 유니크한 의상 종류만을 추출하여 새로운 배열 str2에 저장.
        // // 이때, Arrays.stream()과 distinct()를 이용하여 중복을 제거하고, 다시 toArray()를 이용하여 배열로 변환합니다.
        // String[] str2 = Arrays.stream(str).distinct().toArray(String[]::new);
        //
        // int value = 1;
        // for (int i = 0; i < str2.length; i++) {
        //     value *= (map.get(str2[i]) + 1);
        // }
        // return value - 1;

        for (String[] cloth : clothes) {
            String category = cloth[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }

        int answer = 1;

        for (int count : map.values()) {
            answer *= (count + 1);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        Clothes result = new Clothes();
        String[][] clothes_test1 = {
            {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}
        };
        String[][] clothes_test2 = {
            {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}
        };

        System.out.println(result.solution(clothes_test1)); // 5
        System.out.println(result.solution(clothes_test2)); // 3
    }

}
