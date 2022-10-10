package com.senai.exerciciofuturodev.rest.dto;

public class MedicacaoDto {
    private String substancia;
    private String dose;
    private String laboratorio;
    private String via;

    public String getSubstancia() {
        return substancia;
    }

    public void setSubstancia(String substancia) {
        this.substancia = substancia;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    @Override
    public String toString() {
        return "MedicacaoDto{" +
                "substancia='" + substancia + '\'' +
                ", dose='" + dose + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", via='" + via + '\'' +
                '}';
    }
}
