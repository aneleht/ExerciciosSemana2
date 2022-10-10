package com.senai.exerciciofuturodev.domain.repository;

import com.senai.exerciciofuturodev.domain.model.ClienteModel;
import com.senai.exerciciofuturodev.domain.model.EnderecoModel;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    public void salvarCliente(ClienteModel clienteModel){
        var insertTable = "insert into cliente (nome, cpf) values ()";
        System.out.println("Cliente inserido com sucesso!");
    }
    public void salvarEndereco(EnderecoModel enderecoModel){
        var insertTable = "insert into endereco (cep, cidade) values ()";
        System.out.println("Endereço inserido com sucesso!");
    }
}
