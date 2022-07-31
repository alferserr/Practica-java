package PracticasRandom;
import java.util.Scanner;
public class ParesImpares {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        Operaciones op= new Operaciones();
        System.out.println("Introduce el numero al que quieres llegar");
        int num = escaner.nextInt();

        System.out.println("Que operacion quieres hacer?");
        System.out.println("1) Sumar numeros pares");
        System.out.println("2) Sumar numeros impares");
        int resul=escaner.nextInt();

        switch (resul){
            case 1:
                op.sumaPar();
                break;
            case 2:
                op.sumaImpar();
                break;
            case 3:
                System.exit(0);
        }
    }
    }

