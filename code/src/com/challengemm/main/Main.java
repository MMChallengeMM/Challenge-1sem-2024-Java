package com.challengemm.main;

import com.challengemm.models.*;

public class Main {
    public static void main(String[] args) {

        var estacao1 = new Estacao("1","Estação da Sé","Rua da Sé");
        var estacao2 = new Estacao("2","Estação Marechal Deodoro","Praça marechal");

        var linha1 = new Linha("1","Azul");
        var linha2 = new Linha("2","Vermelha");
        estacao1.addLinha(linha1);
        estacao1.addLinha(linha2);
        estacao2.addLinha(linha2);

        var equip1 = new Equipamento("1","Catraca",estacao1, STATUS_EQUIPAMENTO.ATIVO, new HistoricoFalhas());

        var operador1 = new Operador("1","Carlos",TURNO_USUARIO.MANHA,"Administração Geral");

        equip1.getHistoricoFalhas().addFalha(new Falha("1", TIPO_FALHA.ELETRICA,"a"));
        equip1.getHistoricoFalhas().addFalha(new Falha("2",TIPO_FALHA.SOFTWARE,"b"));
        equip1.getHistoricoFalhas().addFalha(new Falha("3",TIPO_FALHA.MECANICA,"c"));
        equip1.getHistoricoFalhas().addFalha(new Falha("4",TIPO_FALHA.OUTRO,"d"));
        equip1.getHistoricoFalhas().addFalha(new Falha("5",TIPO_FALHA.SOFTWARE,"e"));
        equip1.getHistoricoFalhas().addFalha(new Falha("6",TIPO_FALHA.ELETRICA,"f"));
        equip1.getHistoricoFalhas().addFalha(new Falha("7",TIPO_FALHA.SOFTWARE,"g"));

        operador1.gerarNovoRelatorio(TIPO_RELATORIO.TIPO_DE_FALHA,equip1.getHistoricoFalhas());



    }
}
