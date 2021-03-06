/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author Dkuran
 */
public class FrmRegistro extends javax.swing.JFrame {
    String pass = "";
    int conteo = 0;
    Date now = new Date();
    ClsUsuario [] users = new ClsUsuario[2];
    ClsAula [] aulas = new ClsAula[2];
    ClsVisita [] visitas = new ClsVisita[100];
    int contUsuarios = 1;
    int contVisitas = 0;
    ClsUsuario sesion = new ClsUsuario();
        
    /**
     * Creates new form FrmRegistro
     */
    public FrmRegistro() {
        initComponents();
        ClsUsuario us1 = new ClsUsuario(contUsuarios,"Andres Duran","1234");
        contUsuarios++;
        ClsUsuario us2 = new ClsUsuario(contUsuarios,"Jefferson Tana","4321");
        contUsuarios++;
        users[0] = us1;
        users[1] = us2;
        ClsAula au1 = new ClsAula(1,"22-A","TSI114");
        ClsAula au2 = new ClsAula(2,"22-B","TSI214");
        aulas[0] = au1;
        aulas[1] = au2;
        visitas[0] = null;
        sesion = null;
        
        btnregistrar.setEnabled(false);
        btnborrar.setEnabled(false);
        
        //JComboBox cmbaulas2 = new JComboBox(aulas);
        //cmbaulas.setModel(cmbaulas2.getModel());
        //cmbaulas.setName("algo");
        
        cmbaulas.insertItemAt(au1.getNombreaul(), 0);
        cmbaulas.insertItemAt(au2.getNombreaul(), 1);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lbltexto = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnnum1 = new javax.swing.JButton();
        btnnum2 = new javax.swing.JButton();
        btnnum3 = new javax.swing.JButton();
        btnnum4 = new javax.swing.JButton();
        btnnum5 = new javax.swing.JButton();
        btnnum6 = new javax.swing.JButton();
        btnnum7 = new javax.swing.JButton();
        btnnum8 = new javax.swing.JButton();
        btnnum9 = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        cmbaulas = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlog = new javax.swing.JTextArea();
        lblregistro = new javax.swing.JLabel();
        btnmostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbltitulo.setText("ESCUELA DE FORMACION DE TECNOLOGOS");

        lbltexto.setText("Registro diario de aulas");

        txtpass.setEditable(false);
        txtpass.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        txtpass.setEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnnum1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum1.setText("1");
        btnnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum1ActionPerformed(evt);
            }
        });

        btnnum2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum2.setText("2");
        btnnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum2ActionPerformed(evt);
            }
        });

        btnnum3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum3.setText("3");
        btnnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum3ActionPerformed(evt);
            }
        });

        btnnum4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum4.setText("4");
        btnnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum4ActionPerformed(evt);
            }
        });

        btnnum5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum5.setText("5");
        btnnum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum5ActionPerformed(evt);
            }
        });

        btnnum6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum6.setText("6");
        btnnum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum6ActionPerformed(evt);
            }
        });

        btnnum7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum7.setText("7");
        btnnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum7ActionPerformed(evt);
            }
        });

        btnnum8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum8.setText("8");
        btnnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum8ActionPerformed(evt);
            }
        });

        btnnum9.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnnum9.setText("9");
        btnnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnum9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        btnregistrar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnregistrar.setText("Registrar Visita");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnborrar.setLabel("X");
        btnborrar.setMaximumSize(new java.awt.Dimension(45, 45));
        btnborrar.setMinimumSize(new java.awt.Dimension(45, 45));
        btnborrar.setPreferredSize(new java.awt.Dimension(45, 45));
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        cmbaulas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aula 1", "aula 2" }));
        cmbaulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbaulasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbaulas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtpass)
                                .addComponent(lbltexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(cmbaulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtlog.setEditable(false);
        txtlog.setColumns(20);
        txtlog.setRows(5);
        jScrollPane1.setViewportView(txtlog);

        lblregistro.setText("Registro de usuarios");

        btnmostrar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnmostrar.setText("Imprimir");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblregistro)
                    .addComponent(btnmostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblregistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum1ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum1.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum1ActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
        pass = "";
        txtpass.setText("");
        conteo = 0;
        habilitar(conteo);
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum2ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum2.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum2ActionPerformed

    private void btnnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum3ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum3.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum3ActionPerformed

    private void btnnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum4ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum4.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum4ActionPerformed

    private void btnnum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum5ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum5.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum5ActionPerformed

    private void btnnum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum6ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum6.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum6ActionPerformed

    private void btnnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum7ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum7.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum7ActionPerformed

    private void btnnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum8ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum8.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum8ActionPerformed

    private void btnnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnum9ActionPerformed
        // TODO add your handling code here:
        if(conteo != 4){
            pass = pass + btnnum9.getText();
            txtpass.setText(pass);
            conteo++;
            habilitar(conteo);
        }
    }//GEN-LAST:event_btnnum9ActionPerformed

    private void habilitar(int valor){
        if(valor == 4){
            btnregistrar.setEnabled(true);
            btnborrar.setEnabled(true);
        }else{
            btnregistrar.setEnabled(false);
            btnborrar.setEnabled(false);
        }
    }
    
    private void limpiar(){
        txtpass.setText("");
        pass = "";
        conteo = 0;
        habilitar(conteo);
    }
    
    private void imprimirLog(){
        String texto = "";
        ClsUsuario usuarioVisita = new ClsUsuario();
        ClsAula aulaVisita = new ClsAula();
        
        for(int i = 0 ; i < contVisitas; i ++){
            texto = texto+visitas[i].printVst()+"\n";
            //System.out.println("idusr: "+visitas[i].getIdusr());
            for(int j = 0 ; j < users.length ; j ++){
                if(users[j].identificar(visitas[i].getIdusr()) != null){
                     usuarioVisita = users[j].identificar(visitas[i].getIdusr());
                            //System.out.println("usuario identificado"+usuarioVisita);
                }
            }
            texto = texto+usuarioVisita.getNombreusr()+"\n";

            for(int j = 0 ; j < aulas.length ; j ++){
                if(aulas[j].identificar(visitas[i].getIdaul()) != null){
                    aulaVisita = aulas[j].identificar(visitas[i].getIdaul());
                            //System.out.println("usuario identificado"+usuarioVisita);
                }
            }
            texto = texto+"Aula: "+aulaVisita.getNombreaul()+"\nCódigo: "+aulaVisita.getCodigoaul()+"\n\n";
                    
        }
        txtlog.setText(texto);
    
    }
    
    
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        for(int i = 0 ; i < users.length ; i++){ 
            if( users[i].comprobarPass(pass) != null){
                sesion = users[i].comprobarPass(pass);
                if(aulas[0].getEstadoaul().equals("libre")){
                    ClsVisita vs1 = new ClsVisita(contVisitas+1,aulas[0].getIdaul(),sesion.getIdusr(),now,"entrada");
                    visitas[contVisitas] = vs1;
                    contVisitas++;
                    aulas[0].setEstadoaul("ocupado");
                    JOptionPane.showMessageDialog(rootPane, "bienvenido: "+sesion.getNombreusr()+"\nUsted ha ingresado al aula"+aulas[0].getNombreaul());  
                }else{
                    //System.out.println("entra");
                    if(sesion.getIdusr() == visitas[contVisitas-1].getIdusr()){
                        ClsVisita vs1 = new ClsVisita(contVisitas+1,aulas[0].getIdaul(),sesion.getIdusr(),now,"salida");
                        visitas[contVisitas] = vs1;
                        contVisitas++;
                        aulas[0].setEstadoaul("libre");
                        JOptionPane.showMessageDialog(rootPane, "adios: "+sesion.getNombreusr()+"\nUsted ha salido del aula"+aulas[0].getNombreaul());
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "El aula esta ocupada por favor revise su horario");
                    }      
                } 
            }
        }             
        if(sesion == null ){
            JOptionPane.showMessageDialog(rootPane, "Usuario no registrado");
        }else if(sesion.comprobarPass(pass) == null){ 
            JOptionPane.showMessageDialog(rootPane, "Usuario no registrado");
        }
        
        limpiar();
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        imprimirLog();
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void cmbaulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbaulasActionPerformed
        // TODO add your handling code here:
        if (cmbaulas.getSelectedIndex() >= 0){
            String texto = "idaula: "+String.valueOf(cmbaulas.getSelectedIndex());
            texto = texto + "aula: "+cmbaulas.getSelectedItem();
            txtlog.setText(texto);
        }
        
    }//GEN-LAST:event_cmbaulasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JButton btnnum1;
    private javax.swing.JButton btnnum2;
    private javax.swing.JButton btnnum3;
    private javax.swing.JButton btnnum4;
    private javax.swing.JButton btnnum5;
    private javax.swing.JButton btnnum6;
    private javax.swing.JButton btnnum7;
    private javax.swing.JButton btnnum8;
    private javax.swing.JButton btnnum9;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox cmbaulas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JLabel lbltexto;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextArea txtlog;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
