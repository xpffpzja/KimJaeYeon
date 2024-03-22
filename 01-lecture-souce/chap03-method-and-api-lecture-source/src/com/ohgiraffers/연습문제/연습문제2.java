package com.ohgiraffers.연습문제;

public class 연습문제2 {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2); //1번
        System.out.println(y += 10 - x++); //2번
        System.out.println(x+=2); //3번
        System.out.println( !('A' <= c && c <='Z') ); //4번
        System.out.println('C'-c); //5번
        System.out.println('5'-'0'); //6번
        System.out.println(c+1); //7번
        System.out.println(++c); //8번
        System.out.println(c++); //9번
        System.out.println(c); //10번


        /* 1번 - x는 0보다 작다 그리고 2보다 크다 명제가 거짓이다. y는 5보다 크다는 참이다.
                 ||보다 &&이 우선순위이기때문에 먼저 &&를 처리하고 ||를 처리하였기떄문에 y에 대한 명제가 참이기 때문에 true
        *  2번 - x++ 계산은 나머지 수식을 먼저 계산 하고 증가시키기때문에 y+=10 부터 계산하면 15이고 15에서 2를뺸 13에서 1증가
           3번 - 2번 문제에서 x++로 인해 1증가된 3에서 +=2로 5가된다.
           4번 - Z문자코드 숫자가 90이다. && 를 성립하지않아 거짓이다.
           5번 - C문자코드 숫자가 67이다.
           6번 - 문자5 숫자가 53 - 문자0 숫자가 48
           7번 - A문자코드 숫자 65 + 1
           8번 - 문자코드 숫자 1증가
           9번 -
           10번- */



    }

}
