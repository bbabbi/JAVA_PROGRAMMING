package CH3;

/* 반복문 */

/*
for문은 처음부터 반복 횟수를 알 수 있는 경우에,
while문과 do-while문은 반복 횟수를 알 수 없고 조건에 따라 반복이 계속되거나 중단되는 경우
while문은 반복 조건을 처음부터 따지는 경우에, do-while문은 반복 조건을 나중에 따지는 경우
 */

public class CH3_EX1 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) { // 1 ~ 10까지 반복
            sum += i;
            System.out.print(i); // 더하는 수 출력
            if (i <= 9) // 1~9까지는 '+'출력
                System.out.print("+");
            else { //i가 10인 경우
                System.out.print("="); // '=' 출력하고
                System.out.print(sum); // 덧셈 결과 출력
            }
        }
    }
}
/* for문
- 초기문은 시작할 때 한 번만 수행되며 콤마(,)로 분리하여 여러 문장 나열 가능
- 초기문은 빈 상태로 두어도 되지만, 끝에 세미콜론(;)은 있어야 한다.
- 조건식에는 논리형 변수나 논리 연산을 사용한다.
- 반복 후 작업문에도 콤마(,)로 분리하여 여러 문장을 나열 할 수 있다.
 */