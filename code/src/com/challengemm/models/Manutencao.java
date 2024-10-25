package com.challengemm.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Manutencao {
    private String idManutencao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private STATUS_MANUTENCAO statusManutencao;
    private Falha falhaParaResolver;

    public Manutencao() {
    }

    public Manutencao(String idManutencao, LocalDateTime dataInicio, LocalDateTime dataFim, STATUS_MANUTENCAO statusManutencao, Falha falhaParaResolver) {
        this.idManutencao = idManutencao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.statusManutencao = statusManutencao;
        this.falhaParaResolver = falhaParaResolver;
    }

    public String getIdManutencao() {
        return idManutencao;
    }

    public void setIdManutencao(String idManutencao) {
        this.idManutencao = idManutencao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public STATUS_MANUTENCAO getStatusManutencao() {
        return statusManutencao;
    }

    public void setStatusManutencao(STATUS_MANUTENCAO statusManutencao) {
        this.statusManutencao = statusManutencao;
    }

    public Falha getFalhaParaResolver() {
        return falhaParaResolver;
    }

    public void setFalhaParaResolver(Falha falhaParaResolver) {
        this.falhaParaResolver = falhaParaResolver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manutencao that = (Manutencao) o;
        return Objects.equals(getIdManutencao(), that.getIdManutencao()) && Objects.equals(getDataInicio(), that.getDataInicio()) && Objects.equals(getDataFim(), that.getDataFim()) && Objects.equals(getStatusManutencao(), that.getStatusManutencao()) && Objects.equals(getFalhaParaResolver(), that.getFalhaParaResolver());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdManutencao(), getDataInicio(), getDataFim(), getStatusManutencao(), getFalhaParaResolver());
    }

    @Override
    public String toString() {
        return "Manutencao{" +
                "idManutencao='" + idManutencao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", statusManutencao='" + statusManutencao + '\'' +
                ", falhaParaResolver=" + falhaParaResolver +
                '}';
    }
}
