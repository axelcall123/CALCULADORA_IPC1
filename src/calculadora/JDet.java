/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.JVistaPrincipal.datos;
import static calculadora.JVistaPrincipal.fav;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JDet extends javax.swing.JFrame {
    JTemp temp = new JTemp();//ARREGLO DEL TAMAÑO DEL NUMERO
    JPanel jpanel = (JPanel) this.getContentPane();          
    public JTextField[] text = new JTextField[temp.REG_tamañoo()*temp.REG_tamañoo()+temp.REG_tamañoo()];    //Declaración del array de cajas de texto
    public double[][] matriz= new double[temp.REG_tamañoo()][temp.REG_tamañoo()];
    //Border border = BorderFactory.createLineBorder(Color.black, 1);
    
    public JDet() {
        initComponents();

        setLocationRelativeTo(null);
        setTitle("SISTEMA DE ECUAIONES");
        int d = 0;//PARA BAJAR UNA CASILLA EN Y
        int id = 0;//ID DE LA CAJA PARA QUE SEA DIFERENTE
        
        for (int a = 0; a < temp.REG_tamañoo(); a++) {
            for (int i = 0 + id; i < temp.REG_tamañoo() + id; i++) {//CILCO PAR IMPRIMIR LA
                text[i] = new JTextField();    //LLAMOS EL ARRAY A LA CAJA DE TEXTO
                text[i].setBounds(new Rectangle((i + 1- id) * (35+40)/*POSICOIN X*/, 40 + d/*POSICOIN Y*/, 35, 20));
                /*text[i].setBackground(Color.RED);
                text[i].setOpaque(false);
                text[i].setText("h");*/
                jpanel.add(text[i], null);
            }
            
            id = id + temp.REG_tamañoo();
            d = d + 30;
        }
        setSize(1000, 1000);
        setVisible(true);
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
        Res = new javax.swing.JTextField();
        Bsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Bsave.setText("GUARDAR");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsave))
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(Res, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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
    private int identificador=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NOSE ns= new NOSE();
        int kk=0;//pasa a una matriz
        for(int a=0;a<temp.REG_tamañoo();a++){//PASA LOS TEXFIELD A UNA MATRIZ
            for(int b=0;b<temp.REG_tamañoo();b++){
                JTextField texto=text[kk];//toma el texto de la matriz
                double mat=Double.parseDouble(texto.getText());
                matriz[a][b]=mat;
                kk++;
            }
        }
        Res.setText(String.valueOf(ns.Matriz_2(matriz)));
        
        
        
        Calendar fecha = new GregorianCalendar();
        /**//**/
        String resultado=this.Res.getText();
        //OPERACION
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.SECOND);
        //IDENTIFICADOR
        if (identificador < datos.length) {
            if (datos[identificador] == null) {
                datos[identificador] = new ParaAlmacen(resultado, " Determinante", dia, mes, hora, minuto,1,0);
                identificador++;
            } else {
                for (int a = identificador; a < datos.length; a++) {//4 TAMÑAO ACTUAL
                    if (datos[a] == null) {
                        datos[a] = new ParaAlmacen(resultado, " Determinante", dia, mes, hora, minuto,1,0);
                        //identificador = a;
                        break;
                    } else {

                    }
                }

            }
        }else{
            for(int z=1;z<datos.length;z++){
                datos[z-1]=datos[z];
            }datos[datos.length-1]=new ParaAlmacen(resultado, " Determinante", dia, mes, hora, minuto,1,0);
        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private int contador=temp.Reg_FAV();
    private int D=temp.REG_D();
    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        Calendar fecha = new GregorianCalendar();
        /**//**/
         String resultado=this.Res.getText();
        //OPERACION
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        //IDENTIFICADOR
        D++;
        temp.IN_D(D);
        System.out.println(temp.REG_D());
        if(contador<fav.length){
            if(fav[contador]==null){
                fav[contador]=new ParaAlmacen(resultado, " Determinante", dia, mes, hora, minuto,1,temp.REG_D());
                contador++;
                System.out.println(contador);
            }else{
                for(int z=contador;z<fav.length;z++){//4 TAMÑAO ACTUAL
                    if(fav[z]==null){
                        fav[z]=new ParaAlmacen(resultado, " Determinante", dia, mes, hora, minuto,1,temp.REG_D());
                        //contador=z;
                        System.out.println(contador);
                        break;
                    }else{
                        contador=fav.length+10;
                    }
                }

            }
        }else{
            for(int z=1;z<fav.length;z++){
                fav[z-1]=fav[z];
            }fav[fav.length-1]=new ParaAlmacen(resultado, " Determinante", dia, mes, hora, minuto,1,temp.REG_D());
        }System.out.println(contador);

        if(contador==fav.length-1){
            temp.In_FAV(fav.length);
        }

    }//GEN-LAST:event_BsaveActionPerformed

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
            java.util.logging.Logger.getLogger(JDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JDet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsave;
    private javax.swing.JTextField Res;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
