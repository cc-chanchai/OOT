
package oot;

public class Sample {
    public static void main(String[] args) {
        //Foo f = new Foo("foo"); //error if remove comment.
        Boo b = new Boo("boo");
        b.doFoo();
        b.play("ball");
        System.out.println(b.pay(15.20));
    }
}
