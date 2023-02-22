package CH3;

/* break문 : 하나의 반복문을 즉시 벗어날 때 사용
*
*  break문이 실행되면 현재의 반복문을 벗어나서 실행이 계속된다.
*  break문은 하나의 반복문만 벗어나기 때문에,
*  중첩 반복문의 경우 안쪽 반복문에서 break문이 실행되면,
*  안쪽 반복문만 벗어나며 바깥 쪽 반복문 내에서 실행이 유지된다.
*/

import java.util.Scanner;

public class CH3_EX6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit를 입력하면 종료합니다.");

        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine(); // 한 라인 읽기
            if(text.equals("exit")) // "exit"이 입력되면 반복 종료
                break; // while문을 벗어남.
        }
        System.out.println("종료합니다...");

        scanner.close();
    }
}

/* Tips : while문에서 벗어나기 노하우!!!!
   while문을 만들다보면 벗어나는 조건이 까다로운 경우도 많음.

   입력된 수의 n이 5의 배수거나 음수일 때 while문을 벗어난다고 해보자.
   while문의 조건식에 true를 주어 무한 반복하는 while문을 일단 작성하고,
   while문을 벗어나는 조건을 if문으로 코딩하는 것이 저자의 방식이다.
 */