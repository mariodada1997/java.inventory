package ContabilidadJamones;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class frmProductos extends javax.swing.JFrame {
     
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    Statement sentencia;
    cMiscelanea mis=null;
    cConexion con=null;
    
    public frmProductos() {
        initComponents();
        mis= new cMiscelanea();
        mis.Deshabilitar(jPanel1);
        con = new cConexion();
        this.llenarTabla();
        this.llenarInv();
    }
            
    public void llenarTabla()
    {
        try
        {
            String[] titulostit={"ID Evento","Evento", "Producto","Cantidad","Destinatario","Fecha"};
            String sqlsql="SELECT * FROM higuera_eventos";
            modelo2= new DefaultTableModel(null,titulostit);
            ResultSet resultadores = con.getRegistros(sqlsql);
            String[] filafil = new String[6];

            while(resultadores.next())
            {
                filafil[0]=resultadores.getString("id_evento");
                filafil[1]=resultadores.getString("evento");
                filafil[2]=resultadores.getString("producto");
                filafil[3]=resultadores.getString("peso");
                filafil[4]=resultadores.getString("destinatario");
                filafil[5]=resultadores.getString("fecha");
                modelo2.addRow(filafil);
            }
            
            tblClientes.setModel(modelo2);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void llenarInv() {
        try
        {
            String[] titulosll={"Producto","Cantidad"};
            String sqlll="SELECT `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `13` FROM `higuera_inventario` WHERE 1";
            modelo= new DefaultTableModel(null,titulosll);
            ResultSet resultadooo = con.getRegistros(sqlll);
            String[] filaaa = new String[2];

            while(resultadooo.next())
            {
                filaaa[0]="Jamón cocido del Rancho 4.5 kg";
                filaaa[1]=resultadooo.getString("1");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón cocido La Higuera MUSLO 150%";
                filaaa[1]=resultadooo.getString("2");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón cocido La Higuera PIERNA 150%";
                filaaa[1]=resultadooo.getString("3");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón horneado del Rancho 6.0 kg";
                filaaa[1]=resultadooo.getString("4");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón t. York del Rancho 6.0 kg";
                filaaa[1]=resultadooo.getString("5");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón t. York del Rancho 6.0 kg ahum";
                filaaa[1]=resultadooo.getString("6");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón t. York La Higuera 6.0 kg";
                filaaa[1]=resultadooo.getString("7");
                modelo.addRow(filaaa);
                filaaa[0]="Lomo horneado La Higuera 6.0 kg";
                filaaa[1]=resultadooo.getString("8");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón Gourmet La Higuera 3.8 kg";
                filaaa[1]=resultadooo.getString("9");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón t. Virginia de pavo La Higuera 4.5 kg";
                filaaa[1]=resultadooo.getString("10");
                modelo.addRow(filaaa);
                filaaa[0]="Jamón ahumado de pavo La Higuera 2-3 kg";
                filaaa[1]=resultadooo.getString("11");
                modelo.addRow(filaaa);
                filaaa[0]="Pechuga horneada La Higuera 4.5 kg";
                filaaa[1]=resultadooo.getString("12");
                modelo.addRow(filaaa);
                filaaa[0]="Pechuga gourmet La Higuera 3.8 kg";
                filaaa[1]=resultadooo.getString("13");
                modelo.addRow(filaaa);
            }
            tblInventario.setModel(modelo);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboProducto1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        btnEntrega = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        btnProducto = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtCantidad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Producto");

        comboProducto1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        comboProducto1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JAMÓN DE CERDO", "Jamón cocido del Rancho 4.5 kg", "Jamón cocido La Higuera MUSLO 150%", "Jamón cocido La Higuera PIERNA 150%", "Jamón horneado del Rancho 6.0 kg", "Jamón t. York del Rancho 6.0 kg", "Jamón t. York del Rancho 6.0 kg ahum", "Jamón t. York La Higuera 6.0 kg", "Lomo horneado La Higuera 6.0 kg", "Jamón Gourmet La Higuera 3.8 kg", " ", "JAMÓN DE PAVO", "Jamón t. Virginia de pavo La Higuera 4.5 kg", "Jamón ahumado de pavo La Higuera 2-3 kg", "Pechuga horneada La Higuera 4.5 kg", "Pechuga gourmet La Higuera 3.8 kg", " ", "CHORIZO", "Longaniza ahumada del Rancho 4 kg", "Chorizo tipo español del Rancho 2-5.5", "Pasta de chorizo t. español del Rancho", "Chorizo tipo español La Higuera 3 kg", "Pasta de chorizo t. español Higuera", "Chorizo de lomo La Higuera 2.5 kg", "Chorizo de pavo La Higuera", "Chistorra", " ", "TOCINO", "Tocineta ahumada del Rancho", "Tocino ahumado La Higuera pieza", "Tocino enrollado La Higuera", "Puntas de tocino", " ", "ESPECIALIDADES", "Pierna ahumada Antigua Jamonería 2.5 kg", "Pierna enchilada La Higuera 2.5 kg", "Lomoleta ahumada La Higuera 3.5 kg", "Chuleta ahumada de pavo La Higuera 3.5 kg", "Chuleta ahumada del rancho 3.5 kg", "Lomo t. canadiense La Higuera 2 kg", "Trucha ahumada La Higuera 0.260 kg", "Trucha deshuesada La Higuera 0.240 kg", "Filete de trucha La Higuera 0.175 kg", "Queso de puerco La Higuera 4.3 kg", "Salami cocido La Higuera 2.1 kg", "Chamorros ahumados", " ", "PAQUETERÍA", "Chorizo vegetariano Higuera (400 gr)", "Kibbeh charola (650 gr)", "Jamón cocido Rancho rebanado 1 kg", "Jamón Amer Higue muslo reb 150% 1 kg", "Jamón York Rancho rebanado 1 kg", "Jamón Virginia de pavo rebanado 1 kg", "Tocino ahumado Higuera rebanado 1 Kg", "Salchicha", "Maíz pozolero 1 Kg", " ", "OTROS", "Cuero desgrasado", "Chamorro de cerdo crudo", "Grasa", "Chamorro deshuesado" }));
        comboProducto1.setSelectedItem(null);
        comboProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProducto1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Cantidad (kg):");

        btnEntrega.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContabilidadJamones/-.png"))); // NOI18N
        btnEntrega.setText("Salida");
        btnEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("Destinatario:");

        txtDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinatarioActionPerformed(evt);
            }
        });

        btnProducto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContabilidadJamones/+.png"))); // NOI18N
        btnProducto.setText("Entrada");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContabilidadJamones/manila-nuevo-icono-3676-96.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContabilidadJamones/ver-actualizacion-de-edad-icono-6115-96.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Evento", "Evento", "Producto", "Cantidad", "Destinatario", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        tblClientes.getAccessibleContext().setAccessibleName("tblClientes");

        btnEliminar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContabilidadJamones/eliminar-icono-9787-96.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Jamón cocido del Rancho 4.5 kg", null},
                {"Jamón cocido La Higuera MUSLO 150%", null},
                {"Jamón cocido La Higuera PIERNA 150%", null},
                {"Jamón horneado del Rancho 6.0 kg", null},
                {"Jamón t. York del Rancho 6.0 kg", null},
                {"Jamón t. York del Rancho 6.0 kg ahum", null},
                {"Jamón t. York La Higuera 6.0 kg", null},
                {"Lomo horneado La Higuera 6.0 kg", null},
                {"Jamón Gourmet La Higuera 3.8 kg", null},
                {"Jamón t. Virginia de pavo La Higuera 4.5 kg", null},
                {"Jamón ahumado de pavo La Higuera 2-3 kg", null},
                {"Pechuga horneada La Higuera 4.5 kg", null},
                {"Pechuga gourmet La Higuera 3.8 kg", null}
            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblInventario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDestinatario)
                                    .addComponent(txtCantidad)
                                    .addComponent(comboProducto1, 0, 319, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel12)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnNuevo)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnProducto)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnEntrega)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboProducto1.getAccessibleContext().setAccessibleName("comboProducto1");
        btnEntrega.getAccessibleContext().setAccessibleName("btnEntrega");
        txtDestinatario.getAccessibleContext().setAccessibleName("txtDestinatario");
        btnProducto.getAccessibleContext().setAccessibleName("btnProducto");
        btnNuevo.getAccessibleContext().setAccessibleName("btnNuevo");
        btnActualizar.getAccessibleContext().setAccessibleName("btnActualizar");
        txtCantidad.getAccessibleContext().setAccessibleName("txtCantidad");
        btnEliminar.getAccessibleContext().setAccessibleName("btnEliminar");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContabilidadJamones/LogoHiguera.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        jLabel2.setText("INVENTARIO");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel4.setText("Productos");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContabilidadJamones/updatetables.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProducto1ActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        try {
            String comboProd = String.valueOf(comboProducto1.getSelectedItem());
            
            if((txtCantidad.getText().trim().length()==0 ||  comboProd.length()==0)) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
            else {
                if (comboProd==null || comboProd==" " || comboProd=="JAMÓN DE CERDO" || comboProd=="JAMÓN DE PAVO" || comboProd=="CHORIZO" || comboProd=="TOCINO" || comboProd=="ESPECIALIDADES" || comboProd=="PAQUETERÍA" || comboProd=="OTROS"){
                    JOptionPane.showMessageDialog(null, "Introduzca un producto válido");
                }
                else{
                        float cantidad = Float.parseFloat(txtCantidad.getText());
                        if (cantidad>0) {
                            String date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
                            String sql = "INSERT INTO higuera_eventos (evento, producto, peso, fecha) VALUES('Entrada + ', ?, ?, ?)";
                            String [] Valores = {String.valueOf(comboProducto1.getSelectedItem()), txtCantidad.getText(), date};
                            con.Guardar(sql, Valores);
                                if (comboProd=="Jamón cocido del Rancho 4.5 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `1` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `1`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón cocido La Higuera MUSLO 150%") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `2` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `2`="+num1+ "WHERE 1");
                                    }                  
                                }
                                if (comboProd=="Jamón cocido La Higuera PIERNA 150%") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `3` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `3`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón horneado del Rancho 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `4` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `4`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. York del Rancho 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `5` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `5`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. York del Rancho 6.0 kg ahum") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `6` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `6`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. York La Higuera 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `7` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `7`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Lomo horneado La Higuera 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `8` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `8`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón Gourmet La Higuera 3.8 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `9` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `9`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. Virginia de pavo La Higuera 4.5 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `10` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `10`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón ahumado de pavo La Higuera 2-3 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `11` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `11`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Pechuga horneada La Higuera 4.5 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `12` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `12`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Pechuga gourmet La Higuera 3.8 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `13` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 + cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `13`="+num1+ "WHERE 1");
                                    }                     
                                }
                            JOptionPane.showMessageDialog(null, "Evento agregado");
                            this.llenarTabla();
                            this.llenarInv();
                            mis.LimpiarProducto(jPanel1);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Introduzca una cantidad válida");
                        }
                }
            }
   
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnProductoActionPerformed
            
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        mis.Habilitar(jPanel1); 
        mis.LimpiarProducto(jPanel1);
    }//GEN-LAST:event_btnNuevoActionPerformed

    
    private void btnEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregaActionPerformed
        try {
            String comboProd = String.valueOf(comboProducto1.getSelectedItem());
            
            if((txtCantidad.getText().trim().length()==0 || txtDestinatario.getText().trim().length()==0 ||  comboProd.length()==0)) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            }
            else {
                if (comboProd==null || comboProd==" " || comboProd=="JAMÓN DE CERDO" || comboProd=="JAMÓN DE PAVO" || comboProd=="CHORIZO" || comboProd=="TOCINO" || comboProd=="ESPECIALIDADES" || comboProd=="PAQUETERÍA" || comboProd=="OTROS"){
                    JOptionPane.showMessageDialog(null, "Introduzca un producto válido");
                }
                else{
                        float cantidad = Float.parseFloat(txtCantidad.getText());
                        if (cantidad>0) {
                            String date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar.getInstance().getTime());
                            String sql = "INSERT INTO higuera_eventos (evento, producto, peso, destinatario, fecha) VALUES('Salida - ', ?, ?, ?, ?)";
                            String [] Valores = {String.valueOf(comboProducto1.getSelectedItem()), txtCantidad.getText(), txtDestinatario.getText(), date};
                            con.Guardar(sql, Valores);
                                if (comboProd=="Jamón cocido del Rancho 4.5 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `1` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 =DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `1`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón cocido La Higuera MUSLO 150%") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `2` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `2`="+num1+ "WHERE 1");
                                    }                       
                                }
                                if (comboProd=="Jamón cocido La Higuera PIERNA 150%") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `3` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `3`="+num1+ "WHERE 1");
                                    }                      
                                }
                                if (comboProd=="Jamón horneado del Rancho 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `4` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `4`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. York del Rancho 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `5` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `5`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. York del Rancho 6.0 kg ahum") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `6` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `6`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. York La Higuera 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `7` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `7`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Lomo horneado La Higuera 6.0 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `8` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `8`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón Gourmet La Higuera 3.8 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `9` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `9`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón t. Virginia de pavo La Higuera 4.5 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `10` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `10`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Jamón ahumado de pavo La Higuera 2-3 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `11` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `11`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Pechuga horneada La Higuera 4.5 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `12` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `12`="+num1+ "WHERE 1");
                                    }                     
                                }
                                if (comboProd=="Pechuga gourmet La Higuera 3.8 kg") {
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt = conn.createStatement() ;
                                    String query = "SELECT `13` FROM `higuera_inventario` WHERE 1" ;
                                    ResultSet num = stmt.executeQuery(query);
                                    for (; num.next();) {
                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                    num1= num1 - cantidad;
                                    Class.forName("com.mysql.jdbc.Driver") ;
                                    Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                    Statement stmt2 = conn2.createStatement() ;
                                    stmt2.executeUpdate("UPDATE `higuera_inventario` SET `13`="+num1+ "WHERE 1");
                                    }                     
                                }
                            JOptionPane.showMessageDialog(null, "Evento agregado");
                            this.llenarTabla();
                            this.llenarInv();
                            mis.Limpiar(jPanel1);
                            txtCantidad.setText("");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Introduzca una cantidad válida");
                        }
                }
            }
   
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEntregaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila= tblClientes.getSelectedRow();
        if(fila<1)
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione el registro que desea eliminar");
            return;
        }
        String IdEvento= tblClientes.getValueAt(fila, 0).toString();
        try {
                String comboProd = String.valueOf(comboProducto1.getSelectedItem());
                String sql="DELETE FROM higuera_eventos WHERE id_evento=" + IdEvento;
                float cantidad = Float.parseFloat(txtCantidad.getText());
                    if (comboProd.equals("Jamón cocido del Rancho 4.5 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `1` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            JOptionPane.showMessageDialog(null, fila111[0]);
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `1`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón cocido La Higuera MUSLO 150%")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `2` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `2`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón cocido La Higuera PIERNA 150%")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `3` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `3`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón horneado del Rancho 6.0 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `4` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `4`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón t. York del Rancho 6.0 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `5` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `5`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón t. York del Rancho 6.0 kg ahum")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ; ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `6` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `6`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón t. York La Higuera 6.0 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `7` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `7`="+num1+ "WHERE 1");
                                        }                     
                    }if (comboProd.equals("Lomo horneado La Higuera 6.0 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `8` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `8`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón Gourmet La Higuera 3.8 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `9` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `9`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón t. Virginia de pavo La Higuera 4.5 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `10` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `10`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Jamón ahumado de pavo La Higuera 2-3 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `11` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `11`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Pechuga horneada La Higuera 4.5 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `12` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `12`="+num1+ "WHERE 1");
                                        }                     
                    }
                    if (comboProd.equals("Pechuga gourmet La Higuera 3.8 kg")) {
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt = conn.createStatement() ;
                                        String query = "SELECT `13` FROM `higuera_inventario` WHERE 1" ;
                                        ResultSet num = stmt.executeQuery(query);
                                        for (; num.next();) {
                                        float num1 =  ((Number) num.getObject(1)).floatValue();
                                        
                                            String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){
                                                num1= num1 - cantidad;
                                            }
                                            if (fila111[0]!= null) {
                                                num1= num1 + cantidad;
                                            }
                                        Class.forName("com.mysql.jdbc.Driver") ;
                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                        Statement stmt2 = conn2.createStatement() ;
                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `13`="+num1+ "WHERE 1");
                                        }                     
                    }
                    
                if(con.ejecutarConsulta(sql)>=1)
            {
                JOptionPane.showMessageDialog(null, "Evento eliminado con éxito");
                this.llenarTabla();
                this.llenarInv();
                mis.Limpiar(jPanel1);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int fila= tblClientes.getSelectedRow();
        if(fila<0) 
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un registro válido");
            return;
        }
        String IdCliente= tblClientes.getValueAt(fila, 0).toString(); 
        if(evt.getButton()==1) 
        {
            try{
                mis.Habilitar(jPanel1); 
                String sql="SELECT * FROM higuera_eventos WHERE id_evento=" + IdCliente; 
                ResultSet resultado = con.getRegistros(sql); 
                resultado.next(); 
                txtCantidad.setText(resultado.getString("peso")); 
                txtDestinatario.setText(resultado.getString("destinatario"));
                comboProducto1.setSelectedItem(resultado.getString("producto"));

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); 
            }
        }
        
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int fila= tblClientes.getSelectedRow();
        if(fila<0)
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un registro válido");
            return;
        }
        
        String IdEvento= tblClientes.getValueAt(fila, 0).toString();
        
            try {
                String comboProd = String.valueOf(comboProducto1.getSelectedItem());
                String sql111="SELECT `destinatario` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;              
                                            ResultSet resultado = con.getRegistros(sql111);
                                            String[] fila111 = new String[1];
                                            while(resultado.next())
                                            {
                                                fila111[0]=resultado.getString("destinatario");
                                            }
                                            if (fila111[0]==null){

                                                
                                                if(txtCantidad.getText().trim().length()==0  || comboProd.length()==0) {
                                                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
                                                }
                                                else {
                                                    Class.forName("com.mysql.jdbc.Driver") ;
                                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                    Statement stmt = conn.createStatement() ;
                                                    String query = "SELECT `peso` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                                    ResultSet num_act = stmt.executeQuery(query);
                                                    for (; num_act.next();) {
                                                        float num_actual =  ((Number) num_act.getObject(1)).floatValue();

                                                        String sql = "UPDATE higuera_eventos SET producto=(?), peso=(?),destinatario=(?) WHERE id_evento=" + IdEvento;
                                                        String [] Valores = { String.valueOf(comboProducto1.getSelectedItem()), txtCantidad.getText(), txtDestinatario.getText()};
                                                        int nR = con.Guardar(sql, Valores);
                                                        float cantidad = Float.parseFloat(txtCantidad.getText());

                                                            if (comboProd.equals("Jamón cocido del Rancho 4.5 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `1` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Statement stmt2 = connn.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `1`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                      
                                                            if (comboProd.equals("Jamón cocido La Higuera MUSLO 150%")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `2` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `2`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            
                                                            if (comboProd.equals("Jamón cocido La Higuera PIERNA 150%")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `3` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `3`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            
                                                            if (comboProd.equals("Jamón horneado del Rancho 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `4` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `4`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            
                                                            if (comboProd.equals("Jamón t. York del Rancho 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `5` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `5`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón t. York del Rancho 6.0 kg ahum")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `6` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `6`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón t. York La Higuera 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `7` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `7`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Lomo horneado La Higuera 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `8` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `8`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón Gourmet La Higuera 3.8 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `9` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `9`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }

                                                            if (comboProd.equals("Jamón t. Virginia de pavo La Higuera 4.5 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `10` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `10`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón ahumado de pavo La Higuera 2-3 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `11` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `11`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Pechuga horneada La Higuera 4.5 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `12` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `12`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Pechuga gourmet La Higuera 3.8 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `13` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 + cantidad - num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `13`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                    }   
                                                }
                                            }
                                            

                                            if (fila111[0]!= null) {
                                               // salida
                                                JOptionPane.showMessageDialog(null, "salida");
                                                if(txtCantidad.getText().trim().length()==0  || txtDestinatario.getText().trim().length()==0 || comboProd.length()==0) {
                                                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
                                                }
                                                else {
                                                    Class.forName("com.mysql.jdbc.Driver") ;
                                                    Connection conn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                    Statement stmt = conn.createStatement() ;
                                                    String query = "SELECT `peso` FROM `higuera_eventos` WHERE id_evento="+ IdEvento ;
                                                    ResultSet num_act = stmt.executeQuery(query);
                                                    for (; num_act.next();) {
                                                        float num_actual =  ((Number) num_act.getObject(1)).floatValue();

                                                        String sql = "UPDATE higuera_eventos SET producto=(?), peso=(?),destinatario=(?) WHERE id_evento=" + IdEvento;
                                                        String [] Valores = { String.valueOf(comboProducto1.getSelectedItem()), txtCantidad.getText(), txtDestinatario.getText()};
                                                        int nR = con.Guardar(sql, Valores);
                                                        float cantidad = Float.parseFloat(txtCantidad.getText());   
                                                        
                                                        if (comboProd.equals("Jamón cocido del Rancho 4.5 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `1` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `1`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                      
                                                            if (comboProd.equals("Jamón cocido La Higuera MUSLO 150%")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `2` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `2`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            
                                                            if (comboProd.equals("Jamón cocido La Higuera PIERNA 150%")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `3` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `3`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            
                                                            if (comboProd.equals("Jamón horneado del Rancho 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `4` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `4`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            
                                                            if (comboProd.equals("Jamón t. York del Rancho 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `5` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `5`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón t. York del Rancho 6.0 kg ahum")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `6` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `6`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón t. York La Higuera 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `7` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `7`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Lomo horneado La Higuera 6.0 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `8` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `8`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón Gourmet La Higuera 3.8 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `9` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `9`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón t. Virginia de pavo La Higuera 4.5 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `10` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `10`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Jamón ahumado de pavo La Higuera 2-3 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `11` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `11`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Pechuga horneada La Higuera 4.5 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `12` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `12`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }                  
                                                                
                                                            }
                                                            
                                                            if (comboProd.equals("Pechuga gourmet La Higuera 3.8 kg")) {
                                                                Class.forName("com.mysql.jdbc.Driver") ;
                                                                Connection connn = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                Statement stmtt = connn.createStatement() ;
                                                                String queryy = "SELECT `13` FROM `higuera_inventario` WHERE 1" ;
                                                                ResultSet num = stmtt.executeQuery(queryy);
                                                                for (; num.next();) {
                                                                    float num1 =  ((Number) num.getObject(1)).floatValue();
                                                                    
                                                                        num1= num1 - cantidad + num_actual ;
                                                                        Class.forName("com.mysql.jdbc.Driver") ;
                                                                        Connection conn2 = DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql3235424", "sql3235424", "E1nTtsmm8W") ;
                                                                        Statement stmt2 = conn2.createStatement() ;
                                                                        stmt2.executeUpdate("UPDATE `higuera_inventario` SET `13`="+num1+ "WHERE 1");
                                                                        if (nR > 0) {
                                                                            JOptionPane.showMessageDialog(null, "Evento actualizado");
                                                                            this.llenarTabla();
                                                                            this.llenarInv();
                                                                            mis.LimpiarProducto(jPanel1);
                                                                        } 
                                                                        else
                                                                            JOptionPane.showMessageDialog(null, "Error al actualizar");
                                                                    }
                                                            }
                                                }
                                            }
                                    }
                }
                                           
                                            

            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinatarioActionPerformed

    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblInventarioMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.llenarTabla();
        this.llenarInv();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        con.cerrarConexion();
        System.exit(0);
    }    
    
    
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
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JButton btnEntrega;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnProducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboProducto1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDestinatario;
    // End of variables declaration//GEN-END:variables
}
