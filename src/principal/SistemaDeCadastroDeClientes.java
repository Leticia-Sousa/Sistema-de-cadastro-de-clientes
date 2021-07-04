
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
        System.out.println("Digite o codigo: ");
        c1.codigo = sc.nextInt();
        System.out.println("Digite o nome: ");
        sc.nextLine();
        c1.nome = sc.nextLine();
        System.out.println("Digite o endereco: ");
        c1.endereco = sc.nextLine();
        System.out.println("Digite o numero: ");
        c1.numero = sc.nextInt();
        System.out.println("Digite o complemento: ");
        sc.nextLine();
        c1.complemento = sc.nextLine();
        System.out.println("Digite o celular: ");
        c1.celular = sc.next();
        System.out.println("Digite o fixo: ");
        c1.fixo = sc.next();
        System.out.println("Digite o rg: ");
        sc.nextLine();
        c1.rg = sc.nextLine();
        System.out.println("Digite o cpf: ");
        c1.cpf = sc.nextLine();
    }
    
}
