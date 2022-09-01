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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author mateu
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import sun.rmi.runtime.Log;

@ManagedBean(name = "bank", eager = true)
@SessionScoped
public class bank_communication {

    
    Klient klient ;
    Rachunek rachunek ;
    Karta_debetowa karta;
    // Klient
    int id;
    String czy_osoba_fizyczna;
    String czy_firma;
    String imie;
    String nazwisko;
    String data_urodzenia;
    String narodowosc;
    String nr_dowodu;
    String pesel;
    String nip;
    String regon; 
    String zawod;
    String zatrudnienie_od;
    String zatrudnienie_do;
    String wykonyway_zawod;
    String czy_karta;
    String czy_wiza;
    String czy_maestro;
    String czy_karta_przy_rejestracji;
    String czy_listownie;
    String  data_wystawienia_karty;
    
    ////rachunek
    int idrachunek;
   String numer_rachunku;
   String data_zalozenia;
   String czy_karta1_____signal_____;
   String krajowy;
   String zagraniczny;
    Connection conn;
    
   /*
   //rachunek
   int idrachunek; 
   String numer_rachunku;
   String data_zalozenia;
   String czy_karta;
   String krajowy;
   String zagraniczny;
    */
   //karta_debetowa
    int id1karta;
    String nr_karty;
    String data_wydania;
    String data_waznosci;
    String czy_visa;
    String czy_maestro1karta;
    String czy_zagubiona;
    String data_zgubienia;
    String karta_debetowacol;

    public String getData_urodzenia() {
        return data_urodzenia;
    }

    public void setData_urodzenia(String data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }
    
            
            
    public Rachunek getRachunek() {
		return rachunek;
	}

	public void setRachunek(Rachunek rachunek) {
		this.rachunek = rachunek;
	}

