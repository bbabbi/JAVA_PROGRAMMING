package CH3;

/* main() 메소드 => 이거 잘 모르겠음!! */

/* main() 메소드의 특징
   - 자바 응용프로그램의 실행은 main() 메소드부터 시작한다.
   - main() 메소드는 public 속성이다.
     : public 속성은 메소드가 다른 클래스에서 호출 가능함을 나타낸다.
     자바 응용프로그램이 실행을 시작할 때 자바 가상기계(JVM)에 의해 호출되어야 하므로 public 속성으로 선언되어야 한다.
   - main() 메소드는 static 속성이다.
     : main() 메소드는 자신을 포함하는 클래스의 객체가 생성되기 전에,
     처음부터 자바 가상 기계에 의해 호출된다. 따라서 static 속성으로 선언되어야 한다.
   - main() 메소드의 리턴 타입은 void 이다.
     : 아무 값도 리턴하지 않기 때문.
     ?? main() 메소드를 끝내기 위해 리턴하려면 단순히 return; 문을 사용하면 된다.
   - main() 메소드에는 문자열 배열(String[])이 매개변수로 전달된다.
     : 자바는 명령행에 입력된 인자들을 문자열 배열로 만들어 main() 메소드에 전달한다.
 */

/* main() 메소드의 매개변수
C:> java Hello option1 option2 ... optionN (Hello 클래스의 main()에서 실행 시작)

-> option1, option2, ... , option N을 명령행 인자라고 부른다.
   이 명령행 인자들은 모두 Hello 클래스의 main() 메소드의 매개변수로 전달된다.
*/


// 사용자가 명령행에 입력한 실수들을 main() 메소드에서 전달받아 합을 구하는 프로그램

public class CH3_EX13 {
    public static void main (String[] args){
        double sum = 0.0;

        for(int i=0; i < args.length; i++) // 인자 개수만큼 반복
            sum += Double.parseDouble(args[i]); // 문자열을 실수(double 타입)로 변환하여 합산
        // parseDouble은 문자열을 실수로 변환하여 리턴한다.
        // 예를 들면, Double.parseDouble("20.5")는 실수 20.5를 리턴한다.

        System.out.println("sum = " + sum);
    }
}
