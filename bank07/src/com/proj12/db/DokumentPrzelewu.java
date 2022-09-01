package com.proj12.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="przelew", eager = true)
@SessionScoped
public class DokumentPrzelewu {
	
	int id;
	String nazwa;
	String nadawca;
	String odbiorca;
	String tytulem;
	float kwota;
	String nazwisko;
    String numer_rachunku;
	String numerAktualnegoRachunkuZalogowanegoClienta;
	Connection conn;
	String data_zlozenia; 
	String nazwa2;
	
	
public String getNazwa2() {
		return nazwa2;
	}


	public void setNazwa2(String nazwa2) {
		this.nazwa2 = nazwa2;
	}


public String getTytulem() {
		return tytulem;
	}


	public void setTytulem(String tytulem) {
		this.tytulem = tytulem;
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


	public String getNadawca() {
		return nadawca;
	}


	public void setNadawca(String nadawca) {
		this.nadawca = nadawca;
	}


	public String getOdbiorca() {
		return odbiorca;
	}


	public void setOdbiorca(String odbiorca) {
		this.odbiorca = odbiorca;
	}


	


	public float getKwota() {
		return kwota;
	}


	public void setKwota(float kwota) {
		this.kwota = kwota;
	}


	public String getNazwisko() {
		return nazwisko;
	}


	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	public String getNumer_rachunku() {
		return numer_rachunku;
	}


	public void setNumer_rachunku(String numer_rachunku) {
		this.numer_rachunku = numer_rachunku;
	}


	public String getNumerAktualnegoRachunkuZalogowanegoClienta() {
		return numerAktualnegoRachunkuZalogowanegoClienta;
	}


	public void setNumerAktualnegoRachunkuZalogowanegoClienta(String numerAktualnegoRachunkuZalogowanegoClienta) {
		this.numerAktualnegoRachunkuZalogowanegoClienta = numerAktualnegoRachunkuZalogowanegoClienta;
	}


	public String getData_zlozenia() {
		return data_zlozenia;
	}


	public void setData_zlozenia(String data_zlozenia) {
		this.data_zlozenia = data_zlozenia;
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
	   	
	
public int  dodajWyplata(DokumentPrzelewu dok,Rachuneka rach) {
    	
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
            
             
            //dodac tabele przelew 
            
             
             //Klient
            //stm.executeUpdate("Insert rachunek set czy_obslugiwany=1 where idrachunek="+rach.getId()); //values('"+imie+"','"+nazwisko+"','"+data_urodzenia+"')");
             //get id
            stm.executeUpdate("Insert into konto (nazwa,wyplata,id_rachunek) values('"+nazwa+"','"+kwota+"','"+id+"')");//'"+imie+"','"+nazwisko+"','"+data_urodzenia+"')"); 
             
         } catch(Exception e) {
     	}
    	
    	
    	
    	return 1;
    
    }
	
public int  dodajWplata(DokumentPrzelewu dok,Rachuneka rach) {
	
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
        
         
        //dodac tabele przelew 
        
         
         //Klient
        //stm.executeUpdate("Insert rachunek set czy_obslugiwany=1 where idrachunek="+rach.getId()); //values('"+imie+"','"+nazwisko+"','"+data_urodzenia+"')");
         //get id
        stm.executeUpdate("Insert into konto (nazwa,wplata,id_rachunek) values('"+nazwa+"','"+kwota+"','"+id+"')");//'"+imie+"','"+nazwisko+"','"+data_urodzenia+"')"); 
         
     } catch(Exception e) {
 	}
	
	
	
	return 1;

}



}
