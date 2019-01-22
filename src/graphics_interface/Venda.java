/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics_interface;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.ClienteDAO;
import model.dao.PagamentoDAO;
import model.dao.ProdutoDAO;
import model.dao.VendaDAO;
import model.vo.Cliente;
import model.vo.Pagamento;
import model.vo.Produto;

/**
 *
 * @author Gabriel
 */
public class Venda extends javax.swing.JPanel {

    /**
     * Creates new form Venda
     */
    public Venda() {
        initComponents();
        atualizarTabela();
    }

    public void atualizarTabela() {
        DefaultTableModel modeloCliente = (DefaultTableModel) jTable1.getModel();

        while (modeloCliente.getRowCount() > 0) {
            modeloCliente.removeRow(0);
        }
        List<Cliente> listaDeClientes = null;
        ClienteDAO daoCliente = new ClienteDAO();
        try {
            listaDeClientes = daoCliente.findClientes();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteList.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Cliente cliente : listaDeClientes) {
            modeloCliente.addRow(new String[]{cliente.getId() + "", cliente.getNome()});
        }

        DefaultTableModel modeloProduto = (DefaultTableModel) jTable2.getModel();
        while (modeloProduto.getRowCount() > 0) {
            modeloProduto.removeRow(0);
        }
        List<Produto> listaDeProdutos = null;
        ProdutoDAO daoProduto = new ProdutoDAO();
        try {
            listaDeProdutos = daoProduto.findProdutos();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteList.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Produto produto : listaDeProdutos) {
            modeloProduto.addRow(new String[]{produto.getId() + "", produto.getTipo(), produto.getMarca(), produto.getModelo(), produto.getMaterial(), produto.getCor(), produto.getTamanho(), produto.getQuantidade() + "", produto.getPreco() + ""});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoSelecionarProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botaoSalvar = new javax.swing.JButton();
        botaoSelecionarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TipoDePagamentoComboBox = new javax.swing.JComboBox<>();
        QuantidadeComboBox = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botaoSelecionarProduto.setText("Selecionar Produto");
        botaoSelecionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarProdutoActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Marca", "Modelo", "Material", "Cor", "Tamanho", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        botaoSalvar.setText("Finalizar Venda");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoSelecionarCliente.setText("Selecionar Cliente");
        botaoSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Produtos");

        TipoDePagamentoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À vista", "À prazo" }));

        QuantidadeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "47", "48", "49", "50", "60", "70", "80", "90", "100" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(QuantidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TipoDePagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSelecionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantidadeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDePagamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSelecionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarProdutoActionPerformed
        int linha = jTable2.getSelectedRow();
        String idString = (String) jTable2.getValueAt(linha, 0);
        ProdutoDAO daoProduto = new ProdutoDAO();
        try {
            produto = daoProduto.findById(Integer.parseInt(idString));
            JOptionPane.showMessageDialog(this, "Produto Selecionado");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSelecionarProdutoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        model.vo.Venda venda = new model.vo.Venda();
        venda.setProduto(produto);
        venda.setCliente(cliente);
        venda.setTipoPagamento((String) TipoDePagamentoComboBox.getSelectedItem());
        venda.setData(new Date());
        venda.setQuantidade(Integer.parseInt((String) QuantidadeComboBox.getSelectedItem()));
        VendaDAO daoVenda = new VendaDAO();
        if (venda.getQuantidade() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma quantidade !");
        }
        if (venda.getTipoPagamento() == null) {
            JOptionPane.showMessageDialog(this, "Selecione um tipo de pagamento !");
        }

        if (venda.getQuantidade() != 0 && venda.getTipoPagamento() != null) {
            if (venda.getTipoPagamento() == "À vista") {
                try {
                    daoVenda.salvar(venda);
                    produto.setQuantidade(produto.getQuantidade() - Integer.parseInt((String) QuantidadeComboBox.getSelectedItem()));
                    ProdutoDAO produtoDAO = new ProdutoDAO();
                    produtoDAO.alterar(produto);
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso");

                    Pagamento p = new Pagamento();
                    p.setValor(venda.getQuantidade() * venda.getProduto().getPreco());
                    p.setDescricao("Venda");
                    p.setData(new Date());
                    p.setTipo(Pagamento.CREDITO);
                    PagamentoDAO dao = new PagamentoDAO();
                    dao.salvar(p);
                    atualizarTabela();
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(ClienteAdd.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Erro, não foi possível salvar");
                }
            }
            if (venda.getTipoPagamento() == "À prazo") {
                try {
                    daoVenda.salvar(venda);
                    cliente.setDebito(cliente.getDebito() + (produto.getPreco()) * produto.getQuantidade());
                    produto.setQuantidade(produto.getQuantidade() - Integer.parseInt((String) QuantidadeComboBox.getSelectedItem()));
                    new ProdutoDAO().alterar(produto);
                    new ClienteDAO().alterar(cliente);
                    atualizarTabela();
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(ClienteAdd.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Erro, não foi possível salvar");
                }
            }
        }

    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarClienteActionPerformed
        int linha = jTable1.getSelectedRow();
        String idString = (String) jTable1.getValueAt(linha, 0);
        ClienteDAO daoCliente = new ClienteDAO();
        try {
            cliente = daoCliente.findById(Integer.parseInt(idString));
            JOptionPane.showMessageDialog(this, "Cliente Selecionado");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteList.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(cliente.getNome());
    }//GEN-LAST:event_botaoSelecionarClienteActionPerformed

    private Venda venda;
    private Produto produto;
    private Cliente cliente;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> QuantidadeComboBox;
    private javax.swing.JComboBox<String> TipoDePagamentoComboBox;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSelecionarCliente;
    private javax.swing.JButton botaoSelecionarProduto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
