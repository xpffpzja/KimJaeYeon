package test2;

import test1.TestMethod;
import static test1.TestMethod.TestRandom;

public class Application {
    public static void main(String[] args) {

        TestMethod A = new TestMethod();
        A.Calculator(2, 5);

        System.out.println("=================");

        double circle = A.CircleArea();
        System.out.println("원의 넓이는 " + circle + "입니다.");

        System.out.println("=================");

        String str = TestRandom();
        System.out.println(str);

    }
}
