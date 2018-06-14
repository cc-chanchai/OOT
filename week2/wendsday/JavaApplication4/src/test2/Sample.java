
package test2;

import java.util.Scanner;


public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
        System.out.print("Enter a number <10-100>: ");
        num = sc.nextInt();
        }while(num<10||num>100);
        
        for(int i=1 ;i<=num ;i++){
           
            if(num % i == 0 )
                System.out.println(i +"*"+(num/i));
            
        }
    }    
}
