package com.challengemm.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Falha {
    public enum TIPO_FALHA {
        MECANICA,
        ELETRICA,
        CONTROLE,
        OUTRAS
    }


    public enum STATUS_FALHA {
        EM_ANALISE,
        PENDENTE,
        RESOLVIDA,
        CANCELADA,
    }

    private String idFalha;
    private TIPO_FALHA tipoFalha;
    private String descricaoFalha;
    private LocalDateTime dataRegistro;
    private Equipamento equipamentoEnvolvido;
    private STATUS_FALHA statusFalha;

    //Métodos Gerais

    public Falha() {
    }

    public Falha(String idFalha, TIPO_FALHA tipoFalha, String descricaoFalha, Equipamento equipamentoEnvolvido) {
        this.idFalha = idFalha;
        this.tipoFalha = tipoFalha;
        this.descricaoFalha = descricaoFalha;
        this.dataRegistro = LocalDateTime.now();
        this.equipamentoEnvolvido = equipamentoEnvolvido;
        this.equipamentoEnvolvido.addFalha(this);
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

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public Equipamento getEquipamentoEnvolvido() {
        return equipamentoEnvolvido;
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
        return Objects.equals(getIdFalha(), falha.getIdFalha()) && getTipoFalha() == falha.getTipoFalha() && Objects.equals(getDescricaoFalha(), falha.getDescricaoFalha()) && Objects.equals(getDataRegistro(), falha.getDataRegistro()) && Objects.equals(getEquipamentoEnvolvido(), falha.getEquipamentoEnvolvido()) && getStatusFalha() == falha.getStatusFalha();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdFalha(), getTipoFalha(), getDescricaoFalha(), getDataRegistro(), getEquipamentoEnvolvido(), getStatusFalha());
    }

    @Override
    public String toString() {
        return "Falha{" +
                "idFalha='" + idFalha + '\'' +
                ", tipoFalha=" + tipoFalha +
                ", descricaoFalha='" + descricaoFalha + '\'' +
                ", dataRegistro=" + dataRegistro +
                ", equipamentoEnvolvido=" + equipamentoEnvolvido.getNomeEquipamento() + " - " + equipamentoEnvolvido.getIdEquipamento() +
                ", statusFalha=" + statusFalha +
                '}';
    }
}
