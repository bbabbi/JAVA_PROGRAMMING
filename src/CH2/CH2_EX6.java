package CH2;

/*
  대입 연산자와 증감 연산자 사용
 */

public class CH2_EX6 {
    public static void main(String[] args){

        int a = 3, b = 3, c = 3;

        // 대입 연산자 사례
        a += 3; // a = a + 3 = 6
        b *= 3; // b = b * 3 = 9
        c %= 2; // c = c % 2 = 1
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        int d = 3;

        // 증감 연산자 사례

        /* d++ 연산으로 d는 3이 아닌, 4가 되지만
        d++는 증가 이전 값 3을 반환하기 때문에 a는 3이 된다.
        */

        // 후위연산자 : d를 1 증가하고, 증가 전의 값 반환
        a = d++; // a = 3, d = 4
        System.out.println("a=" + a + ", d=" + d);

        // 전위연산자 : d를 1 증가하고 증가된 값 반환
        a = ++d; // d = 5, a = 5
        System.out.println("a=" + a + ", d=" + d);

        // 후위연산자 : d를 1 감소하고 감소 전의 값 반환
        a = d--; // a = 5, d = 4
        System.out.println("a=" + a + ", d=" + d);

        // 전위연산자 : d를 1 감소하고 감소된 값 반환
        a = --d; // d = 3, a = 3
        System.out.println("a=" + a + ", d=" + d);
    }
}
