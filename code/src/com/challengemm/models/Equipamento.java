package com.challengemm.models;

import java.util.List;
import java.util.Objects;

public class Equipamento {
    public enum STATUS_EQUIPAMENTO {
        ATIVO,
        INATIVO,
        EM_MANUTENCAO,
        COM_FALHA,
        DESCARTADO
    }

    private String idEquipamento;
    private String nomeEquipamento;
    private String localizacaoEquipamento;
    private STATUS_EQUIPAMENTO statusEquipamento;
    private List<Falha> falhasEquipamento;

    public void atualizarStatus(STATUS_EQUIPAMENTO novoStatus) {
        this.statusEquipamento = novoStatus;
    }

    //Métodos Gerais

    public Equipamento() {
    }

    public Equipamento(String idEquipamento, String nomeEquipamento, String localizacaoEquipamento, STATUS_EQUIPAMENTO statusEquipamento) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.localizacaoEquipamento = localizacaoEquipamento;
        this.statusEquipamento = statusEquipamento;
    }

    public Equipamento(String idEquipamento, String nomeEquipamento, String localizacaoEquipamento, STATUS_EQUIPAMENTO statusEquipamento, List<Falha> falhasEquipamento) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.localizacaoEquipamento = localizacaoEquipamento;
        this.statusEquipamento = statusEquipamento;
        this.falhasEquipamento = falhasEquipamento;
    }

    public String getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(String idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getLocalizacaoEquipamento() {
        return localizacaoEquipamento;
    }

    public void setLocalizacaoEquipamento(String localizacaoEquipamento) {
        this.localizacaoEquipamento = localizacaoEquipamento;
    }

    public STATUS_EQUIPAMENTO getStatusEquipamento() {
        return statusEquipamento;
    }

    public List<Falha> getFalhasEquipamento() {
        return falhasEquipamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipamento that = (Equipamento) o;
        return Objects.equals(getIdEquipamento(), that.getIdEquipamento()) && Objects.equals(getNomeEquipamento(), that.getNomeEquipamento()) && Objects.equals(getLocalizacaoEquipamento(), that.getLocalizacaoEquipamento()) && getStatusEquipamento() == that.getStatusEquipamento() && Objects.equals(getFalhasEquipamento(), that.getFalhasEquipamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEquipamento(), getNomeEquipamento(), getLocalizacaoEquipamento(), getStatusEquipamento(), getFalhasEquipamento());
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "idEquipamento='" + idEquipamento + '\'' +
                ", nomeEquipamento='" + nomeEquipamento + '\'' +
                ", localizacaoEquipamento='" + localizacaoEquipamento + '\'' +
                ", statusEquipamento=" + statusEquipamento +
                ", falhasEquipamento=" + falhasEquipamento +
                '}';
    }
}
