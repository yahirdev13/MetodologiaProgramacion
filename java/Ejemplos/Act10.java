package Ejemplos;
import java.util.Scanner;
public class Act10 {
  public static void main(String args[]){
      //Variables
      String sexo;
      int opc;
      char sexo1;
      Scanner leer=new Scanner (System.in);
        
      System.out.println("Indique la letra correspondiente a tu sexo:");
      System.out.println("a)Hombre  b)Mujer");
      sexo=leer.next();
      sexo1=sexo.charAt(0); 
      System.out.println("Ingresa un numero del 1 al 5");
      opc=leer.nextInt();
      
      switch(sexo1){
          case 'a':
          case 'A':
              switch (opc){
                  case 1:
                      System.out.println("Ganaste un desodorante");
                      break;
                  case 2:
                      System.out.println("Ganaste un SixPack de cerveza");
                      break;
                  case 3:
                      System.out.println("Ganaste un boxer");
                      break;
                  case 4:
                      System.out.println("Ganaste una rasuradora");
                      break;
                  case 5:
                      System.out.println("Ganaste una sudadera");
                      break;
                  default:
                      System.out.println("Opcion invalida");
              }
              break;
          case 'B':
          case 'b':
              switch (opc){
                  case 1:
                      System.out.println("Ganaste una loción");
                      break;
                  case 2:
                      System.out.println("Ganaste un bikini");
                      break;
                  case 3:
                      System.out.println("Ganaste una crema facial");
                      break;
                  case 4:
                      System.out.println("Ganaste una plancha");
                      break;
                  case 5:
                      System.out.println("Ganaste un braniz de uñas");
                      break;
                  default:
                      System.out.println("Opcion invalida");
              }
             break;
          default:
              System.out.println("Opcion invalida");
      }
  }  
}
