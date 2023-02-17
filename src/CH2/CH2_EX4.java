package CH2;
/*
 Scanner를 이용한 키 입력 연습
 */

/* 이 import문이 없으면,
   자바 컴파일러가 Scanner 클래스의 코드가 어디에 있는지 찾을 수 없다.*/
import java.util.Scanner;

public class CH2_EX4 {
    public static void main(String args[]){
        /* 왜 빈칸으로 분리하여 입력하라고 했을까?
           Scanner 클래스는 사용자가 입력하는 키 값을
           공백문자(' ', '\t', '\n')를 기준으로 분리하여 토큰 단위로 읽기 때문! */

        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);

        /*
        System.in은 키보드 장치를 직접 제어하고 키 입력을 받는
        표준 입력 스트림 객체이다.
         */

        /* Scanner클래스는 키보드에서 입력된 키를
        * 문자나 정수, 실수, 문자열 등 사용자가 원하는 타입으로 변환해 줌.*/

        String name = scanner.next(); // 문자열 읽기
        System.out.print("이름은 " + name + ", ");

        String city = scanner.next(); // 문자열 읽기
        System.out.print("도시는 " + city + ", ");

        int age = scanner.nextInt(); // 정수 읽기
        System.out.print("나이는 " + age + "살, ");

        double weight = scanner.nextDouble(); // 실수 읽기
        System.out.print("체중은 " + weight + "kg, ");

        boolean isSingle = scanner.nextBoolean(); // 논리값 읽기
        System.out.println("독신 여부는 " + isSingle + "입니다.");

        scanner.close(); // scanner 객체 닫기
    }
}

/* Tips : 응용프로글매 전체에 Scanner 객체를 하나만 생성하고 공유하는 것이 바람직하다.
   Scanner 객체를 여러 개 생성하더라도, 모두 하나뿐인 System.in을 공유하잖아?
   그러니까, Scanner.close()를 호출해서 Scanner 객체를 닫으면 어찌됐던 System.in이 닫힘.
   따라서 응용프로그램 내 다른 Scanner 객체에서 키 입력을 받을 수 없게 된다.
 */
