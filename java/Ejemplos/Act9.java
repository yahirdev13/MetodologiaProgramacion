package Ejemplos;

import java.util.Scanner;
public class Act9 {
     public static void main(String args[]){
         
        //variables
        int semestreCursado,carrerasImp;

        Scanner leer=new Scanner (System.in);
         
        System.out.println("Elige la carrera del estudiante");
        System.out.println("1) Desarrollo de Software");
        System.out.println("2) Animacion");
        System.out.println("3) Infraestructura de redes");
        System.out.println("4) Manufactura");
        carrerasImp=leer.nextInt();
        
        switch (carrerasImp){
            case 1:
                System.out.println("Elige el semestre del alumno");
                System.out.println("1. Primer Semestre");
                System.out.println("2. Segundo Semestre");
                System.out.println("3. Tercer Semestre");
                System.out.println("4. Cuarto Semestre");
                System.out.println("5. Quinto Semestre");
                System.out.println("6. Sexto Semestre");
                semestreCursado=leer.nextInt();
                switch (semestreCursado){
                    case 1:
                        System.out.println("El alumno cursa la carrera Desarrollo de software en el 1 semestre");
                        break;
                    case 2:
                        System.out.println("El alumno cursa la carrera Desarrollo de software en el 2 semestre");
                        break;
                    case 3:
                        System.out.println("El alumno cursa la carrera Desarrollo de software en el 3 semestre");
                        break;
                    case 4:
                        System.out.println("El alumno cursa la carrera Desarrollo de software en el 4 semestre");
                        break;
                    case 5:
                        System.out.println("El alumno cursa la carrera Desarrollo de software en el 5 semestre");
                        break;
                    case 6:
                        System.out.println("El alumno cursa la carrera Desarrollo de software en el 6 semestre");
                        break;
                    default:
                        System.out.println("Semestre no valido");  
                }
                break;
            case 2:
                System.out.println("Elige el semestre del alumno");
                System.out.println("1. Primer Semestre");
                System.out.println("2. Segundo Semestre");
                System.out.println("3. Tercer Semestre");
                System.out.println("4. Cuarto Semestre");
                System.out.println("5. Quinto Semestre");
                System.out.println("6. Sexto Semestre");
                semestreCursado=leer.nextInt();
                switch (semestreCursado){
                    case 1:
                        System.out.println("El alumno cursa la carrera de Animacion en el 1 semestre");
                        break;
                    case 2:
                        System.out.println("El alumno cursa la carrera de Animacion en el 2 semestre");
                        break;
                    case 3:
                        System.out.println("El alumno cursa la carrera de Animacion en el 3 semestre");
                        break;
                    case 4:
                        System.out.println("El alumno cursa la carrera de Animacion en el 4 semestre");
                        break;
                    case 5:
                        System.out.println("El alumno cursa la carrera de Animacion en el 5 semestre");
                        break;
                    case 6:
                        System.out.println("El alumno cursa la carrera de Animacion en el 6 semestre");
                        break;
                    default:
                        System.out.println("Semestre no valido");  
                }
                break;
            case 3:
                System.out.println("Elige el semestre del alumno");
                System.out.println("1. Primer Semestre");
                System.out.println("2. Segundo Semestre");
                System.out.println("3. Tercer Semestre");
                System.out.println("4. Cuarto Semestre");
                System.out.println("5. Quinto Semestre");
                System.out.println("6. Sexto Semestre");
                semestreCursado=leer.nextInt();
                switch (semestreCursado){
                    case 1:
                        System.out.println("El alumno cursa la carrera Infraestructura de redes en el 1 semestre");
                        break;
                    case 2:
                        System.out.println("El alumno cursa la carrera Infraestructura de redes en el 2 semestre");
                        break;
                    case 3:
                        System.out.println("El alumno cursa la carrera Infraestructura de redes en el 3 semestre");
                        break;
                    case 4:
                        System.out.println("El alumno cursa la carrera Infraestructura de redes en el 4 semestre");
                        break;
                    case 5:
                        System.out.println("El alumno cursa la carrera Infraestructura de redes en el 5 semestre");
                        break;
                    case 6:
                        System.out.println("El alumno cursa la carrera Infraestructura de redes en el 6 semestre");
                        break;
                    default:
                        System.out.println("Semestre no valido");  
                }
                break;
            case 4:
                System.out.println("Elige el semestre del alumno");
                System.out.println("1. Primer Semestre");
                System.out.println("2. Segundo Semestre");
                System.out.println("3. Tercer Semestre");
                System.out.println("4. Cuarto Semestre");
                System.out.println("5. Quinto Semestre");
                System.out.println("6. Sexto Semestre");
                semestreCursado=leer.nextInt();
                switch (semestreCursado){
                    case 1:
                        System.out.println("El alumno cursa la carrera de Manufactura en el 1 semestre");
                        break;
                    case 2:
                        System.out.println("El alumno cursa la carrera de Manufactura en el 2 semestre");
                        break;
                    case 3:
                        System.out.println("El alumno cursa la carrera de Manufactura en el 3 semestre");
                        break;
                    case 4:
                        System.out.println("El alumno cursa la carrera de Manufactura en el 4 semestre");
                        break;
                    case 5:
                        System.out.println("El alumno cursa la carrera de Manufactura en el 5 semestre");
                        break;
                    case 6:
                        System.out.println("El alumno cursa la carrera de Manufactura en el 6 semestre");
                        break;
                    default:
                        System.out.println("Semestre no valido");  
                }
                break;
            default:
               System.out.println("Carrera no valida");         
        } 
    }
}
