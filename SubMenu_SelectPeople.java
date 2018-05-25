package gUI_Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import myException.NoAvailableException;
import myException.NoParentException;
import myException.NotToBeClassmatesException;
import myException.NotToBeColleaguesException;
import myException.NotToBeCoupledException;
import myException.NotToBeFriendsException;
import myException.TooYoungException;

import peopleManager.Person;
import profileManager.Helper;
import socialNet.SocialNet;

/**
 *
 * @author JINDONG ZHANG!
 * @version 1.3
 */
public class SubMenu_SelectPeople extends javax.swing.JFrame {

    /*      -------------功能总览-----------
        Function_1----------删除一个人__________Done
        Function_2----------查看小孩和家长_______Done
        Function_3----------跳转Back_MainMenu___Done
        Function_4----------跳转profile以后______Done
        Function_5----------重新定义关系_________Done
        Function_6.1--------show_All_____________Done
        Function_7----------Mouse_Click_选择行___Done
        Function_8----------查看两个人的关系______Done
        Function_9----------设置2个文本框 用作查询--Done
     */
    int count = 0; //for showAll
    int index = -1; //for传值 SubMenu_SelectPeople_ShowPro
    int row = -1;//for MouseClick
    ArrayList<Person> array = new ArrayList();
    Helper hp = new Helper();
    int index_A = -1;
    int index_B = -1;
    int enterKey = 1;

    //int row = 0;//初始化鼠标拿到的行数值
    /**
     * Creates new form SubMenu_SelectPeople
     */
    public SubMenu_SelectPeople() {
        initComponents();
        init();
    }

    public SubMenu_SelectPeople(ArrayList<Person> array) {
        initComponents();
        init(array);
    }

    private void init() {
        this.setTitle("---Select People---");
        this.setResizable(false);
        GUIHelper.setFrameCenter(this);
    }

