/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.milo.mathutil.test.core;

import com.milo.mathutil.core.MathUtility;
import static com.milo.mathutil.core.MathUtility.getFactorial;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Milo
 */
public class MathUtilityTest {
    /*Hàm getF() còn dc thiết kế rằng: nếu đưa n cà chớn
    tham số ko đúng chuẩn, n < 0 n > 20 thì
    HÀM DC THIẾT KÊ LÀ NÉM RA NGOẠI LỆ
    TỨC LÀ: NẾU ĐƯA N < 0, VD: N = 5 THÌ SẼ NHẬN VỀ
    - EXPECTED LÀ EXCEPTION
    TA SẼ DÙNG JUNIT ĐỂ TEST XEM HÀM CÓ NÉM RA NGOẠI LỆ NHƯ THIẾT KẾ HAY KO
    */

    @Test //biến hàm ở dưới này thành public static void main()
    public void testRedGreenSignal() {
        Assert.assertEquals(6789, 6789);
    }

    @Test
    public void testFactorialGivenRightArgumentReturn() {
        //Test case #1: test getF() with n = 0;
        //expected: 1;
        //test hàm getF() vs n=0, hy vọng trả 1, tức là 0! = 1
        int n = 0;
        long expected = 1;
        long actual =  MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Test case #2: test getF() with n = 1;
        //expected: 1;
        //test hàm getF() vs n=1, hy vọng trả 1, tức là 0! = 1
        n = 1;
        expected = 1;
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    //VIẾT KIỂU ASSERTEQUALS(EXPECTED, ACTUAL)
    //LẶP ĐI LẶP LẠI -> CODE BỐC MÙI BAD SMELL
    //NHƯỢC ĐIỂM ĐOẠN CODE TRÊN:
    //Trộn lẫn giữa lệnh so sánh và các data dùng để test
    //Vì trộn lẫn nên ta khó nhìn hết đầy đủ các test case
    //nguyên l1 nghịch lí thuốc trừ sâu có khả năng xuất hiện
    //TA SẼ FIX CODE BỐC MÙI LẶP LẠI BẰNG 1 KĨ THUẬT MỚI
    //DDT - DATA DRIVEN TESTING
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        //nguyên tắc kiểm thử: so sánh giữa expected vs. actual
        //Test case #4: test getF() with n<0
        //Expected: an Exception is thrown. In this case, Illegal Argument Exception is throw
        //JUnit 4 ko có hàm assert() Exception
        //JUnit 5 thì có!!!
        MathUtility.getFactorial(-5);
        //Nếu chỉ viết lệnh này đứng 1 mình thì
        // có nghĩa là ta chưa bắt, ta chưa đo lường, ta chưa so sánh
        //liệu rằng có ngoại lệ như kì vọng hay ko
        //xanh đỏ rong tình huống này ko phày ánh ý nghĩ đúng
        //vậy ta phải bắt 
    }
}