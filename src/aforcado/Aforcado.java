 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aforcado;

import java.util.Scanner;

/**
 *
 * @author a20marcosrf
 */
public class Aforcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduza a palabra secreta: ");
        Scanner teclado = new Scanner(System.in);
        String PalabraSecreta = teclado.next();
        //creamos un string auxiliar modificable no que gardaremos letras correctas
        StringBuilder AuxString = new StringBuilder(PalabraSecreta.length());
        //engadimos un asterisco a cada posicion do string modificable
        for (int i = 0; i < PalabraSecreta.length(); i++) {
            AuxString.append("*");
        }
        //creamos un array coas letras da palabra correcta (isto permite a comparacion posterior
        char[] secrectStrCharArr = PalabraSecreta.toCharArray();
        int charCnt = PalabraSecreta.length();
        while (charCnt > 0) {
            System.out.println("Palabra secreta :" + AuxString.toString());
            System.out.println("Adiviña unha letra :");
            //creamos un array coa letra do intento
            char letra = teclado.next().toCharArray()[0];
            //comparamos os items dos arrays para buscar coincidencias
            for (int i = 0; i < secrectStrCharArr.length; i++) {
                if (letra == secrectStrCharArr[i]) {
                    AuxString.setCharAt(i, letra);
                    charCnt--;
                }
            }
        }

    }
}
