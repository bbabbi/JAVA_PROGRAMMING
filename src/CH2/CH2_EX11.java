package CH2;

/* if - else문 활용 */

// 입력된 수가 3의 배수인지 판별하는 프로그램을 작성하라.
// == 3으로 나눈 나머지가 0인지 판단해주는 프로그램을 작성하면 된다.

/* Tips
   if와 else의 실행문이 한 개 즉 하나의 문장이면 중괄호 생략 가능
 */

import java.util.Scanner;

public class CH2_EX11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수를 입력하시오 : ");
        int number = scanner.nextInt(); // 정수를 입력받는다.
        if(number % 3 == 0) // 3으로 나눈 나머지가 0인지 검사한다.
            System.out.println("3의 배수입니다.");
        else
            System.out.println("3의 배수가 아닙니다.");

        scanner.close();
    }
}
