
package oot;
import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade; 
        
        System.out.print("Enter your grade <A-F> : ");
        grade = sc.next().charAt(0);
        System.out.println("Input     Output");
        System.out.print(grade + "         "); 
        
        switch(grade){
            case 'A' : System.out.print("excellent"); break;
            case 'B' : System.out.print("good"); break;
            case 'C' : System.out.print("fair"); break;
            case 'D' : System.out.print("poor"); break;
            case 'F' : System.out.print("fail"); break;
            default  : System.out.print("unknow");
        }
       
        
    }
}
