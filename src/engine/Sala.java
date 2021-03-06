/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import baseServe.comandoEvent;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author zequi
 */
public class Sala extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Sala() {
        initComponents();
        View.Tela = "Sala";
        load();
    }

    public int clicked =0;
    
    
    private void load(){
    
        
        if(View.clinte.isConnected()){
        
            View.clinte.events.put("playersList", new comandoEvent() {
                @Override
                public void event(String value) {
                   if("Sala".equals(View.Tela)){
                   playersList.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = value.split(",");
                        @Override
                        public int getSize() { return strings.length; }
                        @Override
                        public String getElementAt(int i) { return strings[i]; }
                    });
                    
                    
           
                }}
                
            });
            
             View.clinte.events.put("roomsList", new comandoEvent() {
                @Override
                public void event(String value) {
                   if("Sala".equals(View.Tela)){
                       
                   if(value !=null && !value.isEmpty() && !"null".equals(value)){
                       
                       roomsList.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings =value.split(",");
                        @Override
                        public int getSize() { return strings.length; }
                        @Override
                        public String getElementAt(int i) { return strings[i]; }
                    });
                   }else  {
                     roomsList.setModel(new javax.swing.AbstractListModel<String>() {
                       
                        @Override
                        public int getSize() { return 0; }
                        @Override
                        public String getElementAt(int i) { return null; }
                    });
                   }
           
                }}
                
            });
            
            
            System.out.println("clinte room");
            
            View.clinte.send("players", "return");
            View.clinte.send("rooms", "return");
            
        }
        
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        playersList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        roomsList = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setBackground(new Color(208,223,255));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Players");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setText("Cread Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        playersList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(playersList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rooms");

        roomsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        roomsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsListMouseClicked(evt);
            }
        });
        roomsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                roomsListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(roomsList);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    String room = JOptionPane.showInputDialog("Digite o nome da sala:");

    if(room!=null && !room.isEmpty()){  
    
        View.ViewMain.setView(new Jogo(room,roomsList.getModel().getSize()));
        View.clinte.send("newRoom", room);
        View.ViewMain.setTitle("Room: "+room);
   
    }
       
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void roomsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_roomsListValueChanged
         clicked = 0;
    }//GEN-LAST:event_roomsListValueChanged

    private void roomsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsListMouseClicked
        clicked++; 
        if(clicked > 2){
            clicked = 0;
            View.ViewMain.setView(new Jogo(roomsList.getSelectedValue().trim(),roomsList.getSelectedIndex()));
            View.clinte.send("loginRoom", String.valueOf(roomsList.getSelectedIndex()));
            View.ViewMain.setTitle("Room: "+roomsList.getSelectedValue());
        
       
        } 
            
            System.out.println("clicked: "+clicked);
    }//GEN-LAST:event_roomsListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> playersList;
    private javax.swing.JList<String> roomsList;
    // End of variables declaration//GEN-END:variables
}
