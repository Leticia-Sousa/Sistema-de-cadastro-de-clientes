
package entidades;


public class Cliente {
    
    public int codigo;
    public String nome;
    public String endereco;
    public String nascimento;
    public int numero;
    public String complemento;
    public String cep;
    public String bairro;
    public String cidade;
    public String uf;
    public String email;
    public String celular;
    public String fixo;
    public String rg;
    public String cpf;

    @Override
    public String toString() {
        return "Cliente{" + "Codigo =" + codigo + ", Nome =" + nome + ", Endereco =" + endereco + ", Nascimento =" + nascimento + ", Numero =" + numero + ", Complemento =" + complemento + ", Cep =" + cep + ", Bairro =" + bairro + ", Cidade =" + cidade + ", Uf =" + uf + ", Email =" + email + ", Celular =" + celular + ", Fixo =" + fixo + ", Rg =" + rg + ", Cpf =" + cpf + '}';
    }
    
    
    
}
