//点击搜索按钮弹出弹窗，提供按照ID或姓名搜索两种方案，
//弹窗上有确定和取消两种按钮，点击确定按钮后，关闭弹窗，根据输入的关键字搜索员工信息，
//并更新表格，在这个新的搜索界面的左上角新增一个返回按钮，点击后返回到显示所有信息的主界面;
//点击取消按钮，关闭弹窗

package com.hfut.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchEmployeeUI extends JDialog {
    private JTextField searchField;
    private JButton searchButton;
    private JButton cancelButton;
    private JButton backButton;
    private EmployeeManagerUI employeeManagerUI;
    private DefaultTableModel tableModel;

    public SearchEmployeeUI(EmployeeManagerUI employeeManagerUI, DefaultTableModel tableModel) {
        super(employeeManagerUI, "搜索员工", true);
        this.employeeManagerUI = employeeManagerUI;
        this.tableModel = tableModel;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("搜索员工");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        searchField = new JTextField(20);
        searchButton = new JButton("确定");
        cancelButton = new JButton("取消");
        backButton = new JButton("返回");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = searchField.getText();
                if (employeeManagerUI != null) {
                    employeeManagerUI.searchEmployee(keyword);
                }
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeManagerUI.setVisible(true);
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(backButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(cancelButton);

        panel.add(searchField, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }
}

