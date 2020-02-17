package whackazombie;

import static whackazombie.Game.PlayMusic;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        PlayMusic("Music\\Gravity-Falls-Theme-8-Bit-Universe.wav");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PLAY = new javax.swing.JButton();
        QUIT = new javax.swing.JButton();
        SCORES = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Whack A Zombie");
        setResizable(false);
        getContentPane().setLayout(null);

        PLAY.setBackground(new java.awt.Color(0, 0, 0, 0));
        PLAY.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        PLAY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); // NOI18N
        PLAY.setOpaque(false);
        PLAY.setPreferredSize(new java.awt.Dimension(175, 63));
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });
        getContentPane().add(PLAY);
        PLAY.setBounds(180, 300, 160, 60);

        QUIT.setBackground(new java.awt.Color(0, 0, 0, 0));
        QUIT.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        QUIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        QUIT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        QUIT.setInheritsPopupMenu(true);
        QUIT.setMaximumSize(new java.awt.Dimension(77, 35));
        QUIT.setMinimumSize(new java.awt.Dimension(77, 35));
        QUIT.setPreferredSize(new java.awt.Dimension(175, 63));
        QUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUITActionPerformed(evt);
            }
        });
        getContentPane().add(QUIT);
        QUIT.setBounds(180, 421, 160, 60);

        SCORES.setBackground(new java.awt.Color(0, 0,0,0));
        SCORES.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        SCORES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scores.png"))); // NOI18N
        SCORES.setMaximumSize(new java.awt.Dimension(77, 35));
        SCORES.setMinimumSize(new java.awt.Dimension(77, 35));
        SCORES.setPreferredSize(new java.awt.Dimension(175, 63));
        SCORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCORESActionPerformed(evt);
            }
        });
        getContentPane().add(SCORES);
        SCORES.setBounds(180, 360, 160, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainMenu.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, -20, 540, 580);

        setSize(new java.awt.Dimension(543, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed

        new Game().setVisible(true);    //opening the game
        setVisible(false);  //to close the menu
    }//GEN-LAST:event_PLAYActionPerformed

    private void SCORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCORESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SCORESActionPerformed

    private void QUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QUITActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton PLAY;
    private javax.swing.JButton QUIT;
    private javax.swing.JButton SCORES;
    // End of variables declaration//GEN-END:variables
}
