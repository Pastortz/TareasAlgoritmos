/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monto, descuento = 0, total;

        System.out.print("Ingrese el monto de la compra: Q");
        monto = input.nextDouble();

        if (monto < 500) {
            descuento = 0;
        } else if (monto <= 1000) {
            descuento = monto * 0.05;
        } else if (monto <= 7000) {
            descuento = monto * 0.11;
        } else if (monto <= 15000) {
            descuento = monto * 0.18;
        } else {
            descuento = monto * 0.25;
        }

        total = monto - descuento;

        System.out.println("Descuento aplicado: Q" + descuento);
        System.out.println("Total a pagar: Q" + total);
    }
    //Mi primer commit desde el laboratorio virtual
    //Hola inge   😒
    }
      
   

