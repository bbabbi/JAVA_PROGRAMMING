package CH3;

/* 3.4 다차원 배열 */

/* 2차원 배열
   - 2차원 배열의 선언과 생성
   : 2차원 배열에서도 레퍼런스 변수 선언 후 배열을 생성한다.
   ex) int intArray [][]; or int [][] intArray;
       char charArray [][]; or char [][] charArray;
       double doubleArray [][]; or double [][] doubleArray;

   2차원 배열의 저장 공간도 new 연산자를 이용하여 생성하며,
   첫 번째 []는 행의 개수를, 두 번째 []는 열의 개수를 나타낸다.
   intArray = new int[2][5]; // 2행 5열의 2차원 배열 생성
   charArray = new char[2][5]; // 5행 5열의 2차원 배열 생성
   doubleArray = new double[5][2]; // 5행 2열의 2차원 배열 생성

   물론, 2차원 배열도 레퍼런스 변수 선언과 배열 생성을 동시에 할 수 있다. (아무래도 이게 낫겠지?)
   int intArray [][] = new int [2][5];
   char charArray[][] = new char [5][5];
   double doubleArray[][] = new double[5][2];

   [2차원 배열의 초기화]
   : 2차원 배열을 선언할 때 각 원소를 초기화 하면,
   자동으로 원소 개수만한 배열 공간이 할당되고, 원소 값으로 초기화된다.
   int intArray[][] = {{0,1,2},{3,4,5},{6,7,8}}; // 3x3 배열 생성
   char charArray[][] = {{'a','b','c'},{'d','e','f'}}; // 2x3 배열 생성
   double doubleArray[][] = {{0.01, 0.02}, {0.03, 0.04}}; // 2x2 배열 생성
 */

// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고, 4년간의 전체 평점 평균 구하기

public class CH3_EX10 {
    public static void main(String[] args){
        double score[][] = {{3.5, 3.5}, // 1학년 1, 2학기 평점
                {3.3, 3.0}, // 2학년 1, 2학기 평점
                {4.5, 4.5}, // 3학년 1, 2학기 평점
                {4.5, 4.5} }; // 4학년 1, 2학기 평점
        double sum = 0;

        for(int year = 0; year < score.length; year++) // 각 학년별로 반복
            for(int term = 0; term < score[year].length; term++) // 학기별로 반복
                sum += score[year][term]; // 전체 평점 합

        int n = score.length; // 배열의 행 개수, 4(4학년)
        int m = score[0].length; // 배열의 열 개수, 2(2학기)
        System.out.println("4년 전체 평점 평균은" + sum/(n*m));
    }
}
