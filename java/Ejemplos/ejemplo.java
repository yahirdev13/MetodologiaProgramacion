
package Ejemplos;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        final String CONTRASEÑA = "Sistema";
        String contraseña;
        int opcion, opcion1, contador, cantidad,existencias;
        int intento =0,refrescos =30, papas =60, galletas =75,total=0, totalReal =0;    
        final int PRECIO_PAPAS =13,PRECIO_REFRESCO =10, PRECIO_GALLETAS =14;  
        do{
            System.out.print("Ingresa La Contraseña ");
            contraseña =  leer.next();
            if(contraseña.equals(CONTRASEÑA)){
                do{
                    System.out.println(" Menú.\n 1.-Refresco \n 2.-Papas \n 3.-Galletas \n 4.-Total \n 5.-Compras al provedor \n 6.-Salir");
                    System.out.println("Que Vas A Querer");
                    opcion = leer.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println("Existencias En El Inventario");
                            System.out.println("Refrescos "+refrescos);
                            System.out.println("Cuantos Quieres ");
                            cantidad = leer.nextInt();
                            if(cantidad <= refrescos){
                                total = cantidad * PRECIO_REFRESCO;
                                totalReal = totalReal + total;
                                refrescos = refrescos - cantidad;
                            }else{
                                contador = cantidad - refrescos;
                                System.out.println("Necesitas Comprar "+contador+" Existencias");
                            }
                            break;
                        case 2:
                            System.out.println("Existencias En El Inventario");
                            System.out.println("Papas "+papas);
                            System.out.print("Cuantas Quieres ");
                            cantidad = leer.nextInt();
                            if(cantidad <= papas){
                                total = cantidad * PRECIO_PAPAS;
                                totalReal = totalReal + total;
                                papas = papas - cantidad;
                            }else{
                                contador = cantidad - papas;
                                System.out.println("Necesitas Comprar "+contador+" Existencias");
                            }
                            break;
                        case 3:
                            System.out.println("Existencias En El Inventario");
                            System.out.println("Galletas "+galletas);
                            System.out.print("Cuantas Quieres ");
                            cantidad = leer.nextInt();
                            if(cantidad <= galletas){
                                total = cantidad * PRECIO_GALLETAS;
                                totalReal = totalReal + total;
                                galletas = refrescos - cantidad;
                            }else{
                                contador = cantidad - galletas;
                                System.out.println("Necesitas Comprar "+contador+" Existencias");
                            }
                            break;
                        case 4:
                            System.out.println("Total "+totalReal);
                            totalReal = 0;
                            break;
                        case 5:
                            do{
                                System.out.println(" Menú.\n 1.-Refresco \n 2.-Papas \n 3.-Galletas \n 4.-Regresar");
                                System.out.println("Que Quieres Comprarle Al Provedor");
                                opcion1 = leer.nextInt();
                                switch(opcion1){
                                    case 1:
                                        System.out.println("Cuántos Refrescos Quieres ");
                                        existencias = leer.nextInt();
                                        refrescos = refrescos + existencias;
                                        break;
                                    case 2:
                                        System.out.println("Cuántas Papas Quieres ");
                                        existencias = leer.nextInt();
                                        papas = papas + existencias;
                                        break;
                                    case 3:
                                        System.out.println("Cuántas Gallets Quieres ");
                                        existencias = leer.nextInt();
                                        galletas = galletas + existencias;
                                        break;
                                    case 4:
                                        opcion1 = 4;
                                        break;
                                    default:
                                        System.out.println("Opción Invalida");
                                }
                            }while(opcion1 != 4);
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opción Invalida");
                    }
                }while(opcion != 6);
                intento = 4;
            }else{
                System.out.println("Contraseña Incorrecta");
                intento = intento + 1;
            }
        }while(intento < 3);
    }
}