    private void init(ArrayList<Person> array) {
        this.setTitle("---Select People---");
        this.setResizable(false);
        this.array = array;
        GUIHelper.setFrameCenter(this);
        System.out.println("SubMenu_SelectPeople:传值测试");
        for (Person p : array) {
            System.out.println(p);
        }
        System.out.println("-------SubMenu_SelectPeople:传值测试结束------------");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        person_A_Text = new javax.swing.JTextField();
        person_B_Text = new javax.swing.JTextField();
        selection = new javax.swing.JComboBox<>();
        result_Text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton1.setText("Delete Person");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton2.setText("Show Profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton4.setText("Define Relationship");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton5.setText("Check Child & Parents");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Show All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "toString"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton8.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton8.setText("Check Two People");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Person_A");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Person_B");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        person_A_Text.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        person_A_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_A_TextActionPerformed(evt);
            }
        });

        person_B_Text.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        person_B_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_B_TextActionPerformed(evt);
            }
        });

        selection.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parent", "Sibling", "Friend", "Classmate", "Colleague", "Couple", "Child" }));

        result_Text.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel1.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(127, 127, 127)
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(person_A_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(result_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(person_B_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(person_B_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton10)
                                    .addComponent(person_A_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))
                        .addComponent(result_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-----------Function_1----------删除一个人___Delete_Version_1.1___Done
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //当点击delete person 以后
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();//必须设置为局部变量
        if (row != -1) {
            try {
                hp.beforeDeltetAdults(row, array);//删除删除前置条件
                System.out.println("----------------第一个");
                String name = array.get(row).getName();
                System.out.println("----------------第二个");
//                hp.delete(array, array.get(row).getName());
                array.remove(row);
                
                dtm.removeRow(row);
                hp.delete(array, name);//完全删除存在
            } catch (NoParentException ex) {
                JOptionPane.showMessageDialog(this, "删除失败");
                ex.printStackTrace();
                Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
                //ex.toString();
            }
//             array.remove(row);
//             dtm.removeRow(row);
        } else {
            JOptionPane.showMessageDialog(this, "请选择一个数据");
        }
//        System.out.println(row);//  0 ; 1 ; 2
        //判断
//        array.remove(row);
//        System.out.println("----------------------------Remove之前："+row);
//        dtm.removeRow(row);
////        row--;//为了防止鼠标没有重重新点击
//        System.out.println("------------------------Remove之后："+row);//row=-1

    }//GEN-LAST:event_jButton1ActionPerformed
    //--------------------------Function_2--------查看小孩和家长___Done
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //当点击check child 以后
//        SubMenu_SelectPeople_CheckCP s = new SubMenu_SelectPeople_CheckCP(array);
//        s.setVisible(true);
//        this.dispose();
        row = jTable1.getSelectedRow();
        String ParentList = hp.show(array.get(row), 1);
        String ChildrenList = hp.show(array.get(row), 7);
        result_Text.setText("Parents: "+ParentList+"; Children: "+ChildrenList);
    }//GEN-LAST:event_jButton5ActionPerformed
    //------------------------Function_3---------跳转Back_MainMenu___Done
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainJFrame s = new MainJFrame(array);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    //---------------Function_4----------跳转profile以后____Done
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //当点击show profile以后
        SubMenu_SelectPeople_ShowPro s = new SubMenu_SelectPeople_ShowPro(array.get(index));
    }//GEN-LAST:event_jButton2ActionPerformed

    //---------------Function_5----------重新定义关系___Done
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //当点击DefineRe以后
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        row = jTable1.getSelectedRow();
        person_A_Text.setText(dtm.getValueAt(row, 0).toString());
        String selection = this.selection.getSelectedItem().toString();
        switch (selection) {
            case "Parent":
                enterKey = 1;
                 {
                    try {
                        hp.beforeSetPartner(index_A, index_B, array);
                        hp.add(array.get(index_A), array.get(index_B).getName(), enterKey);
//        hp.add(array.get(index_B),array.get(index_A).getName(),enterKey);
                    } catch (NoAvailableException | NotToBeCoupledException ex) {
                        JOptionPane.showMessageDialog(this, ex.toString());
                        ex.printStackTrace();
                        Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case "Sibling":
                enterKey = 2;
                hp.add(array.get(index_A), array.get(index_B).getName(), enterKey);
                break;
            case "Friend":
                enterKey = 3;
                 {
                    try {
                        hp.beSetFriend(index_A, index_B, array);
                        hp.add(array.get(index_A), array.get(index_B).getName(), enterKey);
                    } catch (NotToBeFriendsException ex) {
                        JOptionPane.showMessageDialog(this, ex.toString());
                        ex.printStackTrace();
                        Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (TooYoungException ex) {
                        JOptionPane.showMessageDialog(this, ex.toString());
                        ex.printStackTrace();
                        Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case "Classmate":
                enterKey = 4;
                 {
                    try {
                        hp.beforeSetClassmates(index_A, index_B, array);
                        hp.add(array.get(index_A), array.get(index_B).getName(), enterKey);
//        hp.add(array.get(index_B),array.get(index_A).getName(),enterKey);
                    } catch (NotToBeClassmatesException ex) {
                        JOptionPane.showMessageDialog(this, ex.toString());
                        ex.printStackTrace();
                        Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case "Colleague":
                enterKey = 5;
                 {
                    try {
                        hp.beforeSetColleagues(index_A, index_B, array);
                        hp.add(array.get(index_A), array.get(index_B).getName(), enterKey);
//        hp.add(array.get(index_B),array.get(index_A).getName(),enterKey);
                    } catch (NotToBeColleaguesException ex) {
                        JOptionPane.showMessageDialog(this, ex.toString());
                        ex.printStackTrace();
                        Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case "Couple":
                enterKey = 6;
                 {
                    try {
                        hp.beforeSetPartner(index_A, index_B, array);
                        hp.add(array.get(index_A), array.get(index_B).getName(), enterKey);
//        hp.add(array.get(index_B),array.get(index_A).getName(),enterKey);
                    } catch (NoAvailableException | NotToBeCoupledException ex) {
                        JOptionPane.showMessageDialog(this, ex.toString());
                        ex.printStackTrace();
                        Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case "Child":
                enterKey = 7;
        {
            try {
                //              hp.beforeSetChilds(index_A,index_B, array);
                hp.beforeSetChilds(array.get(index_A),array.get(row));
                hp.add(array.get(index_A),array.get(index_B),array.get(row),enterKey);
            } catch (NotToBeCoupledException ex) {
                JOptionPane.showMessageDialog(this, "make sure choose children after parents");
                JOptionPane.showMessageDialog(this, ex.toString());
                Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoParentException ex) {
                JOptionPane.showMessageDialog(this, "make sure choose children after parents");
                JOptionPane.showMessageDialog(this, ex.toString());
                Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
        }

        // 需要判断     
        //hp.add(array.get(row), name, row);
//        SubMenu_SelectPeople_DefineRe s = new SubMenu_SelectPeople_DefineRe(array);
//        s.setVisible(true);
//        this.dispose();

    }//GEN-LAST:event_jButton4ActionPerformed
    //-----------------------Function_6-----------show_All-------------------done
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //点击buttom showAll 以后
        //构造默认的 DefaultTableModel，它是一个零列零行的表。
        //DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        //DefaultTableModel myTable=new DefaultTableModel();
        // jTable1 table=new jTable1(myTable);
        //构造一个空向量V_Add
        // Vector V_Add = new Vector();
//        V_Add.add("a");
//        dtm.addRow(V_Add);//version_01
//         for(int x=0 ; x<11 ; x++){//version_01 不可用
//              V_Add.add(x);
//              dtm.addRow(V_Add);
//         }
//           for (int j = 0; j < 11; j++) {
//            for (int x = 0; x < 11; x++) {//version_02 不可用
//                V_Add.add(x);
//                System.out.println(x);
//            }
//             dtm.addRow(V_Add);
//        }
//            for(Person p : array){//verison_03 不可用
//                 V_Add.add(p);
//                 dtm.addRow(V_Add);
//            }

//        int number = 3;
//        int k = 0;
//        while (k++ != 4) {
//            Vector<Object> newRow = new Vector<Object>();
//            for (int i = 1; i <= number; i++) {
//                newRow.add(i);
//            }
//
//            myTable.addRow(newRow);
//        }
//    int k = 0;//version_04 不可用
//        while (k++ != 4) {
//            ArrayList arr = new ArrayList();
//            arr.set(1,3);
//            for (int x = 0; x < 3; x++) {//version_01 不可用
//                //V_Add.add(x);
//                
//            }
//            dtm.addRow(arr[1]);
//            dtm.addRow(arr.get(x));
//        }
//        Vector baseRow = new Vector();//version_05 不可用
//       
//            for (int x = 0; x <=11; x++) {
//                //System.out.println("普通for第    " + x + "   次");
//               // baseRow.add(x);
//                dtm.addRow(new String[x][x]);
//                //让第一个索引值不变,但是他的赋值改变
//                
////            System.out.println("内部增强for第    " + x + "   次");
////            for (Object a : newRow) {               
////                System.out.println(a);
////            }
//                //dtm.addRow((Vector) newRow.get(x));
//                //Vector newRow = new Vector();
//
//                //随着baseRow增加拿到要拿到他的增加的那个元素
//                //System.out.println(dtm.getColumnCount());
//            }
//            //dtm.addRow(baseRow);
//
//            //dtm.addRow(newRow);
//            //newRow.remove(y);
//            System.out.println("增强for循环开始:");
//            for (Object x : baseRow) {
//                System.out.println(x);
//            }
//            
//            for (int x = 0; x <=11; x++) {    version_6_有变化
//                dtm.addRow(new int[x][x]);//地址值改变,但第一个值为空
//            }
//        Vector newRow = new Vector();
//        for (int x = 1; x <= 2; x++) { //   version_7_有变化
//            dtm.addRow(new Vector[x][x]);//地址值改变,设置x=1 值不会为空
//            //newRow.add(x);
//            //dtm.addRow(newRow);
//            newRow.add(x);
//            System.out.println(newRow.toString());
//        }
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector V_Add = new Vector();
//         while(array.get(x++)!= null){version_8
//             V_Add.add(x);
//             dtm.addRow(V_Add);
//         }
//              V_Add.add(x);
//              dtm.addRow(V_Add);
//        
//         
//      //----------Function_6.1---------show All-----------done--方法内部二标注
        if (array.isEmpty()) {//   version_9
            JOptionPane.showMessageDialog(this, "没有List");
        } else {
//         if(array.get(x++) != null)//判断条件有误
            if (count < array.size()) {
                V_Add.add(array.get(count));
                dtm.addRow(V_Add);
                count++;
            } else {
                JOptionPane.showMessageDialog(this, "请添加更多人");
            }
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    //----------Function_7---------Mouse_Click__________鼠标辅助功能------------
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //鼠标点击选中表格中一行信息可像是在文本字段中。
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        //定义变量row为鼠标点击的行数。
        row = jTable1.getSelectedRow();
        //函数getValueAt返回要查询的行和列处单元格的属性值
        //String print = null;
        //print.setText(dtm.getValueAt(row, 0).toString());
        //System.out.println(dtm.getValueAt(row, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    //----------Function_8---------查看两个人的关系_____Done
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String listType = null;
        SocialNet sn = new SocialNet();
//        hp.checkRela(index_A, index_B, array, listType, sn);
        String newListType = hp.checkRela(index_A, index_B, array, listType, sn);
        result_Text.setText(newListType);
    }//GEN-LAST:event_jButton8ActionPerformed
    //-----------------------Function_9---------设置2个文本框 用作查询--
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        row = jTable1.getSelectedRow();
        index_A = row;
        person_A_Text.setText(array.get(index_A).getName());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void person_A_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_A_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_person_A_TextActionPerformed

    private void person_B_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_B_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_person_B_TextActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        row = jTable1.getSelectedRow();
        index_B = row;
        person_B_Text.setText(array.get(index_B).getName());
    }//GEN-LAST:event_jButton10ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SubMenu_SelectPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SubMenu_SelectPeople().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField person_A_Text;
    private javax.swing.JTextField person_B_Text;
    private javax.swing.JTextField result_Text;
    private javax.swing.JComboBox<String> selection;
    // End of variables declaration//GEN-END:variables

    private void close(Vector V_Add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
