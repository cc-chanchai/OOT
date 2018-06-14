
package oot;

public class Sample {
    public static void main(String[] args) {
        Person p = new Person("John",20);
        Person s = new Student("Jack");
        s.setAge(19);
        printInfo(p);
        printInfo(s);
        p.findMax(1992223);
        ((Student)s).findMax(1992223);
        display((Student)s,130059);
    }
    public static void display(Movable x,int num){
        x.moveZeroToEnd(num);
    }
    public static void printInfo(Person x){
        System.out.println(x.getName() + " is " + x.getAge() + " year old. ");
    }
}
