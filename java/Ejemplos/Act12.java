package Ejemplos;

import java.util.Scanner;
public class Act12 {
    public static void main(String args[]){
         
        //variables
        int peli,boletos,costo,credencial;
        double costoF;
        String cadena;
        //CONSTANTES
        final String PASSWORD="cine123";
        int PELI1=30, PELI2=40,PELI3=50;
        double DESCUENTO=.20;
       
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese su contraseña");
        cadena=leer.next();
        
        if (cadena.equals(PASSWORD)){
            System.out.println("Elige la pelicula que deseas ver");
            System.out.println("1. Titanic              $30");
            System.out.println("2. Cars                 $40");
            System.out.println("3. ¿Que paso ayer?      $50");
            peli=leer.nextInt();
            System.out.println("¿Cuantos boletos desea?");
            boletos=leer.nextInt();
            System.out.println("¿Cuenta con credencial de estudiante?");
            System.out.println("1. Si");
            System.out.println("2. No");
            credencial=leer.nextInt();

            switch (peli){
                case 1:
                    costo=PELI1*boletos;
                    switch (credencial){
                        case 1:
                            costoF=costo-(costo*DESCUENTO);
                            System.out.println("El pago sera de $"+costoF);
                            break;
                        case 2:
                            System.out.println("El pago sera de $"+costo);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                case 2:
                    costo=PELI2*boletos;
                    switch (credencial){
                        case 1:
                            costoF=costo-(costo*DESCUENTO);
                            System.out.println("El pago sera de $"+costoF);
                            break;
                        case 2:
                            System.out.println("El pago sera de $"+costo);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                case 3:
                    costo=PELI3*boletos;
                    switch (credencial){
                        case 1:
                            costoF=costo-(costo*DESCUENTO);
                            System.out.println("El pago sera de $"+costoF);
                            break;
                        case 2:
                            System.out.println("El pago sera de $"+costo);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                default:
                    System.out.println("Pelicula no valida");
            }
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }    
}
