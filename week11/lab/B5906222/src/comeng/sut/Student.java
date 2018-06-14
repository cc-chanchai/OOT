/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comeng.sut;

/**
 *
 * @author All User
 */
public class Student implements Sout {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void printNumExcept9(String s) {

        System.out.println(name + " prints number except 9 as follows ");
        String[] t;
        t = s.split(":");
        for (int i = 0; i < t.length; i++) {
            try {
                checkNum(t[i]);
                System.out.println(t[i]);

            } 
            catch(NineException e) {
                System.out.println(e.getMessage());
            }
            catch(NotNumberException e){
                System.out.println(e.getMessage());
            }
        }

    }
     public void checkNum(String str)throws NineException,NotNumberException{
       int n;
       try{
           n = Integer.valueOf(str);
           if(has9(n))
               throw new NineException("NineException : " + n);
           
       }
       catch(NumberFormatException e){
           throw new NotNumberException("NotNumberException : " + str);
           
       }

       }
     public boolean has9(int num){
         while(num > 0 ){
             if(num % 10 == 9)
                 return true;
             num /=10;
         }
         return false;
     }
       
     public void doReverse(String s) {
          System.out.println(name + " reverse numbers as follows ");
        String[] t;
        t = s.split(":");
        for (int i = 0; i < t.length; i++) {
            try {
                checkNum2(t[i]);
                System.out.println(reverse(t[i]));

            } 
            catch(DuplicateException e) {
                System.out.println(e.getMessage());
            }
            catch(NotNumberException e){
                System.out.println(e.getMessage());
            }
        }

    }
     public void checkNum2(String str)throws DuplicateException,NotNumberException{
       int n;
       try{
           n = Integer.valueOf(str);
           if(hasDuplicate(n))
               throw new DuplicateException("DuplicateException : " + n);
           
       }
       catch(NumberFormatException e){
           throw new NotNumberException("NotNumberException : " + str);
           
       }

       }
     public boolean hasDuplicate(int num){
       int[]count = new int[10];
       
       while(num>0){
           count[num%10]++;
           num /=10;
       }
         for (int i = 0; i <= 9; i++) {
             if(count[i]>1)
                 return true;
             
         }
            return false;
    }
     public int reverse(String str){
         int n = Integer.valueOf(str);
         int rev = 0;
         while (n > 0){
             rev = rev*10 + n%10;
             n /=10;
     }
     return rev;
     }
}


