package Ejemplos;

import java.util.Scanner;
public class ExamenPasteleria {
    public static void main(String args[]){
        //variables
        int oportunidad = 0,opcion,masP,cancelar;
        int pastel1Ch,pastel1M,pastel1G,pastel2Ch,pastel2M,pastel2G;
        int ventaP1Ch = 0,ventaP1M = 0,ventaP1G = 0,ventaP2Ch = 0,ventaP2M = 0,ventaP2G = 0;
        double nuevoPrecio,totalBruto,acumuladorCliente = 0,acumuladorDia = 0,pagar;
        String pastel1,pastel2,cambioP;
        String password;
        double CHICO=60,MEDIANO=150,GRANDE=280;
        
        //CONSTANTES
        final String PASSWORD= "diazgonzalezyahiralberto",SI="si";
        final double DESCUENTO1=0.05,DESCUENTO2=0.10,DESCUENTO3=0.15,DESCUENTO4=0.20;
        
        Scanner leer = new Scanner (System.in);
        
        do{
            System.out.println("Ingrese la contraseña");
            password=leer.next();
            if(password.equals(PASSWORD)){
                System.out.println("Ingrese el nombre del 1° pastel");
                pastel1=leer.next();
                System.out.println("Ingrese la existencia de "+pastel1+" del tamaño chico");
                pastel1Ch=leer.nextInt();
                System.out.println("Ingrese la existencia de "+pastel1+" del tamaño mediano");
                pastel1M=leer.nextInt();
                System.out.println("Ingrese la existencia de "+pastel1+" del tamaño grande");
                pastel1G=leer.nextInt();
                System.out.println("Ingrese el nombre del 2° pastel");
                pastel2=leer.next();
                System.out.println("Ingrese la existencia de "+pastel2+" del tamaño chico");
                pastel2Ch=leer.nextInt();
                System.out.println("Ingrese la existencia de "+pastel2+" del tamaño mediano");
                pastel2M=leer.nextInt();
                System.out.println("Ingrese la existencia de "+pastel2+" del tamaño grande ");
                pastel2G=leer.nextInt();
                
                do{
                    System.out.print("Menu Principal\n1. Venta de pasteles\n2. Incremento de la existencia\n3. Cambio del precio\n4. Salir\n");
                    opcion=leer.nextInt();
                    switch (opcion){
                        case 1:
                            do{
                                System.out.print("Submenu\n1. Venta de pasteles\n2. Total\n3. Cancelar pastel\n4. Regresar al Menu principal\n");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        do{
                                            System.out.print("Submenu Venta de pasteles\n1. "+pastel1+"\n2. "+pastel2+"\n3. regresar al submenu Venta de pasteles\n");
                                            opcion=leer.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("Ingrese la cantidad de "+pastel1+" chicos a vender");
                                                    ventaP1Ch=leer.nextInt();
                                                    pastel1Ch=pastel1Ch-ventaP1Ch;
                                                    System.out.println("Ingrese la cantidad de "+pastel1+" medianos a vender");
                                                    ventaP1M=leer.nextInt();
                                                    pastel1M=pastel1M-ventaP1M;
                                                    System.out.println("Ingrese la cantidad de "+pastel1+" grandes a vender");
                                                    ventaP1G=leer.nextInt();
                                                    pastel1G=pastel1G-ventaP1G;
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese la cantidad de "+pastel2+" chicos a vender");
                                                    ventaP2Ch=leer.nextInt();
                                                    pastel2Ch=pastel2Ch-ventaP2Ch;
                                                    System.out.println("Ingrese la cantidad de "+pastel2+" medianos a vender");
                                                    ventaP2M=leer.nextInt();
                                                    pastel2M=pastel2M-ventaP2M;
                                                    System.out.println("Ingrese la cantidad de "+pastel2+" grandes a vender");
                                                    ventaP2G=leer.nextInt();
                                                    pastel2G=pastel2G-ventaP2G;
                                                    break;
                                                case 3:
                                                    opcion=3;
                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida, vuelva a intrentarlo");
                                            }
                                        }while(opcion!=3);
                                        break;
                                    case 2:
                                        totalBruto=(ventaP1Ch*CHICO)+(ventaP1M*MEDIANO)+(ventaP1G*GRANDE)+(ventaP2Ch*CHICO)+(ventaP2M*MEDIANO)+(ventaP2G*GRANDE);
                                        if(totalBruto<150){
                                            pagar=totalBruto;
                                        }else if(totalBruto<=300 && totalBruto>150){
                                            pagar=totalBruto-(totalBruto*DESCUENTO1);
                                        }else if(totalBruto<=500 && totalBruto>300){
                                            pagar=totalBruto-(totalBruto*DESCUENTO2);
                                        }else if(totalBruto<=700 && totalBruto>500){
                                            pagar=totalBruto-(totalBruto*DESCUENTO3);
                                        }else{
                                            pagar=totalBruto-(totalBruto*DESCUENTO4);
                                        }
                                        
                                        acumuladorCliente=pagar;
                                        acumuladorDia=acumuladorDia+acumuladorCliente;
                                        System.out.println("Total de la venta es de: $"+acumuladorCliente);
                                        
                                        acumuladorCliente = 0;
                                        ventaP1Ch=0;
                                        ventaP1M=0;
                                        ventaP1G=0;
                                        ventaP2Ch=0;
                                        ventaP2M=0;
                                        ventaP2G=0;
      
                                        break;
                                    case 3:
                                        do{
                                            System.out.print("Submenu Cancelacion de pasteles\n1. "+pastel1+"\n2. "+pastel2+"\n3. regresar al submenu Venta de pasteles\n");
                                            opcion=leer.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    do{
                                                        System.out.println("cancelacion pedidos de "+pastel1+"\n1. Chico\n2. Mediano\n3. Grande\n4. Regresar al menu de Cancelacion\n");
                                                        opcion=leer.nextInt();
                                                        switch(opcion){
                                                            case 1:
                                                                System.out.println("Ingrese la cantidad a cancelar del tamaño chico");
                                                                cancelar=leer.nextInt();
                                                                if (cancelar <=ventaP1Ch){
                                                                    System.out.println("Cancelacion exitosa");
                                                                    ventaP1Ch=ventaP1Ch-cancelar;
                                                                    pastel1Ch=pastel1Ch+cancelar;
                                                                    acumuladorCliente=acumuladorCliente-(cancelar*CHICO);
                                                                }else{
                                                                    System.out.println("no puede cancelar, solo esta vendiendo "+ventaP1Ch);
                                                                }
                                                                break;
                                                            case 2:
                                                                System.out.println("Ingrese la cantidad a cancelar del tamaño mediano");
                                                                cancelar=leer.nextInt();
                                                                if (cancelar <=ventaP1M){
                                                                    System.out.println("Cancelacion exitosa");
                                                                    ventaP1M=ventaP1M-cancelar;
                                                                    pastel1M=pastel1M+cancelar;
                                                                    acumuladorCliente=acumuladorCliente-(cancelar*MEDIANO);
                                                                }else{
                                                                    System.out.println("no puede cancelar, solo esta vendiendo "+ventaP1M);
                                                                }
                                                                break;
                                                            case 3:
                                                                System.out.println("Ingrese la cantidad a cancelar del tamaño grande");
                                                                cancelar=leer.nextInt();
                                                                if (cancelar <=ventaP1G){
                                                                    System.out.println("Cancelacion exitosa");
                                                                    ventaP1G=ventaP1G-cancelar;
                                                                    pastel1G=pastel1G+cancelar;
                                                                    acumuladorCliente=acumuladorCliente-(cancelar*GRANDE);
                                                                }else{
                                                                    System.out.println("no puede cancelar, solo esta vendiendo "+ventaP1G);
                                                                }
                                                                break;
                                                            case 4:
                                                                opcion=4;
                                                                break;
                                                            default:
                                                                System.out.println("Opcion no valida, vuelva a intrentarlo");
                                                        }
                                                    }while(opcion!=4);
                                                    break;
                                                case 2:
                                                     do{
                                                        System.out.println("cancelacion pedidos de "+pastel2+"\n1. Chico\n2. Mediano\n3. Grande\n4. Regresar al menu de Cancelacion\n");
                                                        opcion=leer.nextInt();
                                                        switch(opcion){
                                                            case 1:
                                                                System.out.println("Ingrese la cantidad a cancelar del tamaño chico");
                                                                cancelar=leer.nextInt();
                                                                if (cancelar <=ventaP2Ch){
                                                                    System.out.println("Cancelacion exitosa");
                                                                    ventaP2Ch=ventaP2Ch-cancelar;
                                                                    pastel2Ch=pastel2Ch+cancelar;
                                                                    acumuladorCliente=acumuladorCliente-(cancelar*CHICO);
                                                                }else{
                                                                    System.out.println("no puede cancelar, solo esta vendiendo "+ventaP2Ch);
                                                                }
                                                                break;
                                                            case 2:
                                                                System.out.println("Ingrese la cantidad a cancelar del tamaño mediano");
                                                                cancelar=leer.nextInt();
                                                                if (cancelar <=ventaP2M){
                                                                    System.out.println("Cancelacion exitosa");
                                                                    ventaP2M=ventaP2M-cancelar;
                                                                    pastel2M=pastel2M+cancelar;
                                                                    acumuladorCliente=acumuladorCliente-(cancelar*MEDIANO);
                                                                }else{
                                                                    System.out.println("no puede cancelar, solo esta vendiendo "+ventaP2M);
                                                                }
                                                                break;
                                                            case 3:
                                                                System.out.println("Ingrese la cantidad a cancelar del tamaño grande");
                                                                cancelar=leer.nextInt();
                                                                if (cancelar <=ventaP2G){
                                                                    System.out.println("Cancelacion exitosa");
                                                                    ventaP2G=ventaP2G-cancelar;
                                                                    pastel2G=pastel2G+cancelar;
                                                                    acumuladorCliente=acumuladorCliente-(cancelar*GRANDE);
                                                                }else{
                                                                    System.out.println("no puede cancelar, solo esta vendiendo "+ventaP2G);
                                                                }
                                                                break;
                                                            case 4:
                                                                opcion=4;
                                                                break;
                                                            default:
                                                                System.out.println("Opcion no valida, vuelva a intrentarlo");
                                                        }
                                                    }while(opcion!=4);
                                                    break;
                                                case 3:
                                                    opcion=3;
                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida, vuelva a intrentarlo");
                                            }
                                        }while(opcion!=3);
                                        break;
                                    case 4:
                                        opcion=8;
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, vuelva a intrentarlo");
                                }
                            }while(opcion!=8);
                            break;
                        case 2:
                            do{
                                System.out.print("Submenu Inremento de existencias\n1. "+pastel1+"\n2. "+pastel2+"\n3. Regresar al Menu Principal\n");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        do{
                                        System.out.println("Incremento de existencia de "+pastel1+"\n1. Chico\n2. Mediano\n3. Grande\n4. Regresar al menu de Incremento de existencia\n");
                                        opcion=leer.nextInt();
                                        switch(opcion){
                                            case 1:
                                                System.out.println("Ingrese la cantidad a incrementar del tamaño chico");
                                                masP=leer.nextInt();
                                                System.out.println("¿Esta seguro de incrementar la existencia?");
                                                cambioP=leer.next();
                                                if (cambioP.equalsIgnoreCase(SI)) {
                                                    System.out.println("Existencia actualizada correctamente");
                                                    pastel1Ch=pastel1Ch+masP;
                                                }else{
                                                    System.out.println("Existencia no actualizada");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la cantidad a incrementar del tamaño mediano");
                                                masP=leer.nextInt();
                                                System.out.println("¿Esta seguro de incrementar la existencia?");
                                                cambioP=leer.next();
                                                if (cambioP.equalsIgnoreCase(SI)) {
                                                    System.out.println("Existencia actualizada correctamente");
                                                    pastel1M=pastel1M+masP;
                                                }else{
                                                    System.out.println("Existencia no actualizada");
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Ingrese la cantidad a incrementar del tamaño grande");
                                                masP=leer.nextInt();
                                                System.out.println("¿Esta seguro de incrementar la existencia?");
                                                cambioP=leer.next();
                                                if (cambioP.equalsIgnoreCase(SI)) {
                                                    System.out.println("Existencia actualizada correctamente");
                                                    pastel1G=pastel1G+masP;
                                                }else{
                                                    System.out.println("Existencia no actualizada");
                                                }
                                                break;
                                            case 4:
                                                opcion=4;
                                                break;
                                            default:
                                                System.out.println("Opcion no valida, vuelva a intrentarlo");
                                        }
                                        }while(opcion!=4);
                                        break;
                                    case 2:
                                        do{
                                        System.out.println("Incremento de existencia de "+pastel2+"\n1. Chico\n2. Mediano\n3. Grande\n4. Regresar al menu de Incremento de existencia\n");
                                        opcion=leer.nextInt();
                                        switch(opcion){
                                            case 1:
                                                System.out.println("Ingrese la cantidad a incrementar del tamaño chico");
                                                masP=leer.nextInt();
                                                System.out.println("¿Esta seguro de incrementar la existencia?");
                                                cambioP=leer.next();
                                                if (cambioP.equalsIgnoreCase(SI)) {
                                                    System.out.println("Existencia actualizada correctamente");
                                                    pastel2Ch=pastel2Ch+masP;
                                                }else{
                                                    System.out.println("Existencia no actualizada");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Ingrese la cantidad a incrementar del tamaño mediano");
                                                masP=leer.nextInt();
                                                System.out.println("¿Esta seguro de incrementar la existencia?");
                                                cambioP=leer.next();
                                                if (cambioP.equalsIgnoreCase(SI)) {
                                                    System.out.println("Existencia actualizada correctamente");
                                                    pastel2M=pastel2M+masP;
                                                }else{
                                                    System.out.println("Existencia no actualizada");
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Ingrese la cantidad a incrementar del tamaño grande");
                                                masP=leer.nextInt();
                                                System.out.println("¿Esta seguro de incrementar la existencia?");
                                                cambioP=leer.next();
                                                if (cambioP.equalsIgnoreCase(SI)) {
                                                    System.out.println("Existencia actualizada correctamente");
                                                    pastel2G=pastel2G+masP;
                                                }else{
                                                    System.out.println("Existencia no actualizada");
                                                }
                                                break;
                                            case 4:
                                                opcion=4;
                                                break;
                                            default:
                                                System.out.println("Opcion no valida, vuelva a intrentarlo");
                                        }
                                        }while(opcion!=4);
                                        break;
                                    case 3:
                                        opcion=3;
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, vuelva a intrentarlo"); 
                                }
                            }while(opcion!=3);
                            break;
                        case 3:
                            do{
                                System.out.print("Submenu Cambio de precio\n1. Chico\n2. Mediano\n3. Grande\n4. Regresar al Menu Principal\n");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        System.out.println("Ingrese el nuevo precio del tamaño chico");
                                        nuevoPrecio=leer.nextInt();
                                        System.out.println("¿Esta seguro de cambiar el precio?");
                                        cambioP=leer.next();
                                        if (cambioP.equalsIgnoreCase(SI)) {
                                            System.out.println("Precio actualizado correctamente");
                                            CHICO=nuevoPrecio;
                                        }else{
                                            System.out.println("Precio no actualizado");
                                        }
                                        break;
                                        
                                    case 2:
                                        System.out.println("Ingrese el nuevo precio del tamaño mediano");
                                        nuevoPrecio=leer.nextInt();
                                        System.out.println("¿Esta seguro de cambiar el precio?");
                                        cambioP=leer.next();
                                        if (cambioP.equalsIgnoreCase(SI)) {
                                            System.out.println("Precio actualizado correctamente");
                                            MEDIANO=nuevoPrecio;
                                        }else{
                                            System.out.println("Precio no actualizado");
                                        }
                                        break;
                                        
                                    case 3:
                                       System.out.println("Ingrese el nuevo precio del tamaño grande");
                                        nuevoPrecio=leer.nextInt();
                                        System.out.println("¿Esta seguro de cambiar el precio?");
                                        cambioP=leer.next();
                                        if (cambioP.equalsIgnoreCase(SI)) {
                                            System.out.println("Precio actualizado correctamente");
                                            GRANDE=nuevoPrecio;
                                        }else{
                                            System.out.println("Precio no actualizado");
                                        }
                                        break;
                                        
                                    case 4:
                                        opcion=4;
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, vuelva a intrentarlo"); 
                                }
                            }while(opcion!=4);
                            break;
                        case 4:
                            System.out.println("Las ventas del dias son de: $"+acumuladorDia);
                            oportunidad=100;
                            opcion=4;
                            break;
                        default:
                            System.out.println("Opcion no valida, vuelva a intrentarlo");
                    }
                }while(opcion!=4);
            }else{
                System.out.println("Contraseña Incorrecta");
                oportunidad = oportunidad + 1;
            }
        }while(oportunidad < 3);
    }
}
