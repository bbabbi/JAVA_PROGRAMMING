package CH2;

/* switch문 */
// switch문은 식의 결과 값을 case문의 값과 비교한다.
// case문의 값은 정수 리터럴, 문자 리터럴, 문자열 리터럴만 허용한다.

// 입력받은 성적에 대한 학점 부여 프로그램, 예제 2-12번 문제를 switch문으로 작성

import java.util.Scanner;

public class CH2_EX14 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        char grade;
        System.out.print("점수를 입력하세요(0~100) : ");
        int score = scanner.nextInt(); // 점수 읽기

        /* if-else문으로 작성한 경우 */
//        if(score >= 90) // score가 90 이상
//            grade = 'A';
//        else if (score >= 80) // score가 80 이상 90 미만
//            grade = 'B';
//        else if (score >= 70) // score가 70 이상 80 미만
//            grade = 'C';
//        else if (score >= 60) // score가 60 이상 70 미만
//            grade = 'D';
//        else // score가 60 미만
//            grade = 'F';

        /* switch문으로 작성한 경우 */

        switch(score/10) {
            case 10: // score = 100
            case 9: // score는 90~99
                grade = 'A';
                break;
            case 8: // score는 80~89
                grade = 'B';
                break;
            case 7: // score는 70~79
                grade = 'C';
                break;
            case 6: // score는 60~69
                grade = 'D';
                break;
            default: // score는 59이하
                grade = 'F';
        }

        System.out.println("학점은 " + grade + " 입니다.");

        scanner.close();
    }

}

/* switch문 내의 break 문
- case의 '실행 문장'이 실행된 후 break 문장은 switch 문을 벗어나도록 지시함.
만약 case문에 break문이 없다면 "break문을 만날 때까지" case문의 '실행 문장'을 계속 처리
*/