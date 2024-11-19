


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;

/**z
 *
 * @author Anner Monge
 */
public class JInternalFrameRevista extends javax.swing.JInternalFrame {

    public JInternalFrameRevista() {
        initComponents();
        jTextnumero.setEnabled(false);//Deshabilitar campo de numero
    }

      public void LimpiarCampos(){
        jTextnumero.setText("");
        jTexttitulo.setText("");
        jTextayo.setText("");
        jTextissn.setText("");
         jTextprecio.setText("");
         jTexthoraventa.setText("");
    }
      
      //Metodo para listar datos dentro de la tabla
    public void obtenerDatos(){
        //se crea una lista que almacena los datos obtenidps
        List<Revista> revistas=new DAORevista().ObtenerDatos();
        //Define un Modelo para la tabla
        DefaultTableModel modelo= new DefaultTableModel();
        //Arreglo con nombres de columnas de la tabla
        String[] columnas={"Numero","Titulo","año","Issn","Precio","Horaventa"};
        //Establece los nombres definidos de la columnah
        modelo.setColumnIdentifiers(columnas);
        for(Revista rev:revistas){ //Recorre cada elemento de la lista y los agrega
            //al modelo de la tabla
            String[]renglon={Integer.toString(rev.getNumero()), rev.getTitulo(),
                Integer.toString (rev.getAyo()), rev.getIssn(),  
                Float.toString(rev.getPrecio()),
                rev.getHoraventa().toString()};
                modelo.addRow(renglon);
         }
         jTableRevista.setModel(modelo);//Ubica los datos del modelo en la tabla
}
    public void actualizarRevista(){
        int num=Integer.parseInt(this.jTextnumero.getText());
         String titu=jTexttitulo.getText();
        int ay=Integer.parseInt(this.jTextayo.getText());
         String iss=jTextissn.getText();
        float pre=Float.parseFloat(this.jTextprecio.getText());
        Time hrv=Time.valueOf(this.jTexthoraventa.getText());
             
        DAORevista dao=new DAORevista();
        int res=dao.Actualizar(num, titu, ay, iss, pre ,hrv);
        if(res==1){
            JOptionPane.showMessageDialog(rootPane, "¡Revista actualizada!");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrio un error!");
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextnumero = new javax.swing.JTextField();
        jTexthoraventa = new javax.swing.JTextField();
        jTexttitulo = new javax.swing.JTextField();
        jTextissn = new javax.swing.JTextField();
        jTextprecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextayo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBAgregarR = new javax.swing.JButton();
        jBBorrarR = new javax.swing.JButton();
        jBEditarR = new javax.swing.JButton();
        jBActualizarR = new javax.swing.JButton();
        jBBuscarR = new javax.swing.JButton();
        jTextBuscarR = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRevista = new javax.swing.JTable();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Autores Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        jTableAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTableAutor);

        jPanel3.add(jScrollPane1);

        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar / Actualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("numero");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("titulo");

        jLabel3.setForeground(new java.awt.Color(0, 0, 102));

        jLabel4.setForeground(new java.awt.Color(0, 0, 102));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HoraVenta");

        jTextnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnumeroActionPerformed(evt);
            }
        });

        jTexthoraventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexthoraventaActionPerformed(evt);
            }
        });

        jTexttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexttituloActionPerformed(evt);
            }
        });

        jTextprecio.setText("0");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ayo");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("precio");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("issn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextayo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextissn, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexthoraventa, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTexttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextayo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextissn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTexthoraventa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transacciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jBAgregarR.setForeground(new java.awt.Color(0, 0, 102));
        jBAgregarR.setText("Agregar");
        jBAgregarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarRActionPerformed(evt);
            }
        });

        jBBorrarR.setForeground(new java.awt.Color(0, 0, 102));
        jBBorrarR.setText("Borrar");
        jBBorrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarRActionPerformed(evt);
            }
        });

        jBEditarR.setForeground(new java.awt.Color(0, 0, 102));
        jBEditarR.setText("Editar");
        jBEditarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarRActionPerformed(evt);
            }
        });

        jBActualizarR.setForeground(new java.awt.Color(0, 0, 102));
        jBActualizarR.setText("Actualizar");
        jBActualizarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarRActionPerformed(evt);
            }
        });

        jBBuscarR.setForeground(new java.awt.Color(0, 0, 102));
        jBBuscarR.setText("Buscar");
        jBBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarRActionPerformed(evt);
            }
        });

        jTextBuscarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarRActionPerformed(evt);
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
                        .addComponent(jBEditarR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBActualizarR))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregarR, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextBuscarR, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarR, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBorrarR, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jBAgregarR)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEditarR)
                    .addComponent(jBActualizarR))
                .addGap(49, 49, 49)
                .addComponent(jBBorrarR)
                .addGap(18, 18, 18)
                .addComponent(jBBuscarR)
                .addGap(31, 31, 31)
                .addComponent(jTextBuscarR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revista/Registradas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        jTableRevista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTableRevista);

        jPanel4.add(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarRActionPerformed
        // Captura  datos de la caja de texto
        String titu=jTexttitulo.getText();
        int ay=Integer.parseInt(this.jTextayo.getText());
        String iss=jTextissn.getText();
        float pre=Float.parseFloat(this.jTextprecio.getText());
        String hrv=jTexthoraventa.getText();
        //Comprueba que las cajas  de texto no esten vacias
        if(titu.contentEquals("")||Integer.toString(ay).contentEquals("")||
            iss.contentEquals("")||Float.toString(pre).contentEquals("")||
                hrv.contentEquals("")){
            
            JOptionPane.showMessageDialog(rootPane,
                "Todos los campos son obligatorios");
        }else{
            
            try{
                 // Convierte el String a Time
               Time hrvTime = Time.valueOf(hrv);
               // Objeto para acceder al método Insertar de DAORevista
               Revista rev=new DAORevista().Insertar(titu, ay, iss, pre, hrvTime);
               JOptionPane.showMessageDialog(rootPane,"Registro agregado");

         }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");

            }
        }
        obtenerDatos(); //llama a este metodo para que se muestre el nuevo
        // registro en la tabla de formularios
        LimpiarCampos();

    }//GEN-LAST:event_jBAgregarRActionPerformed

    private void jBBorrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarRActionPerformed
        int fila=this.jTableRevista.getSelectedRow();
        if(fila==1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        }
        else{
            int num=Integer.parseInt((String)this.jTableRevista.getValueAt(fila, 0).toString());
            DAORevista dao=new DAORevista();
            dao.Eliminar(num);
            obtenerDatos();
        }

    }//GEN-LAST:event_jBBorrarRActionPerformed

    private void jBEditarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarRActionPerformed
        int fila=this.jTableRevista.getSelectedRow(); //Se obtiene filas seleccionadas
        // y se asigna a una variable
        if (fila==-1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        }
        else{ //Se toma cada campo de la tabla del registro seleccionado
            // y se asigna una variable
            try{
                int id=Integer.parseInt((String)this.jTableRevista.getValueAt(fila, 0).toString());
                String titu=(String)this.jTableRevista.getValueAt(fila,1);
                String  ay=(String)this.jTableRevista.getValueAt(fila,2);
                String iss=(String)this.jTableRevista.getValueAt(fila,3);
                String pre=(String)this.jTableRevista.getValueAt(fila,4);
                Time hrv=Time.valueOf((String)this.jTableRevista.getValueAt(fila, 5).toString());

                //Se ubican en las cajas de textos los datos capturados de la tabla
                jTextnumero.setText(""+id);
                jTexttitulo.setText(titu);
                jTextayo.setText(ay);
                jTextissn.setText(iss);
                jTextprecio.setText(pre);
                jTexthoraventa.setText(String.valueOf(hrv));
            }catch(NumberFormatException e){
                e.printStackTrace();
            }

        }

    }//GEN-LAST:event_jBEditarRActionPerformed

    private void jBActualizarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarRActionPerformed
        actualizarRevista();
        obtenerDatos();
        LimpiarCampos();

    }//GEN-LAST:event_jBActualizarRActionPerformed

    private void jBBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarRActionPerformed
        // TODO add your handling code here:
          // Obtiene el texto ingresado en el campo de búsqueda
        String terminoBusqueda = jTextBuscarR.getText().trim();

        // Valida que el campo de búsqueda no esté vacío
        if (terminoBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un término para buscar."); // Muestra un mensaje al usuario si el campo está vacío
            return; // Finaliza el método
        }

        try {
            // Llama al método BuscarProducto en DAOProductos para obtener la lista de productos que coinciden con el término de búsqueda
            List<Revista> Revistas = new DAORevista().BuscarRevista(terminoBusqueda);

            // Valida si hay resultados en la lista de pro
            if (Revistas.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No se encontraron Autores con el término: " + terminoBusqueda); // Informa al usuario que no hubo coincidencias
                return; // Finaliza el método
            }

            // Crea un modelo para la tabla con las columnas especificadas
            DefaultTableModel modelo = new DefaultTableModel();
            String[] columnas = {"numero", "titulo", "ayo", "issn", "precio","Horaventa"};
            modelo.setColumnIdentifiers(columnas); // Configura los nombres de las columnas en el modelo

            // Itera sobre los productos encontrados y los agrega como filas al modelo
            for (Revista rev : Revistas) {
                String[] renglon = {
                    Integer.toString(rev.getNumero()),
                    rev.getTitulo(),// Convierte el ID de Autor a String
                    Integer.toString(rev.getAyo()), // Obtiene el nombre del autor
                    rev.getIssn(),
                   Float.toString(rev.getPrecio()),
                    rev.getHoraventa().toString() // Convierte la fechaNac  a String
                };
                modelo.addRow(renglon); // Agrega la fila al modelo
            }

            // Actualiza la tabla con el modelo que contiene los datos de los productos encontrados
            jTableRevista.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace(); // Muestra detalles del error en la consola
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al realizar la búsqueda."); // Notifica al usuario sobre el error
        } 
    }//GEN-LAST:event_jBBuscarRActionPerformed

    private void jTextBuscarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarRActionPerformed

    private void jTextnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnumeroActionPerformed

    private void jTexttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexttituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexttituloActionPerformed

    private void jTexthoraventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexthoraventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexthoraventaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarR;
    private javax.swing.JButton jBAgregarR;
    private javax.swing.JButton jBBorrarR;
    private javax.swing.JButton jBBuscarR;
    private javax.swing.JButton jBEditarR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAutor;
    private javax.swing.JTable jTableRevista;
    private javax.swing.JTextField jTextBuscarR;
    private javax.swing.JTextField jTextayo;
    private javax.swing.JTextField jTexthoraventa;
    private javax.swing.JTextField jTextissn;
    private javax.swing.JTextField jTextnumero;
    private javax.swing.JTextField jTextprecio;
    private javax.swing.JTextField jTexttitulo;
    // End of variables declaration//GEN-END:variables
}
