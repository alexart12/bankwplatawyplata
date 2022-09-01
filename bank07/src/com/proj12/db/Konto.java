/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proj12.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author mateu
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import sun.rmi.runtime.Log;

@ManagedBean(name = "konto", eager = true)
@RequestScoped
public class Konto {
    
    int id;
    String nazwa;
    Float wplata;
    Float wyplata;
    Float stan;
    int id_rachunek;

    
    
    public Connection sql_connect() {
        Connection con=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "admin", "admin");
        }catch(Exception e){
        
        }
        
        
        return con;
    }
    
    public ArrayList<Konto> getSqlObslugiwaneKonto() throws SQLException{
        
        ArrayList<Konto> lKonto = new ArrayList<Konto>();
        
        Connection conn = sql_connect();
        String id="5";//String.valueOf(racha.getId());
         
        
        PreparedStatement pstmt = conn.prepareStatement("select id,nazwa,wplata,wyplata,stan from konto where id_rachunek=(select idrachunek from rachunek where czy_obslugiwany=1)");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
        
        Konto r = new Konto();
        r.id = rs.getInt("id");
        r.nazwa= rs.getString("nazwa");
        r.wplata= rs.getFloat("wplata");
        r.wyplata= rs.getFloat("wyplata");
        r.stan= rs.getFloat("stan");
        
        lKonto.add(r);
        
        }
        return lKonto;
        }
    
    public ArrayList<Konto> getSqlKonto(String a) throws SQLException{
        
        ArrayList<Konto> lKonto = new ArrayList<Konto>();
        
        Connection conn = sql_connect();
        String id=a;//String.valueOf(racha.getId());
        PreparedStatement pstmt = conn.prepareStatement("select id,nazwa,wplata,wyplata,stan from konto where id_rachunek="+id);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
        
        Konto r = new Konto();
        r.id = rs.getInt("id");
        r.nazwa= rs.getString("nazwa");
        r.wplata= rs.getFloat("wplata");
        r.wyplata= rs.getFloat("wyplata");
        r.stan= rs.getFloat("stan");
        
        
        lKonto.add(r);
        
        
        }
        return lKonto;
        }
        
    
    
    
    @Inject
    private Rachuneka racha;
    public ArrayList<Konto> getSqlKonto() throws SQLException{
    
    ArrayList<Konto> lKonto = new ArrayList<Konto>();
    
    Connection conn = sql_connect();
    String id="5";//String.valueOf(racha.getId());
    PreparedStatement pstmt = conn.prepareStatement("select id,nazwa,wplata,wyplata,stan from konto where id_rachunek=(select idrachunek from rachunek where czy_obslugiwany=1)");
    ResultSet rs = pstmt.executeQuery();
    while(rs.next()){
    
    Konto r = new Konto();
    r.id = rs.getInt("id");
    r.nazwa= rs.getString("nazwa");
    r.wplata= rs.getFloat("wplata");
    r.wyplata= rs.getFloat("wyplata");
    r.stan= rs.getFloat("stan");
    
    
    lKonto.add(r);
    
    
    }
    return lKonto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Float getWplata() {
        return wplata;
    }

    public void setWplata(Float wplata) {
        this.wplata = wplata;
    }

    public Float getWyplata() {
        return wyplata;
    }

    public void setWyplata(Float wyplata) {
        this.wyplata = wyplata;
    }

    public Float getStan() {
        return stan;
    }

    public void setStan(Float stan) {
        this.stan = stan;
    }

    public int getId_rachunek() {
        return id_rachunek;
    }

    public void setId_rachunek(int id_rachunek) {
        this.id_rachunek = id_rachunek;
    }

    /**
     * Creates a new instance of konto
     */
    public Konto() {
    }
    
}
