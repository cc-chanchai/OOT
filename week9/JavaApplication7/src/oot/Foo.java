
package oot;

public abstract class Foo{
    private String name;
    public Foo(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void doFoo();
}
