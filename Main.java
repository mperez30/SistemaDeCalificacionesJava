import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
       * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A

Si está entre 8 y menor a 9: imprimir una B

Si está entre 7 y menor a 8: imprimir una C

Si está entre 6 y menor a 7: imprimir una D

Si está entre 0 y menor a 6: imprimir una F

cualquier otro valor debe imprimir: Valor desconocido

Por ejemplo:

Proporciona un valor entre 0 y 10:
A
* */

        int vinput = 0;
        String Nota;
        Scanner a = new Scanner(System.in);
        System.out.println("INTRODUZCA VALOR NUMERICO DEL 0 AL 10 PARA SABER LA NOTA");



        vinput = a.nextInt();


        if(vinput == 9 ||  vinput ==  10 ){
            System.out.println("LA NOTA ES: A");
        }  else
            if(vinput == 8 ||  vinput ==  9 ) {
                System.out.println("LA NOTA ES: B");
        }  else
            if(vinput == 7 ||  vinput ==  8 ) {
                System.out.println("LA NOTA ES: C");
            }  else
            if(vinput == 6 ||  vinput ==  7) {
                System.out.println("LA NOTA ES: D");
            }  else
            if(vinput == 0 ||  vinput ==  6) {
                System.out.println("LA NOTA ES: F");
            } else {
                System.out.println("VALOR DESCONOCIDO");
            }
    }
}