/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OPERACIONES extends javax.swing.JFrame {

    JTemp temp = new JTemp();//ARREGLO DEL TAMAÑO DEL NUMERO
    JPanel jpanel = (JPanel) this.getContentPane();
    public JTextField[] text;   //Declaración del array de cajas de texto
    static double[][] matriz ;

    //Border border = BorderFactory.createLineBorder(Color.black, 1);
    public OPERACIONES() {
        initComponents();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("OPERACIONES"); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setText("SUMAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("RESTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MULTIPLICACION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double[][] UNO=temp.Reg_Ma();
        double[][] DOS=temp.Reg_Mb();
        matriz= new double[temp.Reg_YU()][temp.Reg_XU()];
        
        text= new JTextField[temp.Reg_XU() * temp.Reg_YU()];
        
       if (temp.Reg_XD() == temp.Reg_XU() && temp.Reg_YD() == temp.Reg_YU()) {
           for (int a = 0; a < temp.Reg_YU(); a++) {//PASA LOS TEXFIELD A UNA MATRIZ
               for (int b = 0; b < temp.Reg_XU(); b++) {
                   matriz[a][b] = UNO[a][b] + DOS[a][b];
               }
           }

           int d = 0;//PARA BAJAR UNA CASILLA EN Y
           int id = 0;//ID DE LA CAJA PARA QUE SEA DIFERENTE
           for (int a = 0; a < temp.Reg_YU(); a++) {
               for (int i = 0 + id; i < temp.Reg_XU() + id; i++) {//CILCO PAR IMPRIMIR LA
                   text[i] = new JTextField();    //LLAMOS EL ARRAY A LA CAJA DE TEXTO
                   text[i].setBounds(new Rectangle((i + 1 - id) * (35 + 40)/*POSICOIN X*/, 70 + d/*POSICOIN Y*/, 35, 20));
                   jpanel.add(text[i], null);
               }

               id = id + temp.Reg_XU();
               d = d + 30;
           }
           setSize(500, 500);
           setVisible(true);

           int kk = 0;
           for (int a = 0; a < temp.Reg_YU(); a++) {//PASA LOS TEXFIELD A UNA MATRIZ
               for (int b = 0; b < temp.Reg_XU(); b++) {
                   text[kk].setText(String.valueOf(matriz[a][b]));
                   kk++;
               }
           }
        }else{
           JOptionPane.showMessageDialog(null, "DIMENSIONES INCORRECTAS");
            dispose();
       }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double[][] UNO=temp.Reg_Ma();
        double[][] DOS=temp.Reg_Mb();
        matriz= new double[temp.Reg_YU()][temp.Reg_XU()];
        
        text= new JTextField[temp.Reg_XU() * temp.Reg_YU()];
        
        if (temp.Reg_XD() == temp.Reg_XU() && temp.Reg_YD() == temp.Reg_YU()) {

            for (int a = 0; a < temp.Reg_YU(); a++) {//PASA LOS TEXFIELD A UNA MATRIZ
                for (int b = 0; b < temp.Reg_XU(); b++) {
                    matriz[a][b] = UNO[a][b] - DOS[a][b];
                }
            }

            int d = 0;//PARA BAJAR UNA CASILLA EN Y
            int id = 0;//ID DE LA CAJA PARA QUE SEA DIFERENTE
            for (int a = 0; a < temp.Reg_YU(); a++) {
                for (int i = 0 + id; i < temp.Reg_XU() + id; i++) {//CILCO PAR IMPRIMIR LA
                    text[i] = new JTextField();    //LLAMOS EL ARRAY A LA CAJA DE TEXTO
                    text[i].setBounds(new Rectangle((i + 1 - id) * (35 + 40)/*POSICOIN X*/, 70 + d/*POSICOIN Y*/, 35, 20));
                    jpanel.add(text[i], null);
                }

                id = id + temp.Reg_XU();
                d = d + 30;
            }
            setSize(500, 500);
            setVisible(true);

            int kk = 0;
            for (int a = 0; a < temp.Reg_YU(); a++) {//PASA LOS TEXFIELD A UNA MATRIZ
                for (int b = 0; b < temp.Reg_XU(); b++) {
                    text[kk].setText(String.valueOf(matriz[a][b]));
                    kk++;
                }
            }
        }else{
           JOptionPane.showMessageDialog(null, "DIMENSIONES INCORRECTAS");
            dispose();
        }
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double[][] UNO=temp.Reg_Ma();
        double[][] DOS=temp.Reg_Mb();
        matriz= new double[temp.Reg_YD()][temp.Reg_YU()];
        text= new JTextField[temp.Reg_YD() * temp.Reg_YU()];
       
        if (temp.Reg_XU() == temp.Reg_YD()) {
            double suma = 0;
            for (int id = 0; id < temp.Reg_YU(); id++) {//CICLO Y1
                for (int a = 0; a < temp.Reg_XD(); a++) {//CICLO X2
                    for (int b = 0; b < temp.Reg_YD(); b++) {//CICLO X1 Y Y2
                        //System.out.print((UNO[0][b]*DOS[b][a])+"|");
                        if (b != temp.Reg_YD() - 1) {
                            suma = suma + UNO[id][b] * DOS[b][a];
                        } else {
                            if (b == temp.Reg_YD() - 1) {//PARA AGARRA EL ULTIMO NUMERO
                                suma = suma + UNO[id][b] * DOS[b][a];
                            }
                            matriz[id][a] = suma;
                            //System.out.println(matriz[b][id]+" U");
                            suma = 0;
                            //System.out.println(matriz[b][id]+" D");

                        }
                    }

                }
                System.out.println();

            }

            int d = 0;//PARA BAJAR UNA CASILLA EN Y
            int id = 0;//ID DE LA CAJA PARA QUE SEA DIFERENTE
            for (int a = 0; a < temp.Reg_YU(); a++) {
                for (int i = 0 + id; i < temp.Reg_XD() + id; i++) {//CILCO PAR IMPRIMIR LA
                    text[i] = new JTextField();    //LLAMOS EL ARRAY A LA CAJA DE TEXTO
                    text[i].setBounds(new Rectangle((i + 1 - id) * (35 + 40)/*POSICOIN X*/, 70 + d/*POSICOIN Y*/, 35, 20));
                    jpanel.add(text[i], null);
                }
                id = id + temp.Reg_XD();
                d = d + 30;
            }
            setSize(500, 500);
            setVisible(true);

            int kk = 0;
            for (int a = 0; a < temp.Reg_YU(); a++) {//PASA LOS TEXFIELD A UNA MATRIZ
                for (int b = 0; b < temp.Reg_XD(); b++) {
                    text[kk].setText(String.valueOf(matriz[a][b]));
                    kk++;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "DIMENSIONES INCORRECTAS");
             dispose();
        }
 
        
        /*for(int id=0;id<3;id++){//CICLO Y2
            for(int a=0;a<3;a++){//CICLO X2
                for(int b=0;b<3;b++){//CICLO X1 Y Y2
                    //System.out.print((UNO[0][b]*DOS[b][a])+"|");
                    if(b!=2){
                        suma=suma+UNO[id][b]*DOS[b][a];
                    }else{
                        if(b==2){//PARA AGARRA EL ULTIMO NUMERO
                            suma=suma+UNO[id][b]*DOS[b][a];
                        }
                        System.out.print(suma+"|");
                        suma=0;
                    }
                }
                System.out.println();
            } System.out.println();
        }CODIGO ORIGINAL PARA UN CASO DE 3*3*/
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(OPERACIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPERACIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPERACIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPERACIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPERACIONES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
