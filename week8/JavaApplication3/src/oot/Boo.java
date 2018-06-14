
package oot;

public class Boo extends Foo {
    private Baz link;    
    public Boo(String name){
       super(name);
    }
    public void setLink(Baz link){
       this.link = link;
    }
    public Baz getLink(){
        return link;
    }
    public void add(int[]n){
        int sum = 0;
        System.out.print(getName() + " add = ");
        for(int i=0; i<n.length; i++)
            sum += n[i];
        System.out.println(sum);
    }
}
