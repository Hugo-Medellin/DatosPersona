package datos;

import static datos.AlphaNumericStringGenerator.getRandomString;
import javax.swing.JOptionPane;

/**
 *
 * @author hugo
 */
public class InterfazFormulario extends javax.swing.JFrame {

    public InterfazFormulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        peso = new javax.swing.JLabel();
        altura = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonImc = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre.setText("Nombre");
        nombre.setMaximumSize(new java.awt.Dimension(80, 16));
        nombre.setMinimumSize(new java.awt.Dimension(80, 16));
        nombre.setPreferredSize(new java.awt.Dimension(80, 16));

        edad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edad.setText("Edad");
        edad.setMaximumSize(new java.awt.Dimension(80, 16));
        edad.setMinimumSize(new java.awt.Dimension(80, 16));
        edad.setPreferredSize(new java.awt.Dimension(80, 16));

        sexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sexo.setText("Sexo (H ó M)");
        sexo.setMaximumSize(new java.awt.Dimension(80, 16));
        sexo.setMinimumSize(new java.awt.Dimension(80, 16));
        sexo.setPreferredSize(new java.awt.Dimension(80, 16));

        peso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        peso.setText("Peso (gr)");
        peso.setMaximumSize(new java.awt.Dimension(80, 16));
        peso.setMinimumSize(new java.awt.Dimension(80, 16));
        peso.setPreferredSize(new java.awt.Dimension(80, 16));

        altura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        altura.setText("Altura (cm)");
        altura.setMaximumSize(new java.awt.Dimension(80, 16));
        altura.setMinimumSize(new java.awt.Dimension(80, 16));
        altura.setPreferredSize(new java.awt.Dimension(80, 16));

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtSexo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });
        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoKeyTyped(evt);
            }
        });

        txtAltura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });

        txtPeso.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Datos.");

        botonLimpiar.setText("Limpiar");
        botonLimpiar.setMaximumSize(new java.awt.Dimension(80, 25));
        botonLimpiar.setMinimumSize(new java.awt.Dimension(80, 25));
        botonLimpiar.setPreferredSize(new java.awt.Dimension(80, 25));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.setMaximumSize(new java.awt.Dimension(80, 25));
        botonSalir.setMinimumSize(new java.awt.Dimension(80, 25));
        botonSalir.setPreferredSize(new java.awt.Dimension(80, 25));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonImc.setText("IMC");
        botonImc.setMaximumSize(new java.awt.Dimension(80, 25));
        botonImc.setMinimumSize(new java.awt.Dimension(80, 25));
        botonImc.setPreferredSize(new java.awt.Dimension(80, 25));
        botonImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImcActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.setMaximumSize(new java.awt.Dimension(80, 25));
        botonGuardar.setMinimumSize(new java.awt.Dimension(80, 25));
        botonGuardar.setPreferredSize(new java.awt.Dimension(80, 25));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(altura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre)
                        .addComponent(txtEdad)
                        .addComponent(txtSexo)
                        .addComponent(txtAltura)
                        .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtAltura.setText("");
        txtPeso.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char TipoTecla = evt.getKeyChar();
        if(Character.isDigit(TipoTecla)){
            evt.consume();
        }
        if(txtNombre.getText().length() >= 25 )
            evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char TipoTecla = evt.getKeyChar();
        
        if(!Character.isDigit(TipoTecla)){
            evt.consume();
        }
        if(txtEdad.getText().length() >= 2 ){
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyTyped
        char TipoTecla = evt.getKeyChar();
        if(Character.isDigit(TipoTecla))
            evt.consume();
        if (txtSexo.getText().length() == 1)
            evt.consume();
        System.out.println(txtSexo.getText());
    }//GEN-LAST:event_txtSexoKeyTyped

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
        char TipoTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoTecla))
            evt.consume();
        if(txtAltura.getText().length() >= 3)
            evt.consume();
    }//GEN-LAST:event_txtAlturaKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        char TipoTecla = evt.getKeyChar();
        if(!Character.isDigit(TipoTecla))
            evt.consume();
        if(txtPeso.getText().length() >= 3)
            evt.consume();
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost

    }//GEN-LAST:event_txtNombreFocusLost

    private void botonImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImcActionPerformed
        if(txtPeso.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, Ingresa tu Peso.");
            return;
        }
        if(txtAltura.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, Ingresa tu Altura.");
            return;
        }
        
        String nombre;
        char sexo;
        int edad, peso, altura;
        nombre = txtNombre.getText();
        edad = Integer.parseInt(txtEdad.getText());
        sexo = txtSexo.getText().charAt(0);
        peso = Integer.parseInt(txtPeso.getText());
        altura = Integer.parseInt(txtAltura.getText());
        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        
        int imc = persona1.calcularIMC(peso, altura);
        boolean age = persona1.esMayorDeEdad(edad);
        
            if(age){
                JOptionPane.showMessageDialog(null,"Eres mayor de edad.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Eres menor de edad.");
            }

            if(imc  == -1){
                JOptionPane.showMessageDialog(null,"Según tu IMC te hace falta peso. Tu IMC está por debajo de 20.");
            }
            else if(imc  == 0){
                JOptionPane.showMessageDialog(null,"Según tu IMC tienes un peso normal. Tu IMC está entre 20 y 25.");
            }
            else if(imc  == 1){
                JOptionPane.showMessageDialog(null,"Según tu IMC tienes sobrepeso. Tu IMC está arriba de 25.");
            }
    }//GEN-LAST:event_botonImcActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, Ingresa el Nombre.");
            return;
        }
        if(txtEdad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, Ingresa la Edad.");
            return;
        }
        if(txtSexo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, Ingresa tu Genero.");
            return;
        }
        if(txtPeso.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, Ingresa tu Peso.");
            return;
        }
        if(txtAltura.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, Ingresa tu Altura.");
            return;
        }
        String nombre, edad, sexo, peso, altura, nss;
        nombre = txtNombre.getText();
        edad = txtEdad.getText();
        nss = getRandomString();
        sexo = txtSexo.getText();
        peso = txtPeso.getText();
        altura = txtAltura.getText();
        
        JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre +
                ", Edad: " + edad +
                ", NSS: " + nss +
                ", Genero: " + sexo +
                ", Peso: " + peso + " gr" +
                ", Altura: " + altura + " cm");
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altura;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonImc;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel peso;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}