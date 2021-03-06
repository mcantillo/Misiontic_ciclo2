/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.g6967.reto4.view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utp.misiontic2022.c2.g6967.reto4.controller.ControllerRequerimientos;
import utp.misiontic2022.c2.g6967.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.g6967.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.g6967.reto4.model.vo.Requerimiento_3;

/**
 *
 * @author Administrator
 */
public class FrmReque extends javax.swing.JFrame {

    /**
     * Creates new form FrmReque
     */
    public FrmReque() {
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

        BtnReq1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        BtnReque2 = new javax.swing.JButton();
        BtnReque3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnReq1.setForeground(new java.awt.Color(0, 0, 255));
        BtnReq1.setText("Requerimiento1_reto5");
        BtnReq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReq1ActionPerformed(evt);
            }
        });

        miTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        miTabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        miTabla.setToolTipText("");
        jScrollPane1.setViewportView(miTabla);

        BtnReque2.setForeground(new java.awt.Color(51, 51, 255));
        BtnReque2.setText("Requerimiento2_Reto5");
        BtnReque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReque2ActionPerformed(evt);
            }
        });

        BtnReque3.setForeground(new java.awt.Color(51, 51, 255));
        BtnReque3.setText("Requerimiento3_Reto5");
        BtnReque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReque3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnReque2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReq1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(BtnReque3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(BtnReq1)
                .addGap(63, 63, 63)
                .addComponent(BtnReque2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnReque3)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReq1ActionPerformed

        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "Ventana", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
        String[] NombreColumnas = {"Fecha", "Id_Codigo", "Nombre Proveedor", "Pagado"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_1> ListaReque;
        
        try{
            ListaReque = controlador.consultaRequerimiento1();
            Object[][] datos = new Object[ListaReque.size()][4];
            
            int index = 0;
            for(Requerimiento_1 r: ListaReque){
                datos[index][0] = r.getFechaCompra();
                datos[index][1] = r.getCodCompra();
                datos[index][2] = r.getNombreProveedor();
                datos[index][3] = r.getPagado();
                index ++;              
                           
                
            }
            
            DefaultTableModel model = new DefaultTableModel(datos,NombreColumnas);
            miTabla.setModel(model);
            
        }catch (SQLException e){
        System.err.println(e);
        
        }//fin Catch    
    
    
    }//GEN-LAST:event_BtnReq1ActionPerformed

    private void BtnReque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReque2ActionPerformed
String[] NombreColumnas = {"Fec. Inicio","Ciudad","Constructora","Nom. Lider","Cod. Tipo","Estrato"};
        
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_2> ListaReque;
        
        try {
            ListaReque = controlador.consultaRequerimiento2();
            
            Object[][] datos = new Object[ListaReque.size()][6];
            
            int index = 0;
            for(Requerimiento_2 r: ListaReque){
                datos[index][0] = r.getFecIni();
                datos[index][1] = r.getNombreCiudad();
                datos[index][2] = r.getNomConstructora();
                datos[index][3] = r.getNombreLider();
                datos[index][4] = r.getCodigoTipo();
                datos[index][5] = r.getEstrato();
                
                index++;
            }
            
            DefaultTableModel model = new DefaultTableModel(datos,NombreColumnas);
            
            miTabla.setModel(model);
        } catch (SQLException e){
            System.err.println(e);
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_BtnReque2ActionPerformed

    private void BtnReque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReque3ActionPerformed
        // TODO add your handling code here:
        String[] NombreColumnas = {"Abrev"};
        
        ControllerRequerimientos controlador = new ControllerRequerimientos();
        
        ArrayList<Requerimiento_3> ListaReque;
        
        try {
            ListaReque = controlador.consultaRequerimiento3();
            
            Object[][] datos = new Object[ListaReque.size()][1];
            
            int index = 0;
            for(Requerimiento_3 r: ListaReque){
                datos[index][0] = r.getAbrev();
                
                index++;
            }
            
            DefaultTableModel model = new DefaultTableModel(datos,NombreColumnas);
            
            miTabla.setModel(model);
        } catch (SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_BtnReque3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReq1;
    private javax.swing.JButton BtnReque2;
    private javax.swing.JButton BtnReque3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
