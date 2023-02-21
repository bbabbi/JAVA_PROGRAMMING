package CH2;

/* 중첩 if-else문 사례 */

// 점수와 학년을 입력 받아, 60점 이상이면 합격, 60점 미만이면 불합격
// 4학년의 경우 70점 이상이어야 합격

import java.util.Scanner;

public class CH2_EX13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100) : ");
        int score = scanner.nextInt(); // 점수 읽기
        System.out.print("학년을 입력하세요(1~4): ");
        int year = scanner.nextInt(); // 학년 읽기

        if(score >= 60) { // 60점 이상
            if (year != 4)
                System.out.println("합격!"); // 4학년이 아니면 합격
            else if (score >= 70)
                System.out.println("합격!"); // 4학년이 70점 이상이면 합격
            else
                System.out.println("불합격!"); // 4학년이 70점 미만이면 불합격
        }

        else // 60점 미만 불합격
            System.out.println("불합격!");

        scanner.close();
    }
}

/* Tips : if - else와 조건 연산자 '?' ':'
조건 연산자 '?' ':'은 똑같은 결과를 가져오는 if-else문으로 바꿀 수 있다.
i = a > b ? a - b : b - a; // a, b 값의 차이를 i에 저장
이 문장은 다음의 if-else문으로 변경할 수 있다.
if (a>b)
    i = a - b;
else
    i = b - a;
 */