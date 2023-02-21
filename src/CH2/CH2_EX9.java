package CH2;

// 87p 부터 다시하기

/*
* 비트 논리 연산과 비트 시프트 연산 - 나 이거 몰랐던 부분임 !
*/

/* (2진수의 한 자리를 비트(bit)라고 부르며, 8개의 비트를 바이트(byte)라고 한다.)
* 비트 연산은 비트끼리 AND, OR, XOR, NOT 연산을 하는 비트 논리 연산과,
* 비트를 오른쪽이나 왼쪽으로 이동시키는 비트 시프트 연산이 있음.
* 비트 AND 연산은 두 비트가 모두 1이면 1, 그렇지 않으면 0
  비트 OR 연산은 두 비트가 모두 0이면 0, 그렇지 않으면 1
  비트 XOR 연산은 두 비트가 다르면 1, 같으면 0
  비트 NOT 연산은 1을 0으로 0을 1로 변환
*/

public class CH2_EX9 {

    public static void main(String[] args){
        short a = (short)0x55ff;
        short b = (short)0x00ff;

        // 비트 논리 연산
        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n", (short)(a & b)); // 비트 AND
        System.out.printf("%04\n", (short)(a | b)); // 비트 OR
        System.out.printf("04x\n", (short)(a ^ b)); // 비트 XOR
        System.out.printf("%04\n", (short)(~a)); // 비트 NOT

        byte c = 20; //0x14
        byte d = -8; //0xf8

        // 비트 시프트 연산
        System.out.println("[시프트 연산 결과]");
        System.out.println( c << 2 ); // c를 2비트 왼쪽 시프트 (산술적 왼쪽 시프트)
        System.out.println( c >> 2 ); // c를 2비트 오른쪽 시프트, 0 삽입
        System.out.println(d >> 2); // d를 2비트 오른쪽 시프트, 1 삽입 (산술적 오른쪽 시프트)
        System.out.printf("%x\n",(d >>> 2)); // d를 2비트 오른쪽 시프트, 0 삽입 (논리적 오른쪽 시프트)
    }

}

/* Tips
   최상위 비트(MSB)란 수를 표현하는 이진수의 제일 높은 자리수
   최하위 비트(LSB)란 이진수의 제일 낮은 자리수
   만약, 숫자 21을 8비트의 이진수로 표현하면 00010101이며, 최상위 비트는 0이고, 최하위 비트는 1이다.
*/

/* 비트 시프트 연산자
-> 시프트 연산의 피연산자는 byte, short, int, long, char 타입만 가능하고,
   float, double, boolean은 사용할 수 없다.
*  1) a >> b : a의 각 비트를 오른쪽으로 b번 시프트한다. (산술적 오른쪽 시프트)
*              -> 최상위 비트의 빈자리는 시프트 하기 전의 최상위 비트로 다시 채운다.
*  2) a >>> b : a의 각 비트를 오른쪽으로 b번 시프트한다.(논리적 오른쪽 시프트)
*              -> 최상위 비트의 빈 자리는 항상 0으로 채운다는 점!
*  3) a << b : a의 각 비트를 왼쪽으로 b번 시프트한다.(산술적 왼쪽 시프트)
*              -> 최하위 비트의 빈자리는 항상 0으로 채운다.
*/