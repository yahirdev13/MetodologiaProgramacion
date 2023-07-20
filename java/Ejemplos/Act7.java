package Ejemplos;

import java.util.Scanner;
public class Act7 {
    public static void main(String args[]){
        //variables
        char clase;
        int tipoEmpleado,horasT;
        String cadena;
        int horasExtra;
        double pagoF;
       //CONSTANTES
       final String CLASE_A= "A";
       final String CLASE_O="O";
       final int PAGO_1=20,PAGO_2=18,PAGO_3=17,PAGO_4=11,PAGO_5=9,PAGO_6=6,PAGO_7=13,PAGO_8=10,PAGO_9=7,PAGO_10=4;
       final int HORAS_MAX=40;
       
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese la clase del empleado en mayusculas");
        cadena=leer.next();
        clase=cadena.charAt(0); 
        
        System.out.println("Ingrese el tipo de empleado");
        tipoEmpleado=leer.nextInt();
        
        System.out.println("Ingrese el total de horas trabajadas");
        horasT=leer.nextInt();
        
        if(cadena.equals(CLASE_A)){
            if (tipoEmpleado==1){
                if (horasT<=HORAS_MAX){
                    pagoF=horasT*PAGO_1;
                    System.out.println("Su pago es de $"+pagoF);
                }else{
                    horasExtra=horasT-HORAS_MAX;
                    pagoF=(horasExtra*PAGO_4)+(HORAS_MAX*PAGO_1);
                    System.out.println("Su pago es de $"+pagoF);
                }
            }else if(tipoEmpleado==2){
                if (horasT<=HORAS_MAX){
                    pagoF=horasT*PAGO_2;
                    System.out.println("Su pago es de $"+pagoF);
                }else{
                    horasExtra=horasT-HORAS_MAX;
                    pagoF=(horasExtra*PAGO_5)+(HORAS_MAX*PAGO_2);
                    System.out.println("Su pago es de $"+pagoF);
                }
            }else if (tipoEmpleado==3){ 
                if (horasT<=HORAS_MAX){
                    pagoF=horasT*PAGO_3;
                    System.out.println("Su pago es de $"+pagoF);
                }else{
                    horasExtra=horasT-HORAS_MAX;
                    pagoF=(horasExtra*PAGO_6)+(HORAS_MAX*PAGO_3);
                    System.out.println("Su pago es de $"+pagoF);
                }
            }else{
                System.out.println("Tipo de empleado no valido");
            }
        }else if(cadena.equals(CLASE_O)){
            if (tipoEmpleado==1){
                if (horasT<=HORAS_MAX){
                    pagoF=horasT*PAGO_7;
                    System.out.println("Su pago es de $"+pagoF);
                }else{
                    horasExtra=horasT-HORAS_MAX;
                    pagoF=(horasExtra*PAGO_9)+(HORAS_MAX*PAGO_7);
                    System.out.println("Su pago es de $"+pagoF);
                }
            }else if(tipoEmpleado==2){
                if (horasT<=HORAS_MAX){
                    pagoF=horasT*PAGO_8;
                    System.out.println("Su pago es de $"+pagoF);
                }else{
                    horasExtra=horasT-HORAS_MAX;
                    pagoF=(horasExtra*PAGO_10)+(HORAS_MAX*PAGO_8);
                    System.out.println("Su pago es de $"+pagoF);
                }
            }else{
                System.out.println("Tipo de empleado no valido");
            }
        }else{
            System.out.println("Clase no valida");
        }  
    }
}
