package figurer;
import java.awt.Graphics;
import java.util.ArrayList;
public class FigurerJPanel extends javax.swing.JPanel {
    ArrayList<Figurer> figurLista = new ArrayList<>();
    FileManager fmgr = new FileManager();
    public FigurerJPanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtng1 = new javax.swing.ButtonGroup();
        btnRensa = new javax.swing.JButton();
        rbtnTriangel = new javax.swing.JRadioButton();
        rbtnRektangel = new javax.swing.JRadioButton();
        rbtnCirkel = new javax.swing.JRadioButton();
        btnSpara = new javax.swing.JButton();
        btnHämta = new javax.swing.JButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btnRensa.setText("Rensa");
        btnRensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRensaActionPerformed(evt);
            }
        });

        rbtng1.add(rbtnTriangel);
        rbtnTriangel.setSelected(true);
        rbtnTriangel.setText("Triangel");

        rbtng1.add(rbtnRektangel);
        rbtnRektangel.setText("Rektangel");

        rbtng1.add(rbtnCirkel);
        rbtnCirkel.setText("Cirkel");

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        btnHämta.setText("Hämta");
        btnHämta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHämtaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnTriangel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnRektangel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnCirkel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHämta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnRensa)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSpara)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTriangel)
                    .addComponent(rbtnRektangel)
                    .addComponent(rbtnCirkel)
                    .addComponent(btnRensa)
                    .addComponent(btnHämta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSpara)
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRensaActionPerformed
        this.figurLista.clear();
        repaint();
    }//GEN-LAST:event_btnRensaActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int x = evt.getX();
        int y = evt.getY();
        int b = (int) (Math.random() * 10) + 20;
        int h = (int) (Math.random() * 10) + 20;
        if(this.rbtnTriangel.isSelected()){
            Figurer t = new Triangel(y+(h/2), x-(b/2), b, h, true);
            figurLista.add(t);
        }
        else if(this.rbtnRektangel.isSelected()){
            Figurer r = new Rektangel(y-(h/2), x-(b/2), b, h, true);
            figurLista.add(r);
        }
        else if(this.rbtnCirkel.isSelected()){
            Figurer c = new Cirkel(y-(h/2), x-(h/2), h, true);
            figurLista.add(c);
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        fmgr.saveToFile(figurLista);
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnHämtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHämtaActionPerformed
        figurLista = fmgr.readFromFile();
        repaint();
    }//GEN-LAST:event_btnHämtaActionPerformed
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < figurLista.size(); i++) {
            figurLista.get(i).draw(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHämta;
    private javax.swing.JButton btnRensa;
    private javax.swing.JButton btnSpara;
    private javax.swing.JRadioButton rbtnCirkel;
    private javax.swing.JRadioButton rbtnRektangel;
    private javax.swing.JRadioButton rbtnTriangel;
    private javax.swing.ButtonGroup rbtng1;
    // End of variables declaration//GEN-END:variables
}
