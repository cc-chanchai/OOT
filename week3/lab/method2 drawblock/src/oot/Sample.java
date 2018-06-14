
package oot;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter an odd number <5-9> : ");
            num = sc.nextInt();
        
        }while(!isOdd(num) || !isRange(num));
        drawBlock(num);
    }
    public static boolean isOdd(int num){
        return num % 2 == 1;
    }
    public static boolean isRange(int num){
        return (num >= 5 && num <= 9);
    }
    public static void drawBlock(int num){
        for(int i=1 ;i <= num ;i++){
            for(int j = 1;j <= num ;j++){
                if(i == 1 || i == num || j == 1||j == num)
                    System.out.print("+");
                else if(i == j || i + j == num + 1)
                    System.out.print("*");
                else
                    System.out.print(" "); 
            }
            System.out.println();
        }
    }
}
