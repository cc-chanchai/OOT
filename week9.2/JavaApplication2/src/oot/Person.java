/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot;

public class Person {
    private String name;
    private int age;
    
    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void findMax(int a){
        System.out.print(name + " find max = ");
        int[]count = new int[10];
        while(a>0){
            count[a%10]++;
            a/=10;
        }
        int sum = 0;
        for(int i=9; i>=0;i--){
            for(int j=1; j<=count[i]; j++)
                sum  = sum*10+i;
        }
        System.out.println(sum);
    }
}
