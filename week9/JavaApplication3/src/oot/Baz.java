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
public class Baz {
    private static String name;
    
    public static void setName(String name){
        Baz.name = name;
    }
    public static String getName(){
        return name;
    }
    public final void doBaz(){
        System.out.println("doBaz");
    }
    public static void printLine(String l){
        System.out.println(l);
    }
}
