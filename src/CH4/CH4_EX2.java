package CH4;

// 너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램
// 너비(width)와 높이(height)필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스 활용

import java.util.Scanner;

// 클래스 선언, class Rectangle
class Rectangle {
    // 필드(변수) - 개체 내에 값을 저장할 멤버 변수를 필드라고 부름.
    // Rectangle 클래스에는 width와 height의 두 필드가 있음.
    int width;
    int height;
    // 메소드 - 함수, 객체의 행동을 구현함.
    // getArea() 메소드는 Rectangle 객체의 width와 height를 이용하여 면적을 계산하여 알려준다.
    public int getArea() {
        return width * height;
    }
}

// 객체는 new 연산자로 생성하고, 점(.) 연산자로 멤버를 접근하는 거야.

public class CH4_EX2 {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(); // 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        rect.width = scanner.nextInt(); // 사각형의 밑변을 입력받기
        rect.height = scanner.nextInt(); // 사각형의 높이를 입력받기
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
    }
}
