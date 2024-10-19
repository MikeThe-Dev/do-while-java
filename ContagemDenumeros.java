/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contagemdenumeros;
import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class ContagemDenumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Digite números inteiros (digite 0 para sair):");

        while (true) {
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            contador++;
        }

        System.out.println("Você inseriu " + contador + " números.");
    }
}