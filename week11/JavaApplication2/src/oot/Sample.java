
package oot;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]n = {10,5,9,3,8};
        System.out.println(n[0]);
        System.out.println(n[n.length-1]);
        //System.out.println(n[9]);     error if delete comment
        System.out.println("bye");
        System.out.println();
        
        String s = "hello";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
        //System.out.println(s.charAt(10));     error if delete comment
        System.out.println("bye");
        System.out.println();
        
        System.out.println(100/10);
        //System.out.println(9/0);      error if delete comment
        System.out.println("bye");
        System.out.println();
        
        
        int a,b;
        String t;
        System.out.print("Enter a number : ");
        a = sc.nextInt();
        System.out.print("Enter a String : ");
        t = sc.next();
        //b = Integer.parseInt(t);          cannot change format
        //System.out.println("n = " + b);
        System.out.println("bye");
        System.out.println();
        
        //String u = null;
        //System.out.println(u.length());
        System.out.println("bye");
    }
}
