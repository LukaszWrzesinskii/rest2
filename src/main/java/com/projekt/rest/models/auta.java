package com.projekt.rest.models;

@Entity
public class auta{
    @Id
    private int Id;
    @Column
    private String Marka;
    @Column
    private String Model;
    @Column
    private int rocznik;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarka) {
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
        return Rocznik;
    }

    public void setRocznik(int Rocznik) {
        this.Rocznik = Rocznik;
    }

}