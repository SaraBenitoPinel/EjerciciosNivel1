/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1;
import java.util.Arrays;

/**
 *
 * @author Sarita
 */
public class EjerciciosNivel1 {
    public int [] maximo (int [] lista){   
        int maximo = lista[0];
        int maximo2 = lista[1];
        for (int i=0; i< lista.length; i++){
            if (maximo < lista [i]){
                maximo2=maximo;
                maximo = lista[i];
            }
            else if (maximo2 < lista[i] && lista[i] != maximo){
               maximo2 = lista[i];
            }
        }
        int[]max={maximo,maximo2};
        return max;
    }
    public boolean palindromo(String cadena){ 
     //Suponemos que la palabra que nos pasan no tiene tildes   
        cadena=cadena.toUpperCase();
        cadena = quita (cadena);
        int izquierda =0;
        int derecha = cadena.length()-1;
    while ((izquierda <= derecha) && (cadena.charAt(izquierda) == cadena.charAt(derecha))){
            izquierda ++;
            derecha --;
        }  
    if (izquierda>derecha){
        return true;
    }
    else{
     return false;    
    } 
}
 private String quita (String cadena){
     String auxiliar = "";
     for (int i=0; i<cadena.length(); i++){
         if (cadena.charAt(i) != ' '){
             auxiliar = auxiliar + cadena.charAt(i);
         }
     }
     return auxiliar;
 }
 public boolean (String palabra){
     
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel1 ejercicio= new EjerciciosNivel1();
        //Ejercicio 1
        int[] listaNumeros ={99,31,50,27,2,5};
        System.out.println (Arrays.toString(ejercicio.maximo(listaNumeros)));
        //Ejercicio 2
        System.out.println (ejercicio.palindromo("ACASO HUBO BUHOS ACA"));
        System.out.println (ejercicio.palindromo("ROMA ROMA"));
    } 
}
