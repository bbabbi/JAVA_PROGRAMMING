/* CH4 : 클래스와 객체 */

package CH4;

// 반지름과 이름을 가진 Circle 클래스 생성후, Circle 클래스의 객체 생성
// 객체가 생성된 모습 보이기.
public class CH4_EX1 {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public CH4_EX1() { } // 생성자

    public double getArea(){ //원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args){
        CH4_EX1 pizza;
        pizza = new CH4_EX1();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name = "의 면적은 " + area);

        CH4_EX1 donut = new CH4_EX1();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
