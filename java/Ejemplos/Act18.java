package Ejemplos;

import java.util.Scanner;

public class Act18 {
    public static void main(String args[]){ 
        //variables
        int opcion,oportunidad = 0, contador=0,proveedor,cantidad,compra;
        int soda=30, papas=60, galletas=75;
        double total, totalFinal = 0;
        String password;
        //CONSTANTES
        int SODA=10, PAPAS=13, GALLETAS=14;
        final String PASSWORD="Sistema";
        
        Scanner leer = new Scanner (System.in);
         
        
        do{
            System.out.println("Ingrese la contraseña");
            password=leer.next();
            if(password.equals(PASSWORD)){
                do{
                    System.out.println("MENU \n1. Refresco\n2. Papas\n3. Galletas \n4. Total\n5. Compras del proveedor\n6. Salir\nSeleccione una opcion");
                    opcion=leer.nextInt();
                    
                    switch(opcion){
                        case 1:
                            System.out.println("Existencias de sodas: "+soda);
                            System.out.println("Ingrese la cantidad a vender");
                            cantidad = leer.nextInt();
                            if(cantidad <= soda){
                                total = cantidad * SODA;
                                totalFinal = totalFinal + total;
                                soda = soda - cantidad;
                            }else{
                                contador = cantidad - soda;
                                System.out.println("Faltan "+contador+" refrescos para realizar esta venta");
                            }
                            break;
                        case 2:
                            System.out.println("Existencias de sodas: "+papas);
                            System.out.println("Ingrese la cantidad a vender");
                            cantidad = leer.nextInt();
                            if(cantidad <= papas){
                                total = cantidad * PAPAS;
                                totalFinal = totalFinal + total;
                                papas = papas - cantidad;
                            }else{
                                contador = cantidad - papas;
                                System.out.println("Faltan "+contador+" papas para realizar esta venta");
                            }
                            break;
                        case 3:
                            System.out.println("Existencias de sodas: "+galletas);
                            System.out.println("Ingrese la cantidad a vender");
                            cantidad = leer.nextInt();
                            if(cantidad <= galletas){
                                total = cantidad * GALLETAS;
                                totalFinal = totalFinal + total;
                                galletas = galletas - cantidad;
                            }else{
                                contador = cantidad - galletas;
                                System.out.println("Faltan "+contador+" galletas para realizar esta venta");
                            }
                            break;
                        case 4:
                            System.out.println("Total de la venta es de: $"+totalFinal);
                            totalFinal = 0;
                            break; 
                        case 5:
                            do{
                                System.out.println(" Menú de proveedores\n1. Refresco \n2. Papas \n3. Galletas \n4. Regresar");
                                proveedor = leer.nextInt();
                                switch(proveedor){
                                    case 1:
                                        System.out.println("Ingrese la cantidad de refrescos a comprar");
                                        compra = leer.nextInt();
                                        soda = soda + compra;
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la cantidad de papas a comprar");
                                        compra = leer.nextInt();
                                        papas = papas + compra;
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la cantidad de galletas a comprar");
                                        compra = leer.nextInt();
                                        galletas = galletas + compra;
                                        break;
                                    case 4:
                                        proveedor=4;
                                        break;
                                    default:
                                        System.out.println("Opción Invalida");
                                }
                            }while(proveedor != 4);    
                            break;
                        case 6:
                            opcion=6;
                            break;    
                        default:
                            System.out.println("Opción Invalida");
                    }
                }while(opcion != 6);
                oportunidad = 100;
            }else{
                System.out.println("Contraseña Incorrecta");
                oportunidad = oportunidad + 1;
            }
        }while(oportunidad < 3);
    }    
}

