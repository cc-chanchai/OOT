/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot;

public class Sample {
    public static void main(String[] args) {
        Foo f = new Foo();
        f.setName("foo");
        System.out.println(f.getName());
        Foo.setBrand("brand foo");
        System.out.println(Foo.getBrand());
        System.out.println(f.getBrand());
        Foo g = new Foo();
        System.out.println(g.getBrand());
    }
}
