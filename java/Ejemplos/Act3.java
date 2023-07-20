package Ejemplos;

import java.util.Scanner;
public class Act3{
    public static void main(String args[]){
        int num1, num2,num3 ;

        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();
        
        System.out.println("Ingrese el tercer numero");
        num3=leer.nextInt();
        
         if(num1>num2) {
            if(num1>num3) {
                if(num2>num3) {
                    System.out.println("Orden descendente: " + num1 + " " + num2 + " " + num3);                 
                }else {
                    System.out.println("Orden descendente: " + num2 + " " + num3 + " " + num1);
                }
            }else {
                System.out.println("Orden descendente: " + num3 + " " + num1 + " " + num3);
            }
        }else {
            if(num2>num3) {
                if(num1>num3) {

                    System.out.println("Orden descendente: " + num2 + " " + num1 + " " + num3);
                }else {
                    System.out.println("Orden descendente: " + num2 + " " + num3 + " " + num1);
                }              
            }else {
                System.out.println("Orden descendente: " + num3 + " " + num2 + " " + num1);
            }
        }
    }
}
