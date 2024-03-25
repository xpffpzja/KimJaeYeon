package Question;

public class Application01 {
    public static void main(String[] args) {

        System.out.println("메소드 호출 확인");
        Application01 app01 = new Application01();

        app01.checkMethodA();
        app01.checkMethodB();
        app01.checkMethodC();
        app01.checkMethodD();


    }
    public void checkMethodA(){
        int a = 10;
        int b = 20;
        Calculator cal = new Calculator();
        int sum = cal.sum(a, b);
        System.out.println( "10과 20의 합 : " + sum);

    }

    public void checkMethodB(){
        int a = 10;
        int b = 5;
        Calculator cal = new Calculator();
        int minus = cal.minus(a, b);
        System.out.println( "10과 5의 차 : " + minus);
    }

    public void checkMethodC(){
        int a = 10;
        int b = 5;
        Calculator cal = new Calculator();
        int multi = cal.multi(a, b);
        System.out.println( "10과 5의 곱 : " + multi);
    }

    public void checkMethodD(){
        int a = 10;
        int b = 5;
        Calculator cal = new Calculator();
        int divide = cal.divide(a, b);
        System.out.println("10을 5로 나눈 몫 : " + divide);
    }

}
