package CH4;

/* 생성자
   : 생성자(constructor)는 객체가 생성될 때 객체의 초기화를 위해 실행되는 메소드
   생성자는 모든 객체지향 언어(C++, C#, Python 등)에 존재한다.
   -> 생성자는 객체가 생성되는 순간에 자동으로 호출되는 메소드로서,
      객체에 필요한 초기화를 실행하는 코드를 담아야 한다.
*/

// 2개의 생성자를 가진 클래스의 실행결과 확인하기 (교재에서는 클래스 이름이 Circle임.)
// 당연함. 원에 관한 내용임. 하지만 나는 정렬된 느낌이 더 좋아서 그냥 함.

public class CH4_EX3 {
    int radius;
    String name;

    // 생성자 이름은 클래스 이름과 동일해야함!
    // 생성자가 뭔데?(180p) 클래스의 이름과 동일한 메소드!
    public CH4_EX3() { // 매개 변수 없는 생성자
        // 필드 초기화
        radius = 1;
        name = "";
    }

    public CH4_EX3(int r, String n){ // 매개 변수를 가진 생성자, 단 생성자이기 때문에 리턴 타입 없음
        // 매개변수로 필드 초기화
        radius = r;
        name = n;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args){
        // 객체 생성. 반지름을 10으로, 이름을 "자바피자"로 초기화
        CH4_EX3 pizza = new CH4_EX3(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        CH4_EX3 donut = new CH4_EX3(); // 객체 생성. 반지름을 1, 이름을 ""로 초기화
        donut.name = "도넛피자"; // 이름 변경
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
