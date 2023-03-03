/* CH4 : 클래스와 객체 */

/*
- 클래스 : 객체를 만들어 내기 위한 설계도 or xmf
- 객체 : 클래스 모양 그대로 생성된 실체
  => 객체를 클래스의 '인스턴스'라고도 부름.
-> 클래스는 하나이지만, 객체들은 수 없이 많이 생성될 수 있다.
   객체들은 클래스의 모양대로 모두 동일한 속성을 가지고 탄생하지만, 자신만의 고유한 값을 가짐으로써 구분된다.
*/

//180부터 이어서 하기!

package CH4;

// 반지름과 이름을 가진 Circle 클래스 생성후, Circle 클래스의 객체 생성
// 객체가 생성된 모습 보이기.

/* 클래스 선언
- 이름이 CH4_EX1인 클래스를 선언한다.
- class 키워드와 클래스 이름으로 선언하고 중괄호({ }) 안에 필드(field)와 메소드(method)를 모두 작성
- 클래스 외부에는 어떤 필드나 메소드를 둘 수 없다. by 캡슐화의 원칙
*/
public class CH4_EX1 {
    /* 필드와 메소드
    - 객체 내에 값을 저장할 멤버 변수를 필드라고 부른다.
    - CH4_EX1 클래스에는 radius와 name의 두 필드가 있다.
    - 메소드는 함수이며 객체의 행동을 구현한다.
    - getArea() 메소드는 CH4_EX1 객체의 반지름 정보를 이용하여 면적을 계산해서 알려줌.
     */
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    /* 접근지정자
    - CH4_EX1이나 필드, 메소드에 붙은 public을 접근 지정자(acess specifier)라고 함.
    - public은 다른 클래스에서 활용하거나 접근할 수 있음을 선언함.
    - 접근 지정자를 생략할 때 디폴트 접근이라고 부른다.
     */
    /* 생성자(constructor)
    - 클래스의 이름과 동일한 메소드!
    - 생성자는 객체가 생성될 때 자동으로 호출되는 메소드임!
     */
    public CH4_EX1() { } // 생성자

    public double getArea(){ //원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args){
        /* 레퍼런스 변수
        - 객체 생성 전, '객체를 가리킬' '레퍼런스 변수'를 선언함.
        - CH4_EX1 pizza 이 선언문 자체로 CH4_EX1 타입의 객체가 생성되는 건 아님.
        - 변수 pizza는 CH4_EX1 클래스의 객체에 대한 주소이며,
          정확히는 레퍼런스를 가지는 변수일 뿐 객체 자체 자체는 아니다.
          따라서 CH4_EX1 pizza 명령어의 결과로는 레퍼런스 변수만 생기고 null로 초기화 된다.

        < C++과의 차이 >
        자바와 달리, C++에서는 CH4_EX1 pizza;로 객체가 생성되며 pizza는 그 자체가 객체.
        하지만 자바에서는 CH4_EX1 pizza 명령어는 레퍼런스 변수 pizza만을 선언함.
        즉, new CH4_EX1(); 처럼 반드시 new 키워드를 통해서만 객체가 생성됨!
        -> 동시에 하려면
           Circle pizza = new Circle();
        */
        
        CH4_EX1 pizza; // CH4_EX1 객체에 대한 레퍼런스 변수 pizza 선언
        pizza = new CH4_EX1(); // CH4_EX1 객체 생성
        pizza.radius = 10; // radius 필드에 10 저장
        pizza.name = "자바피자"; // name 필드에 "자바피자" 저장
        double area = pizza.getArea(); // pizza 객체의 면적 알아내기
        System.out.println(pizza.name = "의 면적은 " + area);

        CH4_EX1 donut = new CH4_EX1();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }

    /* 객체 멤버 접근
    -> 객체의 멤버에 접근할 때는 레퍼런스 변수 뒤에 점(.) 연산자를 붙인다.
    ex) 객체 레퍼런스. 멤버
        pizza.radius = 10;
   이 코드를 실행시키면, radius 필드 값이 10으로 바뀜.
   pizza 객체의 radius 필드 값을 읽을 경우 다음과 같이 하면 된다.
   int r = pizza.radius;

   double area = pizza.getArea();
   -> pizza 객체의 getArea() 메소드를 호출하여 면적 알아내기.
     */
}
