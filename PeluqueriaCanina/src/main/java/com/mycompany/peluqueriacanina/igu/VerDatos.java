package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    Controladora control = null;


    public VerDatos() {
        control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //controlo que la tabla no esté vacía
        if (tablaMascotas.getRowCount() > 0) {
            //controlo que se haya seleccionado a una mascota
            if (tablaMascotas.getSelectedRow() != -1) {
                
                //obtengo la id de la mascota a eliminar
                int num_cliente = Integer.parseInt (String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                // llamo al método borrar
                control.borrarMascota(num_cliente);
                
                //aviso al ususario que borró correctamente
                mostrarMensaje ("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
                cargarTabla();
                
            }
            else {
                mostrarMensaje ("No seleeccionó ninguna mascota", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje ("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //controlo que la tabla no esté vacía
        if (tablaMascotas.getRowCount() > 0) {
            //controlo que se haya seleccionado a una mascota
            if (tablaMascotas.getSelectedRow() != -1) {
                
                //obtengo la id de la mascota a editar
                int num_cliente = Integer.parseInt (String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose();
                
                }
            else {
                mostrarMensaje ("No seleeccionó ninguna mascota", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje ("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

        public void mostrarMensaje(String mensaje, String tipo, String titulo) {
            JOptionPane optionPane = new JOptionPane(mensaje);
            if (tipo.equals("info")) {
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
            else if (tipo.equals("Error")) {
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        // definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // que fila y columna no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        //establecemos los nombres de las columnas
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.", "Dueño", "Cel"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        // carga de los datos desde la base de datos
        List<Mascota> listaMascotas = control.traerMascotas();
        
        //recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(),
                masco.getRaza(), masco.getAlergico(), masco.getAtencion_especial(), masco.getUnDuenio().getNombre(),
                masco.getUnDuenio().getCelDuenio()};
                
                modeloTabla.addRow(objeto);
            }
        }
        
        tablaMascotas.setModel(modeloTabla);
        
    }
}
