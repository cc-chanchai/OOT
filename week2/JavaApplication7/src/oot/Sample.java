
package oot;

import java.util.Scanner;


public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0,digit;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        
       
           while(num > 0){
             digit = num%10;
             if(digit%2==0){
                 sum += digit;
                 System.out.print(digit + " "); 
             }
             num /= 10;
            
        }
        System.out.println();
        System.out.print("sum of event number = " + sum);
    }
}
