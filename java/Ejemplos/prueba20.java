package Ejemplos;
import java.util.Scanner;
public class prueba20 {
    public static void main(String args[ ]){
        //Variables
        double acumulador=0;
        double calif1, calif2, calif3, calif4, calif5, calif6, calif7, calif8, calif9, calif10;
        double promGrupo, prom1, prom2, prom3, prom4, prom5, prom6, prom7, prom8, prom9, prom10;
        Scanner leer=new Scanner(System.in);
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+ i +" del primer alumno");
            calif1=leer.nextDouble();
            acumulador=acumulador+calif1;
        }
        prom1=acumulador/7;
        System.out.println("Tu promedio es: "+prom1);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del segundo alumno");
            calif2=leer.nextDouble();
            acumulador=acumulador+calif2;
        }
        prom2=acumulador/7;
        System.out.println("Tu promedio es: "+prom2);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del tercer alumno");
            calif3=leer.nextDouble();
            acumulador=acumulador+calif3;
        }
        prom3=acumulador/7;
        System.out.println("Tu promedio es: "+prom3);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del cuarto alumno");
            calif4=leer.nextDouble();
            acumulador=acumulador+calif4;
        }
        prom4=acumulador/7;
        System.out.println("Tu promedio es: "+prom4);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del quinto alumno");
            calif5=leer.nextDouble();
            acumulador=acumulador+calif5;
        }
        prom5=acumulador/7;
        System.out.println("Tu promedio es: "+prom5);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del sexto alumno");
            calif6=leer.nextDouble();
            acumulador=acumulador+calif6;
        }
        prom6=acumulador/7;
        System.out.println("Tu promedio es: "+prom6);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del septimo alumno");
            calif7=leer.nextDouble();
            acumulador=acumulador+calif7;
        }
        prom7=acumulador/7;
        System.out.println("Tu promedio es: "+prom7);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del octavo alumno");
            calif8=leer.nextDouble();
            acumulador=acumulador+calif8;
        }
        prom8=acumulador/7;
        System.out.println("Tu promedio es: "+prom8);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del noveno alumno");
            calif9=leer.nextDouble();
            acumulador=acumulador+calif9;
        }
        prom9=acumulador/7;
        System.out.println("Tu promedio es: "+prom9);
        acumulador=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("ingresa la calificación "+i+" del decimo alumno");
            calif10=leer.nextDouble();
            acumulador=acumulador+calif10;
        }
        prom10=acumulador/7;
        System.out.println("Tu promedio es: "+prom10);
        promGrupo=(prom1+prom2+prom3+prom4+prom5+prom6+prom7+prom8+prom9+prom10)/10;
        System.out.println("El promedio del grupo es: "+promGrupo);
        
        
           
    }
    
}