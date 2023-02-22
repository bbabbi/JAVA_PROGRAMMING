package CH3;

/* countine문
*  반복문을 빠져나가지 않으면서, 즉시 다음 반복으로 넘어가고 싶을 때!
* for문에서 continue문을 만나면 '반복 후 작업'으로 분기하고,
* while문이나 do-while문에서는 조건식을 검사하는 과정으로 분기한다.
* */

/* continue 문을 이용하여 양수 합 구하기
5개의 정수를 입력받고 그 중 양수들만 합하여 출력하는 프로그램을 작성하라.
-> 입력된 수가 0이나 음수이면(==양수가 아니면) continue문을 이용하여 합하지 않고 다음 반복으로 넘어간다.
 */

import java.util.Scanner;

public class CH3_EX5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요.");
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int n = scanner.nextInt(); // 키보드에서 정수 입력
            if(n <= 0)
                continue; // 양수가 아닌 경우 다음 반복으로 진행
            else
                sum += n; // 양수인 경우 덧셈
        }
        System.out.println("양수의 합은 " + sum);

        scanner.close();
    }
}
