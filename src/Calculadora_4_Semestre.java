/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno Brandão Acunha
 */
public class Calculadora_4_Semestre extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora_4_Semestre
     */
    public Calculadora_4_Semestre() {
        initComponents();
        
    }
    String primeiroOperando = "";
    String segundoOperando = "";
    String operador = "";
    
    double n1 = 0;
    double n2 = 0;
    double result;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextaAreaDeSoma = new javax.swing.JTextField();
        btNumero2 = new javax.swing.JToggleButton();
        btNumero3 = new javax.swing.JToggleButton();
        btNumero1 = new javax.swing.JToggleButton();
        btNumero6 = new javax.swing.JToggleButton();
        btNumero4 = new javax.swing.JToggleButton();
        btNumero5 = new javax.swing.JToggleButton();
        btNumero7 = new javax.swing.JToggleButton();
        btNumero8 = new javax.swing.JToggleButton();
        btNumeroZero = new javax.swing.JToggleButton();
        btVezes = new javax.swing.JToggleButton();
        btNumero9 = new javax.swing.JToggleButton();
        btVirgula = new javax.swing.JToggleButton();
        BtIgual = new javax.swing.JToggleButton();
        btDividir = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();
        btMais = new javax.swing.JToggleButton();
        btMenos = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CALCULADORA");

        jTextaAreaDeSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextaAreaDeSomaActionPerformed(evt);
            }
        });

        btNumero2.setText("2");
        btNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero2ActionPerformed(evt);
            }
        });

        btNumero3.setText("3");
        btNumero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero3ActionPerformed(evt);
            }
        });

        btNumero1.setText("1");
        btNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero1ActionPerformed(evt);
            }
        });

        btNumero6.setText("6");
        btNumero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero6ActionPerformed(evt);
            }
        });

        btNumero4.setText("4");
        btNumero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero4ActionPerformed(evt);
            }
        });

        btNumero5.setText("5");
        btNumero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero5ActionPerformed(evt);
            }
        });

        btNumero7.setText("7");
        btNumero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero7ActionPerformed(evt);
            }
        });

        btNumero8.setText("8");
        btNumero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero8ActionPerformed(evt);
            }
        });

        btNumeroZero.setText("0");
        btNumeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumeroZeroActionPerformed(evt);
            }
        });

        btVezes.setText("*");
        btVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVezesActionPerformed(evt);
            }
        });

        btNumero9.setText("9");
        btNumero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumero9ActionPerformed(evt);
            }
        });

        btVirgula.setText(",");
        btVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVirgulaActionPerformed(evt);
            }
        });

        BtIgual.setText("=");
        BtIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIgualActionPerformed(evt);
            }
        });

        btDividir.setText("/");
        btDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDividirActionPerformed(evt);
            }
        });

        btExcluir.setText("C");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btMais.setText("+");
        btMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisActionPerformed(evt);
            }
        });

        btMenos.setText("-");
        btMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btVirgula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextaAreaDeSoma)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNumeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextaAreaDeSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNumero4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMais, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNumero8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNumero7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNumeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BtIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextaAreaDeSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextaAreaDeSomaActionPerformed

    }//GEN-LAST:event_jTextaAreaDeSomaActionPerformed
  public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora_4_Semestre().setVisible(true);
        });
    }
    private void btNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero2ActionPerformed
      jTextaAreaDeSoma.setText(primeiroOperando += "2");
    }//GEN-LAST:event_btNumero2ActionPerformed

    private void btNumero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero3ActionPerformed
       jTextaAreaDeSoma.setText(primeiroOperando += "3");
    }//GEN-LAST:event_btNumero3ActionPerformed

    private void btNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero1ActionPerformed
    jTextaAreaDeSoma.setText(primeiroOperando += "1");
    }//GEN-LAST:event_btNumero1ActionPerformed

    private void btNumero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero6ActionPerformed
     jTextaAreaDeSoma.setText(primeiroOperando += "6");
    }//GEN-LAST:event_btNumero6ActionPerformed

    private void btNumero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero4ActionPerformed
    jTextaAreaDeSoma.setText(primeiroOperando += "4");
    }//GEN-LAST:event_btNumero4ActionPerformed

    private void btNumero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero5ActionPerformed
     jTextaAreaDeSoma.setText(primeiroOperando += "5");
    }//GEN-LAST:event_btNumero5ActionPerformed

    private void btNumero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero7ActionPerformed
      jTextaAreaDeSoma.setText(primeiroOperando += "7");
    }//GEN-LAST:event_btNumero7ActionPerformed

    private void btNumero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero8ActionPerformed
      jTextaAreaDeSoma.setText(primeiroOperando += "8");
    }//GEN-LAST:event_btNumero8ActionPerformed

    private void btNumeroZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumeroZeroActionPerformed
       jTextaAreaDeSoma.setText(primeiroOperando += "0");
    }//GEN-LAST:event_btNumeroZeroActionPerformed

    private void btVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVezesActionPerformed
  n1 = Double.parseDouble(primeiroOperando);
        jTextaAreaDeSoma.setText(primeiroOperando = ""); 
        operador = "*";
    }//GEN-LAST:event_btVezesActionPerformed

    private void btNumero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumero9ActionPerformed
       jTextaAreaDeSoma.setText(primeiroOperando += "9");
    }//GEN-LAST:event_btNumero9ActionPerformed

    private void btVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVirgulaActionPerformed
         jTextaAreaDeSoma.setText(primeiroOperando +=".");
    }//GEN-LAST:event_btVirgulaActionPerformed

    private void BtIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIgualActionPerformed
      n2 = Double.parseDouble(primeiroOperando);
        
        switch (operador){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            default:
                jTextaAreaDeSoma.setText("Esse operador não existe");
                  
            
                if("+".equals(operador)){
                    
                    result = n1 + n2;
                }
                if ("-".equals(operador)){
                    result = n1 - n2;
              
                }
                if ("/".equals(operador)){
                    result = n1 / n2;
                }
                if ("*".equals(operador)){
                    result = n1 * n2;
                }
                
                else {
                    System.out.println("Esse operador não existe");
                }
                
        }
        
        jTextaAreaDeSoma.setText(primeiroOperando = String.valueOf(result));
        btMais.setBackground(getBackground());
        btMenos.setBackground(getBackground());
        btVezes.setBackground(getBackground());
        btDividir.setBackground(getBackground());
    }//GEN-LAST:event_BtIgualActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
       n1 = Double.parseDouble(primeiroOperando);
        jTextaAreaDeSoma.setText(primeiroOperando = ""); 
        operador = "/";
    }//GEN-LAST:event_btDividirActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        jTextaAreaDeSoma.setText(primeiroOperando = "");
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisActionPerformed
       n1 = Double.parseDouble(primeiroOperando);
        jTextaAreaDeSoma.setText(primeiroOperando = ""); 
        operador = "+";
    }//GEN-LAST:event_btMaisActionPerformed

    private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosActionPerformed
        n1 = Double.parseDouble(primeiroOperando);
        jTextaAreaDeSoma.setText(primeiroOperando = ""); 
        operador = "-";
    }//GEN-LAST:event_btMenosActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtIgual;
    private javax.swing.JToggleButton btDividir;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btMais;
    private javax.swing.JToggleButton btMenos;
    private javax.swing.JToggleButton btNumero1;
    private javax.swing.JToggleButton btNumero2;
    private javax.swing.JToggleButton btNumero3;
    private javax.swing.JToggleButton btNumero4;
    private javax.swing.JToggleButton btNumero5;
    private javax.swing.JToggleButton btNumero6;
    private javax.swing.JToggleButton btNumero7;
    private javax.swing.JToggleButton btNumero8;
    private javax.swing.JToggleButton btNumero9;
    private javax.swing.JToggleButton btNumeroZero;
    private javax.swing.JToggleButton btVezes;
    private javax.swing.JToggleButton btVirgula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextaAreaDeSoma;
    // End of variables declaration//GEN-END:variables
}
