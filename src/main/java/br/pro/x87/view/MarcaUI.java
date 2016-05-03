/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.view;

import br.pro.x87.controller.GenericTableModel;
import br.pro.x87.dao.DAO;
import br.pro.x87.view.state.NovoUI;
import br.pro.x87.view.state.SalvarUI;
import br.pro.x87.model.Marca;
import br.pro.x87.view.command.ExcluirCommand;
import br.pro.x87.view.command.SalvarCommand;
import br.pro.x87.view.state.AtualizarUI;
import br.pro.x87.view.state.ExcluirUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 *
 * @author JulianoRodrigo
 */
public class MarcaUI extends javax.swing.JFrame {

    private List<Marca> lista;
    private GenericTableModel table;
    private DAO dao = new DAO();
    private Marca marca;
    private boolean update;

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    /**
     * Creates new form Marca
     */
    public MarcaUI() {
        initComponents();
        new NovoUI().gerenciar(bNovo, bSalvar, bListagem, bExcluir, bFechar);
        jTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jDescricao = new javax.swing.JTextField();
        bNovo = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        bListagem = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        StatusBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("***MaqControl***  Marcas");

        jLabel2.setText("Descrição");

        bNovo.setText("Novo");
        bNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bNovoMouseExited(evt);
            }
        });
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bSalvar.setText("Salvar");
        bSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bSalvarMouseExited(evt);
            }
        });
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });

        bListagem.setText("Listagem");
        bListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bListagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bListagemMouseExited(evt);
            }
        });
        bListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListagemActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExcluirMouseExited(evt);
            }
        });
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bFechar.setText("Fechar");
        bFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bFecharMouseExited(evt);
            }
        });
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        StatusBar.setForeground(new java.awt.Color(153, 153, 153));
        StatusBar.setText("***MaqControl*** Cadastro de marcas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(StatusBar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(StatusBar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNovo)
                    .addComponent(bSalvar)
                    .addComponent(bListagem)
                    .addComponent(bExcluir)
                    .addComponent(bFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        new NovoUI().gerenciar(bNovo, bSalvar, bListagem, bExcluir, bFechar);
        setUpdate(false);
        jDescricao.setText("");
        jDescricao.requestFocus();
    }//GEN-LAST:event_bNovoActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        if (!validar()) {
            return;
        }

        if (!isUpdate()) {
            setMarca(new Marca(jDescricao.getText()));
        } else {
            getMarca().setDescricao(jDescricao.getText());
        }

        new SalvarCommand().execute(marca);
        new SalvarUI().gerenciar(bNovo, bSalvar, bListagem, bExcluir, bFechar);

        refreshTable();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
        new ExcluirCommand().execute(marca);
        new ExcluirUI().gerenciar(bNovo, bSalvar, bListagem, bExcluir, bFechar);

        refreshTable();
    }//GEN-LAST:event_bExcluirActionPerformed

    private void bListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListagemActionPerformed


    }//GEN-LAST:event_bListagemActionPerformed

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        setUpdate(true);
        int pos = jTabela.getSelectedRow();
        setMarca(lista.get(pos));
        jDescricao.setText(getMarca().getDescricao());
        new AtualizarUI().gerenciar(bNovo, bSalvar, bListagem, bExcluir, bFechar);

    }//GEN-LAST:event_jTabelaMouseClicked

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bFecharActionPerformed

    private void bNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNovoMouseEntered
        StatusBar.setText("Clique aqui para cadastrar uma nova marca");
    }//GEN-LAST:event_bNovoMouseEntered

    private void bNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNovoMouseExited
        StatusBar.setText("***MaqControl*** Cadastro de marcas");
    }//GEN-LAST:event_bNovoMouseExited

    private void bSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseEntered
        StatusBar.setText("Clique aqui para salvar suas informações");
    }//GEN-LAST:event_bSalvarMouseEntered

    private void bSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalvarMouseExited
        StatusBar.setText("***MaqControl*** Cadastro de marcas");
    }//GEN-LAST:event_bSalvarMouseExited

    private void bListagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bListagemMouseEntered
        StatusBar.setText("Clique aqui para imprimir a listagem completa");
    }//GEN-LAST:event_bListagemMouseEntered

    private void bListagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bListagemMouseExited
        StatusBar.setText("***MaqControl*** Cadastro de marcas");
    }//GEN-LAST:event_bListagemMouseExited

    private void bExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluirMouseEntered
        StatusBar.setText("Clique aqui para excluir o registro selecionado");
    }//GEN-LAST:event_bExcluirMouseEntered

    private void bExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluirMouseExited
        StatusBar.setText("***MaqControl*** Cadastro de marcas");
    }//GEN-LAST:event_bExcluirMouseExited

    private void bFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFecharMouseEntered
        StatusBar.setText("Clique aqui para fechar a janela");
    }//GEN-LAST:event_bFecharMouseEntered

    private void bFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bFecharMouseExited
        StatusBar.setText("***MaqControl*** Cadastro de marcas");
    }//GEN-LAST:event_bFecharMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StatusBar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bListagem;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bSalvar;
    private javax.swing.JTextField jDescricao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    // End of variables declaration//GEN-END:variables

    private void refreshTable() {
        lista = dao.get("Marca");
        table = new GenericTableModel(lista, Marca.class);
        jTabela.setModel(table);
        jTabela.repaint();

        jDescricao.setText("");
    }

    private boolean validar() {
        if (jDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "A descrição não pode ser vazia!");
            return false;
        }

        return true;
    }

}
