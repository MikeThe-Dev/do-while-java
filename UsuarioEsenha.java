/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuarioesenha;
import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class UsuarioEsenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1998;
        int senhaInformada = 0;
        while (senhaInformada != senhaCorreta) {
            System.out.print("Digite a senha: ");
            senhaInformada = scanner.nextInt();
            if (senhaInformada != senhaCorreta) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Senha correta! Acesso concedido.");
    }
}