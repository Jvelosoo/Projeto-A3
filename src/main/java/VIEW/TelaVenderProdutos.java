
package VIEW;

import DAO.ConexaoBD;
import DAO.DAO;
import DAO.DAO.TelaListagemProdutosDAO;
import static DAO.DAO.preencherTabelaVenderComProdutos;
import DTO.DTOProdutos;
import DTO.DTOUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class TelaVenderProdutos extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtualizarProdutos
     */
    public TelaVenderProdutos() {
        initComponents();
        


        textFieldQuantidade.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calcularValorTotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calcularValorTotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calcularValorTotal();
            }
        });
        try {
            preencherTabelaVenderComProdutos(table2);
        } catch (SQLException e) {
            // Tratar a exceção
            e.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        textFieldNome = new javax.swing.JTextField();
        textFieldQuantidade = new javax.swing.JTextField();
        textFieldPreco = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        textFieldID = new javax.swing.JTextField();
        lblValorTotal = new javax.swing.JLabel();
        textFieldVendedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table2);

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        textFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldQuantidadeActionPerformed(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        textFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIDActionPerformed(evt);
            }
        });

        lblValorTotal.setText("0,00");
        lblValorTotal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblValorTotalAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        textFieldVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnSelecionar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(textFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender)
                    .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_table2AncestorAdded

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void preencherCamposTexto(Object[] rowData) {
        textFieldID.setText(rowData[0].toString());
        textFieldNome.setText(rowData[1].toString());
        textFieldPreco.setText(rowData[2].toString());

    }

    public void calcularValorTotal() {
         // Obter os valores dos campos de texto
    String quantidadeText = textFieldQuantidade.getText();
    String precoText = textFieldPreco.getText();

    // Verificar se as strings não estão vazias
    if (!quantidadeText.isEmpty() && !precoText.isEmpty()) {
        // Converter os valores para números
        int quantidade = Integer.parseInt(quantidadeText);
        double preco = Double.parseDouble(precoText);

        // Calcular o valor total
        double valorTotal = quantidade * preco;

        // Converter o valor total para uma string
        String valorTotalText = String.valueOf(valorTotal);

        // Definir o valor total como o texto da JLabel
        lblValorTotal.setText(valorTotalText);
    } else {
        // Se alguma das strings estiver vazia, limpar o valor total da JLabel
        lblValorTotal.setText("");
    }
    }


    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int selectedRow = table2.getSelectedRow();
        if (selectedRow != -1) {
            Object[][] data = new Object[table2.getRowCount()][table2.getColumnCount()];
            for (int i = 0; i < table2.getRowCount(); i++) {
                for (int j = 0; j < table2.getColumnCount(); j++) {
                    data[i][j] = table2.getValueAt(i, j);
                }
            }

            Object[] rowData = data[selectedRow];
            preencherCamposTexto(rowData);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        String quantidadeStr = textFieldQuantidade.getText();
        String idProdutoStr = textFieldID.getText();
        String vendedor = textFieldVendedor.getText();

        // Verificar se os campos foram preenchidos
        if (quantidadeStr.isEmpty() || idProdutoStr.isEmpty() || vendedor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }           
       

        int quantidade = Integer.parseInt(quantidadeStr);
        int idProduto = Integer.parseInt(idProdutoStr);

        // Criar uma instância da classe DAO com a conexão existente
        DAO dao = new DAO(ConexaoBD.obtemConexao());

        // Executar a venda
        dao.realizarVenda(quantidade, idProduto, vendedor);

        // Limpar os campos
        textFieldQuantidade.setText("");
        textFieldID.setText("");
        textFieldVendedor.setText("");
        try {
            preencherTabelaVenderComProdutos(table2);
        } catch (SQLException e) {
            // Tratar a exceção
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void textFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIDActionPerformed

    private void textFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldQuantidadeActionPerformed

    }//GEN-LAST:event_textFieldQuantidadeActionPerformed

    private void textFieldVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldVendedorActionPerformed

    private void lblValorTotalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblValorTotalAncestorAdded

    }//GEN-LAST:event_lblValorTotalAncestorAdded

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
            java.util.logging.Logger.getLogger(TelaAtualizarProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarProdutos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenderProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnVender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTable table2;
    private javax.swing.JTextField textFieldID;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldPreco;
    private javax.swing.JTextField textFieldQuantidade;
    private javax.swing.JTextField textFieldVendedor;
    // End of variables declaration//GEN-END:variables
}
