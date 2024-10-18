package com.challengemm.models;

import java.time.LocalDateTime;

public class Falha {
    public enum TIPO_FALHA {
        FALHAS_TECNICAS,
        FALHAS_OPERACIONAIS,
        FALHAS_DE_SEGURANCA,
        CONDICOES_METEOROLOGICAS,
        FATORES_HUMANOS,
        PROBLEMAS_LOGISTICOS,
        FALTA_DE_MANTENCAO,
        FATORES_EXTERNOS
    }

    public enum STATUS_FALHA {
        ATIVA,
        EM_ANALISE,
        PENDENTE,
        RESOLVIDA,
        CANCELADA,
        NORMALIZADA
    }

    private String idFalha;
    private TIPO_FALHA tipoFalha;
    private String descricaoFalha;
    private LocalDateTime dataRegistro;
    private Equipamento equipamentoEnvolvido;
    private STATUS_FALHA statusFalha;
    private Manutencao manutencaoResponsavel;

    //Métodos Gerais

    public Falha() {
    }

    public Falha(String idFalha, TIPO_FALHA tipoFalha, String descricaoFalha, LocalDateTime dataRegistro, Equipamento equipamentoEnvolvido, STATUS_FALHA statusFalha) {
        this.idFalha = idFalha;
        this.tipoFalha = tipoFalha;
        this.descricaoFalha = descricaoFalha;
        this.dataRegistro = dataRegistro;
        this.equipamentoEnvolvido = equipamentoEnvolvido;
        this.statusFalha = statusFalha;
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

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Equipamento getEquipamentoEnvolvido() {
        return equipamentoEnvolvido;
    }

    public void setEquipamentoEnvolvido(Equipamento equipamentoEnvolvido) {
        this.equipamentoEnvolvido = equipamentoEnvolvido;
    }

    public STATUS_FALHA getStatusFalha() {
        return statusFalha;
    }

    public void setStatusFalha(STATUS_FALHA statusFalha) {
        this.statusFalha = statusFalha;
    }

    public Manutencao getManutencaoResponsavel() {
        return manutencaoResponsavel;
    }

    public void setManutencaoResponsavel(Manutencao manutencaoResponsavel) {
        this.manutencaoResponsavel = manutencaoResponsavel;
    }
}
