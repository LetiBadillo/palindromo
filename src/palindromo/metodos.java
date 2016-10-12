/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class metodos {
    
    static String e;
    static String reversa="";
    static Stack pila = new Stack();
    
    //pide al la oración
    public static String getString(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba la oracion");
        e = sc.nextLine();
        return e; //regresa la oración
    }
    
    public static void resolver(String e){ 
      	
        e = e.replaceAll("\\s",""); //elimina espacios
        for(int i=0; i < e.length(); i++){ //recorre el String
        
            pila.push(String.valueOf((e.charAt(i)))); //inserta caracteres en la pila
            
        }
        while(!pila.isEmpty()){ //mientras que la pila no esté vacía, acumula las letras en reverssa
            reversa +=pila.pop();
        }
        reversa = reversa.replaceAll("\\s",""); //elimina espacios
        if( e.equals(reversa)){ //si son iguales
            System.out.println("La oración es palindromo");  
        }else {
            System.out.println("No es palindromo");  
        }
        
    }
}