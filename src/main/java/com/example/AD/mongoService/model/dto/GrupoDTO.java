package com.example.AD.mongoService.model.dto;

import java.time.LocalDate;

public class GrupoDTO {

    private String nome;
    private String xenero;
    private LocalDate dataFormacion;


    public GrupoDTO(String nome, String xenero, LocalDate dataFormacion) {
        this.nome = nome;
        this.xenero = xenero;
        this.dataFormacion = dataFormacion;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public LocalDate getDataFormacion() {
        return dataFormacion;
    }

    public void setDataFormacion(LocalDate dataFormacion) {
        this.dataFormacion = dataFormacion;
    }
}
