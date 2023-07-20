
import java.util.Scanner;

public class ExamenF {
    public static void main (String args []) {
        //variables contraseña//
        int contC=0;
        String respuesta;
        final String CONTRASEÑA="EnriquezTorresJoseEmilio";
        //variables base de datos peliculas//
        String pelicula1,pelicula2,clasificacionPeli1,clasificacionPeli2;
        double asientosPeli1,asientosPeli2;
        //variables menu principal
        int menuP;
        String pregunta1,confirmacion,pregunta3;
        //variables submenu ventas
        int menu2,pregunta2,menu5;
        double venta,ventaP1 = 0,ventaP2 = 0,boletosP1 = 0,boletosP2 = 0,rembolso,totalV,totalD = 0,totalB;
        //menu compra de boletos
        int menu3 = 0,menu4 = 0;
        //variables precios
        int clasA = 30,clasB = 35,clasC = 40,cambio;
        //Constantes descuentos
        double LIM1=50,LIM2=100,LIM3=150,LIM4=200;
        double DESC1=0.5,DESC2=.10,DESC3=.15,DESC4=.20;
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("ingrese la contraseña");
        respuesta=leer.next();
        
        while (!CONTRASEÑA.equals(respuesta) && contC <3){
            contC=contC+1;
            System.out.println("ingrese la contraseña correcta");
            respuesta=leer.next();
        }
        if (CONTRASEÑA.equals(respuesta)){
            System.out.println("bienvenido");
            System.out.println("ingrese el nombre de la primer pelicula");
            pelicula1=leer.next();
            System.out.println("que clasificacion es la pelicula "+pelicula1+"?\nA\nB\nC");
            clasificacionPeli1=leer.next();
            System.out.println("cuantos asientos disponibles hay en la pelicula "+pelicula1+"?");
            asientosPeli1=leer.nextDouble();
            
            System.out.println("ingrese el nombre de la segunda pelicula");
            pelicula2=leer.next();
            System.out.println("que clasificacion es la pelicula "+pelicula2+"?\nA\nB\nC");
            clasificacionPeli2=leer.next();
            System.out.println("cuantos asientos disponibles hay en la pelicula "+pelicula2+"?");
            asientosPeli2=leer.nextDouble();
            
            System.out.println("va a vender boletos [S/N]?");
            pregunta1=leer.next();
            
            while(pregunta1.equalsIgnoreCase("S")){
                boletosP1=0;
                boletosP2=0;
                ventaP1=0;
                ventaP2=0;
                totalV=0;
                do{
                    System.out.println("clasificacion      costo\nA                   $"+clasA+"\nB                   $"+clasB+"\nC                   $"+clasC);
                    System.out.println("\n   -MENU PRINCIPAL-\n1.-Venta de boletos\n2.-cambio del precio de clasificacion\n3.-salir");
                    menuP=leer.nextInt();
                    
                    System.out.println("usted selecciono la opcion "+menuP+"? [S/N]");
                    confirmacion=leer.next();
                    
                    switch (menuP){
                        
                        
                        case 1:
                            do{
                                System.out.println("\n   -SUBMENU VENTA DE BOLETOS-\n1.-comprar boletos\n2.-total\n3.-cancelar algun boleto\n4.-regresar al menu principal");
                                menu2=leer.nextInt();
                                switch(menu2){
                                    case 1:
                                        do{
                                        System.out.println("\n   -COMPRA DE BOLETOS-\n1.-"+pelicula1+"\n2.-"+pelicula2+"\n3.-regresar");
                                        menu3=leer.nextInt();
                                        switch(menu3){
                                            case 1:
                                                System.out.println("cuantos boletos va a comprar de la pelicula "+pelicula1+"?");
                                                venta=leer.nextDouble();
                                                if(venta<=asientosPeli1){
                                                    if(clasificacionPeli1.equalsIgnoreCase("A")){
                                                        ventaP1=(venta*clasA)+ventaP1;
                                                        asientosPeli1=asientosPeli1-venta;
                                                        boletosP1=venta+boletosP1;
                                                    }else if(clasificacionPeli1.equalsIgnoreCase("B")){
                                                        ventaP1=(venta*clasB)+ventaP1; 
                                                        asientosPeli1=asientosPeli1-venta;
                                                        boletosP1=venta+boletosP1;
                                                    }else if (clasificacionPeli1.equalsIgnoreCase("C")){
                                                        ventaP1=(venta*clasC)+ventaP1;
                                                        asientosPeli1=asientosPeli1-venta;
                                                        boletosP1=venta+boletosP1;
                                                    }else{
                                                    System.out.println("error en la clasificacion de pelicula, reinicie el sistema");    
                                                    }    
                                                }else{
                                                   System.out.println("imposibilidad de compra\nasientos disponibles:"+asientosPeli1); 
                                                }
                                                menu4=1;
                                                break;
                                            case 2:
                                                System.out.println("cuantos boletos va a comprar de la pelicula "+pelicula2+"?");
                                                venta=leer.nextDouble();
                                                if (venta<=asientosPeli2){
                                                    if(clasificacionPeli2.equalsIgnoreCase("A")){
                                                        ventaP2=(venta*clasA)+ventaP2;
                                                        asientosPeli2=asientosPeli2-venta;
                                                        boletosP2=venta+boletosP2;
                                                    }else if(clasificacionPeli2.equalsIgnoreCase("B")){
                                                        ventaP2=(venta*clasB)+ventaP2;
                                                        asientosPeli2=asientosPeli2-venta;
                                                    }else if(clasificacionPeli2.equalsIgnoreCase("C")){
                                                        ventaP2=(venta*clasC)+ventaP2;
                                                        asientosPeli2=asientosPeli2-venta;
                                                    }else {
                                                        System.out.println("error en la clasificacion de pelicula, reinicie el sistema"); 
                                                    }
                                                }else{
                                                    System.out.println("imposibilidad de compra\nasientos disponibles:"+asientosPeli2);
                                                }
                                                menu4=1;
                                                break;
                                            case 3:
                                                menu4=2;
                                                System.out.println("regresando . . . :)\n");
                                                break;
                                        }        
                                        }while(menu4==1);
                                        break;
                                    case 2:
                                        System.out.println("     -TOTAL-");
                                        totalV=ventaP1+ventaP2;
                                        
                                        System.out.println(totalV);
                                        if (totalV>=LIM1 && totalV<=LIM2) {
                                            totalV=totalV-(totalV*DESC1);
                                        }else if (totalV>LIM2 && totalV<=LIM3){
                                            totalV=totalV-(totalV*DESC2);
                                        }else if (totalV>LIM3 && totalV<=LIM4){
                                            totalV=totalV-(totalV*DESC3);
                                        }else if (totalV>LIM4){
                                            totalV=totalV-(totalV*DESC4);
                                        }else{
                                            totalV=totalV;
                                        }
                                            
                                        System.out.println("total a pagar por la pelicula 1:"+ventaP1);
                                        System.out.println("total a pagar por la pelicula 2:"+ventaP2);to
                                        System.out.println("total a pagar es:"+totalV);
                                        
 
                                        break;
                                    case 3:
                                        System.out.println("   -MENU DE CANCELACION DE BOLETOS-\n1.-"+pelicula1+"\n2.-"+pelicula2+"\n3.-regresar");
                                        menu5=leer.nextInt();
                                        switch (menu5){
                                            case 1:
                                                System.out.println("tienes en posecion "+boletosP1+" boletos de la pelicula "+pelicula1+", cuantos vaz a cancelar?");
                                                rembolso=leer.nextDouble();
                                                if(rembolso<=boletosP1){
                                                    if(clasificacionPeli1.equalsIgnoreCase("A")){
                                                        ventaP1=ventaP1-(rembolso*clasA);
                                                        asientosPeli1=asientosPeli1+rembolso;
                                                        boletosP1=boletosP1-rembolso;
                                                    }else if(clasificacionPeli1.equalsIgnoreCase("B")){
                                                        ventaP1=ventaP1-(rembolso*clasB); 
                                                        asientosPeli1=asientosPeli1+rembolso;
                                                        boletosP1=boletosP1-rembolso;
                                                    }else if (clasificacionPeli1.equalsIgnoreCase("C")){
                                                        ventaP1=ventaP1-(rembolso*clasC);
                                                        asientosPeli1=asientosPeli1+rembolso;
                                                        boletosP1=boletosP1-rembolso;
                                                    }else{
                                                    System.out.println("error en la clasificacion de pelicula, reinicie el sistema");    
                                                    }    
                                                }else{
                                                   System.out.println("imposibilidad de rembolso\boletos reembolsables:"+boletosP1); 
                                                } 
                                                break;
                                            case 2:
                                                System.out.println("tienes en posecion "+boletosP2+" boletos de la pelicula "+pelicula2+", cuantos vaz a cancelar?");
                                                rembolso=leer.nextDouble();
                                                if(rembolso<=boletosP2){
                                                    if(clasificacionPeli2.equalsIgnoreCase("A")){
                                                        ventaP2=ventaP2-(rembolso*clasA);
                                                        asientosPeli2=asientosPeli2+rembolso;
                                                        boletosP2=boletosP2-rembolso;
                                                    }else if(clasificacionPeli2.equalsIgnoreCase("B")){
                                                        ventaP2=ventaP2-(rembolso*clasB); 
                                                        asientosPeli2=asientosPeli2+rembolso;
                                                        boletosP1=boletosP1-rembolso;
                                                    }else if (clasificacionPeli2.equalsIgnoreCase("C")){
                                                        ventaP2=ventaP2-(rembolso*clasC);
                                                        asientosPeli2=asientosPeli2+rembolso;
                                                        boletosP2=boletosP2-rembolso;
                                                    }else{
                                                    System.out.println("error en la clasificacion de pelicula, reinicie el sistema");    
                                                    }    
                                                }else{
                                                   System.out.println("imposibilidad de rembolso\boletos reembolsables:"+boletosP2); 
                                                } 
                                                break;
                                            case 3:
                                                System.out.println("regresando . . . :)");
                                                menu3=3;
                                                break;
                                            default:
                                        }
                                        menu3=3;
                                        break;
                                    case 4:
                                        System.out.println("volviendo al menu principal");
                                        confirmacion="n";
                                        menu3=4;
                                        break;
                                } 
                            }while(menu3==3);
                            break;
                            
                            
                        case 2:
                            
                            System.out.println("   -cambio de precios-\n1.-cambiar clasificacion A\n2.-cambiar clasificacion B\n3.-cambiar clasificacion C\n4.-volver al menu principal");
                            pregunta2=leer.nextInt();
                            switch (pregunta2){
                                case 1:
                                    System.out.println("introduzca el nuevo precio de la Clase A");
                                    cambio=leer.nextInt();
                                    System.out.println("esta seguro de realizar el cambio [S/N]?");
                                    pregunta3=leer.next();
                                    if(pregunta3.equalsIgnoreCase("s")){
                                        clasA=cambio;
                                    }else{
                                        System.out.println("cancelando cambio... volviendo al menu principal");
                                    }
                                    confirmacion="n";
                                    break;
                                case 2:
                                    System.out.println("introduzca el nuevo precio de la Clase B");
                                    cambio=leer.nextInt();
                                    System.out.println("esta seguro de realizar el cambio?");
                                    pregunta3=leer.next();
                                    if(pregunta3.equalsIgnoreCase("s")){
                                        clasB=cambio;
                                    }else{
                                        System.out.println("cancelando cambio... volviendo al menu principal");
                                    }
                                    confirmacion="n";
                                    break;
                                case 3:
                                    System.out.println("introduzca el nuevo precio de la Clase C");
                                    cambio=leer.nextInt();
                                    System.out.println("esta seguro de realizar el cambio?");
                                    pregunta3=leer.next();
                                    if(pregunta3.equalsIgnoreCase("s")){
                                        clasC=cambio;
                                    }else{
                                        System.out.println("cancelando cambio... volviendo al menu principal");
                                    }
                                    confirmacion="n";
                                    break;
                                case 4:
                                    System.out.println("volviendo al menu principal");
                                    confirmacion="n";
                                    break;
                            }
                            
                            break;
     
                        case 3:
                            totalD=totalD+totalV;
                            totalB=boletosP1+boletosP2;
                            System.out.println("-SALIENDO-");
                            System.out.println("el total de boletos de la venta es "+totalB);
                            System.out.println("el total de las ventas del dia de hoy "+totalD);
                            break;
                        default:
                    }
                }while(confirmacion.equalsIgnoreCase("n"));
                
            System.out.println("va a vender mas boletos [S/N]?");
            pregunta1=leer.next();             
            if (pregunta1.equalsIgnoreCase("n"));{
            confirmacion="s";   
            }

            }
            System.out.println("cerrando sistema... ;)");
        }else{
           System.out.println("intentos maximos superados"); 
        }
    } 
}