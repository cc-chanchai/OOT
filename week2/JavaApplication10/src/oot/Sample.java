
package oot;

import java.util.Scanner;


public class Sample { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : "); 
        num = sc.nextInt();
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
