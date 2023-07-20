package ejemplos;

import java.util.Scanner;
public class act1 {
    public static void main(String args[]){ 
       double num1, num2, res;
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingresa  el primer número: ");
                num1=leer.nextDouble();
       System.out.println("Ingresa  el segundo número: ");
                num2=leer.nextDouble();
    if(num1>num2){
        res=num1-num2;
        System.out.println("Los números se restaron");
    }else if(num2>num1){
        res=num2+num1;
        System.out.println("Los números se sumaron");
    }else{
        res=num1*num2;
        System.out.println("Los números se multiplicaron");
    }
       System.out.println(res);
    }
    
}