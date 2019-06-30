package bookmanegementapplication;

import java.awt.Color;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.Timer;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class BookArchives extends javax.swing.JDialog {

    DefaultTableModel model;
    
    BookManegementApplication bkm = new BookManegementApplication();
    
    public BookArchives(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) book_table.getModel();
        bookView();
    }
    public void bookView(){
        model.setRowCount(0);
        ArrayList <Book> books = new ArrayList<Book>();
        
        books = bkm.bookCome();
        
        if(books != null ){
            
            for(Book book : books){
                Object[] add = {
                    book.getId(),book.getBook_name(),book.getBook_writer(),
                    book.getBook_type(),book.getBook_publisher()
                };
                model.addRow(add);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtAuthor = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtPublisher = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        book_table = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addBookLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Author:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Book Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Publisher");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("Type:");

        btnAdd.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtAuthor.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N

        txtType.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N

        txtPublisher.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N

        txtBookName.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPublisher)
                        .addComponent(txtType)
                        .addComponent(txtAuthor)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        book_table.setBackground(new java.awt.Color(255, 153, 153));
        book_table.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        book_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "book_name", "book_writer", "book_type", "book_publisher"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        book_table.setGridColor(new java.awt.Color(0, 0, 0));
        book_table.setSelectionBackground(new java.awt.Color(0, 204, 153));
        book_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(book_table);
        if (book_table.getColumnModel().getColumnCount() > 0) {
            book_table.getColumnModel().getColumn(0).setResizable(false);
            book_table.getColumnModel().getColumn(1).setResizable(false);
            book_table.getColumnModel().getColumn(2).setResizable(false);
            book_table.getColumnModel().getColumn(3).setResizable(false);
            book_table.getColumnModel().getColumn(4).setResizable(false);
        }

        btnEdit.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(255, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\isadu\\Downloads\\iconfinder_156_Library_183277.png")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 0), new java.awt.Color(153, 153, 0)));
        jButton4.setFocusCycleRoot(true);
        jButton4.setFocusTraversalPolicyProvider(true);
        jButton4.setHideActionText(true);
        jButton4.setSelected(true);

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Book Archive");

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchField.setCaretColor(new java.awt.Color(102, 255, 51));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 153));
        jLabel6.setText("Search ");

        addBookLabel.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        addBookLabel.setForeground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEdit)
                                    .addComponent(btnDelete)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(506, 506, 506)
                                .addComponent(addBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void filter(String querry){
        TableRowSorter <DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(model);
        book_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(querry));
    
    }
    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        
        String querry = searchField.getText();
        filter(querry);
    }//GEN-LAST:event_searchFieldKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String bookName = txtBookName.getText();
        String author = txtAuthor.getText();
        String type = txtType.getText();
        String publisher = txtPublisher.getText();
        bkm.bookAdd (bookName,author,type,publisher);
        bookView();
        addBookLabel.setBackground(Color.green);
        addBookLabel.setText("Kitabınız Başarıyla Eklendi.");
        clearLabel();  
    }//GEN-LAST:event_btnAddActionPerformed

    private void book_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_tableMouseClicked
        int selectedRow = book_table.getSelectedRow();
        txtBookName.setText(model.getValueAt(selectedRow, 1).toString());
        txtAuthor.setText(model.getValueAt(selectedRow, 2).toString());
        txtType.setText(model.getValueAt(selectedRow, 3).toString());
        txtPublisher.setText(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_book_tableMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        String name  = txtBookName.getText();
        String author  = txtAuthor.getText();
        String type  = txtType.getText();
        String publisher  = txtPublisher.getText();
        int selectedRow = book_table.getSelectedRow();
        
        if (selectedRow == -1){
            
            if (model.getRowCount() == 0){
                
                addBookLabel.setBackground(Color.red);
                addBookLabel.setText("Book table null!");
            }
            
            else{
                addBookLabel.setBackground(Color.red);
                addBookLabel.setText("Select book, please!");
            }
        }
        else{
            int id = (int)model.getValueAt(selectedRow, 0);
            bkm.bookUpdate(id,name,author,type,publisher);
            bookView();
            addBookLabel.setBackground(Color.green);
            addBookLabel.setText("Update Succcess!");
        }
        
        clearLabel();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int[] selectedRow = book_table.getSelectedRows();
        
        if (selectedRow.length == 0){
            
            if (model.getRowCount() == 0){
                
                addBookLabel.setBackground(Color.red);
                addBookLabel.setText("Book table null!");
            }
            
            else{
                addBookLabel.setBackground(Color.red);
                addBookLabel.setText("Select book, please!");
            }
        }
        else{
            for (int row : selectedRow){
                int id = (int)model.getValueAt(row, 0);
            bkm.bookDelete(id);
            bookView();
            addBookLabel.setBackground(Color.green);
            
            }
            addBookLabel.setText("Book Delete Successfull");
            
        }
        clearLabel();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void clearLabel(){
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                
               addBookLabel.setText("");
               timer.cancel();
            }
        };
        timer.schedule(task, 3000, 4000); 
    
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BookArchives dialog = new BookArchives(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel addBookLabel;
    private javax.swing.JTable book_table;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
