package com.cadastromedicamentos.service;

import com.cadastromedicamentos.model.Cadastro;
import com.cadastromedicamentos.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {


  @Autowired
  private CadastroRepository cadastroRepository; //Injeta o repositório

  //Retorna uma lista com todos posts inseridos
  public List<Cadastro> findAll() {
    return cadastroRepository.findAll();
  }

  //Retorno um post a partir do ID
  public Cadastro findOne(Long id) {
    return cadastroRepository.findOne(id);
  }

  //Salva ou atualiza um post
  public Cadastro save(Cadastro post) {
    return cadastroRepository.saveAndFlush(post);
  }

  //Exclui um post
  public void delete(Long id) {
    cadastroRepository.delete(id);
  }

}
