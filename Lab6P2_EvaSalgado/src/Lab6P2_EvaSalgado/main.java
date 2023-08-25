/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab6P2_EvaSalgado;

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
        setTitle("Super Juegos");
        setSize(994, 568);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_acciones = new javax.swing.JPopupMenu();
        jt_agregar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jt_modificar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jt_eliminar = new javax.swing.JMenuItem();
        general = new javax.swing.JPanel();
        tabla_consolas = new javax.swing.JScrollPane();
        consolas = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        gamelist = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lista_juegos1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        jt_agregar.setText("jMenuItem1");
        jp_acciones.add(jt_agregar);
        jp_acciones.add(jSeparator1);

        jt_modificar.setText("jMenuItem2");
        jp_acciones.add(jt_modificar);
        jp_acciones.add(jSeparator2);

        jt_eliminar.setText("jMenuItem3");
        jp_acciones.add(jt_eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        general.setBackground(new java.awt.Color(153, 153, 255));
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
        tabla_consolas.setViewportView(consolas);

        general.add(tabla_consolas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 650, 450));

        jList1.setBackground(new java.awt.Color(255, 204, 204));
        jList1.setForeground(new java.awt.Color(204, 0, 102));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        general.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 210, 310));

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

        add.setBackground(new java.awt.Color(255, 204, 204));
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir");
        add.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 269, 82));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Fabricante:");
        add.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 212, 49));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Precio:");
        add.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 49));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ID de consola:");
        add.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 212, 49));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Modelo:");
        add.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 49));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Años de uso:");
        add.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 212, 49));

        cs_id.setText("\n");
        add.add(cs_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 220, 30));

        cs_fabricante.setText("\n");
        add.add(cs_fabricante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 220, 30));

        cs_añouso.setText("\n");
        add.add(cs_añouso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 220, 30));

        cs_precio.setText("\n");
        add.add(cs_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portatil", "Estacionaria", " " }));
        add.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lista de Juegos");

        lista_juegos1.setViewportView(jList2);

        javax.swing.GroupLayout gamelistLayout = new javax.swing.GroupLayout(gamelist);
        gamelist.setLayout(gamelistLayout);
        gamelistLayout.setHorizontalGroup(
            gamelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(gamelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamelistLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(gamelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gamelistLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel7))
                        .addComponent(lista_juegos1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        gamelistLayout.setVerticalGroup(
            gamelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(gamelistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamelistLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(21, 21, 21)
                    .addComponent(lista_juegos1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(general, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gamelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(general, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gamelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JTable consolas;
    private javax.swing.JTextField cs_añouso;
    private javax.swing.JTextField cs_fabricante;
    private javax.swing.JTextField cs_id;
    private javax.swing.JTextField cs_precio;
    private javax.swing.JPanel gamelist;
    private javax.swing.JPanel general;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu jp_acciones;
    private javax.swing.JMenuItem jt_agregar;
    private javax.swing.JMenuItem jt_eliminar;
    private javax.swing.JMenuItem jt_modificar;
    private javax.swing.JScrollPane lista_juegos1;
    private javax.swing.JScrollPane tabla_consolas;
    // End of variables declaration//GEN-END:variables
}
