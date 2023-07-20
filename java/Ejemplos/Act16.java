package Ejemplos;

import java.util.Scanner;

public class Act16 {
    public static void main(String args[]){ 
        //variables
        int num1,num2,rango1, rango2,contador,acumulador;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el primer valor del rango");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo valor del rango");
        num2=leer.nextInt();
        
        if(num1>num2){
            rango1=num2;
            rango2=num1;
        }else{
            rango1=num1;
            rango2=num2;
        }
        contador=rango1;
        acumulador=rango1;
        do{
           contador=contador+1;
           acumulador=contador+acumulador;
        }while(contador<rango2);
        System.out.println("El valor de la suma es de: "+acumulador);
    }
}
