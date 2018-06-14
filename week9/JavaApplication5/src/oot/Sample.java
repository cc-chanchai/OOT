/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot;

public class Sample {
    public static void main(String[] args) {
        //Baz b = new Baz(); // error if remove comment
        //b.print(5);        // print5 is method in Baz ,but no code inside Baz
        
        Caz c = new Caz();
        c.print(5);
        c.print(6);
    }
}
