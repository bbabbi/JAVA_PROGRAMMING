package CH2;

// 비교 연산과 논리 연산

public class CH2_EX7 {
    public static void main(String[] args) {
        // 비교 연산
        System.out.println('a' > 'b'); // 'a'는 97, 'b'는 98
        System.out.println(3 >= 2); // 3은 2보다 크다
        System.out.println(-1 < 0); // -1은 0보다 작다
        System.out.println(3.45 <= 2); // 3.45는 2보다 크다 false
        System.out.println(3 == 2); // 3은 2와 같지 않다 false
        System.out.println(3 != 2); // 3은 2와 같지 않다
        System.out.println(!(3 != 2)); // 맞는 말의 역 flase

        System.out.println();

        // 비교 연산과 논리 연산 복합
        System.out.println((3 > 2) && (3 > 4)); // 1 && 0 == 0 false 둘 다 true이면 true,,
        System.out.println((3 != 2) || (-1 > 0)); // 1 || 0 true 둘 다 false이면 false
        /* XOR 연산 기억 안 났음 ! */
        System.out.println((3 != 2) ^ (-1 > 0)); // 1 ^ 0 true XOR연산은 둘이 다를 때 true 같으면 flase임.
    }
}
