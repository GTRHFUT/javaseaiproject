package com.hfut.ui;

import com.hfut.bean.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagerUI extends JFrame {
    private JFrame frame;//窗口
    private JTable table;//表格
    private DefaultTableModel model;//表格模型:封装表格数据的对象
    private JTextField nameTextFieldSearch;//搜索输入框
    //静态集合对象用于存储系统中的全部员工对象信息
    private static ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeManagerUI() {
    }

    public EmployeeManagerUI(String username) {
        frame = this;
        initialize();
        this.setVisible(true);
    }

    private void initialize() {
        this.setBounds(100, 100, 800, 600);
        this.setTitle("合肥工业大学员工管理系统");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());

        //输入框和搜索按钮
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nameTextFieldSearch = new JTextField(20);
        JButton btnSearch = new JButton("搜索");
        JButton btnAdd = new JButton("添加");
        topPanel.add(nameTextFieldSearch);
        topPanel.add(btnSearch);
        topPanel.add(btnAdd);

        //创建表格模型
        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "姓名", "性别", "年龄", "电话", "职位", "入职日期", "薪水", "部门"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setRowHeight(30);

        //添加数据列表
        for (int i = 0; i < 2; i++) {
            model.addRow(new Object[]{i + 1, "员工" + (i + 1), "男", "30", "18888888888", "java工程师", new Date().toLocaleString(), 30000, "研发部"});
        }

        //右键菜单
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editItem = new JMenuItem("编辑");
        JMenuItem deleteItem = new JMenuItem("删除");
        popupMenu.add(editItem);
        popupMenu.add(deleteItem);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {//检查是否是鼠标右键
                    int row = table.rowAtPoint(e.getPoint());
                    if (row >= 0) {
                        table.setRowSelectionInterval(row, row);
                        popupMenu.show(table, e.getX(), e.getY());
                    }
                }
            }
        });

        //绑定事件到菜单项
        editItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //这里可以添加编辑员工信息的代码
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    //获取选中行的数据
                    int id = (int) model.getValueAt(selectedRow, 0);
                    String name = (String) model.getValueAt(selectedRow, 1);
                    String sex = (String) model.getValueAt(selectedRow, 2);
                    int age = (int) model.getValueAt(selectedRow, 3);
                    String phone = (String) model.getValueAt(selectedRow, 4);
                    String position = (String) model.getValueAt(selectedRow, 5);
                    String entryDate = (String) model.getValueAt(selectedRow, 6);
                    double salary = (double) model.getValueAt(selectedRow, 7);
                    String department = (String) model.getValueAt(selectedRow, 8);


                    //弹出一个对话框，让用户输入员工信息
                    JPanel panel = new JPanel(new GridLayout(9, 2));
                    JTextField txId = new JTextField(String.valueOf(id));
                    JTextField txName = new JTextField(name);
                    JTextField txSex = new JTextField(sex);
                    JTextField txAge = new JTextField(String.valueOf(age));
                    JTextField txPhone = new JTextField(phone);
                    JTextField txPosition = new JTextField(position);
                    JTextField txEntryDate = new JTextField(entryDate);
                    JTextField txSalary = new JTextField(String.valueOf(salary));
                    JTextField txDepartment = new JTextField(department);

                    panel.add(new JLabel("ID:"));
                    panel.add(txId);
                    panel.add(new JLabel("姓名:"));
                    panel.add(txName);
                    panel.add(new JLabel("性别:"));
                    panel.add(txSex);
                    panel.add(new JLabel("年龄:"));
                    panel.add(txAge);
                    panel.add(new JLabel("电话:"));
                    panel.add(txPhone);
                    panel.add(new JLabel("职位:"));
                    panel.add(txPosition);
                    panel.add(new JLabel("入职日期:"));
                    panel.add(txEntryDate);
                    panel.add(new JLabel("薪水:"));
                    panel.add(txSalary);
                    panel.add(new JLabel("部门:"));
                    panel.add(txDepartment);

                    int result = JOptionPane.showConfirmDialog(frame, panel, "编辑员工信息", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (result == JOptionPane.OK_OPTION) {
                        //更新表格模型中的数据
                        model.setValueAt(Integer.parseInt(txId.getText()), selectedRow, 0);
                        model.setValueAt(txName.getText(), selectedRow, 1);
                        model.setValueAt(txSex.getText(), selectedRow, 2);
                        model.setValueAt(Integer.parseInt(txAge.getText()), selectedRow, 3);
                        model.setValueAt(txPhone.getText(), selectedRow, 4);
                        model.setValueAt(txPosition.getText(), selectedRow, 5);
                        model.setValueAt(txEntryDate.getText(), selectedRow, 6);
                        model.setValueAt(Double.parseDouble(txSalary.getText()), selectedRow, 7);
                        model.setValueAt(txDepartment.getText(), selectedRow, 8);

                        // 更新员工对象
                        Employee updatedEmployee = new Employee(
                                Integer.parseInt(txId.getText()),
                                txName.getText(),
                                txSex.getText(),
                                Integer.parseInt(txAge.getText()),
                                txPhone.getText(),
                                txPosition.getText(),
                                txEntryDate.getText(),
                                Double.parseDouble(txSalary.getText()),
                                txDepartment.getText()
                        );
                        employees.set(selectedRow, updatedEmployee);

                        model.fireTableRowsUpdated(selectedRow, selectedRow);
                    }
                    JOptionPane.showMessageDialog(frame, "编辑员工信息：" + id + ", " + name + ", " + position + ", " + department + " 成功");
                }
            }
        });



        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //这里可以添加删除员工信息的代码
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    //获取选中行的数据
                    int id = (int) model.getValueAt(selectedRow, 0);
                    String name = (String) model.getValueAt(selectedRow, 1);
                    String position = (String) model.getValueAt(selectedRow, 2);
                    String department = (String) model.getValueAt(selectedRow, 3);
                    model.removeRow(selectedRow);
                    employees.removeIf(emp -> emp.getId() == id);
                    JOptionPane.showMessageDialog(frame, "删除员工信息：" + id + ", " + name + ", " + position + ", " + department + " 成功");
                }
            }
        });


        //搜索按钮监听器
        btnSearch.addActionListener(e -> {
            String searchText = nameTextFieldSearch.getText();
            new SearchEmployeeUI(this, model);
        });

        //添加按钮监听器
        btnAdd.addActionListener(e -> {
            //弹出一个添加员工信息的界面出来
            new AddEmployeeUI(this);
        });

        frame.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    public void addEmployee(Employee employee) {
        //添加到集合，展示到表格
        employees.add(employee);
        //添加一行数据到表格
        model.addRow(new Object[]{employee.getId(), employee.getName(), employee.getSex(), employee.getAge(), employee.getPhone(), employee.getPosition(), employee.getEntryDate(), employee.getSalary(), employee.getDepartment()});
    }

    public void searchEmployee(String keyword) {
        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> String.valueOf(employee.getId()).contains(keyword) || employee.getName().contains(keyword))
                .collect(Collectors.toList());

        // 清空现有数据
        model.setRowCount(0);
        for (Employee employee : filteredEmployees) {
            model.addRow(new Object[]{
                    employee.getId(),
                    employee.getName(),
                    employee.getSex(),
                    employee.getAge(),
                    employee.getPhone(),
                    employee.getPosition(),
                    employee.getEntryDate(),
                    employee.getSalary(),
                    employee.getDepartment()
            });
        }
    }
}
