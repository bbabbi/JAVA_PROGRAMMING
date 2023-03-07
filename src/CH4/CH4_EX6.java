package CH4;

/* 객체 배열
-> 자바에서는 기본 타입 데이터뿐 아니라, 객체를 원소로 하는 개체 배열도 만들 수 있다.
-> C나 C++과 달리, 자바의 객체 배열은 객체에 대한 레퍼런스를 원소로 갖는 배열이다.

[객체 배열을 만들기 위한 단계]
1단계) 배열에 대한 레퍼런스 선언
: 다음은 Circle 클래스의 배열에 대한 레퍼런스 변수 c를 선언한다.
Circle [] c;
-> 이제는 알곘지만, 이 선언문은 레퍼런스 변수 c만 선언할 뿐, 배열을 생성하는 것은 아니다.
   따라서, Circle[5] c; 처럼 배열의 원소 개수를 지정하면(== 배열의 크기를 지정하면) 안 된다.

2단계) 레퍼런스 배열 생성
: 두 번째로 5개의 레퍼런스를 원소로 하는 배열을 생성한다.
  배열의 원소는 객체가 아니라 레퍼런스이다.
c = new Circle[5]; // Circle 객체에 대한 레퍼런스 5개 생성
-> 이 코드의 실행 결과 Circle 객체에 대한 레퍼런스 배열이 생성되며,
   변수 c가 이를 가리킨다. 다만, Circle 객체들은 아직 존재하지 않는다.

3단계) 객체 생성
: 이제 다음 코드를 이용하여 Circle 객체를 하나씩 생성하여 배열 c[]의 각 레퍼런스에 대입한다.

*/


// Circle 객체 배열 만들기
// 반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적을 출력하라.

class Circle{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}

public class CH4_EX6 {
    public static void main(String[] args){
        Circle [] c; // Circle 배열에 대한 레퍼런스 c 선언
        c = new Circle[5]; // 5개의 레퍼런스 배열 생성

        for(int i = 0; i < c.length; i++) // 배열의 개수 만큼
            c[i] = new Circle(i); // i 번째 원소 객체 생성

        // 배열의 원소 객체 접근
        // -> 배열 c의 i번째 객체에 접근하기 위해서는 c[i] 레퍼런스를 사용하면 된다.
        for(int i = 0; i < c.length; i++) // 배열의 모든 Circle 객체의 면적 출력
            System.out.print((int)(c[i].getArea()) + " ");
    }
}
