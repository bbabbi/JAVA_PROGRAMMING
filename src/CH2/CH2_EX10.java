/* CH2.6 조건문 */

package CH2;

// 단순 if문 활용
// 시험 점수가 80점 이상이라면 합격 판별을 하는 프로그램 작성

import java.util.Scanner;

public class CH2_EX10 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하시오 : ");
        int score = scanner.nextInt();
        if(score >= 80)
            System.out.println("축하합니다! 합격입니다.");

        scanner.close();
    }
}
