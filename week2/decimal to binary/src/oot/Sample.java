package oot;

import java.util.Scanner;

public class Sample {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = 0, decimal, d, weight = 1,temp;
        
        System.out.print("Enter a decimal number : ");
        decimal = sc.nextInt();
        temp = decimal;
        
        while(decimal > 0){
            d = decimal % 2;
            binary = binary + d * weight;
            weight *= 10;
            decimal /= 2;
        }
        System.out.print("decimal " + temp + " = binary " + binary); 
    }
    
}
