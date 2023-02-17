package CH2;

/*
 자동 타입 변환과 강제 타입 변환이 들어 있는 코드이다.
 */

public class CH2_EX3 {
    public static void main(String[] args){
        byte b = 127;
        int i = 100;
        System.out.println(b + i); // b가 int 타입으로 자동 변환됨.
        System.out.println(10 / 4); // 타입 변환 없이 수행되는 정수 나누기.
        System.out.println(10.0 / 4); // 4가 4.0으로 자동 변환됨.
        System.out.println((char)0x12340041); // char로 변환된 결과 0x0041로서 문자 'A'
        System.out.println((byte)(b + i));
        // (int)2.9나 (int) 2.9나 똑같이 적용됨.
        System.out.println((int) 2.9 + 1.8); // 2 + 1.8
        System.out.println((int)(2.9 + 1.8)); //4.7 -> 4
        System.out.println((int)2.9 + (int)1.8); // 2 + 1 -> 3
    }
}
