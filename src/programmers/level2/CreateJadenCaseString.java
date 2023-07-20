package programmers.level2;

class CreateJadenCaseString {
    public String solution(String s) {
        String answer = "";
        String[] words = s.toLowerCase().split("");
        boolean flag = true;

        for (String word : words) {
            answer += flag ? word.toUpperCase() : word;
            flag = word.equals(" ") ? true : false;
        }
        return answer;
    }

    public static void main(String[] args) {
        CreateJadenCaseString result = new CreateJadenCaseString();
        String s1 = "3people unFollowed me";
        String s2 = "for the last week";

        System.out.println(result.solution(s1));
        System.out.println(result.solution(s2));
    }
}
