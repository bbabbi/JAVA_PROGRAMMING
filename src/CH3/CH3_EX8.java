package CH3;

/* 배열의 크기, length 필드
   객체에는 배열의 저장 공간과 함께 배열의 크기 값을 가진 length 필드가 존재한다.

   length 필드를 이용하면 배열의 크기를 알아낼 수 있다.
   int intArray[] = new int[5];
   int size = intArray.length; // size는 5

   배열 객체에 length 필드가 있기 때문에, 프로그램에서 배열의 크기를 따로 관리할 필요가 없다.
   배열의 크기만큼 반복할 때 length 필드는 매우 유용하다.
   ex)
   for(int i=0; i < intArray.length; i++) // intArray 배열 크기(5)만큼 반복
      System.out.println(intArray[i]);
*/

// 배열 원소의 평균 구하기

import java.util.Scanner;

public class CH3_EX8 {
    public static void main(String[] args) {
        int intArray[] = new int[5]; // 배열의 선언과 생성 (동시에)
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(intArray.length + "개의 정수를 입력하세요>>");
        for(int i=0; i<intArray.length; i++){
            intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
        }
        for(int i =0; i<intArray.length; i++){
            sum += intArray[i]; // 배열에 저장된 정수 값 더하기
        }
        System.out.print("평균은 " + (double)sum/intArray.length);
        scanner.close();
    }
}
