package odd_number_print_star;

import java.util.Scanner;


public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
                
        do{
        System.out.print("Enter an odd number : ");
        num = sc.nextInt();
        }while(num<3 || num>9 || num%2==0);
        
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==j || i+j==num+1)
                    System.out.print('*');
                else
                    System.out.print("+"); 
            }
            System.out.println();
        }
    }
}
