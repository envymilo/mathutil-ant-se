/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathutil.ant.se1617;

import com.milo.mathutil.core.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrowException();
        
    }

    /*Dân dev phải có trách nhiệm vs những hàm/method mình viết ra,
    tức là đảm bảo rằng hàm chạy đúng như thiết kế
    hàm getFactorial() dc thiết kế rằng:
    nếu đưa n < 0 hoặc n > 20 chũi, ném ra ngoại lệ
    nếu đưa n = 0... 20 -> tính đúng n!
    TA - DÂN DEV SẼ KIỂM THỬ HÀM ĐÚNG NHƯ THIẾT KẾ HAY KO
    KIỂM THỬ - DÙNG THỬ - MÔ PHỎNG CÁC TÌNH HUỐNG - CASE
    HÀM SẼ DC DÙNG TRONG TƯƠNG LAI
    hàm sẽ dc dùng theo 2 cách dựa theo thiết kế
    đưa data tử tế n từ 0...20
    đưa data cà chớn n < 0 hoặc n > 20
     */
    //tên hàm kiểm thử viết theo cú pháp con lạc đà - camel Case notation
    //và phải mang ý nghĩa/mục đích kiểm thử
    public static void testFactorialGivenRightArgumentReturnsWell() {
        //Case #1: Test getF() with n=0
        //Expected value: 2;
        //Kiểm thử coi có đúng 0! = 1 hay ko? - 1 tình huống xài hàm
        //1 test case
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n); //gọi hàm tính giai thừa, xem kq trả về
        //so sánh expected vs. actual
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);

        //Case #2: test getF() with n=1
        //expectedValue = 1 lun
        //Ktra xem 1! có đúng là 1 hem???
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);
        //Case #3: test getF() with n = 2;
        n = 2;
        expectedValue = 2;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "! | expected: " + expectedValue
                + " | actual: " + actualValue);
        //Case #4: n = 3
        n=3;
        System.out.println("Test " + n + "! | expected: 6 | actual: " + MathUtility.getFactorial(n));
        //Case #5: n = 5
        n=5;
        System.out.println("Test " + n + "! | expected: 120 | actual: " + MathUtility.getFactorial(n));
    }
        public static void testFactorialGivenWrongArgumentThrowException(){ 
        //Case #6: n = -1
        //Expected: an Illegal Argument Exception is thrown
        //nếu đưa n = -1 thì hãm sẽ đập vào mặt user/ng xài
        //hàm 1 ngoại lệ
        int n=-1;
        System.out.println("Test -1" + "! | expected: Illegal Argument Exception is thrown | actual: ??? ");
        MathUtility.getFactorial(-1);
    }
}
