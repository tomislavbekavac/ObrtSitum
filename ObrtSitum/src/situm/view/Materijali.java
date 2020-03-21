/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import situm.contrelle.ObradaMaterijal;
import situm.model.Materijal;
import situm.model.Radnik;
import situm.pomocno.SitumException;

/**
 *
 * @author Tomislav
 */
public class Materijali extends javax.swing.JFrame {
        private ObradaMaterijal obradaEntitet;
        private DecimalFormat format;
    /**
     * Creates new form Materijali
     */
    public Materijali() {
        initComponents();
        obradaEntitet = new ObradaMaterijal();
        
        NumberFormat nf = NumberFormat.getInstance( new Locale("hr"));
        
        format = (DecimalFormat) nf;
        format.applyPattern("#,###.00");
        
        ucitajEntitete();
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
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtUvjetMaterijal = new javax.swing.JTextField();
        chbLimitator = new javax.swing.JCheckBox();
        txtMaterijal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKolicina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        btnObrisi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnOcistiPolja = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Materijal");

        txtUvjetMaterijal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUvjetMaterijalActionPerformed(evt);
            }
        });

        chbLimitator.setText("Ograniči na 20");

        jLabel2.setText("Količina");

        jLabel3.setText("Cijena");

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnOcistiPolja.setText("Očitsti Polja");
        btnOcistiPolja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPoljaActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUvjetMaterijal, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbLimitator))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOcistiPolja)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisi)))
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjeni))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCijena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKolicina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaterijal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaterijal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnObrisi)
                    .addComponent(btnPromjeni))
                .addGap(26, 26, 26)
                .addComponent(btnOcistiPolja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUvjetMaterijal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbLimitator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        Materijal entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite Materijal");
        }

        try {
            obradaEntitet.obrisi(entitet);
            ucitajEntitete();

            ocistPolja();
        } catch (SitumException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        Materijal entitet = lstEntiteti.getSelectedValue();

        if (entitet == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite Materijal");
        }

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.spremi(entitet);
        } catch (SitumException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistPolja();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnOcistiPoljaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPoljaActionPerformed
        ocistPolja();
    }//GEN-LAST:event_btnOcistiPoljaActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Materijal entitet = new Materijal();

        preuzmiVrijednosti(entitet);

        try {
            obradaEntitet.spremi(entitet);
        } catch (SitumException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajEntitete();

        ocistPolja();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
if (evt.getValueIsAdjusting()) {
            return;
        }

        Materijal entitet = lstEntiteti.getSelectedValue();
        if (entitet == null) {
            return;
        }
        
        ocistPolja();
        
        txtMaterijal.setText(entitet.getMaterijal());
        txtKolicina.setText(format.format(entitet.getKolicina()));
        txtCijena.setText(format.format(entitet.getCijena()));

    }//GEN-LAST:event_lstEntitetiValueChanged

    private void txtUvjetMaterijalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUvjetMaterijalActionPerformed
        ucitajEntitete();
    }//GEN-LAST:event_txtUvjetMaterijalActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnOcistiPolja;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JCheckBox chbLimitator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Materijal> lstEntiteti;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtMaterijal;
    private javax.swing.JTextField txtUvjetMaterijal;
    // End of variables declaration//GEN-END:variables

    private void ucitajEntitete() {
          DefaultListModel<Materijal> m = new DefaultListModel<>();
       for(Materijal j : obradaEntitet.getLista()) {
           m.addElement(j);
       }
       lstEntiteti.setModel(m);
       
       if(m.getSize()>0) {
           lstEntiteti.setSelectedIndex(m.getSize()-1);
       }
    }

    private void ocistPolja() {
        txtMaterijal.setText("");
        txtKolicina.setText("");
        txtCijena.setText("");
    }

    private void preuzmiVrijednosti(Materijal entitet) {
         entitet.setMaterijal((txtMaterijal.getText()));
         entitet.setKolicina((txtKolicina.getText()));
        try {
            entitet.setCijena(new BigDecimal(format.parse(txtCijena.getText()).floatValue()));
        } catch (Exception e) {
            entitet.setCijena(BigDecimal.ZERO);
            txtCijena.setText("0");
        }
       
        
    }

    private  class DuzeUcitanjeEntiteta extends Thread{

        @Override
        public void run() {
            DefaultListModel<Materijal> n = new DefaultListModel<>();
            for (Materijal s : obradaEntitet.getLista(txtUvjetMaterijal.getText().trim(), chbLimitator.isSelected())) {
                n.addElement(s);
            }
          lstEntiteti.setModel(n);
        }
        }
    }
