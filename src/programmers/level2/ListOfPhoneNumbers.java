package programmers.level2;

import java.util.HashMap;

/**
 * 2023. 07. 26 (수)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42577">전화번호 목록</a>
 */
class ListOfPhoneNumbers {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String phone_number : phone_book) {
            map.put(phone_number, 1); // 전화번호(key), 1(value) -> 1을 값으로 가지는 이유는 전화번호의 중복을 방지하기 위해서이다.
        }

        for (String phone_number : phone_book) {
            for (int i = 0; i < phone_number.length(); i++) {
                // 현재 순회중인 전화번호(phone_number)에서 0 ~ i - 1번째 까지 부분 문자열을 추출하여 prefix 변수에 저장한다. prefix는 phone_number의 접두사를 나타낸다.
                String prefix = phone_number.substring(0, i);
                if (map.containsKey(prefix)) { // map에 prefix가 이미 존재한다면, false 반수
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListOfPhoneNumbers result = new ListOfPhoneNumbers();

        String[] phone_book_test1 = {"119", "97674223", "1195524421"};
        String[] phone_book_test2 = {"123","456","789"};
        String[] phone_book_test3 = {"12","123","1235","567","88"};

        System.out.println(result.solution(phone_book_test1)); // false
        System.out.println(result.solution(phone_book_test2)); // true
        System.out.println(result.solution(phone_book_test3)); // false
    }
}
