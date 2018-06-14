
package oot;


public class Student {
    private String name;
    private Teacher advisor;
    private int age;
    
   
    public Student(String name,int a){
        this.name = name;
        this.age = a;
    }
    public void setAdvisor(Teacher t){
        this.advisor = t;
    }
    public Teacher getAdvisor(){
        return advisor;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public void compute(int a, int b, int c ,int d){
        int max, min;
        max = a>b ? a:b;
        max = c>max? c:max;
        max = d>max ? d:max;
        min = a<b ? a:b;
        min = c<min ? c:min;
        min = d<min? d:min;
        
        System.out.println(name + " compute sum of max and min = " + (max+min));
    }
    public void print(String s, char ch, int n){
        for(int i=1; i<=n; i++)
            System.out.print(ch);
        System.out.print(s); 
        for(int i=1; i<=n; i++)
            System.out.print(ch);
        System.out.println();
    }
}
