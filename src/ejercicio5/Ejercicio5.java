/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author pokec
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String a = "\033[35m";
    String b = "\033[34m";
    String c = "\033[33m";
        
    System.out.println(c+"Hora       Domingo");
    System.out.printf("%s      %-8s\n",  a+"07.00", a+"Fisica II");
    System.out.printf("%s      %-8s\n",  b+"09.00", b+"Investigacion de Operaciones");
    System.out.printf("%s      %-8s\n",  a+"11.00", a+"Programacion II");
    System.out.printf("%s      %-8s\n",  b+"14.00", b+"Etica Profesional");
    System.out.printf("%s      %-8s\n",  a+"16.00", a+"Automatas y Lenguajes Formales");
    }
    
}
