/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.awt.PageAttributes.MediaType.D;
import javax.swing.ImageIcon;

/**
 *
 * @author axelc
 */
public class JCasosInte extends javax.swing.JFrame {

    /**
     * Creates new form JCasosDev
     */
    public JCasosInte() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CASOS DE DERIVACION");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        Des = new javax.swing.JSlider();
        Pic = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NDev = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NOTAS = new javax.swing.JLabel();
        Pic1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Des.setBackground(new java.awt.Color(0, 102, 102));
        Des.setMajorTickSpacing(1);
        Des.setMaximum(2);
        Des.setMinorTickSpacing(6);
        Des.setOrientation(javax.swing.JSlider.VERTICAL);
        Des.setPaintTicks(true);
        Des.setValue(0);
        Des.setMaximumSize(new java.awt.Dimension(16, 4));
        Des.setValueIsAdjusting(true);
        Des.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DesStateChanged(evt);
            }
        });

        Pic.setBackground(new java.awt.Color(255, 255, 255));
        Pic.setForeground(new java.awt.Color(63, 202, 202));
        Pic.setOpaque(true);

        Titulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Titulo.setText("TITULO");
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("CASO DE INTEGRACION");

        NDev.setText("NUMERO");

        jLabel3.setText("NOTAS :");

        NOTAS.setText("....");
        NOTAS.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Pic1.setBackground(new java.awt.Color(255, 255, 255));
        Pic1.setForeground(new java.awt.Color(63, 202, 202));
        Pic1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Pic1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Des, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(Pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NDev)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NDev)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NOTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pic, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(Pic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DesStateChanged
        int a=Des.getValue();
        int num=a+1;
        //int b=IMGS.getValue();//NUMERO DE EJEMPLOS EN IMGS
        int total;
        switch(a){
            case 0:
            Titulo.setText("Método de integración por sustitución");//TITULO
            NDev.setText(num+"/3");//NUMERO DE CASO DE DERIVACION
            Pic.setIcon(new ImageIcon("D:\\ALEX\\U\\IPC1\\CALCULADORA\\imgs\\inte\\1.png"));//RUTA DE LA IMG
            Pic1.setIcon(new ImageIcon("D:\\ALEX\\U\\IPC1\\CALCULADORA\\imgs\\inte\\1.1.png"));//RUTA DE LA IMG
            total=0;
            
            //IMGS.setMaximum(total);
            //NEJ.setText(b+"/"+total);//1/5
            
            NOTAS.setText("...");
            break;
            case 1:
            Titulo.setText("Método de integración por partes");
            NDev.setText(num+"/3");
            Pic.setIcon(new ImageIcon("D:\\ALEX\\U\\IPC1\\CALCULADORA\\imgs\\inte\\2.png"));//RUTA DE LA IMG
            Pic1.setIcon(new ImageIcon("D:\\ALEX\\U\\IPC1\\CALCULADORA\\imgs\\inte\\1.2.png"));//RUTA DE LA IMG

            total=0;
            //IMGS.setMaximum(total);
            //NEJ.setText(b+"/"+total);//1/5
            
            NOTAS.setText("...");
            break;
            case 2:
            Titulo.setText("Derivada de una suma");
            NDev.setText(num+"/3");
            Pic.setIcon(new ImageIcon("D:\\ALEX\\U\\IPC1\\CALCULADORA\\imgs\\inte\\3.png"));//RUTA DE LA IMG
            Pic1.setIcon(new ImageIcon("D:\\ALEX\\U\\IPC1\\CALCULADORA\\imgs\\inte\\1.3.png"));//RUTA DE LA IMG

            total=0;
            //IMGS.setMaximum(total);
            //NEJ.setText(b+"/"+total);//1/5
            
            NOTAS.setText("...");
            break;
        }
    }//GEN-LAST:event_DesStateChanged

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCasosInte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Des;
    private javax.swing.JLabel NDev;
    private javax.swing.JLabel NOTAS;
    private javax.swing.JLabel Pic;
    private javax.swing.JLabel Pic1;
    private javax.swing.JLabel Titulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
