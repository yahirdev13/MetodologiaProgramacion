package ejemplos;
import java.util.Scanner;
public class Act4 {
    public static void main(String args[]){ 
       int jub, edad,experiencia;
       
       Scanner leer = new Scanner (System.in);
       System.out.println("Indica el número de la opción por la que estas jubilada");
       System.out.println("1. Edad\n" );
       System.out.println("2. Antiguedad joven\n" );
       System.out.println("3. Antiguedad adulta\n" );
       jub=leer.nextInt();
       
       System.out.println("¿Qué edad tienes?" );
       edad=leer.nextInt();
       System.out.println("¿Cuántos años llevas trabajando con nosotros?" );
       experiencia=leer.nextInt();       
       if(jub==1){
           if(edad>=60 && experiencia<25){
                System.out.println("APLICAS PARA ESTE TIPO DE JUBILACIÓN" );
           }else{
                System.out.println("AÚN NO APLICAS" );
           }
       }
       else if(jub==2){
           if(edad<60 && experiencia>=25){
                System.out.println("APLICAS PARA ESTE TIPO DE JUBILACIÓN" );
           }else{
                System.out.println("AÚN NO APLICAS" );

           }}
       else if(jub==3){
           if(edad>=60 && experiencia>=25){
                System.out.println("APLICAS PARA ESTE TIPO DE JUBILACIÓN" );
           }else{
                System.out.println("AÚN NO APLICAS" );
            }
        }
    }
}