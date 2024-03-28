package test1;

public class Application {
    public static void main(String[] args) {



        int A = 20;
        long B = 30;

        int p = A + (int)B;
        System.out.println(p = A + (int)B);

        String result = (p > 0)? "양수" : (p < 0)? "음수" :  "0" ;
        System.out.println("p는 " + result + "입니다. " );






    }
}
