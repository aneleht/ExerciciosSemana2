package com.senai.exerciciofuturodev.domain.service;

import com.senai.exerciciofuturodev.domain.model.MedicacaoModel;
import com.senai.exerciciofuturodev.domain.model.ViaModel;
import com.senai.exerciciofuturodev.domain.repository.MedicacaoRepository;
import com.senai.exerciciofuturodev.rest.dto.MedicacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicacaoService {

    @Autowired
    MedicacaoRepository medicacaoRepository;
    public void salvar(MedicacaoDto medicacaoDto){
        MedicacaoModel medicacaoModel = new MedicacaoModel();
        medicacaoModel.setLaboratorio(medicacaoDto.getLaboratorio());
        medicacaoModel.setSubstancia(medicacaoDto.getSubstancia());
        medicacaoRepository.salvarMedicacao(medicacaoModel);
        ViaModel viaModel = new ViaModel();
        viaModel.setDose(medicacaoDto.getDose());
        viaModel.setVia(medicacaoDto.getVia());
        medicacaoRepository.salvarVia(viaModel);
        System.out.println("Medicação e via salvos com sucesso!");
    }
}
