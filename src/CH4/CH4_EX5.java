package CH4;

/* 기본 생성자와 this 레퍼런스 */

/* this 레퍼런스
: (단어 뜻 그대로) 객체 자신을 가리키는 레퍼런스

1. this의 기초 개념
- this는 현재 객체 자신에 대한 레퍼런스 (정확히는 현재 실행되고 있는 메소드가 속한 객체에 대한 레퍼런스)
- this는 컴파일러에 의해 자동 관리되기 때문에 개발자는 this를 사용하기만 하면 된다.
  예를 들어, this.radius는 현재 객체의 멤버 radius를 접근한다.
2. this의 필요성
- 클래스 내에서 멤버 radius를 접근할 때 굳이 this.radius로 할 필요가 없다.
- 그러면? this는 언제 필요할까?
  a. 매개변수의 이름을 멤버 변수와 같은 이름으로 붙이고자 하는 경우
  this.radius(멤버 radius) = radius(매개변수 radius);
  b. 메소드가 객체 자신의 레퍼런스를 리턴해야 하는 경우
  public Circle getMe() { return this; } // getMe() 메소드는 객체 자신의 레퍼런스 리턴
 */

public class CH4_EX5 {
    String title;
    String author;

    void show() { System.out.println(title + " " + author);}

    public CH4_EX5(){
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public CH4_EX5(String title){
        this(title, "작자미상");
    }

    public CH4_EX5(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args){
        CH4_EX5 littlePrince = new CH4_EX5("어린왕자", "생텍쥐페리");
        CH4_EX5 loveStory = new CH4_EX5("춘향전");
        CH4_EX5 emptyBook = new CH4_EX5();
        loveStory.show();
    }
}

/* 기본 생성자
1. 기본 생성자가 자동으로 생성되는 경우
- 생성자가 없는 클래스는 있을 수 없다.
- 객체가 생성될 때 반드시 생성자가 실행되기 때문이다.
- 그러므로 생성자가 하나도 없는 경우, 컴파일러는 기본 생성자를 자동으로 생성한다.

예를 들어,
public class Circle {
    int radius;
    void set(int r) { radius = r; }
    double getArea() { return 3.14 * radius * radius; }

    // public Circle() {}

    public static void main(String[] args){
        Circle pizza = new Circle();
        pizza.set(3);
    }
}
처럼 생성자가 하나도 만들어져 있지 않은 프로그램을 실행시키면 컴파일 오류가 나지 않고
저 사이에 public Circle() {} 문장을 "사용자의 눈에 보이지 않게" 삽입해준다.
즉, 자동으로 기본 생성자를 생성해주지만, 자바 파일이 그렇게 변하는 것은 아님!

2. 기본 생성자가 자동으로 생성되지 않은 경우
- 생성자가 하나라도 존재하는 클래스에는 컴파일러가 기본 생성자를 삽입해주지 않는다.
-> 왜 그럴까?
   클래스를 만든 개발자의 의도를 지켜주기 위함.
   Circle 클래스에 Circle(int r) 생성자가 있다는 것은, 객체를 생성할 때 new Circle(10)과 같이
   반드시 반지름 값으로 초기화하도록 강제하고 있다는 의미이다.
   즉 반지름 값 없이 new Circle()로 객체를 생성하지 말라는 개발자의 뜻이다.
   자바 컴파일러는 Circle 클래스의 의도를 훼손하지 않기 위해 기본 생성자를 자동으로 생성해주지 않는다.
*/
