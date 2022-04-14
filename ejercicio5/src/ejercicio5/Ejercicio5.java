/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author emil
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int asciiValue = 97;
        //char convertedChar = (char)asciiValue;
        System.out.println(convertedChar);
       */
       
       Scanner scan = new Scanner(System.in);
       int numero = scan.nextInt();
       
       char assi = (char) numero;
       System.out.println("el caracter es " + assi);
    }
    
}
