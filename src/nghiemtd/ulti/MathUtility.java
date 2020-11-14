/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghiemtd.ulti;

/**
 *
 * @author trndu
 */
public class MathUtility {
    //Fake class MathUtility giống y chang
    //Math.sqrt(), .abs(), .pow(), .sin() ...
    public static final double PI = 3.1415;
    
    //Tính n! = 1.2.3.4...n
    public static long getFactorial(int n){
        if(n < 0 || n >20){
            throw new IllegalArgumentException("n must be between 0 -> 20");
        }
        
        if (n == 0 || n == 1) {
            return 1;//Đặc biệt, return luôn
            //Đứa nào viết else ở đây trừ điểm
            //Mặc nhiên CPU đến được đây là hiểu rằng n = 2 -> 20
        }
        
        long result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
