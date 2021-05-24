/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectou3y4;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author oswy
 */
public class interfaz extends javax.swing.JFrame {
    //Se crean variables globales
    Arbol arbol;
    ArrayList<Alumnos> alumnos;
    int indexNoControl;
    String ord[];
    PriorityQueue<Alumnos> alumnosOrders;

    
    /**
     * Creates new form interfaz
     */
    public interfaz() {
        //Se inicializan las variables y se agregan los datos de tres alumnos
        alumnosOrders = new PriorityQueue<>();
        arbol=new Arbol(null,null,null);
        alumnos=new ArrayList<>();
        Alumnos al1=new Alumnos("S1","Perez","Juan");
        Alumnos al2=new Alumnos("A1","Gomez","Rodrigo");
        Alumnos al3=new Alumnos("D3","Espinoza","Alejandro");
        if(arbol.agregar(al1)){
            System.out.println("Agregado");
        }else{
            System.out.println("Error");
        }
        if(arbol.agregar(al2)){
            System.out.println("Agregado");
        }else{
            System.out.println("Error");
        }
        if(arbol.agregar(al3)){
            System.out.println("Agregado");
        }else{
            System.out.println("Error");
        }
        
        //Se agregan a un arraylist
        alumnos.add(al1);
        alumnos.add(al2);
        alumnos.add(al3);
        //se agregan al priority queue
        alumnosOrders.add(al1);
        alumnosOrders.add(al2);
        alumnosOrders.add(al3);
        indexNoControl=0;
        initComponents();
        //Se imprimien en el txtArea
        agregarArea(al1);
        agregarArea(al2);
        agregarArea(al3);
        //Se ordenan los almunos con ayuda de un arbol y se guardan en un arreglo con ayuda del metodo split() de la clase string
        ord =arbol.ordenNoControl().split("\n");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoControl = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEntrada = new javax.swing.JTextArea();
        btnPaseNombre = new javax.swing.JButton();
        paseNoControl = new javax.swing.JButton();
        lblPaseLista = new javax.swing.JLabel();
        btnOrdenAlumno = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSalida = new javax.swing.JTextArea();
        lblOrden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NoControl");

        jLabel2.setText("Nombre");

        txtNoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoControlActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setText("Lista de alumnos por orden de ingreso");

        txtAreaEntrada.setColumns(20);
        txtAreaEntrada.setRows(5);
        jScrollPane1.setViewportView(txtAreaEntrada);

        btnPaseNombre.setText("Siguiente en pase de lista por Nombre");
        btnPaseNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaseNombreActionPerformed(evt);
            }
        });

        paseNoControl.setText("Siguiente en pase de lista número de control");
        paseNoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paseNoControlActionPerformed(evt);
            }
        });

        btnOrdenAlumno.setText("Orden por alumno");
        btnOrdenAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenAlumnoActionPerformed(evt);
            }
        });

        jButton1.setText("Orden NoControl");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAreaSalida.setColumns(20);
        txtAreaSalida.setRows(5);
        jScrollPane2.setViewportView(txtAreaSalida);

        lblOrden.setText("Lista de alumnos por orden :");

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
                                .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPaseNombre)
                            .addComponent(paseNoControl)
                            .addComponent(lblPaseLista, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnOrdenAlumno)
                            .addComponent(lblOrden))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnOrdenAlumno))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnPaseNombre)
                        .addGap(32, 32, 32)
                        .addComponent(paseNoControl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPaseLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(lblOrden)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void agregarArea(Alumnos al){
        //Metodo utilizado para imprimir en el txtAreaEntrada
        txtAreaEntrada.setText(txtAreaEntrada.getText()+"("+al.getNoControl()+")"+" "+al.getNombre()+" "+al.getApellidos()+"\n");
    }
    private void txtNoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoControlActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //Metodo para agregar usuarios, primero se valida que todos los datos estén completos
        if(txtNoControl.getText().equals("") || txtNombre.getText().equals("") || txtApellido.getText().equals("")){
            System.out.println("Llene todos los campos");
        }else{
            //Se crea un alumno nuevo
            Alumnos al= new Alumnos(txtNoControl.getText(), txtApellido.getText(),txtNombre.getText());
            if(arbol.agregar(al)){
                //Si se agrega al arbol, se imprime mensaje de confirmación y se agrega al txtArea y todos los demás txt se ponen vacios
                System.out.println("Se agregó con exito");
                agregarArea(al);
                txtNoControl.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                ord=arbol.ordenNoControl().split("\n");
                lblPaseLista.setText("");
                //el index se inicializa para volver a empezar el pase de lista por NoControl
                indexNoControl=0;
                //Se agrega al arrayList
                alumnos.add(al);
                //Se eliminan todos los alumnos en el priority queue para que no haya errores
                alumnosOrders.removeAll(alumnos);
                //Se vuelven a agregar todos los alumnos al priority queue con ayuda del array
                for (int i = 0; i < alumnos.size(); i++) {
            alumnosOrders.add(alumnos.get(i));
        }
            }else{
                //Si no se puede agregar, se da aviso
                System.out.println("No se pudo agregar");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Se llama al metodo ordenNoCOntrol que regresa un string y el cual será impreso en el txtAreaSalida
        String or=arbol.ordenNoControl();
        //Se edita la etiqueta
        lblOrden.setText("Lista de alumnos por orden :NoControl");
        txtAreaSalida.setText(or);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void paseNoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paseNoControlActionPerformed
        // TODO add your handling code here:
        //Boton para el pase de lista por NoCOntrol, cada que se da clic imprime un alumno y el index incrementa 1
        String cad=ord[indexNoControl];
        ++indexNoControl;
        //Se valida si se llegó al final de la lista para dar aviso que es el fin lista
        if(ord.length==indexNoControl){
            lblPaseLista.setText(cad+" (FIN LISTA)");
            indexNoControl=0;
        }else{
            //Si aun no llega al final, se imprime normal
            lblPaseLista.setText(cad);
            }
        
        
    }//GEN-LAST:event_paseNoControlActionPerformed

    private void btnOrdenAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenAlumnoActionPerformed
        // TODO add your handling code here:
        //Boton para mostrar alumnos ordenado por apellido
        //Primero se remueven todos los alumnos del priority queu
        alumnosOrders.removeAll(alumnos);
        //Se agregan de nuevo todos los alumnos con ayuda del array
        for (int i = 0; i < alumnos.size(); i++) {
            alumnosOrders.add(alumnos.get(i));
        }
        //Se inicializa una variable de tipo string para guardar a los alumnos
        String cad="";
        //Sentencia while para guardar la informacion de cada alumno en la variable cad, termina cuando el queue priority está vacio
        while(!alumnosOrders.isEmpty()){
            cad+=alumnosOrders.poll().toString()+"\n";
        }
        //Se vuelve a llenar la priority queue
        for (int i = 0; i < alumnos.size(); i++) {
            alumnosOrders.add(alumnos.get(i));
        }
        //Se imprime la cadena en el txtAreaSalida y se edita la etiqueta
        txtAreaSalida.setText(cad);
        lblOrden.setText("Lista de alumnos por orden : Nombre");
         
    }//GEN-LAST:event_btnOrdenAlumnoActionPerformed

    private void btnPaseNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaseNombreActionPerformed
        // TODO add your handling code here:
        //Boton para pase de lista por Nombre, se guarda en una variable tipo string
        String o=alumnosOrders.poll().toString();
        //Se modifica la etiqueta
        lblPaseLista.setText(o);
        //si ya no hay alumnos en la priority queue, se le agrega fin lista a la etiqueta, se vuelve a llenar la prority queue
        if(alumnosOrders.isEmpty()){
            lblPaseLista.setText(o+" (FIN LISTA)");
            for (int i = 0; i < alumnos.size(); i++) {
            alumnosOrders.add(alumnos.get(i));
        }
        }
    }//GEN-LAST:event_btnPaseNombreActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnOrdenAlumno;
    private javax.swing.JButton btnPaseNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrden;
    private javax.swing.JLabel lblPaseLista;
    private javax.swing.JButton paseNoControl;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextArea txtAreaEntrada;
    private javax.swing.JTextArea txtAreaSalida;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}