package com.example.demo.hibernatetest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personel")
public class Personel {

    private int personelid;
    private String personelAdi, personelSoyadi;

    @Id
    public int getPersonelid(){
        return personelid;
    }

    public void setPersonelid(int personelid){
        this.personelid = personelid;
    }

    public String getPersonelAdi(){
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi){
        this.personelAdi = personelAdi;
    }

    public String getPersonelSoyadi(){
        return personelSoyadi;
    }

    public void setPersonelSoyadi(String personelSoyadi){
        this.personelSoyadi = personelSoyadi;
    }

}
