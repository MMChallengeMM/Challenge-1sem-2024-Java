package com.challengemm.models;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Relatorio {
    private String idRelatorio;
    private TIPO_RELATORIO tipoRelatorio;
    private LocalDateTime dataGeracao;
    private String dadosRelatorio;

    public void exibirRelatorio() {
        System.out.printf("""
                
                Relatório #%s
                Tipo de Relatório: %s
                Data: %s
                ========================
                %s
                """,idRelatorio,tipoRelatorio,dataGeracao,dadosRelatorio);
    }

    private String gerarDadosGeral(HistoricoFalhas historicoFalhas) {
        var falhas = historicoFalhas.getFalhas();

        if (falhas.isEmpty()) {
            return  "Não há falhas";
        }

        return gerarDadosGeral(falhas);
    }

    private String gerarDadosPorTipoFalha(HistoricoFalhas historicoFalhas, TIPO_FALHA tipoFalha) {

        var falhas = historicoFalhas.filtrarFalhasPorTipoFalha(tipoFalha);

        if (falhas.isEmpty()) {
            return "Não há falhas desse tipo";
        }

        return gerarDadosGeral(falhas);
    }

    private String gerarDadosPorPeriodo(HistoricoFalhas historicoFalhas, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        var falhas = historicoFalhas.filtrarFalhasPorPeriodo(dataInicial, dataFinal);

        if (falhas.isEmpty()) {
            return "Não há falhas nesse periodo";
        }

        return gerarDadosGeral(falhas);
    }

    private String gerarDadosGeral(List<Falha> falhas) {
        var numeroTotalFalhas = falhas.size();
        var falhaMaisFrequente = falhas.stream()
                .collect(Collectors.groupingBy(Falha::getTipoFalha, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        return """
                
                Número total de falhas: %d
                Tipo de falha mais frequente: %s
                """.formatted(numeroTotalFalhas, falhaMaisFrequente == null ? "Não há falhas" : falhaMaisFrequente.getKey());
    }


    // Métodos Gerais

    public Relatorio() {
    }

    public Relatorio(String idRelatorio, HistoricoFalhas historicoFalhas) {
        this.idRelatorio = idRelatorio;
        this.dataGeracao = LocalDateTime.now();
        this.tipoRelatorio = TIPO_RELATORIO.GERAL;
        this.dadosRelatorio = gerarDadosGeral(historicoFalhas);
    }

    public Relatorio(String idRelatorio, HistoricoFalhas historicoFalhas, TIPO_FALHA tipoFalha) {
        this.idRelatorio = idRelatorio;
        this.dataGeracao = LocalDateTime.now();
        this.tipoRelatorio = TIPO_RELATORIO.TIPO_DE_FALHA;
        this.dadosRelatorio = gerarDadosPorTipoFalha(historicoFalhas,tipoFalha);
    }

    public Relatorio(String idRelatorio, HistoricoFalhas historicoFalhas, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        this.idRelatorio = idRelatorio;
        this.dataGeracao = LocalDateTime.now();
        this.tipoRelatorio = TIPO_RELATORIO.PERIODO;
        this.dadosRelatorio = gerarDadosPorPeriodo(historicoFalhas,dataInicial,dataFinal);
    }

    public String getIdRelatorio() {
        return idRelatorio;
    }

    public LocalDateTime getDataGeracao() {
        return dataGeracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relatorio relatorio = (Relatorio) o;
        return Objects.equals(getIdRelatorio(), relatorio.getIdRelatorio()) && tipoRelatorio == relatorio.tipoRelatorio && Objects.equals(getDataGeracao(), relatorio.getDataGeracao()) && Objects.equals(dadosRelatorio, relatorio.dadosRelatorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdRelatorio(), tipoRelatorio, getDataGeracao(), dadosRelatorio);
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "idRelatorio='" + idRelatorio + '\'' +
                ", tipoRelatorio=" + tipoRelatorio +
                ", dataGeracao=" + dataGeracao +
                ", dadosRelatorio='" + dadosRelatorio + '\'' +
                '}';
    }
}
