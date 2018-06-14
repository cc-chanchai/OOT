
package oot;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        
        while(num > 0){
            sum += num%10;
            num /= 10;
        }
        System.out.print(sum);
        
        
    }
}
