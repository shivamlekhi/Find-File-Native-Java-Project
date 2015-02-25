package learning_portal;

import java.io.*;
import javax.swing.JFileChooser;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.util.*;

public class MainForm extends javax.swing.JFrame {
    public MainForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        jFrame1 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find Your File");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Raavi", 0, 16)); // NOI18N
        jLabel1.setText("Folder Path :");

        jLabel2.setFont(new java.awt.Font("Raavi", 0, 16)); // NOI18N
        jLabel2.setText("Query      : ");

        jTextField2.setAutoscrolls(false);

        jButton2.setFont(new java.awt.Font("Monaco", 0, 11)); // NOI18N
        jButton2.setText("Browse");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Folder", "URL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                                .addGap(646, 646, 646)))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jButton2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

class methods{
    
private void Execute(){        
        try
        {
         String path = jTextField1.getText(); 
         String filename;

         File folder = new File(path); //Accesing The File Path
         File[] listOfFiles = folder.listFiles(); // Array With Files as Element
         String Query = jTextField2.getText();
         
        for (int i = 0; i < listOfFiles.length; i++) 
        {
             //FileName From Array of Files And Folders
             filename = listOfFiles[i].getName();
             String FileExtention = filename.substring(filename.length() - 3, filename.length()); // FileName extention for filtering pdf's

         if (listOfFiles[i].isFile() && FileExtention.equals("pdf")) // For Finding All Files
         {
             jTextArea3.setText(jTextArea3.getText() + filename + "\n");
             
             PDDocument pd = PDDocument.load(listOfFiles[i]);
             PDFTextStripper stripper = new PDFTextStripper();
             String pdtext = stripper.getText(pd);
             //System.out.println(pdtext);
             
             if(pdtext.contains(Query)){
                 jTextArea2.setText(jTextArea2.getText() + filename + "\n");
             }
             else{continue;}
             pd.close();
         }   
         else if(listOfFiles[i].isDirectory())
         {
                jTextArea1.setText(jTextArea1.getText() + listOfFiles[i].getName() + "\n"); 
                int q,d,n,x,p,h,g,e,m;
                
                File[] Layer0_array = listOfFiles[i].listFiles();
                
                for(q=0 ; q < Layer0_array.length ; q++)
                    {
                        if(Layer0_array[q].isDirectory())
                        {
                             File[] Layer1_array = Layer0_array[q].listFiles();
                             jTextArea1.setText(jTextArea1.getText() + Layer0_array[q].getName() + "\n");

                             for(d=0 ; d < Layer1_array.length ; d++)
                             {
                                 if(Layer1_array[d].isDirectory())
                                 {
                                    jTextArea1.setText(jTextArea1.getText() + Layer1_array[d].getName() + "\n" );

                                     File[] Layer2_array = Layer1_array[d].listFiles();

                                     for(n=0 ; n < Layer2_array.length ; n++)
                                     {
                                         if(Layer2_array[n].isDirectory())
                                         {
                                             jTextArea1.setText(jTextArea1.getText() + Layer2_array[n].getName() + "\n");

                                             File[] Layer3_array = Layer2_array[n].listFiles();

                                             for(x=0 ; x < Layer3_array.length ; x++)
                                             {
                                                 if(Layer3_array[x].isDirectory())
                                                 {
                                                     jTextArea1.setText(jTextArea1.getText() + Layer3_array[x].getName() + "\n");

                                                     File[] Layer4_array = Layer3_array[x].listFiles();

                                                     for(m=0 ; m < Layer4_array.length ; m++)
                                                     {
                                                         if(Layer4_array[m].isDirectory())
                                                         {
                                                             jTextArea1.setText(jTextArea1.getText() + Layer4_array[m].getName() + "\n");

                                                             File[] Layer5_array = Layer4_array[m].listFiles();

                                                             for(h=0 ; h < Layer5_array.length ; h++)
                                                             {
                                                                 if(Layer5_array[h].isDirectory())
                                                                 {
                                                                     jTextArea1.setText(jTextArea1.getText() + Layer5_array[h].getName() + "\n");

                                                                     File[] Layer6_array = Layer5_array[h].listFiles();

                                                                     for(g=0 ; g < Layer6_array.length ; g++)
                                                                     {
                                                                         if(Layer6_array[g].isDirectory())
                                                                         {
                                                                             jTextArea1.setText(jTextArea1.getText() + Layer6_array[g].getName() + "\n");

                                                                             File[] Layer7_array = Layer6_array[g].listFiles();

                                                                             for(e=0 ; e < Layer7_array.length ; e++)
                                                                             {
                                                                                 if(Layer7_array[e].isDirectory())
                                                                                 {
                                                                                      jTextArea1.setText(jTextArea1.getText() + Layer7_array[e].getName() + "\n");
                                                                                 }
                                                                                 else if(Layer7_array[e].isFile())
                                                                                 {
                                                                                  String FileName7 = Layer7_array[e].getName();
                                                                                  String FileExtention7 = FileName7.substring(FileName7.length() - 3 , FileName7.length());
                                                                                     
                                                                                  jTextArea3.setText(jTextArea3.getText() + FileName7 + "\n");
                                                                                 }
                                                                                 else{continue;}
                                                                             }
                                                                         }
                                                                         else if(Layer6_array[g].isFile())
                                                                         {
                                                                             String FileName6 = Layer6_array[g].getName();
                                                                             String FileExtention6 = FileName6.substring(FileName6.length() - 3 , FileName6.length());
                                                                             
                                                                             jTextArea3.setText(jTextArea3.getText() + FileName6 + "\n");
                                                                             
                                                                         }
                                                                         else{continue;}
                                                                     }
                                                                 }
                                                                 else if(Layer5_array[n].isFile())
                                                                 {
                                                                     String FileName5 = Layer5_array[h].getName();
                                                                     String FileExtention5 = FileName5.substring(FileName5.length() - 3 , FileName5.length());
                                                                     jTextArea3.setText(jTextArea3.getText() + FileName5 + "\n");
                                                                     
                                                                 }
                                                                 else{continue;}
                                                             }
                                                         }
                                                         else if(Layer4_array[m].isFile())
                                                         {
                                                             String FileName4 = Layer4_array[m].getName();
                                                             String FileExtention4 = FileName4.substring(FileName4.length() - 3 , FileName4.length());
                                                             jTextArea3.setText(jTextArea3.getText() + FileName4 + "\n");
                                                             
                                                         }
                                                         else{continue;}
                                                     }
                                                 }
                                                 else if(Layer3_array[x].isFile())
                                                 {
                                                     String FileName3 = Layer3_array[x].getName();
                                                     String FileExtention3 = FileName3.substring(FileName3.length() - 3 , FileName3.length());
                                                     jTextArea3.setText(jTextArea3.getText() + FileName3 + "\n");
                                                 }
                                                 else{continue;}
                                             }
                                         }
                                         else if(Layer2_array[n].isFile())
                                         {
                                             String FileName2 = Layer2_array[n].getName();
                                             String FileExtention2 = FileName2.substring(FileName2.length() - 3 , FileName2.length());
                                             jTextArea3.setText(jTextArea3.getText() + FileName2 + "\n");
                                         }
                                         //else{continue;}
                                     }
                                 }
                                 else if(Layer1_array[d].isFile())
                                 {
                                     String FileName1 = Layer1_array[d].getName();
                                     String FileExtention1 = FileName1.substring(FileName1.length() - 3 , FileName1.length());
                                     jTextArea3.setText(jTextArea3.getText() + FileName1 + "\n");
                                 }
                                 //else{continue;}
                             }
                        }
                        else if(Layer0_array[q].isFile())
                        {
                            String FileName0 = Layer0_array[q].getName();
                            String FileExtention0 = FileName0.substring(FileName0.length() - 3, FileName0.length());
                            
                            
                            
                            jTextArea3.setText(jTextArea3.getText() + FileName0 + "\n");
                        }
                        else{continue;}
                    }
         }
        }
        }
        catch(Exception c)
        {
            System.out.println("Hello");
        }
        }

private void Main(){
    Execute();
      }
    }

    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        methods new_method = new methods();
        new_method.Main();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try
 {
     JFileChooser fc = new JFileChooser(); //  new Instance Of JFileChooser
     
     fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Condition For Only DIrecories
     
     int returnVal = fc.showDialog(jLabel1, null); // show new Dialog of jFileChooser
     
     String file = fc.getSelectedFile().getPath(); //  Retrieving Path Of Folder Selected
     
     jTextField1.setText(file); //  Setting Path For User TO verify With TO TextField
 }
 catch(Exception exception)
 {
     //System.out.println("Error");
 }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 0 || "Folder Path :".equals(jLabel1.getText()))
        {
            jLabel1.setText("Folder Path :");
            jTextField1.setEnabled(false);
        }
        else if(jComboBox1.getSelectedIndex() == 1)
        {
            jLabel1.setText("URL :");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */    
       /*//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
