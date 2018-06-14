
package oot;


public class Sample {
    public static void main(String[] args) {
        Teacher t = new Teacher("John");
        Student s = new Student("Jack",20);
        s.setAdvisor(t);
        System.out.println(s.getName() + " is " + s.getAge() + " year old");
        System.out.println(s.getAdvisor().getName() + " is " + s.getName() + "\'s advisor");
        s.compute(29,1,5,100);
        s.print("hello", '#', 3);
        s.print("hi", '*',4);
    }
}
