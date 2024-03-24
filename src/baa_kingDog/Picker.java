package baa_kingDog;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Picker {

    public static void main(String[] args) {
        // ProblemBuilder 클래스를 사용하여 문제 번호 리스트를 가져옴
        List<Integer> numberList = ProblemBuilder.build();
        Random random = new Random();

        System.out.println(LocalDate.now() + "\n🚀 오늘의 문제");

        // 랜덤한번호를 출력
        for (int i = 0; i < 1; i++) {
            int randomIndex = random.nextInt(numberList.size());
            int randomNumber = numberList.get(randomIndex);
            System.out.println("문제 번호: " + randomNumber);
            System.out.println("문제 링크: https://www.acmicpc.net/problem/" + randomNumber);
        }
    }

}

