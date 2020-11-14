/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import nghiemtd.ulti.MathUtility;

/**
 *
 * @author trndu
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120;//Tớ hi vọng thấy 120 nếu gọi 5
        long actual = MathUtility.getFactorial(5);
        //In ra để kiểm tra sự khớp nhau giữa cái ta muốn và cái ta làm
        System.out.println("5! expected: " + expected);
        System.out.println("5! acutal: " + actual);

        //Tiếp tục cho các tình huống 6!, 7!, 21!, -5!, 0! ...
        //Các tình huống test ta gọi là test cases
        //Về lý thuyết ta phải test hết các tình huống ...
        //Về thực hành: kỳ 5 sẽ rõ SWT301
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));

        //Tao kì vọng m ném về ngoại lệ mà phải là ngoại lệ
        //IllegalArgumentException, nếu tao cố tình, người xài hàm
        //này của tao đưa tham số âm, tham số > 20
        System.out.println("expected IllegalArgumentException: " + MathUtility.getFactorial(-5));
    }
    
}
