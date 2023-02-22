package CH3;

/* while문 */

// -1이 입력될 때까지 정수를 계속 입력받아 합을 구하고 평균을 출력하는 프로그램

import java.util.Scanner;

public class CH3_EX2 {

    public static void main(String[] args){
        int count = 0; // count는 입력된 정수의 개수
        int sum = 0; // sum은 합

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

        int n = scanner.nextInt(); // 정수 입력
        /*
        true 동안 작업문의 실행을 반복하고, false가 되면 while문을 벗어난다.
        for문과 달리, while문에 조건식이 없으면 컴파일 오류가 발생한다.

        **** while문을 사용하는 경우,
             조건식에 사용되는 변수를 while문 실행 전에 초기화 하는 것을 잊지 말아야 함!!
         */
        while (n != -1) { // -1이 입력되면 while문을 벗어난다.
            sum += n;
            count ++;
            n = scanner.nextInt();
        }
        if(count == 0){
            System.out.println("입력된 수가 없습니다.");
        }
        else {
            System.out.print("정수의 개수는 " + count + "개이며");
            System.out.println("평균은 " + (double)sum/count + "입니다.");
        }
        scanner.close();
    }
}
