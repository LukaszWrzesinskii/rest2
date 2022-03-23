package com.projekt.rest.models;

import javax.persistence.*;

@Entity
public class user {
    @Id
    private int Id;
    @Column
    private String Marka;
    @Column
    private String Model;
    @Column
    private int rocznik;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        this.Id = Id;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String Marka) {
        this.Marka = Marka;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int Rocznik) {
        this.rocznik = Rocznik;
    }

}
