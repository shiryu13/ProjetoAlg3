/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidade.telas;

/**
 *
 * @author garrien
 */
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    public PrincipalJFrame() {
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

        conteudojPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAluno = new javax.swing.JMenuItem();
        jMenuCurso = new javax.swing.JMenuItem();
        jMenuDepartamento = new javax.swing.JMenuItem();
        jMenuDisciplina = new javax.swing.JMenuItem();
        jMenuFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        conteudojPanel.setLayout(new javax.swing.BoxLayout(conteudojPanel, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(conteudojPanel);

        jMenu1.setText("File");

        jMenuAluno.setText("Aluno");
        jMenuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAluno);

        jMenuCurso.setText("Curso");
        jMenuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCursoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCurso);

        jMenuDepartamento.setText("Departamento");
        jMenuDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDepartamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDepartamento);

        jMenuDisciplina.setText("Disciplina");
        jMenuDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDisciplinaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDisciplina);

        jMenuFuncionario.setText("Funcionário");
        jMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFuncionario);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlunoActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new AlunoJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_jMenuAlunoActionPerformed

    private void jMenuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCursoActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new CursoJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_jMenuCursoActionPerformed

    private void jMenuDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDepartamentoActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new DepartamentoJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_jMenuDepartamentoActionPerformed

    private void jMenuDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDisciplinaActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new DisciplinaJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_jMenuDisciplinaActionPerformed

    private void jMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFuncionarioActionPerformed
        // TODO add your handling code here:
        conteudojPanel.removeAll();
        conteudojPanel.add(new FuncionarioJPanel());
        conteudojPanel.setVisible(false);
        conteudojPanel.setVisible(true);
    }//GEN-LAST:event_jMenuFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel conteudojPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAluno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCurso;
    private javax.swing.JMenuItem jMenuDepartamento;
    private javax.swing.JMenuItem jMenuDisciplina;
    private javax.swing.JMenuItem jMenuFuncionario;
    // End of variables declaration//GEN-END:variables
}
