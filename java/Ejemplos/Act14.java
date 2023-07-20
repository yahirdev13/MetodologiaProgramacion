package Ejemplos;

import java.util.Scanner;
public class Act14 {
    public static void main (String args[]){
        
        //variables
        int opc;
        double area,base,altura,lado,radio;
        //CONSTANTES
        double PI=3.1416;
        
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Calculador de figuras geometricas");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Circulo");
        System.out.println("4. Salir del sistema");
        opc=leer.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("Ingrese la base");
                base=leer.nextDouble();
                System.out.println("Ingrese la altura");
                altura=leer.nextDouble();
                area=(base*altura)/2;
                System.out.println("El area del triangulo es: "+area);
                break;
            case 2:
                System.out.println("Ingrese el valor de su lado");
                lado=leer.nextDouble();
                area=lado*lado;
                System.out.println("El area del cuadrado es: "+area);
                break;
            case 3:
                System.out.println("Ingrese el radio del circulo");
                radio=leer.nextDouble();
                area= PI*(radio*radio);
                System.out.println("El area del circulo es: "+area);
                break;
            case 4:
                break;
            default:   
                System.out.println("Opcion no valida, intente de nuevo");
        }   
    }
}
