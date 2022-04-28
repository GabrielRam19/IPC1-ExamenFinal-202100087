/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_final;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Examen_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("1.Primer problema\n"
                + "2.Segundo Problema\n"
                + "3.Tercer problema\n"
                + "4.Salir");
        Scanner a=new Scanner(System.in);
        int eleccion=a.nextInt();
        if(eleccion==4){System.exit(0);}
    }
    
}
