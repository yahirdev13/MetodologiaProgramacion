package Ejemplos;

import java.util.Scanner;
public class ExamenCafeteria {
     public static void main(String args[]){
         
        //variables
        String password;
        int pedido,cantidad,tarjeta;
        double pagar,pagoFinal,precio1;
        //CONSTANTES
        final String PASSWORD="diazgonzalezyahiralberto";
        double FRAPPE=50.50,CAPUCCINO=62.50,MOFFIN=38.50;
        double DESCUENTO1=0.05,DESCUENTO2=0.10,DESCUENTO3=0.15,DESCUENTO4=0.20,COMISION=0.03;
        
        Scanner leer=new Scanner (System.in);
                 
        System.out.println("Ingrese su contraseña");
        password=leer.next();
         
        if (password.equals(PASSWORD)){
            System.out.println("MENU\n1. Frappe\n2. Capuccino\n3. Moffin\nSeleciona una opcion");
            pedido=leer.nextInt();
            
            switch(pedido){
                case 1:
                    System.out.println("¿Cuantos Frappes desea?");
                    cantidad=leer.nextInt();
                    
                    System.out.println("¿Desea pagar con tarjeta de credito?\n1. Si\n2. No");
                    tarjeta=leer.nextInt();
                    
                    precio1=FRAPPE*cantidad;
                    
                    if(precio1<150){
                        pagar=precio1;
                    }else if(precio1<=280 && precio1>150){
                        pagar=precio1-(precio1*DESCUENTO1);
                    }else if(precio1<=350 && precio1>280){
                        pagar=precio1-(precio1*DESCUENTO2);
                    }else if(precio1<=500 && precio1>350){
                        pagar=precio1-(precio1*DESCUENTO3);
                    }else{
                        pagar=precio1-(precio1*DESCUENTO4);
                    }
                    
                    switch(tarjeta){
                        case 1:
                            pagoFinal=pagar+(pagar*COMISION);
                            System.out.println("El costo es de $"+pagoFinal);
                            break;
                        case 2:
                            pagoFinal=pagar;
                            System.out.println("El costo es de $"+pagoFinal);
                            break;
                    }   
                    break;
                case 2:
                    System.out.println("¿Cuantos Capuccionos desea?");
                    cantidad=leer.nextInt();
                    
                    System.out.println("¿Desea pagar con tarjeta de credito?\n1. Si\n2. No");
                    tarjeta=leer.nextInt();
                    
                    precio1=CAPUCCINO*cantidad;
                    
                    if(precio1<150){
                        pagar=precio1;
                    }else if(precio1<=280 && precio1>150){
                        pagar=precio1-(precio1*DESCUENTO1);
                    }else if(precio1<=350 && precio1>280){
                        pagar=precio1-(precio1*DESCUENTO2);
                    }else if(precio1<=500 && precio1>350){
                        pagar=precio1-(precio1*DESCUENTO3);
                    }else{
                        pagar=precio1-(precio1*DESCUENTO4);
                    }
                    
                    switch(tarjeta){
                        case 1:
                            pagoFinal=pagar+(pagar*COMISION);
                            System.out.println("El costo es de $"+pagoFinal);
                            break;
                        case 2:
                            pagoFinal=pagar;
                            System.out.println("El costo es de $"+pagoFinal);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("¿Cuantos Moffins desea?");
                    cantidad=leer.nextInt();
                    
                    System.out.println("¿Desea pagar con tarjeta de credito?\n1. Si\n2. No");
                    tarjeta=leer.nextInt();
                    
                    precio1=MOFFIN*cantidad;
                    
                    if(precio1<150){
                        pagar=precio1;
                    }else if(precio1<=280 && precio1>150){
                        pagar=precio1-(precio1*DESCUENTO1);
                    }else if(precio1<=350 && precio1>280){
                        pagar=precio1-(precio1*DESCUENTO2);
                    }else if(precio1<=500 && precio1>350){
                        pagar=precio1-(precio1*DESCUENTO3);
                    }else{
                        pagar=precio1-(precio1*DESCUENTO4);
                    }
                    
                    switch(tarjeta){
                        case 1:
                            pagoFinal=pagar+(pagar*COMISION);
                            System.out.println("El costo es de $"+pagoFinal);
                            break;
                        case 2:
                            pagoFinal=pagar;
                            System.out.println("El costo es de $"+pagoFinal);
                            break;
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");            
            } 
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
}
