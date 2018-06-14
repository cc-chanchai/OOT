/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exOOT;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number : ");
        num = sc.nextInt();
        
        switch(num%2){
            case 0 : System.out.print("event"); break;
            case 1 : System.out.print("odd"); 
        }
    }
    
}
