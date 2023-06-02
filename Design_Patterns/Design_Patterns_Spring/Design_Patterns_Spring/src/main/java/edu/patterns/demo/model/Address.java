package edu.patterns.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private String cep;
    private String number;
    private String complement;
    private String neightborhood;
    private String locallity;
    private String state;
    private String ibge;
    private String gia;
    private String ddd;
    private String siaf;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeightborhood() {
        return neightborhood;
    }

    public void setNeightborhood(String neightborhood) {
        this.neightborhood = neightborhood;
    }

    public String getLocallity() {
        return locallity;
    }

    public void setLocallity(String locallity) {
        this.locallity = locallity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiaf() {
        return siaf;
    }

    public void setSiaf(String siaf) {
        this.siaf = siaf;
    }
}
