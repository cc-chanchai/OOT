/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot;

public class Sample {
    public static void main(String[] args) {
      Baz b = new Baz();
      Caz c = new Caz();
      
      b.doBaz();
      c.doBaz(); // c can only use inherited method, cannot override
      Baz.printLine("=====");
      Baz.setName("Baz");
      System.out.println(b.getName());
    }
}
