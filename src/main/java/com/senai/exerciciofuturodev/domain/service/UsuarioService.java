package com.senai.exerciciofuturodev.domain.service;

import com.senai.exerciciofuturodev.domain.model.ClienteModel;
import com.senai.exerciciofuturodev.domain.model.EnderecoModel;
import com.senai.exerciciofuturodev.domain.repository.UsuarioRepository;
import com.senai.exerciciofuturodev.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public void salvar(UsuarioDto usuarioDto){
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setCpf(usuarioDto.getCpf());
        clienteModel.setNome(usuarioDto.getNome());
        usuarioRepository.salvarCliente(clienteModel);
        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setCep(usuarioDto.getCep());
        enderecoModel.setCidade(usuarioDto.getCidade());
        System.out.println("Cliente e endereço salvos com sucesso!");

    }
}
