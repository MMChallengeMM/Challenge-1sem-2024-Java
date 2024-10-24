package com.challengemm.models.MecanismoFerrovia;

import com.challengemm.models.Equipamento.Equipamento;

import java.util.List;
import java.util.Objects;

public class Vagao extends MecanismoDaFerrovia{

    private TIPO_VAGAO tipoVagao;

    //Métodos Gerais

    public Vagao() {
    }

    public Vagao(String id, String nome, TIPO_VAGAO tipoVagao) {
        super(id, nome);
        this.tipoVagao = tipoVagao;
    }

    public Vagao(String id, String nome, List<Equipamento> equipamentos, TIPO_VAGAO tipoVagao) {
        super(id, nome, equipamentos);
        this.tipoVagao = tipoVagao;
    }

    public TIPO_VAGAO getTipoVagao() {
        return tipoVagao;
    }

    public void setTipoVagao(TIPO_VAGAO tipoVagao) {
        this.tipoVagao = tipoVagao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vagao vagao = (Vagao) o;
        return getTipoVagao() == vagao.getTipoVagao();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoVagao());
    }

    @Override
    public String toString() {
        return "Vagao{" +
                "tipoVagao=" + tipoVagao +
                "} " + super.toString();
    }
}
