/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author ASUS
 */
public class nodeClass <T>{
    //Atributes
    private  String data;
    private nodeClass next;
    //Constructor
    public nodeClass (String data){
        this.data= data;
        this.next = null;
    }
    
    public void setData(String data){
        this.data = data;
    }
    public void setNext(nodeClass next){
        this.next=next;
    }
    public String getData(){
        return this.data;
    }
    
    public nodeClass getNext(){
        return this.next;
    }
}
