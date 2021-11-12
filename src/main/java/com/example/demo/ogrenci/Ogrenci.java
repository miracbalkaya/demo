package com.example.demo.ogrenci;

import jdk.jfr.DataAmount;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ogrenci")
public class Ogrenci {

    @Id
    @GeneratedValue
    private int id;
    private String ad;
    private String soyad;
    private String alan;

    public Ogrenci(){
        super();
    }

    public Ogrenci(int id, String ad, String soyad, String alan) {
        super();
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.alan = alan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }
}
