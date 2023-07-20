package Ejemplos;

import java.util.Scanner;
public class act6{
    public static void main(String args[]){
        int unidades;
        double IVA=.16,DESCUENTO1=.05,DESCUENTO2=.10,DESCUENTO3=.20,DESCUENTO4=.25;
        double precioArt,precioBruto,pagar;
       
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de articulos");
        unidades=leer.nextInt();
        
        System.out.println("Ingrese el precio de los articulos");
        precioArt=leer.nextDouble();
        
        precioBruto=((unidades*precioArt)*IVA)+(unidades*precioArt);
        
        if (precioBruto<40000){
            pagar=precioBruto;
            System.out.println("El precio a pagar es de $"+pagar);
        }else if(precioBruto<=50000 && precioBruto>40000){
            pagar=precioBruto-(precioBruto*DESCUENTO1);
            System.out.println("El costo a pagar es de $"+pagar);
        }else if (precioBruto<=70000 && precioBruto>50000){
            pagar=precioBruto-(precioBruto*DESCUENTO2);
            System.out.println("El costo a pagar es de $"+pagar);
        }else if (precioBruto <=100000 && precioBruto>70000){
            pagar=precioBruto-(precioBruto*DESCUENTO3);
            System.out.println("El costo a pagar es de $"+pagar);
        }else if (precioBruto>100000){
            pagar=precioBruto-(precioBruto*DESCUENTO4);
            System.out.println("El costo a pagar es de $"+pagar);
        }
    }
}
