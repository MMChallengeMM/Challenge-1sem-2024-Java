package com.challengemm.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class MecanismoDaFerrovia {

    private String id;
    private String nome;
    private List<Equipamento> equipamentos = new ArrayList<>();

    public void addEquipamento(Equipamento equipamento) {
        equipamentos.add(equipamento);
    }

    public void removeEquipamento(Equipamento equipamento) {
        equipamentos.remove(equipamento);
    }

    // Métodos Gerais

    public MecanismoDaFerrovia() {
    }

    public MecanismoDaFerrovia(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public MecanismoDaFerrovia(String id, String nome, List<Equipamento> equipamentos) {
        this.id = id;
        this.nome = nome;
        this.equipamentos = equipamentos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MecanismoDaFerrovia that = (MecanismoDaFerrovia) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNome(), that.getNome()) && Objects.equals(getEquipamentos(), that.getEquipamentos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getEquipamentos());
    }

    @Override
    public String toString() {
        return "MecanismoDaFerrovia{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", equipamentos=" + equipamentos +
                '}';
    }
}
