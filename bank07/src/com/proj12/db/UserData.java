/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proj12.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import sun.rmi.runtime.Log;

@ManagedBean(name = "userData", eager = true)
@RequestScoped
public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String dept;
    private int age;
    private int salary;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public UserData() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Connection get_connection() {

        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "admin", "admin");
            // jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC

        } catch (Exception e) {
            System.out.print(e);
        }
        return connection;
    }

    
     public Connection sql_connect() {
        Connection con=null;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "admin", "admin");
        }catch(Exception e){
        
        }
        
        
        return con;
    }
                     
     public  int getRachunek() throws ClassNotFoundException{
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = sql_connect();
         Statement stm = null;
        try{
            stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO rachunek ( numer_rachunku) VALUES ('3453535345345')"); 
            
        }catch(Exception e){
        }
        return 1;
    }
    
    public ArrayList<Employee> getSqlEmplyees() throws ClassNotFoundException, SQLException {
        this.employees = new ArrayList<Employee>();
        Connection connect = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            //Class.forName("com.mysql.jdbc.Driver");
            connect = get_connection();
            // System.out.println("Connection established"+connect);

            ArrayList<Employee> employees = new ArrayList<Employee>();
            employees = new ArrayList<Employee>();
            pstmt = connect
                    .prepareStatement("select name, dept, age, salary from Employee");
            rs = pstmt.executeQuery();
        } catch (Exception ex) {
            System.out.println("in exec");
            System.out.println(ex.getMessage());
        }

        while (rs.next()) {

            Employee employee = new Employee(rs.getString("name"), rs.getString("dept"), rs.getInt("age"), rs.getInt("salary"));

            employees.add(employee);

        }

        // close resources
        rs.close();
        pstmt.close();
        connect.close();
        return employees;
    }

    
    
    
    
    public ArrayList<Employee> getEmployees() {

        //add sql
        ArrayList<Employee> list = null;
        try {

            list = getSqlEmplyees();

        } catch (Exception e) {
            System.out.print(e);

        }

        return list;

    }

    public String addEmployee() {
        Employee employee = new Employee(name, dept, age, salary);
        employees.add(employee);
        return null;
    }

    public String deleteEmployee(Employee employee) {
        employees.remove(employee);
        return null;
    }

    public String editEmployee(Employee employee) {
        employee.setCanEdit(true);
        return null;
    }

    public String saveEmployees() {

        //set "canEdit" of all employees to false 
        for (Employee employee : employees) {
            employee.setCanEdit(false);
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
   }
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
