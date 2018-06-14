
package labtest;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,num2,digit,count=0,sum=0;
        
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        num2 = num;
        
        while(num > 0){
           /* digit = num%10;         
            num = num/10;           
            sum = sum+digit;        
            count++;
           */ //or
            sum+=num%10;
            count++;
            num/=10;
            
        }
        System.out.print(num2 + " has " + count + " and sum all digits = " + sum);
    }
}
