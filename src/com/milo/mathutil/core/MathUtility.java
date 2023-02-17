/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.milo.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {

    public static final double Pi = 3.1415;
    
    //211 vượt kiểu long - 18 con số -
    //ta thí nghiệm hàm n! vs n - 0,1,2,...20 =>
    //n! = 1 x 2 x 3 x 4 5 x ... x 20 ->
    //không có giai thừa 0
    public static long getFactorial(int n) {
        String str = "Invalid n. n must be beteween 0...20!";
        if (n<0 || n>20)            
            throw new IllegalArgumentException(str);
    
        if (n==0 || n==1) 
            return 1;
        
        //Sống sót đến đây, sure n=2..20
        //for hay đệ quy mà tính
        long product = 1; //biến tích lũy, gom việc nhân 
        for(int i = 2; i<=n;i++) {
            product *=i;
        }
        
        return product;
    }
}
