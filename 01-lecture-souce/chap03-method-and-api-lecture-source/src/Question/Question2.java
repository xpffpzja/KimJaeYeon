
package Question;

public class Question2 {

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
        *  2번 - y+=10 부터 계산하면 15이고 15에서 x값 2를 뺀 13
           3번 - 2번 문제에서 x++로 인해 4에서 1 증가된 5가된다.
           4번 - Z문자코드 숫자가 90이다. && 를 성립하지않아 거짓이다.
           5번 - C문자코드 숫자가 67이다.
           6번 - 문자5 숫자가 53 - 문자0 숫자가 48
           7번 - A문자코드 숫자 65 + 1
           8번 - A문자코드 숫자 65에서 1증가
           9번 - 8번에서 그대로
           10번- 9번문제에서 +1 증가로 인해 67에 해당한는 문자 C*/

        /*내가 가지고 있는 사과의 갯수는 92개이다.
          이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
          아래에 알맞은 코드를 넣으시오.*/


        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = 10;
        System.out.println("필요한 바구니의 수 : " + numOfBucket);

        //System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10



          //System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10


    }
}
