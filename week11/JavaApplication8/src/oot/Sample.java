/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot;

/**
 *
 * @author All User
 */
public class Sample {
    public static void main(String[] args) {
        try{
            method1();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       
    }
    
    public static void method1() throws Exception{
        method2();
    }
    public static void method2() throws Exception{
        throw new Exception("find exception");
    }
}
