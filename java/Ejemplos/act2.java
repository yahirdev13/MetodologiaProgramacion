package Ejemplos;

import java.util.Scanner;
public class act2{
    public static void main(String args[]){
        double num1;
        double num2;
        double num3;
        
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero");
        num1=leer.nextDouble();
        
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextDouble();
        
        System.out.println("Ingrese el tercer numero");
        num3=leer.nextDouble();
        
        if (num1>num2){
            System.out.println("El numero mayor es "+num1);
            }else if (num1>num3){
            System.out.println("El numero mayor es "+num1);
        }else if(num2>num3){
              System.out.println("El numero mayor es "+num2);
              }else{
              System.out.println("El numero mayor es "+num3);
            }   
        }
    }