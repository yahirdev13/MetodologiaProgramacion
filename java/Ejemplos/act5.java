package Ejemplos;

import java.util.Scanner;
public class act5{
    public static void main(String args[]){
        int horasT, horasExtra,horasExtra2;
        double pago,sueldoOrdinario, sueldoExtra, sueldoExtra2,sueldoFinal;
        int HORASMAX=40;
        int HORASEXTRAMAX=8;

        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese las horas de trabajo");
        horasT=leer.nextInt();
        System.out.println("Ingrese el salario por hora");
        pago=leer.nextDouble();
        
        if (horasT<=HORASMAX){
            sueldoOrdinario=horasT*pago;
            sueldoFinal=sueldoOrdinario;
            System.out.println("El sueldo del trabajador es de: $"+sueldoFinal);
        }else{
            if (horasT>HORASMAX){
                horasExtra=horasT-HORASMAX;
                if (horasExtra<=HORASEXTRAMAX){
                    sueldoOrdinario=HORASMAX*pago;
                    sueldoExtra=horasExtra*(pago*2);
                    sueldoFinal=sueldoOrdinario+sueldoExtra;
                    System.out.println("El sueldo del trabajador es de: $"+sueldoFinal);
                }else{
                    horasExtra2=horasExtra-HORASEXTRAMAX;
                    sueldoOrdinario=HORASMAX*pago;
                    sueldoExtra=HORASEXTRAMAX*(pago*2);
                    sueldoExtra2=horasExtra2*(pago*3);
                    sueldoFinal=sueldoOrdinario+sueldoExtra+sueldoExtra2;
                    System.out.println("El sueldo del trabajador es de: $"+sueldoFinal);
                }
            }
        }
    }
}

        