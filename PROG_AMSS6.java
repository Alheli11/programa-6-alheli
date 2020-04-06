/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_amss6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sale7
 */
public class PROG_AMSS6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);

        int arreglo[], y, aux;



        y = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero del arreglo"));



        arreglo = new int[y]; //Le asignamos el numero de elementos al arreglo



        for (int i = 0; i < y; i++) {

            System.out.print((i + 1) + ".Introduzca un numero ");

            arreglo[i] = entrada.nextInt();

        }

        //Metodo burbuja 

        for (int i = 0; i < (y - 1); i++) {

            for (int h = 0; h < (y - 1); h++) {

                if (arreglo[h] > arreglo[h + 1]) {

                    aux = arreglo[h];

                    arreglo[h] = arreglo[h + 1];

                    arreglo[h + 1] = aux;

                }

            }

        }

        //Mostando el arreglo ordenado

        System.out.print("\nArreglo ordenado menor a mayor: ");

        for (int i = 0; i < y; i++) {

            System.out.print(arreglo[i] + " - ");

        }

        System.out.print("\nArreglo ordenado de mayor a menor: ");

        for (int i = (y - 1); i >= 0; i--) {

            System.out.print(arreglo[i] + " - ");

        }

        System.out.println("");

    }



}
    
