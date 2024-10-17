package com.challengemm.models;

import java.util.List;
import java.util.Objects;

public class Linha {

    private String idLinha;
    private String nomeLinha;
    private List<Equipamento> equipamentosLinha;
    private List<Estacao> estacoesLinha;

    public void addEquipamento(Equipamento equipamento) {
        equipamentosLinha.add(equipamento);
    }

    public void removeEquipamento(Equipamento equipamento) {
        equipamentosLinha.remove(equipamento);
    }

    public void addLinha(Estacao estacao) {
        estacoesLinha.add(estacao);
    }

    public void removeLinha(Estacao estacao) {
        estacoesLinha.remove(estacao);
    }

    //Métodos Gerais

    public Linha() {
    }

    public Linha(String idLinha, String nomeLinha) {
        this.idLinha = idLinha;
        this.nomeLinha = nomeLinha;
    }

    public Linha(String idLinha, String nomeLinha, List<Equipamento> equipamentosLinha, List<Estacao> estacoesLinha) {
        this.idLinha = idLinha;
        this.nomeLinha = nomeLinha;
        this.equipamentosLinha = equipamentosLinha;
        this.estacoesLinha = estacoesLinha;
    }

    public String getIdLinha() {
        return idLinha;
    }

    public void setIdLinha(String idLinha) {
        this.idLinha = idLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    public List<Equipamento> getEquipamentosLinha() {
        return equipamentosLinha;
    }

    public List<Estacao> getEstacoesLinha() {
        return estacoesLinha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linha linha = (Linha) o;
        return Objects.equals(getIdLinha(), linha.getIdLinha()) && Objects.equals(getNomeLinha(), linha.getNomeLinha()) && Objects.equals(getEquipamentosLinha(), linha.getEquipamentosLinha()) && Objects.equals(getEstacoesLinha(), linha.getEstacoesLinha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdLinha(), getNomeLinha(), getEquipamentosLinha(), getEstacoesLinha());
    }

    @Override
    public String toString() {
        return "Linha{" +
                "idLinha='" + idLinha + '\'' +
                ", nomeLinha='" + nomeLinha + '\'' +
                ", equipamentosLinha=" + equipamentosLinha +
                ", estacoesLinha=" + estacoesLinha +
                '}';
    }
}
