/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.milo.mathutil.test.core;

import com.milo.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Milo
 */

@RunWith(value = Parameterized.class)
//báo vs JUnit và JVM rằng, class này sẽ tách data ra ko
//câu lệnh assertEquals()
//Về logic, khi run class này, JUnit sẽ tự sinh ra thêm
//code để fill data vào trong hàm assertE() cho mình
//Mình bị phải viết code theo cách JUnit yêu câu
//thì mới sủa dc bad smell
//Dùng code theo cách thức bị ép tuân thủ 1 logic nào đó
//TA ĐANG XÀI FRAMEWORK
public class MathUtilAdvancedTest {
    
    //chuẩn bị data - mảng 2 chiều
    @Parameterized.Parameters
    public static Object[][] initData(){
        //mảng 1 chiều
        int a[] = {5,10,15,20};
        
        return new Object[][] {
                               {0,1},
                               {1,1},
                               {2,2},
                               {3,6},
                               {4,24},
                               {5,120},
                               {6,720},
                               {7,5040},
                               {8,40320},
                               {9,362880},
                               {10,3628800}
                              };
        }
    
    //map 1 dòng gôm 2 cột vào 2 biến n và expected
    //JUnit sẽ tự loop qua từng dòng của mảng để gán
    //data các cột vào 2 biến tương ứng
    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;

//test hoy, so sánh hoy
@Test
    public void testFactorialGivenRightArgumentRunsWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
