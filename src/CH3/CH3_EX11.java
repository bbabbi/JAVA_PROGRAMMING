package CH3;

/* 비정방형 배열 - 헷갈렸던 내용임!!*/

/* 비정방형 배열은 행마다 열의 개수가 서로 다른 배열을 말한다.

   ** length 필드의 의미
      i.length -> 2차원 배열의 행의 개수, 4
      i[0].length -> 0번째 행의 열의 개수, 1
      i[1].length -> 1번째 행의 열의 개수, 2
      i[2].length -> 2번째 행의 열의 개수, 3
      i[3].length -> 3번째 행의 열의 개수, 4

   => 어떤 메소드가 '배열을 매개변수로 받을 때',
      배열이 정방형인지 비정방형인지는 표시되지 않기 때문에
      항상 length 필드를 사용하여 각 행의 열의 개수를 파악해야 한다.

   ** 배열 생성 시에 초기화를 통해 비정방형 배열을 생성하는 방법
      int intArray[][] = {{0}, {1,2}, {3,4,5}, {6,7,8,9}};
 */

// 비정방형 배열 만들고 값을 초기화하여 출력하기

public class CH3_EX11 {
    public static void main(String[] args){
        int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
        intArray[0] = new int[3]; // 첫째 행의 정수 3개의 배열 생성
        intArray[1] = new int[2]; // 둘째 행의 정수 2개의 배열 생성
        intArray[2] = new int[3]; // 셋째 행의 정수 3개의 배열 생성
        intArray[3] = new int[2]; // 넷째 행의 정수 2개의 배열 생성

        for(int i=0; i<intArray.length; i++) // 행에 대해 반복
            for(int j=0; j<intArray[i].length; j++) // 열에 대해 반복
                intArray[i][j] = (i+1)*10 + j;

        for(int i=0; i<intArray.length; i++){
            for(int j=0; j<intArray[i].length; j++){
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println(); // 다음줄로 넘어가기
        }
    }
}
