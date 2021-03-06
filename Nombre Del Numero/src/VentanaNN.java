
import java.util.Stack;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjiman
 */
public class VentanaNN extends javax.swing.JFrame {

    /**
     * Creates new form VentanaNN
     */
    public VentanaNN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numero = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        texto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto.setText("Texto");
        texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoMouseClicked(evt);
            }
        });

        jLabel1.setText("Numero");

        jLabel2.setText("Maximo 999,999,999");

        jLabel3.setText("Nombre");

        jLabel4.setText("En otras palabras");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 236, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoMouseClicked
        String[] separados = new String[9];
        for (String separado : separados) {
            separado = "0";
        }
        String s = new StringBuilder(numero.getText()).reverse().toString();
        for (int i = s.length(); i < 9; i++) {
            s += "0";
        }
        separados = s.split("");
        hacerNombre(separados);
    }//GEN-LAST:event_textoMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaNN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaNN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JButton texto;
    // End of variables declaration//GEN-END:variables

    private void hacerNombre(String[] separados) {

        String[] millares = new String[3];
        String[] miles = new String[3];
        String[] unidades = new String[3];
        String nameunidades = "";
        String namedecenas = "";
        String namecentenas = "";
        System.arraycopy(separados, 0, unidades, 0, 3);
        System.arraycopy(separados, 3, miles, 0, 3);
        System.arraycopy(separados, 6, millares, 0, 3);
        namecentenas = nombrarUnidades(millares);
        if (namecentenas.equals("cero ")) {
            namecentenas = " ";
        } else {
            if (namecentenas.equals("uno ")) {
                namecentenas = "un millon ";
            } else {
                namecentenas += "millones ";
            }
        }
        namedecenas = nombrarUnidades(miles);
        if (namedecenas.equals("cero ")) {
            namedecenas = " ";
        } else {
            if (namedecenas.equals("uno ")) {
                namedecenas = "mil ";
            } else {
                namedecenas += "mil ";
            }
        }
        nameunidades = nombrarUnidades(unidades);
        if (nameunidades.equals("cero ")){
            nameunidades = "";
        }
        String defi =namecentenas + namedecenas + nameunidades;
        nombre.setText(defi);
        
        jTextArea1.setText("$" + numero.getText() +"(Centidad en numeros)\n"+ defi +"(cantidad en palabras)");
    }

    private String nombrarUnidades(String[] unidades) {
        String unidad = "";
        String decena = "";
        String centena = "";
        for (int i = 0; i < unidades.length; i++) {
            if (i == 0) {
                switch (unidades[i]) {
                    case "0":
                        unidad = "cero ";
                        break;
                    case "1":
                        unidad = "uno ";
                        break;
                    case "2":
                        unidad = "dos ";
                        break;
                    case "3":
                        unidad = "tres ";
                        break;
                    case "4":
                        unidad = "cuatro ";
                        break;
                    case "5":
                        unidad = "cinco ";
                        break;
                    case "6":
                        unidad = "seis ";
                        break;
                    case "7":
                        unidad = "siete ";
                        break;
                    case "8":
                        unidad = "ocho ";
                        break;
                    case "9":
                        unidad = "nueve ";
                        break;
                    default:
                        break;
                }
            }
            if (i == 1) {
                switch (unidades[i]) {
                    case "0":
                        decena = "";
                        break;
                    case "1":
                        switch (unidad) {
                            case "cero ":
                                centena = "diez ";
                                break;
                            case "uno ":
                                unidad = "once ";
                                break;
                            case "dos ":
                                unidad = "doce ";
                                break;
                            case "tres ":
                                unidad = "trece ";
                                break;
                            case "cuatro ":
                                unidad = "catorce ";
                                break;
                            case "cinco ":
                                unidad = "quince ";
                                break;
                            case "seis ":
                                unidad = "deiciseis ";
                                break;
                            case "siete ":
                                unidad = "diecisiete ";
                                break;
                            case "ocho ":
                                unidad = "dieciocho ";
                                break;
                            case "nueve ":
                                unidad = "diecinueve ";
                                break;
                            default:
                                break;
                        }
                        break;
                    case "2":
                        if (!unidad.equals("cero ")) {
                            decena = "veinti";
                        } else {
                            unidad = "veinte ";
                        }
                        break;
                    case "3":
                        if (!unidad.equals("cero ")) {
                            decena = "treinta y ";
                        } else {
                            unidad = "treinta ";
                        }
                        break;
                    case "4":
                        if (!unidad.equals("cero ")) {
                            decena = "cuarenta y ";
                        } else {
                            unidad = "cuarenta ";
                        }
                        break;
                    case "5":
                        if (!unidad.equals("cero ")) {
                            decena = "cincuenta y ";
                        } else {
                            unidad = "cincuenta ";
                        }
                        break;
                    case "6":
                        if (!unidad.equals("cero ")) {
                            decena = "sesenta y ";
                        } else {
                            unidad = "sesenta";
                        }
                        break;
                    case "7":
                        if (!unidad.equals("cero ")) {
                            decena = "setenta y ";
                        } else {
                            unidad = "setenta ";
                        }
                        break;
                    case "8":
                        if (!unidad.equals("cero ")) {
                            decena = "ochenta y ";
                        } else {
                            unidad = "ochenta ";
                        }
                        break;
                    case "9":
                        if (!unidad.equals("cero ")) {
                            decena = "noventa y ";
                        } else {
                            unidad = "noventa ";
                        }
                        break;
                    default:
                        break;
                }
            }
            if (i == 2) {
                switch (unidades[i]) {
                    case "1":
                        if (!unidades[i - 1].equals("0")) {
                            centena = "ciento ";
                        } else {
                            centena = "cien ";
                        }
                        break;
                    case "2":
                        centena = "doscientos ";
                        break;
                    case "3":
                        centena = "trescientos ";
                        break;
                    case "4":
                        centena = "cuatrocientos ";
                        break;
                    case "5":
                        centena = "quinientos ";
                        break;
                    case "6":
                        centena = "seiscientos ";
                        break;
                    case "7":
                        centena = "setecientos ";
                        break;
                    case "8":
                        centena = "ochocientos ";
                        break;
                    case "9":
                        centena = "novecientos ";
                        break;
                    default:
                        break;
                }
            }
        }
        String regresar = centena + decena + unidad;
        nombre.setText(regresar);
        return regresar;
    }

}
