/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookinventory;
import java.io.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author 2008684
 */
public class InventoryMainForm extends javax.swing.JFrame implements Serializable{ 

    DefaultListModel listModel = new DefaultListModel(); //sets default listmodel, add import for list
        //add an instance var ArrayList<Book> bookInventory, Book referencing the class Book.java

    ArrayList<Book> bookInventory = new ArrayList<Book>(); //Add arraylist using lightbulb
    ArrayList<Book> searchList = new ArrayList<Book>();
    /**
     * Creates new form BookInventory
     */
    public InventoryMainForm() {
        initComponents();
        
        listSearch.setModel(listModel);
        
        //deserialize the data
        deSerializeData();
        //update the listbox to see if we have the data
        for(int index = 0; index < bookInventory.size(); index++) {
            Book b = bookInventory.get(index);
            listModel.addElement(b.getTitle());
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

        jPanel1 = new javax.swing.JPanel();
        checkBoxLastName = new javax.swing.JCheckBox();
        checkBoxFirstName = new javax.swing.JCheckBox();
        checkBoxTitle = new javax.swing.JCheckBox();
        textFieldFirstName = new javax.swing.JTextField();
        textFieldTitle = new javax.swing.JTextField();
        textFieldLastName = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSearch = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemAdd = new javax.swing.JMenuItem();
        menuItemView = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Main Form");
        setLocationByPlatform(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Criteria"));

        checkBoxLastName.setText("By Last Name");

        checkBoxFirstName.setText("By First Name");

        checkBoxTitle.setText("By Title");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkBoxTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(checkBoxFirstName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textFieldFirstName))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(checkBoxLastName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxLastName)
                    .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxFirstName)
                    .addComponent(textFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxTitle)
                    .addComponent(textFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listSearch);

        jMenu1.setText("File");

        menuItemAdd.setText("Add New Book");
        menuItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemAdd);

        menuItemView.setText("View Book Inventory");
        menuItemView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemViewActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemView);
        jMenu1.add(jSeparator1);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSearch)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //adds item
    private void menuItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddActionPerformed
        // TODO add your handling code here:
        
        //create an instance of the add new book dialog 
        //references AddNewBookDialog.java 
        AddNewBookDialog addDlg = new AddNewBookDialog(this, true); //true because execution of this form will stop
       
        //Displays essentially the AddNewBookDialog.java
        //display the dialog
        addDlg.setVisible(true);
        
        // if pressedOK display title to list box
        if(addDlg.isPressedOK()) {
            //get the data from add dialog
            String fn = addDlg.getFirstName();
            String ln = addDlg.getLastName();
            String t = addDlg.getTitle();
            String g = addDlg.getGroup();
            String d = addDlg.getDescription();
            
            //create an instance of book object
            Book b = new Book(fn, ln, t, g, d);
            
            //add the new instance to an array list var bookInventory
            bookInventory.add(b);
            
            //serialize the bookInventory
            serializeData();
            
            listModel.addElement(addDlg.getTitle());
        }
        //add code to create new book here 
        
    }//GEN-LAST:event_menuItemAddActionPerformed

    //views the inventorylist
    private void menuItemViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemViewActionPerformed
        // TODO add your handling code here:
        
        //references dialog form
        ViewInventoryList viewDlg = new ViewInventoryList(this, true); //this, true ... passed into constructor
        
        //pass the bookInventory data to the viewDlg 
        viewDlg.setInventory(bookInventory);
        
        //display the dialog
        viewDlg.setVisible(true); //views dialog
        
    }//GEN-LAST:event_menuItemViewActionPerformed
  
    //exits system
    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        //add the search method here
        search();
        //update the listbox
        updateListBox();
    }//GEN-LAST:event_buttonSearchActionPerformed

    //add serialize and deserialize methods to the application
    private void serializeData() {
         try {
         FileOutputStream fileOut = new FileOutputStream("bookInventory.dat");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         //here is where we are writing the entire array list
         out.writeObject(bookInventory);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in bookInventory.dat");
      } catch (IOException i) {
         i.printStackTrace();
      }
    }
    
    private void deSerializeData() {
         try {
         FileInputStream fileIn = new FileInputStream("bookInventory.dat");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         //deserialize and cast to ArrayList<Book> type
         //assign to the bookInventory var
         bookInventory = (ArrayList<Book>) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
    }
    
    private void search() {
        //make sure to clear out all previous items in the searchlist
        searchList.clear();
        
        //want to search based on selected checkbox
        if(checkBoxLastName.isSelected()) {
            //get criteria from lastname textfield
            String critLastName = textFieldLastName.getText();
            //loop through the arraylist to find matches
            //bookInventory because that is where we are pulling info from
            for(Book b : bookInventory){
                //regex short for regular expression
                String regex = "(.*)" + critLastName.toUpperCase() + "(.*)";
                //do the comparison using the matches method
                //adding books to the list
                if(b.getLastName().toUpperCase().matches(regex)) {
                    //add that book object to the searchlist
                    searchList.add(b);
                }
            }
        }
        else if(checkBoxTitle.isSelected()) {
            {
            //get criteria from lastname textfield
            String critTitle = textFieldTitle.getText();
            //loop through the arraylist to find matches
            //bookInventory because that is where we are pulling info from
            for(Book b : bookInventory){
                //regex short for regular expression
                String regex = "(.*)" + critTitle.toUpperCase() + "(.*)";
                //do the comparison using the matches method
                //adding books to the list
                if(b.getTitle().toUpperCase().matches(regex)) {
                    //add that book object to the searchlist
                    searchList.add(b);
                }
            }
        }
        }
    }
    
    private void updateListBox() {
        //clear the list model so only the new items appear in the list
        listModel.clear();
        
        for(Book b : searchList) {
            String item = b.getTitle() + " - " + b.getLastName();
            listModel.addElement(item);
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
            java.util.logging.Logger.getLogger(InventoryMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSearch;
    private javax.swing.JCheckBox checkBoxFirstName;
    private javax.swing.JCheckBox checkBoxLastName;
    private javax.swing.JCheckBox checkBoxTitle;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> listSearch;
    private javax.swing.JMenuItem menuItemAdd;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemView;
    private javax.swing.JTextField textFieldFirstName;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JTextField textFieldTitle;
    // End of variables declaration//GEN-END:variables
}
