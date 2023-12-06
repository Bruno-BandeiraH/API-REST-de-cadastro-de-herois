package com.associacaodeherois.RegistroDeHerois.entity;

import com.associacaodeherois.RegistroDeHerois.util.TipoDePoder;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "herois")
public class Heroi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String nomeDeHeroi;
    private int celular;
    private String email;
    @Enumerated(EnumType.STRING) // defines that the value stored in the db is String
    private TipoDePoder poder;
    private String descricaoDoPoder;
    private boolean atuaComoHeroi;

    public Long getId() {
        return id;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeDeHeroi() {
        return nomeDeHeroi;
    }
    public void setNomeDeHeroi(String nomeDeHeroi) {
        this.nomeDeHeroi = nomeDeHeroi;
    }
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public TipoDePoder getPoder() {
        return poder;
    }
    public void setPoder(TipoDePoder poder) {
        this.poder = poder;
    }
    public String getDescricaoDoPoder() {
        return descricaoDoPoder;
    }
    public void setDescricaoDoPoder(String descricaoDoPoder) {
        this.descricaoDoPoder = descricaoDoPoder;
    }
    public boolean isAtuaComoHeroi() {
        return atuaComoHeroi;
    }
    public void setAtuaComoHeroi(boolean atuaComoHeroi) {
        this.atuaComoHeroi = atuaComoHeroi;
    }

}
