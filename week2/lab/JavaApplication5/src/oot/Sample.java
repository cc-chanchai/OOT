package oot;
import java.util.Scanner;
public class Sample {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char ch;
        
        do{
        System.out.print("Enter a character <a-z>: ");
        ch = sc.next().charAt(0); 
        }while(ch<'a'||ch>'z');
        do{
        System.out.print("Enter a number <1-5>: ");
        num = sc.nextInt();
        }while(num<1||num>5);
        
        for(int i = 1; i <=num; i++){
           System.out.print(ch + " ");
           ch++;
           if(ch>'z')
               ch = 'a';
       }
    }    
}
