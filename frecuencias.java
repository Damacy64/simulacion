package simulacion;

/**
 *
 * @author pzx64
 */
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
public class frecuencias extends javax.swing.JFrame {
    private int N, K;
    private String numeros[];
    DefaultTableModel modelo = new DefaultTableModel();
    DecimalFormat decimales = new DecimalFormat("0.0000");
    private double oi[] = new double[]{0, 0, 0, 0, 0};
    private String Intervalos[] = new String[]{"0.0 - 0.2", "0.2 - 0.4", "0.4 - 0.6", "0.6 - 0.8", "0.8 - 1.0"};
    private String fila[] = new String[5];
    private double EI;
    private double X2;

    public frecuencias() {
        initComponents();
        modelo.addColumn("Intervalo");
        modelo.addColumn("Ei");
        modelo.addColumn("Oi");
        modelo.addColumn("(oi - Ei)");
        modelo.addColumn("(Oi - Ei)^2");
        jTable1.setModel(modelo);
    }

    private void generarNumeros() {
        for (int i = 0; i < N; i++) {
            numeros[i] = decimales.format(Math.random());
        }
    }

    private void imprimirNumeros() {
        for (int i = 0; i < N; i++) {
            jTextArea1.append(numeros[i] + "\n");
        }
    }

    private void generarOi() {
        for (int i = 0; i < N; i++) {
            double numero = Double.parseDouble(numeros[i]);
            if (numero >= 0 && numero <= 0.2) {
                oi[0] = oi[0] + 1;
            } else if (numero > 0.2 && numero <= 0.4) {
                oi[1] = oi[1] + 1;
            } else if (numero > 0.4 && numero <= 0.6) {
                oi[2] = oi[2] + 1;
            } else if (numero > 0.6 && numero <= 0.8) {
                oi[3] = oi[3] + 1;
            } else if (numero > 0.8 && numero <= 1) {
                oi[4] = oi[4] + 1;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonGenerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMostrar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTamaño = new javax.swing.JTextField();
        jTextFieldK = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButtonGenerar.setBackground(new java.awt.Color(153, 204, 255));
        jButtonGenerar.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setText("   F r e c u e n c i a s ");

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel4.setText("X2:");

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel2.setText("Muestra N");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel3.setText("Dame el valor de K:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextFieldTamaño, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                                        .addComponent(jTextFieldK))
                                                                .addGap(178, 178, 178)
                                                                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(223, 223, 223)
                                                                .addComponent(jLabel1)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextFieldMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 45, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextFieldTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTextFieldK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        this.N = Integer.parseInt(jTextFieldTamaño.getText());
        this.K = Integer.parseInt(jTextFieldK.getText());
        this.EI = (double) (N) / (double) (K);
        this.numeros = new String[N];
        generarNumeros();
        imprimirNumeros();
        generarOi();
        for (int i = 0; i < 5; i++) {
            fila[0] = Intervalos[i];
            fila[1] = EI + "";
            fila[2] = oi[i] + "";
            fila[3] = (Double.parseDouble(fila[2]) - Double.parseDouble(fila[1])) + "";
            fila[4] = (Math.pow(Double.parseDouble(fila[3]), 2) + "");
            modelo.addRow(fila);
            X2 += (Double.parseDouble(fila[4]) / EI);
        }
        jTextFieldMostrar.setText(decimales.format(X2));
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frecuencias().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldK;
    private javax.swing.JTextField jTextFieldMostrar;
    private javax.swing.JTextField jTextFieldTamaño;
    // End of variables declaration//GEN-END:variables
}
