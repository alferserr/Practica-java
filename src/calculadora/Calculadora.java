package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner escaner=new Scanner(System.in);
        OperacionesCalculadora oc = new OperacionesCalculadora();

        System.out.println("Que operacion quieres hacer? (Introduce abajo el numero segun el tipo de operacion que quieras hacer)");
        System.out.println("1) Suma");
        System.out.println("2) resta");
        System.out.println("3) multiplicacion");
        System.out.println("4) division");

        int resul = escaner.nextInt();

        switch (resul){
            case 1:
                oc.datos();
                oc.suma();
                break;
            case 2:
                oc.datos();
                oc.resta();
                break;
            case 3:
                oc.datos();
                oc.multiplicacion();
                break;
            case 4:
                oc.datos();
                oc.division();
                break;
            case 5:
                System.exit(0);

        }

    }




}
