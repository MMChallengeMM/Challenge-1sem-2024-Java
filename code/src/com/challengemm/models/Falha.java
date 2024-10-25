package com.challengemm.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Falha {

    private String idFalha;
    private TIPO_FALHA tipoFalha;
    private String descricaoFalha;
    private LocalDateTime dataRegitro;
    private STATUS_FALHA statusFalha;

    public String exibirFalha() {
        return "#%s (%s) | %s | %s: %s\n".formatted(idFalha,statusFalha,dataRegitro,tipoFalha,descricaoFalha);
    }

    public Falha() {
    }

    public Falha(String idFalha, TIPO_FALHA tipoFalha, String descricaoFalha) {
        this.idFalha = idFalha;
        this.tipoFalha = tipoFalha;
        this.descricaoFalha = descricaoFalha;
        this.dataRegitro = LocalDateTime.now();
        this.statusFalha = STATUS_FALHA.EM_ANALISE;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Falha falha = (Falha) o;
        return Objects.equals(getIdFalha(), falha.getIdFalha()) && getTipoFalha() == falha.getTipoFalha() && Objects.equals(getDescricaoFalha(), falha.getDescricaoFalha()) && Objects.equals(getDataRegitro(), falha.getDataRegitro()) && getStatusFalha() == falha.getStatusFalha();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdFalha(), getTipoFalha(), getDescricaoFalha(), getDataRegitro(), getStatusFalha());
    }

    @Override
    public String toString() {
        return "Falha{" +
                "idFalha='" + idFalha + '\'' +
                ", tipoFalha=" + tipoFalha +
                ", descricaoFalha='" + descricaoFalha + '\'' +
                ", dataRegitro=" + dataRegitro +
                ", statusFalha=" + statusFalha +
                '}';
    }
}
