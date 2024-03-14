package baa_kingDog.recursion._17478_재귀함수가_뭔가요;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final String MESSAGE_INTRO = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
    static final String MESSAGE_QUESTION = "\"재귀함수가 뭔가요?\"";
    static final String MESSAGE_ANSWER_1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static final String MESSAGE_ANSWER_2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static final String MESSAGE_ANSWER_3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static final String MESSAGE_FINAL = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static final String MESSAGE_END = "라고 답변하였지.";
    static final String MESSAGE_UNDER_BAR = "____";

    private static void responseMessage(int level, String underBar) {
        if (level == 0) {
            System.out.println(underBar + MESSAGE_QUESTION);
            System.out.println(underBar + MESSAGE_FINAL);
            System.out.println(underBar + MESSAGE_END);
            return;
        }

        System.out.println(underBar + MESSAGE_QUESTION);
        System.out.println(underBar + MESSAGE_ANSWER_1);
        System.out.println(underBar + MESSAGE_ANSWER_2);
        System.out.println(underBar + MESSAGE_ANSWER_3);

        responseMessage(level - 1, underBar + MESSAGE_UNDER_BAR);

        System.out.println(underBar + MESSAGE_END);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(MESSAGE_INTRO);
        responseMessage(N, "");
    }

}
