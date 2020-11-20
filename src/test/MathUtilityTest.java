package test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static nghiemtd.ulti.MathUtility.*;
/**
 *
 * @author trndu
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        //Class này là class xài bộ thư viện JUnit dùng để test code theo dạng xanh đỏ
        //Thay vì nhìn bằng mắt như bên main() sout()
        //2 file .jar đã được add vào project này và ta thoải mái xài các hàm cảu nó
        //Trong các hàm của thư viện này có n hàm đạc biệt đều có tên xuất phát là assertX(expected và actual đưa vào)
        //Nếu nó thấy expected hông có bằng actual, nó thảy màu đỏ
        //Nếu bằng nó thảy màu xanh
        //Quy tắc xanh đỏ: Nếu tất cả Xanh -> Kết luận Xanh
        // Nếu có ít nhất 1 đỏ -> Éo quan tâm phần còn lại -> Kết luận đỏ
        //Đảm bảo yếu tố hàm chạy đúng mọi CASE, trường hợp
         //Biến hàm sau đây ngay thành public static void main(_
        //Muốn chạy thì nhấn Shift-f6

    }

    @Test
    public void getFactoria_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(5));
    }

    @Test(expected = SQLException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        //Ngoại lệ không phải là value để mà assert()
        //Chỉ có thể chụp nó lại
        getFactorial(-5);
    }
    
}
