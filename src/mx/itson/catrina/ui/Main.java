package mx.itson.catrina.ui;

import mx.itson.catrina.entidades.Cuenta;
import mx.itson.catrina.entidades.Movimiento;
import mx.itson.catrina.enumeradores.Tipo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Locale;

/**
 * Clase principal de la interfaz gráfica
 *
 * @author Diego Castro Arce
 */
public class Main extends javax.swing.JFrame {

    /**
     * Inicializa los componentes de la interfaz gráfica
     */
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblCp = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRfc = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblSaldoFinalPeriodo = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblClabe = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblSaldoFinal = new javax.swing.JLabel();
        lblSaldoInicial = new javax.swing.JLabel();
        lblDepositos = new javax.swing.JLabel();
        lblRetiros = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CATRINA BANK");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione el archivo a cargar:\t\t");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 40));

        btnMes.setBackground(new java.awt.Color(204, 204, 204));
        btnMes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnMes.setForeground(new java.awt.Color(51, 51, 51));
        btnMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
        jPanel1.add(btnMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione el mes:\t");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        btnSeleccionar.setBackground(new java.awt.Color(204, 204, 204));
        btnSeleccionar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(51, 51, 51));
        btnSeleccionar.setText("Seleccionar...");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 140, 20));

        jLabel3.setBackground(new java.awt.Color(255, 192, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ESTADO DE CUENTA");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 810, 40));

        lblProducto.setBackground(new java.awt.Color(255, 192, 0));
        lblProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(0, 0, 0));
        lblProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProducto.setOpaque(true);
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 310, 20));

        lblDomicilio.setBackground(new java.awt.Color(255, 255, 255));
        lblDomicilio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDomicilio.setForeground(new java.awt.Color(0, 0, 0));
        lblDomicilio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 320, 20));

        lblCiudad.setBackground(new java.awt.Color(255, 255, 255));
        lblCiudad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 320, 20));

        lblCp.setBackground(new java.awt.Color(255, 255, 255));
        lblCp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCp.setForeground(new java.awt.Color(0, 0, 0));
        lblCp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblCp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 320, 20));

        lblNombre.setBackground(new java.awt.Color(255, 192, 0));
        lblNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNombre.setOpaque(true);
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 320, 20));

        lblRfc.setBackground(new java.awt.Color(255, 255, 255));
        lblRfc.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblRfc.setForeground(new java.awt.Color(0, 0, 0));
        lblRfc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 320, 20));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText(" Saldo final");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText(" CLABE");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 120, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText(" MONEDA");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 120, 20));

        lblSaldoFinalPeriodo.setBackground(new java.awt.Color(255, 192, 0));
        lblSaldoFinalPeriodo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblSaldoFinalPeriodo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoFinalPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldoFinalPeriodo.setOpaque(true);
        lblSaldoFinalPeriodo.setPreferredSize(new java.awt.Dimension(806, 30));
        jPanel1.add(lblSaldoFinalPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 120, -1));

        lblMoneda.setBackground(new java.awt.Color(255, 255, 255));
        lblMoneda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblMoneda.setForeground(new java.awt.Color(0, 0, 0));
        lblMoneda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMoneda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 190, 20));

        lblCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lblCuenta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCuenta.setForeground(new java.awt.Color(0, 0, 0));
        lblCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 190, 20));

        lblClabe.setBackground(new java.awt.Color(255, 255, 255));
        lblClabe.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblClabe.setForeground(new java.awt.Color(0, 0, 0));
        lblClabe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblClabe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblClabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 190, 20));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText(" CUENTA");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 120, 20));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText(" Saldo inicial (anterior)");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 20));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText(" Depósitos");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 20));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText(" Retiros");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 270, 20));

        lblSaldoFinal.setBackground(new java.awt.Color(255, 255, 255));
        lblSaldoFinal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblSaldoFinal.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldoFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblSaldoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 150, 20));

        lblSaldoInicial.setBackground(new java.awt.Color(255, 255, 255));
        lblSaldoInicial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblSaldoInicial.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoInicial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldoInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 150, 20));

        lblDepositos.setBackground(new java.awt.Color(255, 255, 255));
        lblDepositos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblDepositos.setForeground(new java.awt.Color(0, 0, 0));
        lblDepositos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDepositos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblDepositos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 150, 20));

        lblRetiros.setBackground(new java.awt.Color(255, 255, 255));
        lblRetiros.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblRetiros.setForeground(new java.awt.Color(0, 0, 0));
        lblRetiros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRetiros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblRetiros, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 150, 20));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 390, 80));

        jLabel26.setBackground(new java.awt.Color(255, 192, 0));
        jLabel26.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText(" RESUMEN DEL PERIODO");
        jLabel26.setOpaque(true);
        jLabel26.setPreferredSize(new java.awt.Dimension(806, 30));
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 810, 20));

        tblMovimientos.setBackground(new java.awt.Color(255, 255, 255));
        tblMovimientos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblMovimientos.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "FECHA", "DESCRIPCIÓN	", "DEPÓSITO", "RETIRO", "SUBTOTAL"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMovimientos);
        if (tblMovimientos.getColumnModel().getColumnCount() > 0) {
            tblMovimientos.getColumnModel().getColumn(0).setMinWidth(100);
            tblMovimientos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblMovimientos.getColumnModel().getColumn(0).setMaxWidth(100);
            tblMovimientos.getColumnModel().getColumn(2).setMinWidth(100);
            tblMovimientos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblMovimientos.getColumnModel().getColumn(2).setMaxWidth(100);
            tblMovimientos.getColumnModel().getColumn(3).setMinWidth(100);
            tblMovimientos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblMovimientos.getColumnModel().getColumn(3).setMaxWidth(100);
            tblMovimientos.getColumnModel().getColumn(4).setMinWidth(100);
            tblMovimientos.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblMovimientos.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 810, 200));

        jLabel27.setBackground(new java.awt.Color(255, 192, 0));
        jLabel27.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText(" DETALLE DE MOVIMIENTOS");
        jLabel27.setOpaque(true);
        jLabel27.setPreferredSize(new java.awt.Dimension(806, 30));
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 810, 20));

        jLabel28.setBackground(new java.awt.Color(255, 192, 0));
        jLabel28.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("SALDO FINAL DEL PERIODO");
        jLabel28.setOpaque(true);
        jLabel28.setPreferredSize(new java.awt.Dimension(806, 30));
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 690, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        String mes = btnMes.getSelectedItem().toString().toUpperCase(); //Obtiene el mes seleccionado y lo convierte a mayúsculas
        DateFormat dateFormat = new SimpleDateFormat("MMMM", new Locale("es", "MX")); //Obtiene el nombre del mes en español
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Formato de fecha
        DecimalFormat df = new DecimalFormat("#.00"); //Formato de decimales

        //Se abre un file chooser para seleccionar el archivo
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new java.io.File(System.getProperty("user.home")));

            //Comprobamos que el usuario haya seleccionado un archivo
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();
                byte archivoBytes[] = Files.readAllBytes(archivo.toPath());
                String contenido = new String(archivoBytes, StandardCharsets.UTF_8);

                //Se deserealiza el archivo para convertirlo en un objeto de tipo Cuenta
                Cuenta cuenta = new Cuenta().deserealizar(contenido);

                //Se asignan los valores a los labels correspondientes
                lblNombre.setText(" " + cuenta.getCliente().getNombre());
                lblRfc.setText(" " + cuenta.getCliente().getRfc());
                lblDomicilio.setText(" " + cuenta.getCliente().getDomicilio());
                lblCiudad.setText(" " + cuenta.getCliente().getCiudad());
                lblCp.setText(" " + cuenta.getCliente().getCp());
                lblProducto.setText(" " + cuenta.getProducto());
                lblCuenta.setText(cuenta.getCuenta() + " ");
                lblClabe.setText(cuenta.getClabe() + " ");
                lblMoneda.setText(cuenta.getMoneda() + " ");
                lblSaldoInicial.setText(" $ " + df.format(Cuenta.calcularSaldoInicial(cuenta, mes)));
                lblDepositos.setText(" $ " + df.format(Cuenta.calcularDepositos(cuenta, mes)));
                lblRetiros.setText(" $ " + df.format(Cuenta.calcularRetiros(cuenta, mes)));
                lblSaldoFinal.setText(" $ " + df.format(Cuenta.calcularSaldoInicial(cuenta, mes) + Cuenta.calcularDepositos(cuenta, mes) - Cuenta.calcularRetiros(cuenta, mes)));
                lblSaldoFinalPeriodo.setText(" $ " + df.format(Cuenta.calcularSaldoInicial(cuenta, mes) + Cuenta.calcularDepositos(cuenta, mes) - Cuenta.calcularRetiros(cuenta, mes)) + " ");

                //Se ordenan los movimientos por fecha
                cuenta.getMovimientos().sort(Comparator.comparing(Movimiento::getFecha));

                //Se asignan los valores a la tabla de movimientos
                DefaultTableModel model = (DefaultTableModel) tblMovimientos.getModel();
                model.setRowCount(0);
                for (Movimiento movimiento : cuenta.getMovimientos()) {
                    if (dateFormat.format(movimiento.getFecha()).toUpperCase().equals(mes)) {
                        if (movimiento.getTipo() == Tipo.DEPOSITO) {
                            model.addRow(new Object[]{
                                    formato.format(movimiento.getFecha()),
                                    movimiento.getDescripcion(),
                                    df.format(movimiento.getCantidad()),
                                    ""});
                        } else {
                            model.addRow(new Object[]{
                                    formato.format(movimiento.getFecha()),
                                    movimiento.getDescripcion(),
                                    "",
                                    df.format(movimiento.getCantidad())});
                        }
                    }
                }

                double subtotal = 0; //Variable para calcular el subtotal de los movimientos en la tabla

                //Calcula el subtotal de los movimientos obteniendo el valor de la columna de depósitos y retiros
                for (int i = 0; i < tblMovimientos.getRowCount(); i++) {
                    if (tblMovimientos.getValueAt(i, 2) != "") {
                        subtotal += Double.parseDouble(tblMovimientos.getValueAt(i, 2).toString());
                    } else {
                        subtotal -= Double.parseDouble(tblMovimientos.getValueAt(i, 3).toString());
                    }
                    tblMovimientos.setValueAt("$ " + df.format(Cuenta.calcularSaldoInicial(cuenta, mes) + subtotal), i, 4);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    /**
     * Método principal de la clase
     *
     * @param args Los argumentos de la línea de comandos
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btnMes;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblClabe;
    private javax.swing.JLabel lblCp;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDepositos;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblRetiros;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblSaldoFinal;
    private javax.swing.JLabel lblSaldoFinalPeriodo;
    private javax.swing.JLabel lblSaldoInicial;
    private javax.swing.JTable tblMovimientos;
    // End of variables declaration//GEN-END:variables
}
