package com.senai.exerciciofuturodev.domain.repository;

import com.senai.exerciciofuturodev.domain.model.MedicacaoModel;
import com.senai.exerciciofuturodev.domain.model.ViaModel;
import org.springframework.stereotype.Repository;

@Repository
public class MedicacaoRepository {

    public void salvarMedicacao(MedicacaoModel medicacaoModel){
        var insertTable = "insert into medicacao (substancia, laboratorio) values ()";
        System.out.println("Medicação salva com sucesso!");
    }
    public void salvarVia(ViaModel viaModel){
        var insertTable = "insert into via (dose, via) values ()";
        System.out.println("Via salva com sucesso!");
    }

}
