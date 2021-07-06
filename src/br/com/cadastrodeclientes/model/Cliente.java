
package br.com.cadastrodeclientes.model;


public class Cliente {
    
    private int codigo;
    private String nome;
    private String endereco;
    private String nascimento;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;
    private String email;
    private int ddd;
    private String celular;
    private String fixo;
    private String rg;
    private String cpf; 
    
    //construtor
     public Cliente() {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
        this.ddd = ddd;
        this.celular = celular;
        this.fixo = fixo;
        this.rg = rg;
        this.cpf = cpf;
    }
        

    public Cliente(int codigo, String nome, String endereco, String nascimento, int numero, String complemento, String cep, String bairro, String cidade, String uf, String email, String celular, String fixo, String rg, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
        this.ddd = ddd;
        this.celular = celular;
        this.fixo = fixo;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    //encapsulamento

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
