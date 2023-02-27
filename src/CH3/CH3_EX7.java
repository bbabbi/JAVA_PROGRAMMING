package CH3;

/* 배열
   Java에서 배열의 생성은 C/C++과 달리 다음 두 단계로 이루어진다.
   1) 배열에 대한 레퍼런스 변수 선언 ex) int intArray[]; or int [] intArray;
   -> 이 선언만으로 배열 공간이 할당되지 않음.
   -> 아직 정수를 저장할 배열 공간이 생성되지 않았으므로 intArray 값은 null이다.
   -> 자바에서는 배열의 주소를 '레퍼런스'라고 부르며,
      배열에 대한 주소 갑슬 가지는 변수를 레퍼런스 변수라고 부른다.
   -> 배열 선언 시 []에 크기를 지정하면 안 됨!
      ex) int intArray[10]; - 컴파일 오류임

   2) 배열 생성 - 배열의 저장 공간 할당
   반!드!시!
   new 연산자를 이용하여 배열을 생성하며, 이때 [] 안에 생성할 원소 개수를 지정한다.
   ex) intArray = new int[5]; // 이 때 배열의 인덱스는 정수만 가능

   => 이렇게 하면 세팅 완료다. intArray를 배열로 사용할 수 있다.

   ** 동시에 선언하는 방법
   int intArray[] = new int[5];
*/

/* 배열 초기화
   : 배열 선언문에서 { }에 원소를 나열하면 초기화된 배열 만들기 가능
   ex) int intArray[] = {4, 3, 2, 1, 0};
       double doubleArray[] = {0.01, 0.02, 0.03, 0.04};
   -> intArray 배열의 크기는 자동으로 5가 되며,
      doubleArray 배열의 크기는 자동으로 4가 된다.
      즉, 배열의 원소 개수는 {}에 나열된 값의 개수로 정해지므로 []에 크기를 주면 안 된다.
*/


// 배열에 입력받은 수 중 가장 큰 수 찾기

import java.util.Scanner;

public class CH3_EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[5]; // 배열 생성
        int max = 0; // 현재 가장 큰 수
        System.out.println("양수 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장
            if (intArray[i] > max) // intArray[i]가 현재 가장 큰 수보다 크면
                max = intArray[i]; // intArray[i]를 max로 변경
        }
        System.out.print("가장 큰 수는 " + max + "입니다.");

        scanner.close();
    }
}

/* 레퍼런스 치환과 배열 공유
   : 자바에서는 레퍼런스 변수와 배열 공간이 분리되어 있기 때문에,
    다수의 레퍼런스 변수가 하나의 배열 공간을 가리키는 '배열 공유'가 쉽게 이루어진다.
    ex) int intArray[] = new int[5];
        int myArray[] = intArray; // 레퍼런스 치환. myArray는 intArray와 동일한 배열 참조
        -> 이 치환으로 intArray 배열이 복사되는 게 아니라, '레퍼런스' 즉 배열에 대한 '주소'만 복사된다.
           따라서 myArray는 intArray와 동일한 레퍼런스 값을 가지게 되어 myArray는 intArray의 배열을 공유하게 되고,
           myArray로 intArray의 배열 원소를 마음대로 접근할 수 있게 된다.
 */