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
public class Foo {
    private String name;
    private static String brand;
    public void doFoo(){
        System.out.println("dooFoo in Foo");
    }
    public static void doThing(){
        System.out.println("do thing");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void setBrand(String brand){
        Foo.brand = brand;
    }
    public static String getBrand(){
        return brand;
    }
}
