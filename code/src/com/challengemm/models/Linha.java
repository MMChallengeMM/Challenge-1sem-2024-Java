package com.challengemm.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Linha extends MecanismoDaFerrovia {

    private List<Estacao> estacoes = new ArrayList<>();

    public void addEstacao(Estacao estacao) {
        estacoes.add(estacao);
        if (estacao.getLinhas().contains(this)) {
            return;
        }
        estacao.addLinha(this);
    }

    public void removeEstacao(Estacao estacao) {
        estacoes.remove(estacao);
        if (!estacao.getLinhas().contains(this)) {
            return;
        }
        estacao.removeLinha(this);
    }

    //Métodos Gerais

    public Linha() {
    }

    public Linha(String id, String nome) {
        super(id, nome);
    }

    public Linha(String id, String nome, List<Equipamento> equipamentos, List<Estacao> estacoes) {
        super(id, nome, equipamentos);
        this.estacoes = estacoes;
    }

    public List<Estacao> getEstacoes() {
        return estacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Linha linha = (Linha) o;
        return Objects.equals(getEstacoes(), linha.getEstacoes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEstacoes());
    }

    @Override
    public String toString() {
        return "Linha{" +
                "estacoes=" + estacoes.stream()
                .map(MecanismoDaFerrovia::getNome)
                .toList() +
                "} " + super.toString();
    }
}
