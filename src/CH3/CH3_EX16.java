package CH3;

/* 범위를 벗어난 배열의 접근(ArrayIndexOutOfBoundsException) */

public class CH3_EX16 {
    public static void main(String[] args){
        int[] intArray = new int[5];
        try{
            for(int i=0; i<5 ; i++){
                intArray[i+1] = i+1 + intArray[i]; // i=4인 경우 예외 발생
                System.out.println("intArray[" + i + "]"+"="+intArray[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}
// 이건 그냥 종료해버린다는 점에서 예제 15와의 차이점이 있음.
// 예제 15는 제대로 입력될 때까지 시키려고 while(true)문을 사용함.