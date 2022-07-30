package calculadora;

import java.util.Scanner;

public class OperacionesCalculadora {
    Scanner escaner = new Scanner(System.in);
    int num1,num2,suma,resta,multiplicacion,division;

    public void suma(){
        suma=num1+num2;
        System.out.println("El resultado de la suma es: "+suma);
    }

    public void resta(){
        resta=num1-num2;
        System.out.println("El resultado de la resta es: "+resta);
    }

    public void multiplicacion(){
        multiplicacion=num1*num2;
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);
    }

    public void division(){
        division=num1/num2;
        System.out.println("El resultado de la division es "+division);
    }

    public void datos(){
        System.out.println("Ingresa el primer numero");
        num1 = escaner.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = escaner.nextInt();
    }

}
