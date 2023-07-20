package Ejemplos;
import java.util.Scanner;
public class ExamenPasteleriaC {
    public static void main(String args[]){
        //variables
        int oportunidad = 0,opcion,masP,cancelar,cancelar2;
        int pastel1,pastel2, tam1,tam2;
        int acumuladorP1 = 0,acumuladorP2 = 0;
        double nuevoPrecio,totalBruto,acumuladorDia = 0,pagar;
        String nompastel1,nompastel2,cambioP;
        String password;
        double COSTO = 0,COSTO2 = 0, CHICO=60,MEDIANO=150,GRANDE=280;
        
        //CONSTANTES
        final String PASSWORD= "diazgonzalezyahiralberto",SI="si";
        final double DESCUENTO1=0.05,DESCUENTO2=0.10,DESCUENTO3=0.15,DESCUENTO4=0.20;
            
        Scanner leer = new Scanner (System.in);
            
        do{   
           System.out.println("Ingrese la contraseña");
           password=leer.next();
           if(password.equals(PASSWORD)){
               System.out.println("Ingrese el nombre del 1° pastel");
               nompastel1=leer.next();
               System.out.println("Ingrese el tamaño del 1° pastel\n1. Chico\n2. Mediano\n3. Grande");
               tam1=leer.nextInt();
               System.out.println("Ingrese la existencia del 1° pastel");
               pastel1=leer.nextInt();
               System.out.println("Ingrese el nombre del 2° pastel");
               nompastel2=leer.next();
               System.out.println("Ingrese el tamaño del 2° pastel\n1. Chico\n2. Mediano\n3. Grande");
               tam2=leer.nextInt();
               System.out.println("Ingrese la existencia del 2° pastel");
               pastel2=leer.nextInt();
               
               
               
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
                                            System.out.print("Submenu Venta de pasteles\n1. "+nompastel1+"\n2. "+nompastel2+"\n3. regresar al submenu Venta de pasteles\n");
                                            opcion=leer.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("Ingrese la cantidad de "+nompastel1+" a vender");
                                                    acumuladorP1=leer.nextInt();
                                                    if (acumuladorP1<=pastel1){
                                                        pastel1=pastel1-acumuladorP1;
                                                    }else{
                                                        System.out.println("no hay suficiente stock para realizar la venta, solo existen:"+pastel1);
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese la cantidad de "+nompastel2+" a vender");
                                                    acumuladorP2=leer.nextInt();
                                                    if (acumuladorP2<=pastel2){
                                                        pastel2=pastel2-acumuladorP2;
                                                    }else{
                                                        System.out.println("no hay suficiente stock para realizar la venta, solo existen:"+pastel1);
                                                    }
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
                                        switch(tam1){
                                            case 1:
                                                COSTO=CHICO;
                                                break;
                                            case 2:
                                                COSTO=MEDIANO;
                                                break;
                                            case 3:
                                                COSTO=GRANDE;
                                                break;
                                        }
                                        switch(tam2){
                                            case 1:
                                                COSTO2=CHICO;
                                                break;
                                            case 2:
                                                COSTO2=MEDIANO;
                                                break;
                                            case 3:
                                                COSTO2=GRANDE;
                                                break;
                                        }
                                        totalBruto=(acumuladorP1*COSTO)+(acumuladorP2*COSTO2);
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
                                        System.out.println("El total a pagar es de: $"+pagar);
                                        acumuladorDia=acumuladorDia+pagar;
                                        pagar=0;        
                                        break;
                                    case 3:
                                        do{
                                            System.out.print("Submenu Cancelacion de pasteles\n1. "+nompastel1+"\n2. "+nompastel2+"\n3. regresar al submenu Venta de pasteles\n");
                                            opcion=leer.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    System.out.println("Ingrese la cantidad de "+nompastel1+" a cancelar");
                                                    cancelar=leer.nextInt();
                                                    if (cancelar<=acumuladorP1){
                                                        acumuladorP1=acumuladorP1-cancelar;
                                                        pastel1=pastel1+cancelar;
                                                    }else{
                                                        System.out.println("No puedes cancelar mas de lo que vendes solo vendes"+acumuladorP1);
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese la cantidad de "+nompastel1+" a cancelar");
                                                    cancelar2=leer.nextInt();
                                                    if (cancelar2<=acumuladorP2){
                                                        acumuladorP2=acumuladorP2-cancelar2;
                                                        pastel2=pastel2+cancelar2;
                                                    }else{
                                                        System.out.println("No puedes cancelar mas de lo que vendes solo vendes"+acumuladorP2);
                                                    }
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
                                System.out.print("Submenu Inremento de existencias\n1. "+nompastel1+"\n2. "+nompastel2+"\n3. Regresar al Menu Principal\n");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        System.out.println("Ingrese la cantidad a incrementar del pastel "+nompastel1); 
                                        masP=leer.nextInt();
                                        System.out.println("¿Esta seguro de incrementar la existencia?");
                                        cambioP=leer.next();
                                        if (cambioP.equalsIgnoreCase(SI)) {
                                            System.out.println("Existencia actualizada correctamente");
                                            pastel1=pastel1+masP;
                                        }else{
                                            System.out.println("Existencia no actualizada");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la cantidad a incrementar del pastel "+nompastel2); 
                                        masP=leer.nextInt();
                                        System.out.println("¿Esta seguro de incrementar la existencia?");
                                        cambioP=leer.next();
                                        if (cambioP.equalsIgnoreCase(SI)) {
                                            System.out.println("Existencia actualizada correctamente");
                                            pastel2=pastel2+masP;
                                        }else{
                                            System.out.println("Existencia no actualizada");
                                        }
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
    
    
    
    
