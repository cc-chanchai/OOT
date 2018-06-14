
package oot;


public class Sample {
    public static void main(String[] args) {
        Pop p = new Pop(20);
        Cop c = new Cop();
        
        c.setNumber(15);
        System.out.println(p.sum(p.getNumber(),100));
        System.out.println(c.sum(c.getNumber(),50));
        display(p,5);
        display(c,5);
    }
    public static void display(Cop c, int n){
        c.print(n);
    }
}
