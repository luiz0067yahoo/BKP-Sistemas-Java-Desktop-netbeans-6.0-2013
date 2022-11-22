
import Dao.ProdutoDao;
import Until.conexao;
import bean.ProdutoBean;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.application.Action;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadastroCliente.java
 *
 * Created on 15/07/2010, 18:12:00
 */

/**
 *
 * @author Particular
 */
public class CadastroProduto extends javax.swing.JFrame {

    /** Creates new form CadastroCliente */
    public CadastroProduto() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        Painel_Formulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Campo_Texto_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Campo_Texto_Nome = new javax.swing.JTextField();
        Campo_Texto_Descricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Campo_Texto_Valor = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        Painel_Botoes = new javax.swing.JPanel();
        Botao_Inserir = new javax.swing.JButton();
        Botao_Alterar = new javax.swing.JButton();
        Botao_Excluir = new javax.swing.JButton();
        Botao_Buscar = new javax.swing.JButton();
        Painel_Tabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Consulta = new javax.swing.JTable();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(sistemas.SistemasApp.class).getContext().getResourceMap(CadastroProduto.class);
        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setName("jTextField4"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 350));
        setName("Form"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Painel_Formulario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, resourceMap.getColor("Painel_Formulario.border.matteColor"))); // NOI18N
        Painel_Formulario.setName("Painel_Formulario"); // NOI18N
        Painel_Formulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        Painel_Formulario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 15, -1, -1));

        Campo_Texto_Codigo.setText(resourceMap.getString("Campo_Texto_Codigo.text")); // NOI18N
        Campo_Texto_Codigo.setName("Campo_Texto_Codigo"); // NOI18N
        Painel_Formulario.add(Campo_Texto_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 12, 63, -1));

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        Painel_Formulario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 50, -1, -1));

        Campo_Texto_Nome.setText(resourceMap.getString("Campo_Texto_Nome.text")); // NOI18N
        Campo_Texto_Nome.setName("Campo_Texto_Nome"); // NOI18N
        Painel_Formulario.add(Campo_Texto_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 50, 210, -1));

        Campo_Texto_Descricao.setName("Campo_Texto_Descricao"); // NOI18N
        Painel_Formulario.add(Campo_Texto_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 76, 210, -1));

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        Painel_Formulario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 79, -1, -1));

        Campo_Texto_Valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        Campo_Texto_Valor.setText(resourceMap.getString("Campo_Texto_Valor.text")); // NOI18N
        Campo_Texto_Valor.setName("Campo_Texto_Valor"); // NOI18N
        Painel_Formulario.add(Campo_Texto_Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 102, 210, -1));

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        Painel_Formulario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 105, -1, -1));

        getContentPane().add(Painel_Formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 150));

        Painel_Botoes.setBorder(javax.swing.BorderFactory.createEtchedBorder(resourceMap.getColor("Painel_Botoes.border.highlightColor"), resourceMap.getColor("Painel_Botoes.border.shadowColor"))); // NOI18N
        Painel_Botoes.setName("Painel_Botoes"); // NOI18N

        Botao_Inserir.setText(resourceMap.getString("Botao_Inserir.text")); // NOI18N
        Botao_Inserir.setName("Botao_Inserir"); // NOI18N
        Botao_Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acao_Inserir(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(sistemas.SistemasApp.class).getContext().getActionMap(CadastroProduto.class, this);
        Botao_Alterar.setAction(actionMap.get("Acao_Alterar")); // NOI18N
        Botao_Alterar.setText(resourceMap.getString("Botao_Alterar.text")); // NOI18N
        Botao_Alterar.setName("Botao_Alterar"); // NOI18N

        Botao_Excluir.setAction(actionMap.get("Acao_Excluir")); // NOI18N
        Botao_Excluir.setText(resourceMap.getString("Botao_Excluir.text")); // NOI18N
        Botao_Excluir.setName("Botao_Excluir"); // NOI18N

        Botao_Buscar.setAction(actionMap.get("Acao_Buscar")); // NOI18N
        Botao_Buscar.setText(resourceMap.getString("Botao_Buscar.text")); // NOI18N
        Botao_Buscar.setName("Botao_Buscar"); // NOI18N

        javax.swing.GroupLayout Painel_BotoesLayout = new javax.swing.GroupLayout(Painel_Botoes);
        Painel_Botoes.setLayout(Painel_BotoesLayout);
        Painel_BotoesLayout.setHorizontalGroup(
            Painel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BotoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Botao_Inserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botao_Alterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botao_Excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botao_Buscar)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        Painel_BotoesLayout.setVerticalGroup(
            Painel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_Alterar)
                    .addComponent(Botao_Inserir)
                    .addComponent(Botao_Excluir)
                    .addComponent(Botao_Buscar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(Painel_Botoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 350, 50));

        Painel_Tabela.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, resourceMap.getColor("Painel_Tabela.border.matteColor"))); // NOI18N
        Painel_Tabela.setName("Painel_Tabela"); // NOI18N
        Painel_Tabela.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        Tabela_Consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Descrição", "Valor"
            }
        ));
        Tabela_Consulta.setName("Tabela_Consulta"); // NOI18N
        jScrollPane1.setViewportView(Tabela_Consulta);

        Painel_Tabela.add(jScrollPane1);

        getContentPane().add(Painel_Tabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 350, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Acao_Inserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acao_Inserir

        conexao con = new conexao ("MySql","localhost", "3306","banco", "root","root" );
        ProdutoBean produtoB = new ProdutoBean();
        
        try {
            produtoB.setNome(Campo_Texto_Nome.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            produtoB.setDescricao(Campo_Texto_Descricao.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            produtoB.setValor(Campo_Texto_Valor.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        ProdutoDao produtoD = new ProdutoDao(con);
        try {
            produtoD.inserir(produtoB);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        JOptionPane.showMessageDialog(null, "OI");
    }//GEN-LAST:event_Acao_Inserir

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }


    public void Acao_Alterar() {
        conexao con = new conexao ("MySql","localhost", "3306","banco", "root","root" );
        ProdutoBean produtoB = new ProdutoBean();
        try {
            produtoB.setCodigo(Campo_Texto_Codigo.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        try {
            produtoB.setNome(Campo_Texto_Nome.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            produtoB.setDescricao(Campo_Texto_Descricao.getText());
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            produtoB.setValor(Campo_Texto_Valor.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        ProdutoDao produtoD = new ProdutoDao(con);
        try {
            produtoD.alterar(produtoB);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        JOptionPane.showMessageDialog(null, "OI");



    }

    @Action
    public void Acao_Excluir() {
        conexao con = new conexao ("MySql","localhost", "3306","banco", "root","root" );
        ProdutoBean produtoB = new ProdutoBean();
        try {
            produtoB.setCodigo(Campo_Texto_Codigo.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            ProdutoDao produtoD = new ProdutoDao(con);
        try {
            produtoD.excluir(produtoB);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        JOptionPane.showMessageDialog(null, "OI");



    }

    @Action
    public void Acao_Buscar() {
        conexao con = new conexao ("MySql","localhost", "3306","banco", "root","root" );
        ProdutoBean produtoB = new ProdutoBean();
        try {
            if ((Campo_Texto_Codigo.getText()!= null)&&(Campo_Texto_Codigo.getText().length()!= 0))
                produtoB.setCodigo(Campo_Texto_Codigo.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        try {
            if ((Campo_Texto_Nome.getText()!= null)&&(Campo_Texto_Nome.getText().length()!= 0))
                produtoB.setNome(Campo_Texto_Nome.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            if ((Campo_Texto_Descricao.getText()!= null)&&(Campo_Texto_Descricao.getText().length()!= 0))
                produtoB.setDescricao(Campo_Texto_Descricao.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            if ((Campo_Texto_Valor.getText()!= null)&&(Campo_Texto_Valor.getText().length()!= 0))
                produtoB.setValor(Campo_Texto_Valor.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        ProdutoDao produtoD = new ProdutoDao(con);

        try {
            
            ArrayList<ProdutoBean> listaProdutos = new ArrayList(produtoD.buscar());
            //arraylist é uma lista de produtos bean com nome de lista produtos
            //listaprodutos sera criada com o resultado da busca de produtoD.
            DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new Object[]{"Código", "Nome", "Descrição", "Valor"});
            //cria um novo modelo de tabela para atualizar os dados
            JOptionPane.showMessageDialog(null, "OI");
            for (int contador = 0; contador < listaProdutos.size()-1; contador++) {//laço repetiçao que vai preencher o modelo
                //com os dados da lista de produtos
                model.addRow(new String[]{
                    listaProdutos.get(contador).getCodigo()+"",//aspas duplas somadas com qualquer tipo de dado converte automaticamente para string
                    listaProdutos.get(contador).getNome(),
                    listaProdutos.get(contador).getDescricao(),
                    listaProdutos.get(contador).getValor()+""
                    }
                );
            }

            /* Depois é só setar nosso model na tabela...*/
            //Tabela_Consulta.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


        



    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Alterar;
    private javax.swing.JButton Botao_Buscar;
    private javax.swing.JButton Botao_Excluir;
    private javax.swing.JButton Botao_Inserir;
    private javax.swing.JTextField Campo_Texto_Codigo;
    private javax.swing.JTextField Campo_Texto_Descricao;
    private javax.swing.JTextField Campo_Texto_Nome;
    private javax.swing.JFormattedTextField Campo_Texto_Valor;
    private javax.swing.JPanel Painel_Botoes;
    private javax.swing.JPanel Painel_Formulario;
    private javax.swing.JPanel Painel_Tabela;
    private javax.swing.JTable Tabela_Consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
