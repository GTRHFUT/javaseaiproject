package com.hfut.ui;

import com.hfut.bean.Employee;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

//添加员工信息的界面
public class AddEmployeeUI extends JFrame {
    private JTextField txId, txName, txSex, txAge, txPhone, txPosition, txSalary, txDepartment;
    private JFormattedTextField txHireDate;
    private JButton btnSave, btnCancel;
    private EmployeeManagerUI employeeManagerUI;

    //初始化这个界面，提供很多输入框信息
    //"ID", "姓名", "性别", "年龄", "电话", "职位", "入职日期", "薪水", "部门"
    //提供一个添加按钮和取消按钮
    public AddEmployeeUI(EmployeeManagerUI employeeManagerUI) {
        super("添加员工信息");
        this.employeeManagerUI = employeeManagerUI;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);//内边距

        //设置字体大小
        Font font = new Font("微软雅黑", Font.PLAIN, 14);

        //标签和文本框
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel = new JLabel("ID:");
        jLabel.setFont(font);
        add(jLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txId = new JTextField(10);
        add(txId,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel jLabel2 = new JLabel("姓名:");
        jLabel2.setFont(font);
        add(jLabel2, gbc);


        gbc.gridx = 1;
        txName = new JTextField(10);
        add(txName, gbc);


        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel jLabel3 = new JLabel("性别:");
        jLabel3.setFont(font);
        add(jLabel3, gbc);

        gbc.gridx = 1;
        txSex = new JTextField(10);
        add(txSex, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel jLabel4 = new JLabel("年龄:");
        jLabel4.setFont(font);
        add(jLabel4, gbc);

        gbc.gridx = 1;
        txAge = new JTextField(10);
        add(txAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        JLabel jLabel5 = new JLabel("电话:");
        jLabel5.setFont(font);
        add(jLabel5, gbc);

        gbc.gridx = 1;
        txPhone = new JTextField(10);
        add(txPhone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        JLabel jLabel6 = new JLabel("职位:");
        jLabel6.setFont(font);
        add(jLabel6, gbc);

        gbc.gridx = 1;
        txPosition = new JTextField(10);
        add(txPosition, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        JLabel jLabel7 = new JLabel("入职日期:");
        jLabel7.setFont(font);
        add(jLabel7, gbc);

        gbc.gridx = 1;
        txHireDate = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
        add(txHireDate, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        JLabel jLabel8 = new JLabel("薪水:");
        jLabel8.setFont(font);
        add(jLabel8, gbc);


        gbc.gridx = 1;
        txSalary = new JTextField(10);
        add(txSalary,gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        JLabel jLabel9 = new JLabel("部门:");
        jLabel9.setFont(font);
        add(jLabel9, gbc);


        gbc.gridx = 1;
        txDepartment = new JTextField(10);
        add(txDepartment,gbc);

        //添加和取消按钮
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        btnSave = new JButton("添加");
        btnCancel = new JButton("取消");
        btnSave.setPreferredSize(new Dimension(100, 30));
        btnCancel.setPreferredSize(new Dimension(100, 30));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSave);
        buttonPanel.add(btnCancel);
        add(buttonPanel, gbc);

        //给添加员工按钮添加一个点击事件监听器
        btnSave.addActionListener(e -> {
            //获取输入框的数据，封装成员工对象，添加到信息界面的集合并在其表格展示
            Employee employee = new Employee();
            employee.setId(Integer.parseInt(txId.getText()));//将字符穿转为整数
            employee.setName(txName.getText());
            employee.setSex(txSex.getText());
            employee.setAge(Integer.parseInt(txAge.getText()));
            employee.setPhone(txPhone.getText());
            employee.setPosition(txPosition.getText());
            employee.setEntryDate(txHireDate.getText());
            employee.setSalary(Double.parseDouble(txSalary.getText()));
            employee.setDepartment(txDepartment.getText());
            //给员工对象送到信息界面那里去，添加到信息界面的集合中，并在信息界面的表格中展示
            employeeManagerUI.addEmployee(employee);
            //弹出一个提示成功的弹窗
            JOptionPane.showMessageDialog(this, "添加成功！", "提示", JOptionPane.INFORMATION_MESSAGE);
            //关闭当前窗口
            dispose();
        });

        //设置窗口属性
        pack();//窗口大小自适应
        setSize(300, 400);
        setLocationRelativeTo(null);//设置窗口居中
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//关闭窗口，退出程序
        setVisible(true);
    }
}
