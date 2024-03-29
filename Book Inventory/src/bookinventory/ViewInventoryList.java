/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookinventory;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2008684
 */
public class ViewInventoryList extends javax.swing.JDialog {
    
    // add global instance variables for the dialog, its the table
    DefaultTableModel tableModel = new DefaultTableModel(); //sets default tablemodel, add import for table
    
    //create the heading for the table
    Object[] headings = {"Last Name", "First Name", "Title", "Group", "Book ID"};
    
    //create an instance var to hold the book inventory data, adds stuff to list
    private ArrayList<Book> inventory = new ArrayList<Book>(); //add import, only accessible via set method due to private
                     //references book.java
    
    /**
     * Creates new form ViewInventoryList
     */
    public ViewInventoryList(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); //put any code after initComponents();
        
        //loop through the heading var and add to the tableModel
        for(int index = 0; index < headings.length; index++) {
            //adds the heading information
            tableModel.addColumn(headings[index]);
        }
        
        //set the tableModel to the table
        tableInventory.setModel(tableModel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInventory = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        radioButtonLastName = new javax.swing.JRadioButton();
        radioButtonGroup = new javax.swing.JRadioButton();
        radioButtonTitle = new javax.swing.JRadioButton();
        radioButtonBookID = new javax.swing.JRadioButton();
        buttonSort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Inventory List");

        tableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableInventory);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sort Criteria"));

        buttonGroup1.add(radioButtonLastName);
        radioButtonLastName.setText("By Last Name");

        buttonGroup1.add(radioButtonGroup);
        radioButtonGroup.setText("By Group");

        buttonGroup1.add(radioButtonTitle);
        radioButtonTitle.setText("By Title");

        buttonGroup1.add(radioButtonBookID);
        radioButtonBookID.setText("By Book ID");

        buttonSort.setText("Sort List");
        buttonSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioButtonLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioButtonTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButtonBookID)
                            .addComponent(radioButtonGroup)))
                    .addComponent(buttonSort, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonLastName)
                    .addComponent(radioButtonGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButtonTitle)
                    .addComponent(radioButtonBookID))
                .addGap(18, 18, 18)
                .addComponent(buttonSort)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSortActionPerformed
        // TODO add your handling code here:
        if(radioButtonLastName.isSelected()) sortByLastName();
        else if(radioButtonTitle.isSelected()) sortByTitle();
        else if(radioButtonGroup.isSelected()) sortByGroup();
        else if(radioButtonBookID.isSelected()) sortByBookID();
        updateTable();
    }//GEN-LAST:event_buttonSortActionPerformed

    //create a set method to get book inventory data from main form
    public void setInventory(ArrayList<Book> i) {//public because needs to access main form
        inventory = i;    
        
        //use the update table to display info to the table
        updateTable();
    }
    
    //Display the inventory data into the table
    private void updateTable() {
        //set row count to zero
        tableModel.setRowCount(0);
        
        //loop through the inventory array list and add a new row for each book in inventory
        for(int index = 0; index < inventory.size(); index++) {
            //adds to arraylist
            Book b = inventory.get(index);
            
            //create a row data that will be added to the table
            Object[] rowData = {b.getLastName(), b.getFirstName(), b.getTitle(),  b.getGroup(), b.getBookID()};
            
            //add the row data to the table model
            tableModel.addRow(rowData);
        }
    }
    
    //method to sort
    private void sortByLastName() {
        //outer loop
        for(int index = 0; index < inventory.size(); index++) {
            Book currentBook = inventory.get(index);
            //inner loop is going to start at index + 1
            
            for(int j = index + 1; j < inventory.size(); j++) {
                Book nextBook = inventory.get(j);
                
                //compare last name from each of the books, if next book
                //comes before the current swap them in the arrayList
                if(nextBook.getLastName().compareToIgnoreCase(currentBook.getLastName()) < 0){
                    //have to swap the book object
                    //create temp book object
                    Book temp = currentBook;
                    //swap objects
                    inventory.set(index, nextBook);
                    inventory.set(j, temp);
                    //update currentBook to nextBook
                    currentBook = nextBook;
                }
            }
        }
    }
    
    private void sortByTitle() {
        //outer loop
        for(int index = 0; index < inventory.size(); index++) {
            Book currentBook = inventory.get(index);
            //inner loop is going to start at index + 1
            
            for(int j = index + 1; j < inventory.size(); j++) {
                Book nextBook = inventory.get(j);
                
                //compare last name from each of the books, if next book
                //comes before the current swap them in the arrayList
                if(nextBook.getTitle().compareToIgnoreCase(currentBook.getTitle()) < 0){
                    //have to swap the book object
                    //create temp book object
                    Book temp = currentBook;
                    //swap objects
                    inventory.set(index, nextBook);
                    inventory.set(j, temp);
                    //update currentBook to nextBook
                    currentBook = nextBook;
                }
            }
        }
    }
    
    private void sortByBookID() {
        //outer loop
        for(int index = 0; index < inventory.size(); index++) {
            Book currentBook = inventory.get(index);
            //inner loop is going to start at index + 1
            
            for(int j = index + 1; j < inventory.size(); j++) {
                Book nextBook = inventory.get(j);
                
                //compare last name from each of the books, if next book
                //comes before the current swap them in the arrayList
                if(nextBook.getBookID().compareToIgnoreCase(currentBook.getBookID()) < 0){
                    //have to swap the book object
                    //create temp book object
                    Book temp = currentBook;
                    //swap objects
                    inventory.set(index, nextBook);
                    inventory.set(j, temp);
                    //update currentBook to nextBook
                    currentBook = nextBook;
                }
            }
        }
    }
    
    private void sortByGroup(){
        //outer loop
        for(int index = 0; index < inventory.size(); index++) {
            Book currentBook = inventory.get(index);
            //inner loop is going to start at index + 1
            
            for(int j = index + 1; j < inventory.size(); j++) {
                Book nextBook = inventory.get(j);
                
                //compare last name from each of the books, if next book
                //comes before the current swap them in the arrayList
                if(nextBook.getGroup().compareToIgnoreCase(currentBook.getGroup()) < 0){
                    //have to swap the book object
                    //create temp book object
                    Book temp = currentBook;
                    //swap objects
                    inventory.set(index, nextBook);
                    inventory.set(j, temp);
                    //update currentBook to nextBook
                    currentBook = nextBook;
                }
            }
        }
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
            java.util.logging.Logger.getLogger(ViewInventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInventoryList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewInventoryList dialog = new ViewInventoryList(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSort;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioButtonBookID;
    private javax.swing.JRadioButton radioButtonGroup;
    private javax.swing.JRadioButton radioButtonLastName;
    private javax.swing.JRadioButton radioButtonTitle;
    private javax.swing.JTable tableInventory;
    // End of variables declaration//GEN-END:variables
}
