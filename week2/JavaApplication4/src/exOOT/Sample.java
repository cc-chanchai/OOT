
package exOOT;

import java.util.Scanner;


public class Sample {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.print("Enter a character <a-z> : ");
            ch = sc.next().charAt(0);
        }while(ch < 'a' || ch > 'z');
        switch(ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : System.out.print("vowel"); break;
            default  : System.out.print("consonant");
        }
    }
    
}
