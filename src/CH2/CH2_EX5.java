package CH2;

/*
 / 와 % 산술 연산
 초 단위의 정수를 입력받아서 몇 시간, 몇 분, 몇 초인지를 출력하는 프로그램
 */

import java.util.Scanner;

public class CH2_EX5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt(); // 정수 입력
        int second = time % 60; // 60으로 나눈 나머지는 '초'
        int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
        int hour = (time / 60) / 60; // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간

        System.out.println(time + "초는 ");
        System.out.println(hour + "시간, ");
        System.out.println(minute + "분, ");
        System.out.println(second + "초입니다.");

        scanner.close();
    }
}

/* Tips : 연산자 우선순위
 우선순위가 동일하면 왼쪽 -> 오른쪽으로 처리하지만,
 대입연산자, --, ++, +(양수부호), -(음수부호), !, 타입 변환 연산자 등은
 왼쪽 <- 오른쪽으로 처리한다.

 */