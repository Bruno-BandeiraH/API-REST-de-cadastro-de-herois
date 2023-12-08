package com.associacaodeherois.RegistroDeHerois.entity;

import org.springframework.validation.annotation.Validated;

import com.associacaodeherois.RegistroDeHerois.util.TipoDePoder;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Validated
@Table(name = "herois")
public class Heroi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private String nomeDeHeroi;
    @NotNull
    private Long celular;
    private String email;
    @Enumerated(EnumType.STRING) // defines that the value stored in the db is String
    @NotNull
    private TipoDePoder poder;
    private String descricaoDoPoder;
    private boolean atuaComoHeroi;

    // GETTERS AND SETTERS

    public void setId(Long id) {
        this.id = id;
    }
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
    public Long getCelular() {
        return celular;
    }
    public void setCelular(Long celular) {
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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
        result = prime * result + ((nomeDeHeroi == null) ? 0 : nomeDeHeroi.hashCode());
        result = prime * result + ((celular == null) ? 0 : celular.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((poder == null) ? 0 : poder.hashCode());
        result = prime * result + ((descricaoDoPoder == null) ? 0 : descricaoDoPoder.hashCode());
        result = prime * result + (atuaComoHeroi ? 1231 : 1237);
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Heroi other = (Heroi) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nomeCompleto == null) {
            if (other.nomeCompleto != null)
                return false;
        } else if (!nomeCompleto.equals(other.nomeCompleto))
            return false;
        if (nomeDeHeroi == null) {
            if (other.nomeDeHeroi != null)
                return false;
        } else if (!nomeDeHeroi.equals(other.nomeDeHeroi))
            return false;
        if (celular == null) {
            if (other.celular != null)
                return false;
        } else if (!celular.equals(other.celular))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (poder != other.poder)
            return false;
        if (descricaoDoPoder == null) {
            if (other.descricaoDoPoder != null)
                return false;
        } else if (!descricaoDoPoder.equals(other.descricaoDoPoder))
            return false;
        if (atuaComoHeroi != other.atuaComoHeroi)
            return false;
        return true;
    }





}
