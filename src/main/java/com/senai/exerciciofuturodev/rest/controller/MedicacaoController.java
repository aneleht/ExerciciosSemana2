package com.senai.exerciciofuturodev.rest.controller;

import com.senai.exerciciofuturodev.domain.service.MedicacaoService;
import com.senai.exerciciofuturodev.rest.dto.MedicacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicacaoController {

    @Autowired
    MedicacaoService medicacaoService;

    @PostMapping("/medicacao")
    public String salvarMedicacao(@RequestBody MedicacaoDto medicacaoDto) {
        medicacaoService.salvar(medicacaoDto);
        return "Medicação salva com sucesso!";
    }
}