
package oot;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary, decimal = 0, d, weight = 1,temp;
        
        System.out.print("Enter a binary number : ");
        binary = sc.nextInt();
        temp = binary;
        
        while(binary > 0){
            d = binary % 10;
            decimal = decimal + d * weight;
            weight *= 2;
            binary /= 10;
        }
        System.out.print("binary " + temp + " = decimal " + decimal); 
    }
}
