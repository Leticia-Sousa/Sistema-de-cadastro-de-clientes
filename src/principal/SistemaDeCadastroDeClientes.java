
package principal;

import entidades.Cliente;
import java.util.Locale;
import java.util.Scanner;


public class SistemaDeCadastroDeClientes {

    
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Cliente c1 = new Cliente();
        
        System.out.println("DIGITE OS DADOS DO CLIENTE");
        System.out.println("Digite o codigo: ");
        c1.codigo = sc.nextInt();
        System.out.println("Digite o nome: ");
        sc.nextLine();
        c1.nome = sc.nextLine();
        System.out.println("Digite o data de nascimento: ");
        c1.nascimento = sc.nextLine();
        System.out.println("Digite o endereco: ");
        c1.endereco = sc.nextLine();
        System.out.println("Digite o numero da residência: ");
        c1.numero = sc.nextInt();
        System.out.println("Digite o complemento: ");
        sc.nextLine();
        c1.complemento = sc.nextLine();
        System.out.println("Digite o cep: ");
        c1.cep = sc.nextLine();
        System.out.println("Digite o bairro: ");
        c1.bairro = sc.nextLine();
        System.out.println("Digite a cidade: ");
        c1.cidade = sc.nextLine();
        System.out.println("Digite o uf: ");
        c1.uf = sc.next();
        System.out.println("Digite o email: ");
        sc.nextLine();
        c1.email = sc.nextLine();
        System.out.println("Digite o celular: ");
        c1.celular = sc.next();
        System.out.println("Digite o fixo: ");
        sc.nextLine();
        c1.fixo = sc.next();
        System.out.println("Digite o rg: ");
        sc.nextLine();
        c1.rg = sc.nextLine();
        System.out.println("Digite o cpf: ");
        c1.cpf = sc.nextLine();
        
        System.out.println(c1.toString());
    }
    
}
