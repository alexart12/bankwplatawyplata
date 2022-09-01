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
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *tyutyutyutyutyu
 * @author mateu
 */




import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import sun.rmi.runtime.Log;

@ManagedBean(name = "rachuneka", eager = true)
@SessionScoped
public class Rachuneka {

    int id;
    String numer_rachunku;
    String data_zalozenia;
    String czy_karta;
    String czy_krajowy;
    String czy_zagraniczny;
    String numerAktualnegoRachunkuZalogowanegoClienta;
    String nazwisko;
    Connection conn;
    
String czy_obslugiwany;
    
    
    public String getCzy_obslugiwany() {
		return czy_obslugiwany;
	}

	public void setCzy_obslugiwany(String czy_obslugiwany) {
		this.czy_obslugiwany = czy_obslugiwany;
	}
    
    public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getNumerAktualnegoRachunkuZalogowanegoClienta() {
		return numerAktualnegoRachunkuZalogowanegoClienta;
	}

	public void setNumerAktualnegoRachunkuZalogowanegoClienta(String numerAktualnegoRachunkuZalogowanegoClienta) {
		this.numerAktualnegoRachunkuZalogowanegoClienta = numerAktualnegoRachunkuZalogowanegoClienta;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumer_rachunku() {
        return numer_rachunku;
    }

    public void setNumer_rachunku(String numer_rachunku) {
        this.numer_rachunku = numer_rachunku;
    }

    public String getData_zalozenia() {
        return data_zalozenia;
    }

    public void setData_zalozenia(String data_zalozenia) {
        this.data_zalozenia = data_zalozenia;
    }

    public String getCzy_karta() {
        return czy_karta;
    }

    public void setCzy_karta(String czy_karta) {
        this.czy_karta = czy_karta;
    }

    public String isCzy_krajowy() {
        return czy_krajowy;
    }

    public void setCzy_krajowy(String czy_krajowy) {
        this.czy_krajowy = czy_krajowy;
    }

    public String getCzy_zagraniczny() {
        return czy_zagraniczny;
    }

    public void setCzy_zagraniczny(String czy_zagraniczny) {
        this.czy_zagraniczny = czy_zagraniczny;
    }
    
    /**
     * Creates a new instance of rachunek
     */
    public Rachuneka() {
    }
    
    
    
    public int  wybierzKlient2(Rachunek rach) {
    	
    	id = rach.getId();
    	nazwisko = rach.getNazwisko();
    	numer_rachunku = rach.getNumer_rachunku();
    	numerAktualnegoRachunkuZalogowanegoClienta=rach.getNumer_rachunku();
    	
    	return 1;
    } 
    
    public Connection sql_connect() {
        Connection con=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "admin", "admin");
        }catch(Exception e){
        
        }
        
        
        return con;
    }
   
    
    
    public int  wybierzKlient3(Rachunek rach) {
    	
    	Rachuneka racha = new Rachuneka();
    	racha.numerAktualnegoRachunkuZalogowanegoClienta="78687354354";
    	id = rach.getId();
    	nazwisko = rach.getNazwisko();
    	numer_rachunku = rach.getNumer_rachunku();
    	numerAktualnegoRachunkuZalogowanegoClienta=rach.getNumer_rachunku();
    	
    	 conn = sql_connect();
         Statement stm = null;
         PreparedStatement pstmt = null;
         ResultSet rs =null;
         try{
             stm = conn.createStatement(); 
            
             
             pstmt = conn.prepareStatement("select idrachunek from rachunek where czy_obslugiwany=1");//+imie+"' and nazwisko='"+nazwisko+"' and dob='"+data_urodzenia+"'");
             
             rs = pstmt.executeQuery();
              while (rs.next()) {
             
             String klient_id=rs.getString("idrachunek");
             stm.executeUpdate("Update rachunek set czy_obslugiwany=0 where idrachunek="+klient_id);// (imie,nazwisko,dob) values('"+imie+"','"+nazwisko+"','"+data_urodzenia+"')");
              
             
             }
             
             //Klient
            stm.executeUpdate("Update rachunek set czy_obslugiwany=1 where idrachunek="+rach.getId()); //values('"+imie+"','"+nazwisko+"','"+data_urodzenia+"')");
             //get id
             
             
         } catch(Exception e) {
     	}
    	
    	
    	
    	return 1;
    
    }
    
    
    
public int  dodajWyplata(DokumentPrzelewu dok,Rachunek rach) {
    	
    	Rachuneka racha = new Rachuneka();
    	racha.numerAktualnegoRachunkuZalogowanegoClienta="78687354354";
    	id = rach.getId();
    	nazwisko = rach.getNazwisko();
    	numer_rachunku = rach.getNumer_rachunku();
    	numerAktualnegoRachunkuZalogowanegoClienta=rach.getNumer_rachunku();
    	
    	 conn = sql_connect();
         Statement stm = null;
         PreparedStatement pstmt = null;
         ResultSet rs =null;
         try{
             stm = conn.createStatement(); 
            
             
             
            
             
             //Klient
            //stm.executeUpdate("Insert rachunek set czy_obslugiwany=1 where idrachunek="+rach.getId()); //values('"+imie+"','"+nazwisko+"','"+data_urodzenia+"')");
             //get id
            //stm.executeUpdate("Insert into konto (imie,nazwisko,dob) values('"+imie+"','"+nazwisko+"','"+data_urodzenia+"')"); 
             
         } catch(Exception e) {
     	}
    	
    	
    	
    	return 1;
    
    }
    
    
    
}
