package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /*수업목표. for 단독 사용에 대한 흐름 이해하고 적용할 수 있다. */
        /*
         * [for문 표현식]
         *  for(초기식; 조건식; 증감식){
         *     조건을 만족하는 경우 수행할 수문(반복할 구문)
         * }
         * */

        /* 1부터 10까지 1씩 증가시키며 10번 i 값을 증가시키는 기본 반복문 */
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }



    }


    public void testForExample1(){
        /* 우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다. */
        /* 10명의 학생의 이름을 입력 받아 이름을 출력해보자 */


        Scanner sc = new Scanner(System.in);

        System.out.println("1 번째 학생의 이름을 입력해주세요 : ");
        String student = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student + "입니다. ");


        /*
        * 반복해야 하는 내용은?
        * 1. 학생의 이름을 입력받아 변수의 저장
        * 2. 안내문구 출력
        * 3. 저장된 이름 출력
        * */

        /* 반복 횟수 1~10까지 1씩 증가하여 총 10번을 반복하였다.*/

        for(int i = 1; i<=10; i++){
            System.out.println(i + "번째 학생의 이름을 입력해주세요");
            String student1 = sc. nextLine();
            System.out.println(i + " 번째 학생의 이름은" + student + "입니다");
        }



    }
    public void testForExample2() {
        /* 우리가 뭘 반복하는지 확인하여 반복문으로 개선할수 있다. (2) */

        /* 문장 속에 규칙 착기
         * 1~10까지의 합계를 구하여라
         * */

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum : " + sum);
    }

}




