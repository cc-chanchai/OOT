
package oot;

public class Boo extends Foo implements Playable{
    public Boo(String name){
        super(name);
    }
    public void doFoo(){
        System.out.println("doFoo");
    }
    public void play(String s){
        System.out.println(getName() + " play " + s);
    }
    public int pay(double n){
        System.out.print(getName() + " pays ");
        return (int)n;
    }
    
    
}
