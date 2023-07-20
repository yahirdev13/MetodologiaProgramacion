package Examenes;

import java.util.Scanner;
public class ExamenPasteleria {
    public static void main(String args[]){
        //variables
        int oportunidad = 0,opcion;
        int pastel1Ch,pastel1M,pastel1G,pastel2Ch,pastel2M,pastel2G;
        double nuevoPrecio;
        String pastel1,pastel2,cambioP;
        String password;
        
        //CONSTANTES
        final String PASSWORD= "diazgonzalezyahiralberto",SI="si";
        double CHICO=60,MEDIANO=150,GRANDE=280;
        
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
                System.out.println("Ingrese la existencia de "+pastel1+" del tamaño mediano");
                pastel1G=leer.nextInt();
                System.out.println("Ingrese el nombre del 2° pastel");
                pastel2=leer.next();
                System.out.println("Ingrese la existencia de "+pastel2+" del tamaño chico");
                pastel2Ch=leer.nextInt();
                System.out.println("Ingrese la existencia de "+pastel2+" del tamaño mediano");
                pastel2M=leer.nextInt();
                System.out.println("Ingrese la existencia de "+pastel2+" del tamaño mediano");
                pastel2G=leer.nextInt();
                
                do{
                    System.out.print("Menu Principal\n1. Venta de pasteles\n2. Incremento de la existencia\n3. Cambio del precio\n4. Salir\n");
                    opcion=leer.nextInt();
                    switch (opcion){
                        case 1:
                            do{
                                System.out.print("Submenu\n1. Venta de pasteles\n2. Total\n3. Cancelar pastel\n4. Regresar al Menu principal\nSelecciona una opcion");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        do{
                                            System.out.print("Submenu\n1. "+pastel1+"\n2. "+pastel2+"\n3. regresar al submenu Venta de pasteles\nSelecciona una opcion");
                                            opcion=leer.nextInt();
                                            switch(opcion){
                                                case 1:
                                                    
                                                    break;
                                                case 2:
                                                    
                                                    break;
                                                case 3:
                                                    opcion=3;
                                                    break;
                                                default:
                                                    System.out.println("Opcion no valida, vuelva a intrentarlo");
                                            }
                                        }while(opcion==3);
                                        break;
                                    case 2:
                                        
                                        break;
                                    case 3:
                                        
                                        break;
                                    case 4:
                                        
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, vuelva a intrentarlo");
                                }
                            }while(opcion==4);
                            break;
                        case 2:
                            
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
                                            CHICO=nuevoPrecio;
                                        }else{
                                            System.out.println("Precio no actualizado");
                                        }
                                        break;
                                        
                                    case 3:
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
                                        
                                    case 4:
                                        opcion=4;
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, vuelva a intrentarlo"); 
                                }
                            }while(opcion==4);
                            break;
                        case 4:
                            
                            break;
                        default:
                            System.out.println("Opcion no valida, vuelva a intrentarlo");
                    }
                }while(opcion==4);
                
                
                
                
                
                
                
                
                
                
                
                
            }else{
                System.out.println("Contraseña Incorrecta");
                oportunidad = oportunidad + 1;
            }
        }while(oportunidad < 3);
    }
}
