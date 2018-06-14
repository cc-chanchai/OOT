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
        int[]n = {3,9,5,0,2};
        
        for(int i = 0; i < n.length; i++){
            //System.out.println(100/n[i]);
            try{
                System.out.println(100/n[i]);
            }
            catch(ArithmeticException r){
                System.out.println("find divide by 0");
            }
        }
        System.out.println("bye");
    }
}
