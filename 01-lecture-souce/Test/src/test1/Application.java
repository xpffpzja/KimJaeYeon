package test1;

public class Application {
    public static void main(String[] args) {

        byte bnum = 0;
        short snum = 10;
        int inum = 20;
        long lnum = 30;

        float fnum = 50L;
        double dnum = 50.0 ;

        char ch2 ='a';
        boolean istrue = true;

        inum = 10;
        lnum = 20;

        int isum = (int) (inum + lnum);
        System.out.println(isum);


        String result1 = (isum > 0) ? "양수" : (isum < 0) ? "음수" : "0";
        System.out.println("isum은" + result1 + " 입니다. ");



    }
}
