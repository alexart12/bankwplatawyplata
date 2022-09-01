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

@ManagedBean(name = "karta_debetowa", eager = true)
@RequestScoped
public class Karta_debetowa {

    int id;
    String nr_karty;
    String data_wydania;
    String data_ważnosci;
    String czy_visa;
    String maestro;
    String czy_zagubiona;
    String data_zgubienia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getData_ważnosci() {
        return data_ważnosci;
    }

    public void setData_ważnosci(String data_ważnosci) {
        this.data_ważnosci = data_ważnosci;
    }

    public String getCzy_visa() {
        return czy_visa;
    }

    public void setCzy_visa(String czy_visa) {
        this.czy_visa = czy_visa;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
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
    /**
     * Creates a new instance of karta_debetowa
     */
    public Karta_debetowa() {
    }
    
}
