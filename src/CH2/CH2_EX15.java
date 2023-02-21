package CH2;

// switch문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라.
// 에스프레소, 카푸치노, 키페 라떼는 3500원이고 아메리카노는 2000원이다.

import java.util.Scanner;

// switch문은 식의 결과 값을 case문의 값과 비교한다.
// case 문의 값을 정수 리터럴, 문자 리터럴, 문자열 리터럴만 허용한다.

public class CH2_EX15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("무슨 커피 드릴까요?");
        String order = scanner.next(); // 주문 읽기
        int price = 0;
        switch (order){
            case "에스프레소" :
            case "카푸치노" :
            case "카페라떼" :
                price = 3500; break;
            case "아메리카노"  :
                price = 2000; break;
            default : System.out.println("메뉴에 없습니다!");
        }
        if(price != 0)
            System.out.print(order + "는 " + price + "원 입니다.");
        scanner.close();
    }
}
