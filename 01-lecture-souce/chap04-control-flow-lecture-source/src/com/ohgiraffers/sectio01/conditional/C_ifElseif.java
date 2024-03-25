package com.ohgiraffers.sectio01.conditional;

import java.util.Scanner;

public class C_ifElseif {

    public void testsimpleIfElseIfstatment(){
        /* 수업목표 if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
         * [if-else-if문 표현식]
         * if(조건식1){
         *       조건식1이 true일 때 실행할 명령문;
         * }else if(조건식2){
         *       조건식2이 true일 때 실행할 명령문;
         * }else{
         *       위의 두개의 조건이 모두가 거짓일 경우 실행할 명령문
         *
         * */

        System.out.println("산 속에 나무를 하던 나무꾼이 연못에 도끼를 빠트리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼한테 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼이냐? ( 1.금도끼 2.은도끼 3.쇠도끼 ): ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1){
            System.out.println("이런 거짓말쟁이 !! 너에게는 아무런 도끼도 줄수 없구나!! 욕심쟁이야!!");
        }else if(answer == 2){
            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");
        }else{
            System.out.println("오호 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼 모두 가져가거라!!");
        }

        System.out.println("그렇게 산신령은 연못속으로 사라졌다....");


    }

    public void testNestdIfElseIfStatement2() {

        /* 수업목표. 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if-else-if문 실행 흐름 확인 */

        /*
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();

        String grade = "";
        int num = sc.nextInt();
        if (num >= 95){
            grade = "A+";

        }
        if (num >= 90){
            grade = "A";

        }
        if (num >= 85){
            grade = "B+";

        }
        if (num >= 80){
            grade = "B";

        }
        if (num >= 75){
            grade = "C+";

        }
        if (num >= 70){
            grade = "C";

        }

        if (num >= 65){
            grade = "D+";

        }
        if (num >= 60){
            grade = "D";

        }
        if (num < 60){
            grade = "F";

        }

        System.out.println(name + "학생의 점수는" + num + " 점, 등급은" + grade + "  + 이다.");








    }


    }





