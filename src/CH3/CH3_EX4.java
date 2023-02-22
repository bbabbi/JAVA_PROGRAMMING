package CH3;

/* 중첩 반복문 : 반복문 안에 다른 반복문*/

// 2중 중첩 for문을 사용하여 구구단 출력하는 프로그램

public class CH3_EX4 {
    // 한 줄에 한 단씩 출력한다.

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // 1단에서 9단
            for (int j = 1; j < 10; j++) { // 각 단의 구구셈 출력
                System.out.print(i + "*" + j + "=" + i * j); // 구구셈 출력
                System.out.print('\t'); // 하나씩 탭으로 찍기
            }
            System.out.println(); // 한 단이 끝나면 다음 줄로 커서를 이동한다.
        }
    }
}