	public String getImie() {
        return imie;
    }
    public void setImie(String imie) {    
        this.imie = imie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCzy_osoba_fizyczna() {
        return czy_osoba_fizyczna;
    }

    public void setCzy_osoba_fizyczna(String czy_osoba_fizyczna) {
        this.czy_osoba_fizyczna = czy_osoba_fizyczna;
    }

    public String getCzy_firma() {
        return czy_firma;
    }

    public void setCzy_firma(String czy_firma) {
        this.czy_firma = czy_firma;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNarodowosc() {
        return narodowosc;
    }

    public void setNarodowosc(String narodowosc) {
        this.narodowosc = narodowosc;
    }

    public String getNr_dowodu() {
        return nr_dowodu;
    }

    public void setNr_dowodu(String nr_dowodu) {
        this.nr_dowodu = nr_dowodu;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public String getZatrudnienie_od() {
        return zatrudnienie_od;
    }

    public void setZatrudnienie_od(String zatrudnienie_od) {
        this.zatrudnienie_od = zatrudnienie_od;
    }

    public String getZatrudnienie_do() {
        return zatrudnienie_do;
    }

    public void setZatrudnienie_do(String zatrudnienie_do) {
        this.zatrudnienie_do = zatrudnienie_do;
    }

    public String getWykonyway_zawod() {
        return wykonyway_zawod;
    }

    public void setWykonyway_zawod(String wykonyway_zawod) {
        this.wykonyway_zawod = wykonyway_zawod;
    }

    public String getCzy_karta() {
        return czy_karta;
    }

    public void setCzy_karta(String czy_karta) {
        this.czy_karta = czy_karta;
    }

    public String getCzy_wiza() {
        return czy_wiza;
    }

    public void setCzy_wiza(String czy_wiza) {
        this.czy_wiza = czy_wiza;
    }

    public String getCzy_maestro() {
        return czy_maestro;
    }

    public void setCzy_maestro(String czy_maestro) {
        this.czy_maestro = czy_maestro;
    }

    public String getCzy_karta_przy_rejestracji() {
        return czy_karta_przy_rejestracji;
    }

    public void setCzy_karta_przy_rejestracji(String czy_karta_przy_rejestracji) {
        this.czy_karta_przy_rejestracji = czy_karta_przy_rejestracji;
    }

    public String getCzy_listownie() {
        return czy_listownie;
    }

    public void setCzy_listownie(String czy_listownie) {
        this.czy_listownie = czy_listownie;
    }

    public String getData_wystawienia_karty() {
        return data_wystawienia_karty;
    }

    public void setData_wystawienia_karty(String data_wystawienia_karty) {
        this.data_wystawienia_karty = data_wystawienia_karty;
    }

    public int getIdrachunek() {
        return idrachunek;
    }

    public void setIdrachunek(int idrachunek) {
        this.idrachunek = idrachunek;
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

    public String getCzy_karta1_____signal_____() {
        return czy_karta1_____signal_____;
    }

    public void setCzy_karta1_____signal_____(String czy_karta1_____signal_____) {
        this.czy_karta1_____signal_____ = czy_karta1_____signal_____;
    }

    public String getKrajowy() {
        return krajowy;
    }

    public void setKrajowy(String krajowy) {
        this.krajowy = krajowy;
    }

    public String getZagraniczny() {
        return zagraniczny;
    }

    public void setZagraniczny(String zagraniczny) {
        this.zagraniczny = zagraniczny;
    }

    public int getId1karta() {
        return id1karta;
    }

    public void setId1karta(int id1karta) {
        this.id1karta = id1karta;
    }

    public String getNr_karty() {
        return nr_karty;
    }

    public void setNr_karty(String nr_karty) {
        this.nr_karty = nr_karty;
    }

    public String getData_wydania() {
        return data_wydania;
    }

    public void setData_wydania(String data_wydania) {
        this.data_wydania = data_wydania;
    }

    public String getData_waznosci() {
        return data_waznosci;
    }

    public void setData_waznosci(String data_waznosci) {
        this.data_waznosci = data_waznosci;
    }

    public String getCzy_visa() {
        return czy_visa;
    }

    public void setCzy_visa(String czy_visa) {
        this.czy_visa = czy_visa;
    }

    public String getCzy_maestro1karta() {
        return czy_maestro1karta;
    }

    public void setCzy_maestro1karta(String czy_maestro1karta) {
        this.czy_maestro1karta = czy_maestro1karta;
    }

    public String getCzy_zagubiona() {
        return czy_zagubiona;
    }

    public void setCzy_zagubiona(String czy_zagubiona) {
        this.czy_zagubiona = czy_zagubiona;
    }

    public String getData_zgubienia() {
        return data_zgubienia;
    }

    public void setData_zgubienia(String data_zgubienia) {
        this.data_zgubienia = data_zgubienia;
    }

    public String getKarta_debetowacol() {
        return karta_debetowacol;
    }

    public void setKarta_debetowacol(String karta_debetowacol) {
        this.karta_debetowacol = karta_debetowacol;
    }
    
    
    
    /**
     * Creates a new instance of bank_communication
     */
    public bank_communication() {
    }
   
    
    public String GetEmplyees() {
    	
    	List<EmployeeTest> listE = new ArrayList<EmployeeTest>(); 
    	String result = "";//JsonConvert.SerializeObject(new{data=list});
    	return result;
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
   
    public int drukujRaport() throws SQLException{
    
    	
    //call jasper report library
    //create report object	
    	
    	
    	
    ArrayList<Rachunek> lRachunki = new ArrayList<Rachunek>();
    
    Connection conn = sql_connect();
    PreparedStatement pstmt = conn.prepareStatement("select idrachunek,numer_rachunku from rachunek");
    ResultSet rs = pstmt.executeQuery();
    while(rs.next()){
    
    Rachunek r = new Rachunek();
    r.id = rs.getInt("idrachunek");
    r.numer_rachunku = rs.getString("numer_rachunku");
    
    
    lRachunki.add(r);
    }
    return 0;
    }
    
public ArrayList<Rachunek> getSqlRachunkiObslugiwany() throws SQLException{
        
        ArrayList<Rachunek> lRachunki = new ArrayList<Rachunek>();
        
        Connection conn = sql_connect();
        PreparedStatement pstmt = conn.prepareStatement("select rachunek.idrachunek,klient.nazwisko,rachunek.numer_rachunku,rachunek.czy_obslugiwany from rachunek,klient where klient.id=rachunek.id_klient and czy_obslugiwany=1");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
        
        Rachunek r = new Rachunek();
        r.id = rs.getInt("idrachunek");
        r.nazwisko=rs.getString("nazwisko");
        r.numer_rachunku = rs.getString("numer_rachunku");
        r.czy_obslugiwany = rs.getString("czy_obslugiwany");
        
        
        lRachunki.add(r);
        
        
        }
    return lRachunki;
    }
    
    public ArrayList<Rachunek> getSqlRachunki() throws SQLException{
        
        ArrayList<Rachunek> lRachunki = new ArrayList<Rachunek>();
        
        Connection conn = sql_connect();
        PreparedStatement pstmt = conn.prepareStatement("select rachunek.idrachunek,klient.nazwisko,rachunek.numer_rachunku,rachunek.czy_obslugiwany from rachunek,klient where klient.id=rachunek.id_klient");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
        
        Rachunek r = new Rachunek();
        r.id = rs.getInt("idrachunek");
        r.nazwisko=rs.getString("nazwisko");
        r.numer_rachunku = rs.getString("numer_rachunku");
        r.czy_obslugiwany = rs.getString("czy_obslugiwany");
        
        
        lRachunki.add(r);
        
        
        }
    return lRachunki;
    }
    
    
    
    
    
    
    
 public ArrayList<Rachunek> getSqlRachunki2() throws SQLException{
        
        ArrayList<Rachunek> lRachunki = new ArrayList<Rachunek>();
        
        Rachunek r = new Rachunek();
        r.id=1;
        r.numer_rachunku = "laskjd";
        
        
        lRachunki.add(r);
        
        
        
    return lRachunki;
    }
    
 public ArrayList<lokata> getSqlLokata() {
		
		ArrayList<lokata> lilokata = new ArrayList();
		lokata lok = new lokata();
		lok.setDataZalozenia("01/01/2005");
		lok.setKwotaLokaty(760);
     lilokata.add(lok);
     
     lokata lok2 = new lokata();
		lok2.setDataZalozenia("01/02/2005");
		lok2.setKwotaLokaty(762);
     lilokata.add(lok2);
     
     
		return lilokata;
	}
    
    
    
    
    
    public void rejestruj_klient(){
    
    Klient klient = new Klient();
    Rachunek rachunek = new Rachunek();
        
    klient.id = id;
    int id;
    klient.czy_osoba_fizyczna=czy_osoba_fizyczna;
    String czy_firma;
    String imie;
    String nazwisko;
    String narodowosc;
    String nr_dowodu;
    String pesel;
    String nip;
    String regon; 
    String zawod;
    String zatrudnienie_od;
    String zatrudnienie_do;
    String wykonyway_zawod;
    String czy_karta;
    String czy_wiza;
    String czy_maestro;
    String czy_karta_przy_rejestracji;
    String czy_listownie;
    String data_wystawienia_karty;
        
    }
    
    
    public  int addRachunek(){
    
        conn = sql_connect();
        Statement stm = null;
        PreparedStatement pstmt = null;
        ResultSet rs =null;
        try{
            stm = conn.createStatement(); 
           
            //Klient
            
           stm.executeUpdate("Insert into klient (imie,nazwisko,dob) values('"+imie+"','"+nazwisko+"','"+data_urodzenia+"')");
            //get id
            pstmt = conn.prepareStatement("select id from klient where imie='"+imie+"' and nazwisko='"+nazwisko+"' and dob='"+data_urodzenia+"'");
            
            rs = pstmt.executeQuery();
             while (rs.next()) {
            
            klient=new Klient();
            
            klient.id=rs.getInt("id");
            }
            
            //karta
            
            stm.executeUpdate("Insert into karta_debetowa (nr_karty,data_wydania,data_waznosci,id_klient) values('"+nr_karty+"','"+data_wydania+"','"+data_waznosci+"','"+klient.id+"')");
            
            //get id
            pstmt = conn.prepareStatement("select id from karta_debetowa where nr_karty='"+nr_karty+"' and id_klient='"+klient.id+"'");
            
            rs = pstmt.executeQuery();
             while (rs.next()) {

            karta = new Karta_debetowa();
            karta.id =rs.getInt("id");
            }
            
            
            //Rachunek
            czy_karta="Tak";
            
            stm.executeUpdate("Insert into rachunek (numer_rachunku,data_zalozenia,czy_karta,id_klient,id_karta) values('"+numer_rachunku+"','"+data_zalozenia+"','"+czy_karta+"','"+klient.id+"','"+karta.id+"')");
            
           
        }catch(Exception e){
            System.out.print(e);
        }
        return 1;
    }

    public ArrayList<Rachunek> get_rachunki_for_client(){
        
        ArrayList<Rachunek> rachunki = new ArrayList<Rachunek>() ;
                
    return rachunki;
    
    }
    
    public ArrayList<Klient> sql_all_clients(){
     ArrayList<Klient> lklient = new ArrayList<Klient>() ;
                
    return lklient;
    }
}
