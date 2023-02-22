package CH3;

/* do - while문
*  do - while문의 조건식은 while문과 동일하며 조건식이 없으면 컴파일 오류가 발생함
*  다른 반복문과 달리, do - while 문은 작업문 실행 후 조건식을 검사한다.
*  따라서 작업문을 최초 한 번은 반드시 실행된다.*/

// 'a'부터 'z'까지 출력하는 프로그램

public class CH3_EX3 {
    public static void main(String[] args){
        char c = 'a';

        do{
            System.out.print(c);
            c = (char)( c + 1 ); // 영문의 경우 1을 더하면 다음 문자의 코드 값이 된다. by ASCII 코드
        } while ( c <= 'z' );
    }
}

/* Tips : 세 가지 반복문 for, while, do-while문

   세 가지 반복문은 기능적인 면에서 동일하다.
   따라서 각 반복문은 "다른 반복문으로 변환할 수 있다"

   1) 횟수나 범위가 명확한 경우 : for문
   2) 반복이 진행되면서 평가되어야 하는 경우 : while문, do-while문

   *** 무한 반복에 빠지지 않도록 주의하자 ***

 */
