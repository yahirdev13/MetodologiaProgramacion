package Ejemplos;

import java.util.Scanner;
public class Act21 {
    public static void main(String[] args) {
        
        //variables
        int inicializacion;
        double num;
        int positivo=0,negativo=0,neutro=0;

        Scanner leer = new Scanner (System.in);
          
        for(inicializacion=1;inicializacion<=20;inicializacion+=1){
          System.out.println("Ingrese el numero "+inicializacion);
          
          num=leer.nextDouble();             
          if(num==0){
            neutro = neutro + 1;
          }else if(num>0){
            positivo = positivo + 1;
          }else{
            negativo = negativo + 1;
          }
        }
        System.out.println("Numeros positivos: "+positivo);
        System.out.println("Numeros neutros: "+neutro);
        System.out.println("Numeros negativos: "+negativo);
    }
}
    
