package CH2;

/*
 상수 PI를 선언하고 원의 면적을 구하는 프로그램

 상수는 이름 전체를 대문자로 표기하도록 권장하며, final double __ 형태로 표현
 */

public class CH2_EX2 {
    public static void main(String[] args){
        final double PI = 3.14; // 원주율을 상수 PI로 선언함.

        double radius = 10.0; // 원의 반지름
        double circleArea = radius * radius * PI; //원의 면적 계산

        // 원의 면적을 화면에 출력한다.
        System.out.println("원의 면적 = " + circleArea);
    }
}
