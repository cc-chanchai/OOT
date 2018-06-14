
package oot;


public class Sample {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.equals("Hello"));
        System.out.println(s.equalsIgnoreCase("Hello"));
        System.out.println(s.substring(0,4));
        
        System.out.println(s.length());
        String t = "     hello     ";
        System.out.println(t.length());
        t = t.trim();
        System.out.println(t.length());
        
        String u = "3:10:100";
        String[]v;
        v = u.split(":");
        int sum = 0;
        for(int i=0; i<v.length; i++){
            System.out.println(v[i]);
        }
        for(int i=0; i<v.length; i++){
            sum += Integer.valueOf(v[i]);
            System.out.println("sum = " + sum);
        }
    }
}
