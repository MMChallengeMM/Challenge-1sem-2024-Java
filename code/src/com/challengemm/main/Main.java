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

//        equip1.getHistoricoFalhas().addFalha(new Falha(TIPO_FALHA.ELETRICA));
//        equip1.getHistoricoFalhas().addFalha(new Falha(TIPO_FALHA.SOFTWARE));
//        equip1.getHistoricoFalhas().addFalha(new Falha(TIPO_FALHA.OUTRO));
//        equip1.getHistoricoFalhas().addFalha(new Falha(TIPO_FALHA.MECANICA));
//        equip1.getHistoricoFalhas().addFalha(new Falha(TIPO_FALHA.SOFTWARE));

        new Relatorio("1",equip1.getHistoricoFalhas()).exibirRelatorio();



    }
}
