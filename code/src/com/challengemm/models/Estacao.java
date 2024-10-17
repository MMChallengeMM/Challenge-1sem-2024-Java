package com.challengemm.models;

import java.util.List;
import java.util.Objects;

public class Estacao {

    private String idEstacao;
    private String nomeEstacao;
    private String localizacaoEstacao;
    private List<Equipamento> equipamentosEstacao;
    private List<Linha> linhasEstacao;

    public void addEquipamento(Equipamento equipamento) {
        equipamentosEstacao.add(equipamento);
    }

    public void removeEquipamento(Equipamento equipamento) {
        equipamentosEstacao.remove(equipamento);
    }

    public void addLinha(Linha linha) {
        linhasEstacao.add(linha);
    }

    public void removeLinha(Linha linha) {
        linhasEstacao.remove(linha);
    }

    //Métodos gerais

    public Estacao() {
    }

    public Estacao(String idEstacao, String nomeEstacao, String localizacaoEstacao) {
        this.idEstacao = idEstacao;
        this.nomeEstacao = nomeEstacao;
        this.localizacaoEstacao = localizacaoEstacao;
    }

    public Estacao(String idEstacao, String nomeEstacao, String localizacaoEstacao, List<Equipamento> equipamentosEstacao, List<Linha> linhasEstacao) {
        this.idEstacao = idEstacao;
        this.nomeEstacao = nomeEstacao;
        this.localizacaoEstacao = localizacaoEstacao;
        this.equipamentosEstacao = equipamentosEstacao;
        this.linhasEstacao = linhasEstacao;
    }

    public String getIdEstacao() {
        return idEstacao;
    }

    public void setIdEstacao(String idEstacao) {
        this.idEstacao = idEstacao;
    }

    public String getNomeEstacao() {
        return nomeEstacao;
    }

    public void setNomeEstacao(String nomeEstacao) {
        this.nomeEstacao = nomeEstacao;
    }

    public String getLocalizacaoEstacao() {
        return localizacaoEstacao;
    }

    public void setLocalizacaoEstacao(String localizacaoEstacao) {
        this.localizacaoEstacao = localizacaoEstacao;
    }

    public List<Equipamento> getEquipamentosEstacao() {
        return equipamentosEstacao;
    }

    public List<Linha> getLinhasEstacao() {
        return linhasEstacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estacao estacao = (Estacao) o;
        return Objects.equals(getIdEstacao(), estacao.getIdEstacao()) && Objects.equals(getNomeEstacao(), estacao.getNomeEstacao()) && Objects.equals(getLocalizacaoEstacao(), estacao.getLocalizacaoEstacao()) && Objects.equals(getEquipamentosEstacao(), estacao.getEquipamentosEstacao()) && Objects.equals(getLinhasEstacao(), estacao.getLinhasEstacao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdEstacao(), getNomeEstacao(), getLocalizacaoEstacao(), getEquipamentosEstacao(), getLinhasEstacao());
    }

    @Override
    public String toString() {
        return "Estacao{" +
                "idEstacao='" + idEstacao + '\'' +
                ", nomeEstacao='" + nomeEstacao + '\'' +
                ", localizacaoEstacao='" + localizacaoEstacao + '\'' +
                ", equipamentosEstacao=" + equipamentosEstacao +
                ", linhasEstacao=" + linhasEstacao +
                '}';
    }
}
