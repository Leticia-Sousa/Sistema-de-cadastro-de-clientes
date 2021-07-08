
package br.com.cadastrodeclientes.view;

import br.com.cadastrodeclientes.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitários.Utilitarios;


public class Tela extends javax.swing.JFrame {

    List<Cliente> lista = new ArrayList<>();
    
    public void listarTodos(){
        
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        
        for (Cliente cliente : lista){
            dados.addRow(new Object[]{
                cliente.getCodigo(),
                cliente.getNome(),
                cliente.getNascimento(),
                cliente.getEmail(),
                cliente.getRg(),
                cliente.getCpf(),
                cliente.getEndereco(),
                cliente.getNumero(),
                cliente.getCep(),
                cliente.getComplemento(),
                cliente.getBairro(),
                cliente.getCidade(),
                cliente.getUf(),
                cliente.getCelular(),
                cliente.getFixo()
            });
        }
    }
    
    public Tela() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Abas = new javax.swing.JTabbedPane();
        TelaInicial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNascimento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textRg = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        textCpf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textCep = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        textComplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textUf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textCelular = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        textFixo = new javax.swing.JFormattedTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        textPesquisar = new javax.swing.JTextField();
        botaoPesquisar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBackground(new java.awt.Color(0, 153, 153));

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Sistema de Clientes");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Titulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nome: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Data de nascimento: ");

        try {
            textNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("         ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("RG: ");

        try {
            textRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("         ##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("CPF: ");

        try {
            textCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("            ###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Endereço: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("N°:");

        textNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("CEP: ");

        try {
            textCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Complemento: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Bairro: ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Cidade:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("UF:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Celular:");

        try {
            textCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("       (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Fixo: ");

        try {
            textFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoSalvar.setText("SALVAR");
        botaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSalvarMouseClicked(evt);
            }
        });
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoEditar.setText("EDITAR");
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoEditarMouseClicked(evt);
            }
        });
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoNovo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoNovo.setText("NOVO");
        botaoNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoNovoMouseClicked(evt);
            }
        });
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaInicialLayout = new javax.swing.GroupLayout(TelaInicial);
        TelaInicial.setLayout(TelaInicialLayout);
        TelaInicialLayout.setHorizontalGroup(
            TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaInicialLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaInicialLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaInicialLayout.createSequentialGroup()
                        .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TelaInicialLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textNascimento))
                            .addGroup(TelaInicialLayout.createSequentialGroup()
                                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TelaInicialLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(textEmail)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5))
                                    .addGroup(TelaInicialLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 13, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TelaInicialLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textRg, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(textCep))))
                        .addGap(28, 28, 28))))
            .addGroup(TelaInicialLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaInicialLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14)
                        .addGap(27, 27, 27)
                        .addComponent(textCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(textFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaInicialLayout.createSequentialGroup()
                        .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaInicialLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaInicialLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaInicialLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelaInicialLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textUf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        TelaInicialLayout.setVerticalGroup(
            TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaInicialLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNome))
                .addGap(28, 28, 28)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCep, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaInicialLayout.createSequentialGroup()
                        .addComponent(textComplemento)
                        .addGap(32, 32, 32))
                    .addGroup(TelaInicialLayout.createSequentialGroup()
                        .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addGap(30, 30, 30)))
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFixo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(textCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(TelaInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        Abas.addTab("CADASTRO", TelaInicial);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Nome do cliente: ");

        botaoPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoPesquisar.setText("PESQUISAR");
        botaoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoPesquisarMouseClicked(evt);
            }
        });
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirMouseClicked(evt);
            }
        });
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓD.", "NOME", "NASC.", "EMAIL", "RG", "CPF", "ENDEREÇO", "N°", "CEP", "COMPLEM.", "BAIRRO", "CIDADE", "UF", "CELULAR", "FIXO"
            }
        ));
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(110);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(70);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(110);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(110);
            tabela.getColumnModel().getColumn(7).setPreferredWidth(35);
            tabela.getColumnModel().getColumn(9).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(10).setPreferredWidth(75);
            tabela.getColumnModel().getColumn(11).setPreferredWidth(75);
            tabela.getColumnModel().getColumn(12).setPreferredWidth(35);
            tabela.getColumnModel().getColumn(13).setPreferredWidth(90);
            tabela.getColumnModel().getColumn(14).setPreferredWidth(90);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(textPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        Abas.addTab("CONSULTA", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Abas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Abas))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
       
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseClicked
        //SALVAR
        Cliente cliente = new Cliente();
        
        cliente.setCodigo(Integer.parseInt(textCodigo.getText()));
        cliente.setNome(textNome.getText());
        cliente.setNascimento(textNascimento.getText());
        cliente.setEmail(textEmail.getText());
        cliente.setRg(textRg.getText());
        cliente.setCpf(textCpf.getText());
        cliente.setEndereco(textEndereco.getText());
        cliente.setNumero(Integer.parseInt(textNumero.getText()));
        cliente.setCep(textCep.getText());
        cliente.setComplemento(textComplemento.getText());
        cliente.setBairro(textBairro.getText());
        cliente.setCidade(textCidade.getText());
        cliente.setUf(textUf.getText());
        cliente.setCelular(textCelular.getText());
        cliente.setFixo(textFixo.getText());
        
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        
        lista.add(cliente);
        listarTodos();
    }//GEN-LAST:event_botaoSalvarMouseClicked

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMouseClicked
        //EDITAR
        Cliente clienteS = new Cliente();
        
        clienteS.setCodigo(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
        clienteS.setNome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        clienteS.setNascimento(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        clienteS.setEmail(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        clienteS.setRg(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        clienteS.setCpf(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        clienteS.setEndereco(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        clienteS.setNumero(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 7).toString()));
        clienteS.setCep(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
        clienteS.setComplemento(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
        clienteS.setBairro(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
        clienteS.setCidade(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
        clienteS.setUf(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());
        clienteS.setCelular(tabela.getValueAt(tabela.getSelectedRow(), 13).toString());
        clienteS.setFixo(tabela.getValueAt(tabela.getSelectedRow(), 14).toString());
        
        try{
             for(Cliente cliente : lista){
            
            if (cliente.getCodigo() == clienteS.getCodigo()){
                int posicao = lista.indexOf(cliente);
                
                Cliente clienteCadastrado = new Cliente();
                
                clienteCadastrado.setCodigo(Integer.parseInt(textCodigo.getText()));
                clienteCadastrado.setNome(textNome.getText());
                clienteCadastrado.setNascimento(textNascimento.getText());
                clienteCadastrado.setEmail(textEmail.getText());
                clienteCadastrado.setRg(textRg.getText());
                clienteCadastrado.setCpf(textCpf.getText());
                clienteCadastrado.setEndereco(textEndereco.getText());
                clienteCadastrado.setNumero(Integer.parseInt(textNumero.getText()));
                clienteCadastrado.setComplemento(textComplemento.getText());
                clienteCadastrado.setBairro(textBairro.getText());
                clienteCadastrado.setCidade(textCidade.getText());
                clienteCadastrado.setUf(textUf.getText());
                clienteCadastrado.setCelular(textCelular.getText());
                clienteCadastrado.setFixo(textFixo.getText());
                
                
                lista.set(posicao, clienteCadastrado);
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
                
            }
            listarTodos();
        } 
        } catch(Exception e){
            e.getMessage();
        }
     
    }//GEN-LAST:event_botaoEditarMouseClicked

    private void botaoExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirMouseClicked
        // EXCLUIR
        Cliente clienteS = new Cliente();
        
        clienteS.setCodigo(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
        clienteS.setNome(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        clienteS.setNascimento(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        clienteS.setEmail(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        clienteS.setRg(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        clienteS.setCpf(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        clienteS.setEndereco(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        clienteS.setNumero(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 7).toString()));
        clienteS.setCep(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
        clienteS.setComplemento(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
        clienteS.setBairro(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
        clienteS.setCidade(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
        clienteS.setUf(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());
        clienteS.setCelular(tabela.getValueAt(tabela.getSelectedRow(), 13).toString());
        clienteS.setFixo(tabela.getValueAt(tabela.getSelectedRow(), 14).toString());
        
        for(Cliente cliente : lista){
            
            if(cliente.getCodigo() == clienteS.getCodigo()){
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                lista.remove(cliente);
                listarTodos();
            }
        }
    }//GEN-LAST:event_botaoExcluirMouseClicked

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void botaoPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarMouseClicked
        // PESQUISAR DADOS DOS CLIENTES
        
        for (Cliente cliente : lista) {
            //compara
            if(cliente.getNome() == textPesquisar.getText().toString()) {
                int posicao = lista.indexOf(cliente);

                JOptionPane.showMessageDialog(null, cliente.getNome()); 
                                     
            }
        }    
    }//GEN-LAST:event_botaoPesquisarMouseClicked

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoNovoMouseClicked
        // NOVO
        
        new Utilitarios().limpaTela(TelaInicial);
    }//GEN-LAST:event_botaoNovoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abas;
    private javax.swing.JPanel Painel;
    private javax.swing.JPanel TelaInicial;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField textBairro;
    private javax.swing.JFormattedTextField textCelular;
    private javax.swing.JFormattedTextField textCep;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textComplemento;
    private javax.swing.JFormattedTextField textCpf;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JFormattedTextField textFixo;
    private javax.swing.JFormattedTextField textNascimento;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textPesquisar;
    private javax.swing.JFormattedTextField textRg;
    private javax.swing.JTextField textUf;
    // End of variables declaration//GEN-END:variables
}
