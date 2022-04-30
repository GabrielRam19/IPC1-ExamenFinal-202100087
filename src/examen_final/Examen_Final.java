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
        
        //Primer Problema
        
        if(eleccion==1){
        System.out.println("Ingrese un numero");
        Scanner b=new Scanner(System.in);
        int num1=b.nextInt();
        System.out.println("Ingrese un segundo numero");
        Scanner c=new Scanner(System.in);
        int num2=c.nextInt();
        if(num1>num2){System.out.println("El numero con mayor valor es: "+num1);}
        else{System.out.println("El numero con mayor valor es: "+num2);}
        }
        
        //Segundo problema
        
        if(eleccion==2){
            System.out.println("Ingrese un numero impar para generar la piramide");
            Scanner numero=new Scanner(System.in);
            int impar=numero.nextInt();
            if(impar%2==0){System.out.println("Error el numero es par, ingrese un numero impar");}
            else{
                System.out.println();
                 
        for(int espacios = impar-1,asteriscos=1; espacios>=0; espacios--, asteriscos += 2){
            for(int i=1;i<=espacios;i++){
                System.out.print(" ");
            }

            for(int j=1;j<=asteriscos;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
            
        //Tercer problema
            
        if(eleccion==3){
            System.out.println("¿Que cantidad de vacas hay disponibles? 8 o 10");
            Scanner vacas=new Scanner(System.in);
            int vakas=vacas.nextInt();
            if(vakas==8){
                var produ=new produccion[1];
                int peso[]={223,243,100,200,200,155,300,150};
                int producto[]={30,34,28,45,31,50,29,1};
                produ[0]=new produccion(8,1000,peso,producto);
                System.out.println("");
            }
            else if(vakas==10){}
            else{System.out.println("Error,la opcion solamente esta disponible para 8 y 10 vacas");}
        }
        
        //Salir del programa
        if(eleccion==4){System.exit(0);}
    }
    
    }}

class produccion{
    public int numVacas;
    public int pesoCami;
    public int pesoVacas[];
    public int produVacas[];

    public produccion(int numVacas, int pesoCami, int[] pesoVacas, int[] produVacas) {
        this.numVacas = numVacas;
        this.pesoCami = pesoCami;
        this.pesoVacas = pesoVacas;
        this.produVacas = produVacas;
    }
    
}
