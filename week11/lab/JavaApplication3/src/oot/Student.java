/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot;

public class Student implements Sout{
    private String name;
    
    public Student(String name){
        this.name = name;
    }
    public void printNumExcept9(String str){
        String[]t;
        t = str.split(":");
        System.out.println(name + " print numbers except 9 as follows");
        for(int i = 0; i < t.length; i++){
            try{
                check(t[i]);
                System.out.println(t[i]);
            }
            catch(Exception e){
               System.out.println(e.getMessage());
            }
        }
    }
    public void doReverse(String str){       
        String[]t;
        t = str.split(":");
        System.out.println(name + " reverse numbers as follows");
        for(int i = 0; i < t.length; i++){
            try{
                checkNum(t[i]);
                System.out.println(t[i]);
            }
            catch(Exception e){
               System.out.println(e.getMessage());
            }
        }
    }
    
    public static void checkNum(String str) throws Exception{
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '9')
                throw new Exception("NineException : " + str);
            else if(ch < '0' || ch >'9' )
                throw new Exception("NotNumberException : " + str);
        }
    }
}
