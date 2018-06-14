
package oot;

public class Sample {
    public static void main(String[] args) {
        Foo f = new Foo("foo");
        Foo b = new Boo("boo");
        Baz c = new Baz("baz");
        
        ((Boo)b).setLink(c);
        System.out.println(((Boo)b).getLink().getName() + " is linked to " + b.getName());
        //f.setLink(c); //error if remove comment
        f.add(new int[] {15,250,101,2,20});
        b.add(new int[] {15,250,101,2,20});
    }
}
