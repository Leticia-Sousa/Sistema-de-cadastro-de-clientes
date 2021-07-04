
package principal;

import entidades.Cliente;
import java.util.Locale;
import java.util.Scanner;


public class SistemaDeCadastroDeClientes {

    
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Cliente c1 = new Cliente();
        
        System.out.println("Digite os dados do cliente");
        System.out.println("Digite o nome: ");
        c1.nome = sc.nextLine();
        System.out.println("Digite o endereco: ");
        c1.endereco = sc.nextLine();
        
    }
    
}
