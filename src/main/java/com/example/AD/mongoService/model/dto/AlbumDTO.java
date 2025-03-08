package com.example.AD.mongoService.model.dto;

import java.time.LocalDate;


/**
 * Clase DTO de album
 * @author cristian
 * @version 1.0
 */
public class AlbumDTO {

    //atributos de clase
    private String grupo_id;
    private String titulo;
    private LocalDate data_lanzamento;
    private float puntuacion;


    /**
     * Constructor de la clase
     * @param grupo_id el id del grupo
     * @param titulo el titulo del album
     * @param data_lanzamento la fecha de lanzamiento
     * @param puntuacion la puntuacion del album
     */
    public AlbumDTO(String grupo_id, String titulo, LocalDate data_lanzamento, float puntuacion) {
        this.grupo_id = grupo_id;
        this.titulo = titulo;
        this.data_lanzamento = data_lanzamento;
        this.puntuacion = puntuacion;
    }

    public AlbumDTO() {
    }

    //getter y setter
    public String getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(String grupo_id) {
        this.grupo_id = grupo_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData_lanzamento() {
        return data_lanzamento;
    }

    public void setData_lanzamento(LocalDate data_lanzamento) {
        this.data_lanzamento = data_lanzamento;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }
}
