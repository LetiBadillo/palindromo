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
public class Stack{
    private static nodeClass top;
    private static int size;
    //Constructor
    public Stack(){
        this.top= null;
        this.size=0;
    }
    //return stack top
    public nodeClass getTop() {
        return top;
    }
    //tamaño pila
    public int getSize() {
        return size;
    }
//Si está vacía
    public boolean isEmpty(){
        return top==null;
    }
    
//inserta en las cosas
    
  public void push(String data){
     nodeClass node = new nodeClass(data);
     
     if(isEmpty()){ //Si la pila está vacía
         top = node;
     }else{
       node.setNext(top);
       top=node;
     }
     ++size;
  }
  
  public String pop(){
      nodeClass aux= top;
      if (!isEmpty()){
          top= top.getNext();
          --size;
          return aux.getData();
      }else{
          System.out.println("Ya está vacía jij");
          return "0";
      }
  }
  
  public void showStack(){
        if(!isEmpty()){
        nodeClass aux = top;
        do {
            System.out.println(aux.getData());
            System.out.println("↓");
            aux=aux.getNext();
        }while (aux!= null);
            System.out.println("");
      }
    }
}
