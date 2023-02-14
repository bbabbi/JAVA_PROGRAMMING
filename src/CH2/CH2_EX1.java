// 자바 프로그램의 기본 구조

package CH2;

/*
 소스파일 : CH2_EX1.java
 */

/*
   public은 자바의 접근지정자(access specifier)로서
   다른 모든 클래스에서 클래스 CH2_EX1을 자유롭게 사용할 수 있다는 선언이다.
   클래스 바깥에 어떤 것도 작성해서는 안 된다.
 */
public class CH2_EX1 {

    /*
    클래스 이름의 첫 번째 문자는 대문자로 시작 - 여러 단어가 복합되면 각 단어의 첫 번째 문자만 대문자로 표시
    변수와 메소드 이름의 첫 번째 문자는 소문자로 시작 - 이후 각 단어의 첫 번째 문자만 대문자로 표시
     */

    // sum 메소드
    public static int sum(int n, int m){
        return n + m;
    }

    // main() 메소드에서 실행 시작
    /*
       main()은 반드시 public static void 타입으로 선언되어야 하며
       한 클래스에 2개 이상의 main()을 작성하면 안 된다.
    */
    public static void main(String[] args){
        int i = 20;
        int s;
        char a;

        s = sum(i, 10); // sum 메소드 호출
        a = '?';
        System.out.println(a); // 문자 '?' 출력
        System.out.println("Hello"); // "Hello" 문자열 출력
        System.out.println(s); // 정수 s 값 30 출력
    }

}
