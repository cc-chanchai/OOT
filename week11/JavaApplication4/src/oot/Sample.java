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
        int[]n = {3,9,5,2};
        
        try{
        System.out.println(n[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("find out of bond");
        }
        
        /*try{
        System.out.println(n[10]);
        }
        catch(ArithmeticException e){
        System.out.println("find out of bond");
        }
        */ //error if delete comment 
        
        System.out.println("bye");
    }
}
