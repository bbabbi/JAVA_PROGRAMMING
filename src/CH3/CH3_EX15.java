package CH3;

/* 예외 처리, try-catch-finally문 */

/* 예외처리란, 개발자가 작성한 프로그램의 실행 중에 예외가 발생하면 이에 대응하는 것을 말한다.
   -> 예외가 발생할 가능성이 있는 실행문들을 try{ }블록으로 묶고,
      예외 처리 코드는 catch{ } 블록 내에 작성한다.
      catch()문의 ()안에는 처리하고자 하는 예외의 타입을 선언한다.
      catch{ } 블록은 예외마다 하나씩 작성되어야 한다.
      finally{ } 블록은 생략해도 상관없으며, 실제로 많은 경우에 생략한다.
      finally 블록은 예외 발생여부에 관계없이 마지막에 반드시 실행되는 블록이다.
*/

/* Tips : 다수의 예외처리를 하려는 경우
   -> 여러 개의 catch 블록을 연속적으로 ㅆㅇ
 */

// try-catch 블록을 이용하여 CH3_EX14를 수정하여,
// "정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다." 출력하고 다시 입력 받기

import java.util.Scanner;

public class CH3_EX15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("나뉨수를 입력하시오 : ");
            int dividend = scanner.nextInt(); // 나뉨수 입력
            System.out.print("나눗수를 입력하시오 : ");
            int divisor = scanner.nextInt(); // 나눗수 입력
            try{
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
                break; // 정상적인 나누기 완료 후 while 벗어나기
            } catch (ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
            }
        }
        scanner.close();
    }
}
