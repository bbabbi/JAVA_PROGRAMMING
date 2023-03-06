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

/* 생성자의 특징
1. 생성자의 이름은 클래스 이름과 동일하다.
-> 생성자의 이름은 반드시 클래스 이름과 동일하게 작성해야 한다.

2. 생성자는 여러 개 작성(오버로딩) 할 수 있다.
-> 매개변수의 개수와 타입만 다르다면, 클래스 내에 생성자를 여러 개 둘 수 있다.

3. 생성자는 new를 통해 객체를 생성할 때 한 번만 호출된다.
-> 객체 생성은 반드시 new를 통해서만 이루어지며, 생성자는 이 때 자동으로 한 번만 호출된다.
   즉, 호출하고 싶을 때 아무 때나 호출할 수 있는 메소드가 아니다.

4. 생성자에 리턴 타입을 지정할 수 있다.
-> 생성자는 어떤 값도 리턴하지 않기 때문에 리턴 타입을 선언해서는 안 된다.
   ex) public Circle () {...} // 리턴 타입을 선언하지 않은 경우
       public void Circle () {...} // 오류. void를 리턴 타입으로 사용할 수 없음.

5. 생성자의 목적은 객체가 생성될 때, 필요한 초기 작업을 위함이다.
-> 생성자는 객체가 생성될 때, 필드 초기화, 필요한 메모리 확보, 파일 열기, 네트워크 연결 등
   객체가 활동하기 전에 필요한 초기 준비를 하는데 이용된다.
 */