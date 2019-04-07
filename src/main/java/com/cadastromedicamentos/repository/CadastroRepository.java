package com.cadastromedicamentos.repository;


import com.cadastromedicamentos.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Para definir a classe como um bean do Spring
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
  //Estendi JpaRepository e declarei a entidade (Cadastro) e o tipo de chave primária (Long)

}
