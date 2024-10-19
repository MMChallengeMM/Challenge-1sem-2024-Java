package com.challengemm.models;

import java.util.ArrayList;
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
    private MecanismoDaFerrovia localizacaoEquipamento;
    private STATUS_EQUIPAMENTO statusEquipamento;
    private List<Falha> falhasEquipamento = new ArrayList<>();

    public void addFalha(Falha falha) {
        falhasEquipamento.add(falha);
    }

    public void removeFalha(Falha falha) {
        falhasEquipamento.remove(falha);
    }

    //Métodos Gerais

    public Equipamento() {
    }

    public Equipamento(String idEquipamento, String nomeEquipamento, MecanismoDaFerrovia localizacaoEquipamento, STATUS_EQUIPAMENTO statusEquipamento) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.localizacaoEquipamento = localizacaoEquipamento;
        this.localizacaoEquipamento.addEquipamento(this);
        this.statusEquipamento = statusEquipamento;
    }

    public Equipamento(String idEquipamento, String nomeEquipamento, MecanismoDaFerrovia localizacaoEquipamento, STATUS_EQUIPAMENTO statusEquipamento, List<Falha> falhasEquipamento) {
        this.idEquipamento = idEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.localizacaoEquipamento = localizacaoEquipamento;
        this.localizacaoEquipamento.addEquipamento(this);
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

    public MecanismoDaFerrovia getLocalizacaoEquipamento() {
        return localizacaoEquipamento;
    }

    public void setLocalizacaoEquipamento(MecanismoDaFerrovia localizacaoEquipamento) {
        this.localizacaoEquipamento = localizacaoEquipamento;
    }

    public STATUS_EQUIPAMENTO getStatusEquipamento() {
        return statusEquipamento;
    }

    public void setStatusEquipamento(STATUS_EQUIPAMENTO statusEquipamentoo) {
        this.statusEquipamento = statusEquipamentoo;
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
                ", localizacaoEquipamento=" + localizacaoEquipamento.getNome() +
                ", statusEquipamento=" + statusEquipamento +
                ", falhasEquipamento=" + falhasEquipamento +
                '}';
    }
}

