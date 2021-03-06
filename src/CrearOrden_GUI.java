
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 * Se encarga en crear una nueva orden donde el usuario ingresa los detalles 
 * @author Rodrigo Zea, Oscar Juarez, Andrés Quan
 * @version 17.11.17
 */
public class CrearOrden_GUI extends javax.swing.JFrame {
    Procesos procesos = new Procesos();
    private ArrayList<Orden> ordenes = new ArrayList<>(); 
    private int contadorOrdenes=0;
    private int precioC, precioCh, precioB, precioT, restaurante;
    public CrearOrden_GUI() {
        initComponents();
        bloquear();
        
       // procesos.showOpts(opcion, cmbComida, cmbBebida, cmbChips);
    }
    
    public CrearOrden_GUI(int opcion) {
        initComponents();
        procesos.showOpts(opcion, cmbComida, cmbBebida, cmbChips);
        procesos.conseguirListaOrdenes(ordenes);
        procesos.getContador();
        restaurante = opcion;        
        bloquear();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        spnCord = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbComida = new javax.swing.JComboBox<>();
        cmbChips = new javax.swing.JComboBox<>();
        cmbBebida = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPrec = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        spnCord1 = new javax.swing.JSpinner();
        spnCord2 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblOrd1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnElim = new javax.swing.JButton();
        lblOrd2 = new javax.swing.JLabel();
        lblOrd3 = new javax.swing.JLabel();
        lblOrd4 = new javax.swing.JLabel();
        lblOrd5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCom = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setText("Forma de pago:");

        spnCord.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnCord.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCordStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Menu:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Comida:");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("Chips:");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setText("Bebida:");

        cmbComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComidaActionPerformed(evt);
            }
        });

        cmbChips.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChipsActionPerformed(evt);
            }
        });

        cmbBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cmbBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBebidaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setText("Total a pagar:");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setText("Q");

        lblPrec.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPrec.setText("Precio");

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        spnCord1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnCord1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCord1StateChanged(evt);
            }
        });

        spnCord2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnCord2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCord2StateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setText("1.");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("Cant.");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setText("Cant.");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setText("Cant.");

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblOrd1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel17.setText("2.");

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel19.setText("3.");

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel21.setText("4.");

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel23.setText("5.");

        btnElim.setBackground(new java.awt.Color(255, 51, 51));
        btnElim.setText("Eliminar Ordenes");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        lblOrd2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblOrd3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblOrd4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        lblOrd5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("Seleccione el dia y hora de entrega");

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.HOUR_OF_DAY));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setText("Ingrese su tarjeta de credito:");

        jButton3.setText("Hacer pedido");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel20.setText("Crear Orden:");

        txtCom.setColumns(20);
        txtCom.setRows(5);
        jScrollPane1.setViewportView(txtCom);

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setText("Ingrese una nota adicional (opcional):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOrd1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOrd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOrd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOrd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOrd5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(137, 137, 137)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(86, 86, 86)))
                                        .addGap(64, 64, 64)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPrec))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(cmbComida, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel14))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnCord, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(cmbChips, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel12))
                                            .addComponent(spnCord1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(cmbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(spnCord2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))))
                                .addGap(0, 250, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel20)
                    .addContainerGap(944, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14))
                        .addGap(29, 29, 29))
                    .addComponent(cmbChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnCord1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnCord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lblOrd1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(lblOrd2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(lblOrd3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(lblOrd4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrd5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(lblPrec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(9, 9, 9)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel20)
                    .addContainerGap(769, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        segundaParte();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                            
        if(jTextField1.getText().equals(" ") == false){ 
           procesos.salvarOrd(ordenes);
            FacturaT_GUI factura = new FacturaT_GUI(procesos.contador);
            factura.ordenes = ordenes;
            factura.setVisible(true);
            this.setVisible(false); 
            
        }else{ 
            JOptionPane.showMessageDialog(null, "Ingrese una tarjeta de crédito, por favor", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                             
        
        //Fecha del spinner
        Date fecha = (Date) jSpinner1.getValue();
        
        int horas = fecha.getHours();
        int minutos = fecha.getMinutes();
        
        int totalM = (horas*60)+minutos;
        
        int horas2 = new Date().getHours();
        int minutos2 = new Date().getMinutes();
        
        int totalM2 = (horas2*60)+minutos2;
        
        int resta = Math.abs(totalM2-totalM);
        
        //Fecha definida a partir de una semana
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        Date semana = calendar.getTime();                


         System.out.println(totalM+"");
         System.out.println(totalM2+"");
        
    if (fecha.before(new Date()) ) {
        
        JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida", "Error", JOptionPane.WARNING_MESSAGE);
       
    } else if (fecha.after(semana)){
        
        JOptionPane.showMessageDialog(null, "Dispone de menos de una semana para hacer una reserva", "Error", JOptionPane.WARNING_MESSAGE);
        
    } else if (fecha.getDay() == 0){
        
        JOptionPane.showMessageDialog(null, "No puede realizar una orden el día Domingo", "Error", JOptionPane.WARNING_MESSAGE);
        
    } else if (fecha.getHours() < 7 || fecha.getHours() > 12){
        
        JOptionPane.showMessageDialog(null, "El restaurante se encuentra cerrado a esta hora", "Error", JOptionPane.WARNING_MESSAGE);
        
    }else if (precioT==0){ 
        
        JOptionPane.showMessageDialog(null, "Por favor agregue un item a su orden", "Error", JOptionPane.WARNING_MESSAGE);
        
    } else if (fecha.getDay() == new Date().getDay() && resta<15){       
    
            JOptionPane.showMessageDialog(null, "Se necesitan minimo 15 minutos para reservar la orden", "Error", JOptionPane.WARNING_MESSAGE);  
        
    } else {
        
        String comida = (String) cmbComida.getSelectedItem();
        String chips = (String) cmbChips.getSelectedItem();
        String bebida = (String) cmbBebida.getSelectedItem();
        int cCom = (int) spnCord.getValue();
        int cChi = (int) spnCord1.getValue();
        int cBeb = (int) spnCord2.getValue();
        String comment = txtCom.getText();                                    
        fecha.setHours(fecha.getHours()-6);
        
        switch (contadorOrdenes){ 
            case 0:
                procesos.crearOrden(lblOrd1, comida, chips, bebida, cCom, cChi, cBeb, comment, fecha, 0, precioT, ordenes, restaurante);
                Orden ord = new Orden(comida, bebida, chips, comment, procesos.contador, cCom, cBeb, cChi, fecha, precioT, restaurante);
                ordenes.add(ord);
                contadorOrdenes++;
                break;
            case 1:
                procesos.crearOrden(lblOrd2, comida, chips, bebida, cCom, cChi, cBeb, comment, fecha, 0, precioT, ordenes, restaurante);                
                Orden ord2 = new Orden(comida, bebida, chips, comment, procesos.contador, cCom, cBeb, cChi, fecha, precioT, restaurante);
                ordenes.add(ord2);
                contadorOrdenes++;
                break;
            case 2:
                procesos.crearOrden(lblOrd3, comida, chips, bebida, cCom, cChi, cBeb, comment, fecha, 0, precioT, ordenes, restaurante);                
                Orden ord3 = new Orden(comida, bebida, chips, comment, procesos.contador, cCom, cBeb, cChi, fecha, precioT, restaurante);
                ordenes.add(ord3);
                contadorOrdenes++;
                break;
            case 3:
                procesos.crearOrden(lblOrd4, comida, chips, bebida, cCom, cChi, cBeb, comment, fecha, 0, precioT, ordenes, restaurante);
                Orden ord4 = new Orden(comida, bebida, chips, comment, procesos.contador, cCom, cBeb, cChi, fecha, precioT, restaurante);
                ordenes.add(ord4);
                contadorOrdenes++;
                break;
            case 4:
                procesos.crearOrden(lblOrd5, comida, chips, bebida, cCom, cChi, cBeb, comment, fecha, 0, precioT, ordenes, restaurante);
                Orden ord5 = new Orden(comida, bebida, chips, comment, procesos.contador, cCom, cBeb, cChi, fecha, precioT, restaurante);
                ordenes.add(ord5);
                contadorOrdenes++;
                break;
            case 5:
                JOptionPane.showMessageDialog(this, "Solo puede crear 5 ordendes con el mismo ID");                
            
        }        
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbComidaActionPerformed
        // TODO add your handling code here:
        precioC = procesos.colocarPrecioComida(cmbComida, spnCord);
        precioT = procesos.precioTotal(precioC, precioCh, precioB);
        lblPrec.setText(precioT+"");
    }//GEN-LAST:event_cmbComidaActionPerformed

    private void spnCordStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCordStateChanged
        // TODO add your handling code here:
        precioC = procesos.colocarPrecioComida(cmbComida, spnCord);
        precioT = procesos.precioTotal(precioC, precioCh, precioB);
        lblPrec.setText(precioT+"");
                                         
    }//GEN-LAST:event_spnCordStateChanged

    private void cmbChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChipsActionPerformed
        // TODO add your handling code here:
        precioCh = procesos.colocarPrecioChips(cmbChips, spnCord1);
        precioT = procesos.precioTotal(precioC, precioCh, precioB);
        lblPrec.setText(precioT+"");
    }//GEN-LAST:event_cmbChipsActionPerformed

    private void spnCord1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCord1StateChanged
        // TODO add your handling code here:
        precioCh = procesos.colocarPrecioChips(cmbChips, spnCord1);
        precioT = procesos.precioTotal(precioC, precioCh, precioB);
        lblPrec.setText(precioT+"");
    }//GEN-LAST:event_spnCord1StateChanged

    private void cmbBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBebidaActionPerformed
        // TODO add your handling code here:
        precioB = procesos.colocarPrecioBebidas(cmbBebida, spnCord2);
        precioT = procesos.precioTotal(precioC, precioCh, precioB);
        lblPrec.setText(precioT+"");
    }//GEN-LAST:event_cmbBebidaActionPerformed

    private void spnCord2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCord2StateChanged
        // TODO add your handling code here:
        precioB = procesos.colocarPrecioBebidas(cmbBebida, spnCord2);
        precioT = procesos.precioTotal(precioC, precioCh, precioB);
        lblPrec.setText(precioT+"");
    }//GEN-LAST:event_spnCord2StateChanged

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        int decision = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar todas  las ordenes?", "Aviso", JOptionPane.YES_NO_OPTION);        
        
        if (decision==0) {
            
            procesos.eliminarOrden(ordenes, procesos.contador);
            lblOrd1.setText("");
            lblOrd2.setText("");
            lblOrd3.setText("");
            lblOrd4.setText("");
            lblOrd5.setText("");
            
        }
    }//GEN-LAST:event_btnElimActionPerformed

    
    
    public void bloquear(){
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jTextField1.setEnabled(false);
    }
    
    public void segundaParte(){
        btnElim.setEnabled(false);
        jButton2.setEnabled(false);
        cmbComida.setEnabled(false);
        cmbBebida.setEnabled(false);
        cmbChips.setEnabled(false);
        jButton3.setEnabled(true);
        jSpinner1.setVisible(false);
        txtCom.setEnabled(false);
        jButton1.setEnabled(false);
        jTextField1.setEnabled(true);
    }
    
    
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
            java.util.logging.Logger.getLogger(CrearOrden_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearOrden_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearOrden_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearOrden_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearOrden_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElim;
    private javax.swing.JComboBox<String> cmbBebida;
    private javax.swing.JComboBox<String> cmbChips;
    private javax.swing.JComboBox<String> cmbComida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblOrd1;
    private javax.swing.JLabel lblOrd2;
    private javax.swing.JLabel lblOrd3;
    private javax.swing.JLabel lblOrd4;
    private javax.swing.JLabel lblOrd5;
    private javax.swing.JLabel lblPrec;
    private javax.swing.JSpinner spnCord;
    private javax.swing.JSpinner spnCord1;
    private javax.swing.JSpinner spnCord2;
    private javax.swing.JTextArea txtCom;
    // End of variables declaration//GEN-END:variables
}
