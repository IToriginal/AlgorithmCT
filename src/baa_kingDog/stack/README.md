# 스택 문제

![100%](https://progress-bar.dev/6/?scale=8&title=progress&width=310&color=babaca&suffix=/8)

| 문제 분류 |  문제   |                            문제 제목                            |
|:-----:|:-----:|:-----------------------------------------------------------:|
| 연습 문제 | 10828 |         [스택](https://www.acmicpc.net/problem/10828)         |
| 기본 문제 | 10773 |        [🌟제로](https://www.acmicpc.net/problem/10773)        |
| 응용 문제 | 1874  |        [🌟스택 수열](https://www.acmicpc.net/problem/1874)        |
| 응용 문제 | 2493  |          [🌟탑](https://www.acmicpc.net/problem/2493)          |
| 응용 문제 | 6198  |      [옥상 정원 꾸미기](https://www.acmicpc.net/problem/6198)      |
| 응용 문제 | 17298 |        [오큰수](https://www.acmicpc.net/problem/17298)         |
| 응용 문제 | 3015  |      [오아시스 재결합](https://www.acmicpc.net/problem/3015)       |
| 응용 문제 | 6549  |  [히스토그램에서 가장 큰 직사각형](https://www.acmicpc.net/problem/6549)  |

# 스택(Stack)
## Index
1. 정의와 성질
2. 기능과 구현

## 정의와 성질
**스택은 무엇일까?**

stack 이라는 영어 단어는 명사로 뜻은 `더미`, `퇴적`, `쌓아 올림`이라고 한다.
게임을 해본 사람은 아마도 게임에서 자주 "스택을 쌓는다."라는 말을 많이 보았을 것 같다.
이처럼 나에겐 중첩이라는 말이 가장 와닿는거 같다.

이렇게 자료구조의 스택은 위의 개념과 비슷하면서도 다른 것 같다.
자료구조에서 스택은 한쪽 끝에서만 원소를 넣거나 뺄 수 있는 자료 구조이다. 원소를 넣는 개념은 위의 개념과 같지만, 이 원소를 뺄 수도 있는 것이다.

스택은 구조적으로 먼저 들어간 원소가 제일 마지막에 나오게된다.
프링글스를 아신다면, 길다란 프링글스 통을 생각해보자.
우리는 무조건 가장 위의 감자칩을 먼저 먹는다는 제한이 있을 때, 가장 먼저 통에 들어간 감자칩을 먹기 위해서는 쌓인 감자칩을 모조리 먹어야 한다.
이처럼, `FILO: First In Last Out` 자료구조로 불린다.

### 스택의 성질
1. 원소의 추가가 O(1)
2. 원소의 제거가 O(1)
3. 제일 상단의 원소 확인이 O(1)
4. 제일 상단이 아닌 나머지 원소들의 확인/변경이 원칙적으로 불가능

### 기능과 구현
스택은 배열 혹은 연결리스트를 이용해 구현할 수 있다. (배열이 연결리스트보다 구현이 쉬움)

**구현**

```java
import java.util.Stack;

public class Snack {

    public static void main(String[] args) {
        Stack<Integer> snackBox = new Stack<>();

        // [push || add] 1 ~ 5번의 감자칩을 과자통에 넣기 위해서는 push() 또는 add()를 이용한다.
        for (int potatoChips = 1; potatoChips <= 5; potatoChips++) {
            snackBox.push(potatoChips); // snack.add(potatoChips);
        }

        // [pop] 감자칩 1개를 꺼내 먹기 위해서는 pop()을 이용한다.
        snackBox.pop(); // 1, 2, 3, 4

        // [peek] 다음으로 먹을 수 있는 감자칩을 확인할 때는 peek()을 이용한다. (먹지 않고 확인만 할 때)
        int checkChip = snackBox.peek(); // 4
        checkSnack(snackBox); // 감자칩이 4개 남아있습니다.

        // [clear] 감자칩이 오래되어 모두 버리려할 때는 clear()를 이용한다. (stack의 모든 요소를 비울 때)
        snackBox.clear();
        checkSnack(snackBox); // 모든 감자칩을 버려서 남은 것이 없습니다.


    }

    public static void checkSnack(Stack<Integer> snackBox) {
        // [isEmpty] 감자칩이 제대로 비워져 있는지 확인하기 위해서는 isEmpty()를 이용한다.
        if (snackBox.isEmpty()) {
            System.out.println("모든 감자칩을 버려서 남은 것이 없습니다.");
        } else {
            // [size] 감자칩이 몇개 남아있는지 확인하기 위해서는 size()를 이용한다.
            System.out.println("감자칩이 " + snackBox.size() + "개 남아있습니다.");
        }
    }

}
```
