/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oot;


public class Pop extends Cop{
    private int num;
    
    public Pop(int num){
        this.num = num;
    }
    public int getNumber(){
        return num;
    }
    public void print(int n){
        for(int i=1; i<=n*2; i++){
            if(i<=n)
                System.out.print("/");
            else
                System.out.print("\\"); 
        }
        System.out.println();
    }
   
}
