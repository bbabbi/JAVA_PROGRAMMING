package CH2;

/* 조건 연산자
* 조건 연산자는 3개의 피연산자로 구성됨.
* 조건 연산자 == 삼항(ternary) 연산자
* condition ? opr2 : opr3
*/

public class CH2_EX8 {
    public static void main (String[] args) {
        int a = 3, b = 5;
        System.out.print("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
        // a > b false a - b = -2 b - a = 2
    }
}
