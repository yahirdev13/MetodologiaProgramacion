package Ejemplos;

import java.util.Scanner;
public class Act13 {
    public static void main (String args[]){
     
        //variables
        int votos=0,votos1=0,votos2=0,votos3=0,voto;
        double porcentaje1,porcentaje2,porcentaje3;
        String respuesta;
        //CONSTANTES
        final String OP1="Candidato 1",OP2="Candidato 2",OP3="Candidato 3";
        int TOTAL=100;
        
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Calculador de votos orizaba 2021");
        System.out.println("¿Va a votar? (si/no)");
        respuesta=leer.next();
        while (respuesta.equalsIgnoreCase("Si")){
            
            System.out.println("Ingrese 1 para votar por el candidato 1");
            System.out.println("Ingrese 2 para votar por el candidato 2");
            System.out.println("Ingrese 3 para votar por el candidato 3");
            voto=leer.nextInt();
            
            switch (voto){
                case 1:
                    votos1=votos1+1;
                    votos=votos+1;
                    break;
                case 2:
                    votos2=votos2+1;
                    votos=votos+1;
                    break;
                case 3:
                    votos3=votos3+1;
                    votos=votos+1;
                    break;
                default:
                    System.out.println("ese candidato no existe");
            }
            System.out.println("¿Va a votar? (si/no)");
            respuesta=leer.next();
        }
        
        if (votos1 > votos2) {
            if (votos1 > votos3) {
                porcentaje1=(votos1/votos*TOTAL);
                System.out.println("El ganador es el " + OP1 + " con el " + porcentaje1 + "% de los votos");                                             
            } else {
                porcentaje3=(votos3/votos*TOTAL);
                System.out.println("el mayor es el " + OP3+ " con el " + porcentaje3 + "% de los votos");     
            }
        }else if (votos2 > votos3) {
            porcentaje2=(votos2/votos*TOTAL);
            System.out.println("el mayor es el " + OP2 + " con el " + porcentaje2 + "% de los votos");
        }else{
            porcentaje3=(votos3/votos*TOTAL);
            System.out.println("el mayor es el " + OP3 + " con el " + porcentaje3 + "% de los votos");
        }
    }      
}
