/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab6P2_EvaSalgado;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author evaja
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setTitle("Super Juegos Management and More");
        setSize(993, 605);
        add_consola.setVisible(false);
        add_juego.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_acciones = new javax.swing.JPopupMenu();
        jt_agregar = new javax.swing.JMenuItem();
        jt_modificar = new javax.swing.JMenuItem();
        jt_eliminar = new javax.swing.JMenuItem();
        jp_listar = new javax.swing.JPopupMenu();
        jl_añadiraconsola = new javax.swing.JMenuItem();
        jl_eliminar = new javax.swing.JMenuItem();
        general = new javax.swing.JPanel();
        tabla_consolas = new javax.swing.JScrollPane();
        consolas = new javax.swing.JTable();
        lista = new javax.swing.JScrollPane();
        listar_juegos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        add_game = new javax.swing.JButton();
        add_console = new javax.swing.JButton();
        add_consola = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cs_id = new javax.swing.JTextField();
        cs_fabricante = new javax.swing.JTextField();
        cs_añouso = new javax.swing.JTextField();
        cs_precio = new javax.swing.JTextField();
        cs_tipo = new javax.swing.JComboBox<>();
        cs_portatil = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        pt_estuche = new javax.swing.JComboBox<>();
        cs_estacionaria = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pt_almacenamiento = new javax.swing.JTextField();
        pt_conexion = new javax.swing.JTextField();
        pt_controles = new javax.swing.JTextField();
        add_juego = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        g_name = new javax.swing.JTextField();
        g_desc = new javax.swing.JTextField();
        g_price = new javax.swing.JTextField();
        g_agregado = new javax.swing.JComboBox<>();
        g_estado = new javax.swing.JComboBox<>();
        g_rentable = new javax.swing.JComboBox<>();
        g_add = new javax.swing.JButton();
        g_date = new com.toedter.calendar.JDateChooser();
        g_cant = new javax.swing.JSpinner();

        jp_acciones.setBackground(new java.awt.Color(255, 102, 102));
        jp_acciones.setAlignmentX(53.0F);
        jp_acciones.setAlignmentY(174.0F);

        jt_agregar.setText("jMenuItem1");
        jt_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_agregarMouseClicked(evt);
            }
        });
        jt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_agregarActionPerformed(evt);
            }
        });
        jp_acciones.add(jt_agregar);

        jt_modificar.setText("jMenuItem2");
        jp_acciones.add(jt_modificar);

        jt_eliminar.setText("jMenuItem3");
        jp_acciones.add(jt_eliminar);

        jl_añadiraconsola.setText("añadir a consola");
        jp_listar.add(jl_añadiraconsola);

        jl_eliminar.setText("eliminar");
        jp_listar.add(jl_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        general.setBackground(new java.awt.Color(153, 153, 255));
        general.setPreferredSize(new java.awt.Dimension(1239, 635));
        general.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consolas.setBackground(new java.awt.Color(255, 204, 204));
        consolas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        consolas.setForeground(new java.awt.Color(255, 51, 102));
        consolas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID de Consola", "Fabricante", "Años de Uso", "precio", "Juegos Disponibles", "Modelo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        consolas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consolasMouseClicked(evt);
            }
        });
        tabla_consolas.setViewportView(consolas);

        general.add(tabla_consolas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 650, 450));

        listar_juegos.setBackground(new java.awt.Color(255, 204, 204));
        listar_juegos.setForeground(new java.awt.Color(204, 0, 102));
        listar_juegos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listar_juegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listar_juegosMouseClicked(evt);
            }
        });
        lista.setViewportView(listar_juegos);

        general.add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 190, 310));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA DE CONTENIDO");
        general.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 330, 50));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LISTA DE JUEGOS");
        general.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 46, 210, 50));

        add_game.setText("Añadir Juego");
        add_game.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_gameMouseClicked(evt);
            }
        });
        general.add(add_game, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 210, 50));

        add_console.setText("Añadir Consola");
        add_console.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_consoleMouseClicked(evt);
            }
        });
        general.add(add_console, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 210, 50));

        add_consola.setBackground(new java.awt.Color(255, 204, 204));
        add_consola.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add_consola.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 269, 82));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Fabricante:");
        add_consola.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 212, 49));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Precio:");
        add_consola.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 49));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ID de consola:");
        add_consola.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 212, 49));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Modelo:");
        add_consola.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 49));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Años de uso:");
        add_consola.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 212, 49));

        cs_id.setText("\n");
        add_consola.add(cs_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 220, 30));

        cs_fabricante.setText("\n");
        add_consola.add(cs_fabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 220, 30));

        cs_añouso.setText("\n");
        add_consola.add(cs_añouso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 220, 30));

        cs_precio.setText("\n");
        add_consola.add(cs_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, 30));

        cs_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portatil", "Estacionaria", " " }));
        add_consola.add(cs_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        cs_portatil.setBackground(new java.awt.Color(153, 102, 255));
        cs_portatil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("Datos de Consola Portatil");
        cs_portatil.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 204));
        jLabel13.setText("Tiene un Estuche");
        cs_portatil.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 204));
        jLabel14.setText("Tamaño de Pantalla");
        cs_portatil.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 204));
        jLabel15.setText("Duración de Bateria");
        cs_portatil.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeño ", "Mediano", "Grande", " " }));
        cs_portatil.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        cs_portatil.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        pt_estuche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si ", "No", " " }));
        cs_portatil.add(pt_estuche, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        add_consola.add(cs_portatil, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 320, 530));

        cs_estacionaria.setBackground(new java.awt.Color(153, 102, 255));
        cs_estacionaria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Datos de Estacionaria");
        cs_estacionaria.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 26, 245, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("Número de Controles");
        cs_estacionaria.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 95, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 204));
        jLabel10.setText("Almacenamiento");
        cs_estacionaria.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 186, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Tipo de Conexión");
        cs_estacionaria.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 289, -1, -1));
        cs_estacionaria.add(pt_almacenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 221, 90, 38));
        cs_estacionaria.add(pt_conexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, 40));
        cs_estacionaria.add(pt_controles, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 142, 42, 38));

        add_consola.add(cs_estacionaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 320, 530));

        general.add(add_consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add_juego.setBackground(new java.awt.Color(153, 153, 255));
        add_juego.setMaximumSize(new java.awt.Dimension(1239, 635));
        add_juego.setMinimumSize(new java.awt.Dimension(1239, 635));
        add_juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Añadir Juego");
        add_juego.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 200, 70));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 204));
        jLabel17.setText("Cantidad disponibles");
        add_juego.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 190, 40));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 204));
        jLabel18.setText("Nombre de Juego");
        add_juego.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 160, 40));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 204));
        jLabel19.setText("Descripción");
        add_juego.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 40));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 204));
        jLabel20.setText("Fecha de Lanzamiento");
        add_juego.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 190, 40));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 204));
        jLabel21.setText("Precio");
        add_juego.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 80, 40));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 204));
        jLabel22.setText("Estado");
        add_juego.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 80, 40));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 204));
        jLabel23.setText("Rentable?");
        add_juego.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 120, 40));

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 204));
        jLabel24.setText("Agregado: ");
        add_juego.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 120, 40));
        add_juego.add(g_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, 50));
        add_juego.add(g_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 260, 130));
        add_juego.add(g_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 50, 40));

        g_agregado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no", " " }));
        add_juego.add(g_agregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        g_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usable", "No usable", " " }));
        add_juego.add(g_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        g_rentable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "si", "no", " " }));
        add_juego.add(g_rentable, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        g_add.setText("Añadir");
        g_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g_addMouseClicked(evt);
            }
        });
        add_juego.add(g_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 230, 70));

        g_date.setDateFormatString("dd/MM/yyyy\n");
        add_juego.add(g_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));
        add_juego.add(g_cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));

        general.add(add_juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consolasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consolasMouseClicked

        if (evt.isMetaDown()) {
            jp_acciones.show(evt.getComponent(), getX(), getY());
        }

    }//GEN-LAST:event_consolasMouseClicked

    private void jt_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_agregarMouseClicked
        add_consola.setVisible(true);
        general.setVisible(false);
    }//GEN-LAST:event_jt_agregarMouseClicked

    private void jt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_agregarActionPerformed

    private void add_gameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_gameMouseClicked
       add_juego.setVisible(true);
       tabla_consolas.setVisible(false);
       lista.setVisible(false);
       add_game.setVisible(false);
       add_console.setVisible(false);
       jLabel1.setVisible(false);
       jLabel8.setVisible(false);
    }//GEN-LAST:event_add_gameMouseClicked

    private void g_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_addMouseClicked
        juego game = new juego();
        DefaultListModel modelo = (DefaultListModel)listar_juegos.getModel();
        boolean estado = true, rent = true, agregado = true;
        
        if (g_estado.getSelectedItem().equals("Usable")) {
            estado=true;
        } else {
            estado=false;
        }
        if (g_rentable.getSelectedItem().equals("si")) {
            rent=true;
        } else {
            rent = false;
        } 
        if (g_agregado.getSelectedItem().equals("si")) {
            agregado=true;
        } else {
            agregado=false;
        }
        double precio = Double.parseDouble(g_price.getText());
        game = new juego(g_name.getText(), g_desc.getText(),g_date.getDate(),precio,estado, rent, agregado,(Integer)g_cant.getValue());
        
        modelo.addElement(c.juegos.add(game));
        listar_juegos.setModel(modelo);
        
        JOptionPane.showMessageDialog(this, "Datos ingresados correctamente");
        add_juego.setVisible(false);
        general.setVisible(true);
    }//GEN-LAST:event_g_addMouseClicked

    private void listar_juegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listar_juegosMouseClicked
        if (listar_juegos.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                jp_listar.show(evt.getComponent(),
                        evt.getX(), evt.getY());

            }
        }
    }//GEN-LAST:event_listar_juegosMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       DefaultTableModel modelo = (DefaultTableModel) consolas.getModel();
       String m = "";
        if (cs_tipo.getSelectedItem().equals("Portatil")) {
            m="Portatil";
            cs_portatil.setVisible(true);
        } else {
            m="Estacionaria";
            cs_estacionaria.setVisible(true);
        }
       c = new consola(Integer.parseInt(cs_id.getText()),cs_fabricante.getText(),
               Integer.parseInt(cs_añouso.getText())
               , Double.parseDouble(cs_precio.getText()),m );
       consolegame.add(c);
       modelo.addColumn(consolegame);
       JOptionPane.showMessageDialog(this, "Datos ingresados correctamente");
    }//GEN-LAST:event_jButton1MouseClicked

    private void add_consoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_consoleMouseClicked
       add_consola.setVisible(true);tabla_consolas.setVisible(false);
       lista.setVisible(false);
       add_game.setVisible(false);
       add_console.setVisible(false);
       jLabel1.setVisible(false);
       jLabel8.setVisible(false);
       add_juego.setVisible(false);
       cs_portatil.setVisible(false);
       cs_estacionaria.setVisible(false);
        
    }//GEN-LAST:event_add_consoleMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    consola c = new consola();
    ArrayList consolegame = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_consola;
    private javax.swing.JButton add_console;
    private javax.swing.JButton add_game;
    private javax.swing.JPanel add_juego;
    private javax.swing.JTable consolas;
    private javax.swing.JTextField cs_añouso;
    private javax.swing.JPanel cs_estacionaria;
    private javax.swing.JTextField cs_fabricante;
    private javax.swing.JTextField cs_id;
    private javax.swing.JPanel cs_portatil;
    private javax.swing.JTextField cs_precio;
    private javax.swing.JComboBox<String> cs_tipo;
    private javax.swing.JButton g_add;
    private javax.swing.JComboBox<String> g_agregado;
    private javax.swing.JSpinner g_cant;
    private com.toedter.calendar.JDateChooser g_date;
    private javax.swing.JTextField g_desc;
    private javax.swing.JComboBox<String> g_estado;
    private javax.swing.JTextField g_name;
    private javax.swing.JTextField g_price;
    private javax.swing.JComboBox<String> g_rentable;
    private javax.swing.JPanel general;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem jl_añadiraconsola;
    private javax.swing.JMenuItem jl_eliminar;
    private javax.swing.JPopupMenu jp_acciones;
    private javax.swing.JPopupMenu jp_listar;
    private javax.swing.JMenuItem jt_agregar;
    private javax.swing.JMenuItem jt_eliminar;
    private javax.swing.JMenuItem jt_modificar;
    private javax.swing.JScrollPane lista;
    private javax.swing.JList<String> listar_juegos;
    private javax.swing.JTextField pt_almacenamiento;
    private javax.swing.JTextField pt_conexion;
    private javax.swing.JTextField pt_controles;
    private javax.swing.JComboBox<String> pt_estuche;
    private javax.swing.JScrollPane tabla_consolas;
    // End of variables declaration//GEN-END:variables
}
