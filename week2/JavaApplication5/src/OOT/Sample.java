
package OOT;
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,rev=0,temp;
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        temp = num;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.print(rev);
        if(rev == temp)
            System.out.print("   palindrome");
        else
            System.out.print("    not palindrome");
        
    }
}
