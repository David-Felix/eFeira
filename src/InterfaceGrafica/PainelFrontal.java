/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

/**
 *
 * @author Lab-NTM-01
 */
public class PainelFrontal extends javax.swing.JFrame {

    /**
     * Creates new form PainelFrontal
     */
    public PainelFrontal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        JdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuTopoCadastros = new javax.swing.JMenu();
        jMenuProdutos = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuTopoCompra = new javax.swing.JMenu();
        jMenuTopoVenda = new javax.swing.JMenu();
        jMenuTopoRelatorios = new javax.swing.JMenu();
        JMenuRelProdutos = new javax.swing.JMenuItem();
        jMenuTopoSair = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("eFeira - Cayque Silva");

        javax.swing.GroupLayout JdpPrincipalLayout = new javax.swing.GroupLayout(JdpPrincipal);
        JdpPrincipal.setLayout(JdpPrincipalLayout);
        JdpPrincipalLayout.setHorizontalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        JdpPrincipalLayout.setVerticalGroup(
            JdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jMenuTopoCadastros.setText("Cadastros");

        jMenuProdutos.setText("Produtos");
        jMenuProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProdutosMouseClicked(evt);
            }
        });
        jMenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProdutosActionPerformed(evt);
            }
        });
        jMenuTopoCadastros.add(jMenuProdutos);

        jMenuCliente.setText("Clientes");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenuTopoCadastros.add(jMenuCliente);

        jMenuBar1.add(jMenuTopoCadastros);

        jMenuTopoCompra.setText("Compra");
        jMenuBar1.add(jMenuTopoCompra);

        jMenuTopoVenda.setText("Venda");
        jMenuBar1.add(jMenuTopoVenda);

        jMenuTopoRelatorios.setText("Relatórios");

        JMenuRelProdutos.setText("Produtos");
        JMenuRelProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuRelProdutosActionPerformed(evt);
            }
        });
        jMenuTopoRelatorios.add(JMenuRelProdutos);

        jMenuBar1.add(jMenuTopoRelatorios);

        jMenuTopoSair.setText("Sair");
        jMenuTopoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuTopoSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuTopoSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(JdpPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JdpPrincipal)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1109, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProdutosActionPerformed
        // TODO add your handling code here:
        jifCadastro obj = new jifCadastro();
        JdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuProdutosActionPerformed

    private void jMenuTopoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuTopoSairMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuTopoSairMouseClicked

    private void jMenuProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuProdutosMouseClicked

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        // TODO add your handling code here:
        jifClientes obj = new jifClientes();
        JdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void JMenuRelProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuRelProdutosActionPerformed
        // TODO add your handling code here:
        jifRelatorioProduto obj = new jifRelatorioProduto();
        JdpPrincipal.add(obj);
        obj.setVisible(true);
    }//GEN-LAST:event_JMenuRelProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(PainelFrontal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelFrontal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelFrontal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelFrontal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelFrontal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuRelProdutos;
    private javax.swing.JDesktopPane JdpPrincipal;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuProdutos;
    private javax.swing.JMenu jMenuTopoCadastros;
    private javax.swing.JMenu jMenuTopoCompra;
    private javax.swing.JMenu jMenuTopoRelatorios;
    private javax.swing.JMenu jMenuTopoSair;
    private javax.swing.JMenu jMenuTopoVenda;
    // End of variables declaration//GEN-END:variables
}
