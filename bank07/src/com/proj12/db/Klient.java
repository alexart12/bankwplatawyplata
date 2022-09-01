/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proj12.db;




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

@ManagedBean(name = "klient", eager = true)
@RequestScoped
public class Klient {

    int id;
    String czy_osoba_fizyczna;
    String czy_firma;
    String imie;
    String nazwisko;
    String narodowosc;
    String numer_dowodu;
    String pesel;
    String nip;
    String regon;
    String zawod;
    String zartudnienie_od;
    String zatrudnienie_do;
    String wykonywany_zawod;
    String czy_karta;
    String czy_visa;
    String czy_maestro;
    String czy_karta_przy_rejestracji;
    String czy_listownie;
    String data_wystawienia_karty;

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

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
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

    public String getNumer_dowodu() {
        return numer_dowodu;
    }

    public void setNumer_dowodu(String numer_dowodu) {
        this.numer_dowodu = numer_dowodu;
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

    public String getZartudnienie_od() {
        return zartudnienie_od;
    }

    public void setZartudnienie_od(String zartudnienie_od) {
        this.zartudnienie_od = zartudnienie_od;
    }

    public String getZatrudnienie_do() {
        return zatrudnienie_do;
    }

    public void setZatrudnienie_do(String zatrudnienie_do) {
        this.zatrudnienie_do = zatrudnienie_do;
    }

    public String getWykonywany_zawod() {
        return wykonywany_zawod;
    }

    public void setWykonywany_zawod(String wykonywany_zawod) {
        this.wykonywany_zawod = wykonywany_zawod;
    }

    public String getCzy_karta() {
        return czy_karta;
    }

    public void setCzy_karta(String czy_karta) {
        this.czy_karta = czy_karta;
    }

    public String getCzy_visa() {
        return czy_visa;
    }

    public void setCzy_visa(String czy_visa) {
        this.czy_visa = czy_visa;
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
    
    
    
    
    /**
     * Creates a new instance of klient
     */
    public Klient() {
    }
    
}
