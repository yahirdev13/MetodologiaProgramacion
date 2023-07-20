package Ejemplos;

import java.util.Scanner;
public class Act8 {
    public static void main(String args[]){
        //variables
        int semestreCursado;

        Scanner leer=new Scanner (System.in);
         
        System.out.println("Elige el semestre que el alumno esta cursando");
        System.out.println("1. Primer Semestre");
        System.out.println("2. Segundo Semestre");
        System.out.println("3. Tercer Semestre");
        System.out.println("4. Cuarto Semestre");
        System.out.println("5. Quinto Semestre");
        System.out.println("6. Sexto Semestre");
        semestreCursado=leer.nextInt();
        
        switch (semestreCursado){
            case 1:
                System.out.println("El alumno esta cursando el primer semestre");
                break;
            case 2:
                System.out.println("El alumno esta cursando el segundo semestre");
                break;
            case 3:
                System.out.println("El alumno esta cursando el tercer semestre");
                break;
            case 4:
                System.out.println("El alumno esta cursando el cuarto semestre");
                break;
            case 5:
                System.out.println("El alumno esta cursando el quinto semestre");
                break;
            case 6:
                System.out.println("El alumno esta cursando el sexto semestre");
                break;
            default:
                System.out.println("Semestre no valido");   
        }
    }
}