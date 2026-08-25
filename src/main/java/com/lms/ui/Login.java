/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lms.ui;

/**
 *
 * @author Admin
 */
public class Login {
    public int addition(){
        int a = 0;
        int b= 2;
        int result = a + b;
        return result;
    }
    
    public int substration(int a, int b) {
        return a-b;
    }
    
    public static void main(String []args) {
        Login add = new Login();
        Login sub = new Login();
        
        int result = add.addition();
        int subResult = sub.substration(3, 0);
        System.out.println("Addition Result" + result);
        System.out.println("Substration Result" + subResult);
    }
}
