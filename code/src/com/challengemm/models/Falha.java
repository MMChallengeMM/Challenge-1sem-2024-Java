package com.challengemm.models;

import java.time.LocalDateTime;

public class Falha {

    private String idFalha;
    private TIPO_FALHA tipoFalha;
    private String descricaoFalha;
    private LocalDateTime dataRegitro;
    private STATUS_FALHA statusFalha;

    public Falha() {
    }

    public Falha(TIPO_FALHA tipoFalha) {
        this.tipoFalha = tipoFalha;
    }

    public String getIdFalha() {
        return idFalha;
    }

    public void setIdFalha(String idFalha) {
        this.idFalha = idFalha;
    }

    public TIPO_FALHA getTipoFalha() {
        return tipoFalha;
    }

    public void setTipoFalha(TIPO_FALHA tipoFalha) {
        this.tipoFalha = tipoFalha;
    }

    public String getDescricaoFalha() {
        return descricaoFalha;
    }

    public void setDescricaoFalha(String descricaoFalha) {
        this.descricaoFalha = descricaoFalha;
    }

    public LocalDateTime getDataRegitro() {
        return dataRegitro;
    }

    public void setDataRegitro(LocalDateTime dataRegitro) {
        this.dataRegitro = dataRegitro;
    }

    public STATUS_FALHA getStatusFalha() {
        return statusFalha;
    }

    public void setStatusFalha(STATUS_FALHA statusFalha) {
        this.statusFalha = statusFalha;
    }
}
