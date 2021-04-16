package src;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Flashcard extends javax.swing.JFrame {

    public static WordList wordlist   = new WordList();
    private       WordList reviewList = new WordList();
    private       WordSource source   = new WordSource();
    
    Vocabulary currentWord;
    
    public Flashcard() throws IOException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        word = new javax.swing.JLabel();
        mean = new javax.swing.JLabel();
        btn_again = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btn_add = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minimalism Flashcard 1.0");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        word.setBackground(new java.awt.Color(102, 102, 102));
        word.setFont(new java.awt.Font("Garamond", 0, 70)); // NOI18N
        word.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word.setText("Manipulationalize");
        word.setToolTipText("");
        word.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        mean.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        mean.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mean.setText("The meaning of the flashcard");
        mean.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btn_again.setText("AGAIN");
        btn_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_againActionPerformed(evt);
            }
        });

        btn_next.setText("NEXT");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_add.setText("ADD");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_show.setText("SHOW MEAN");
        btn_show.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_showFocusGained(evt);
            }
        });
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_again, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(mean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(word, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mean, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_again, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(btn_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_show, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        if (!wordlist.isEmpty()) {
            currentWord = wordlist.nextWord();
            word.setText(currentWord.getWord());
            mean.setText("");
            btn_show.requestFocus();
        }
        else {
            word.setText("EMPTY !");
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
         new AddCard().setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_againActionPerformed
        mean.setText("");
    }//GEN-LAST:event_btn_againActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        mean.setText(currentWord.getMeaning());
        btn_next.requestFocus();
    }//GEN-LAST:event_btn_showActionPerformed
    
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            source   = new WordSource();
            wordlist = source.importWords();
            if (wordlist.isEmpty()) {
                System.err.println("Don't read anything");
            }
        } catch (IOException ex) {
            System.err.println("Can't find the source files");
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            source.writeList(wordlist);
        } catch (IOException ex) {
            Logger.getLogger(Flashcard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btn_showFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_showFocusGained
        
    }//GEN-LAST:event_btn_showFocusGained

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Flashcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Flashcard().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Flashcard.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_again;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_show;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mean;
    private javax.swing.JLabel word;
    // End of variables declaration//GEN-END:variables
}
