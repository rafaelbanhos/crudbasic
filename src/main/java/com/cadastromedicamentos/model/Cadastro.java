package com.cadastromedicamentos.model;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "tbl_cadastro") //Definindo o nome da tabela que será criado no BD
public class Cadastro implements Serializable {

  private static final long serialVersionUID = 1L;


  @Id
  @SequenceGenerator(name = "post_seq", sequenceName = "post_seq") //Cria uma sequence para ser usada com a tabela
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq") //Define que a tabela fará uso da sequence criada antes
  private Long id;

  @Column(nullable = false, length = 150) //Define propriedades da coluna
  @NotBlank(message = "Nome é uma informação obrigatória.") //Define qual mensagem será exibida caso a validação da coluna falhar
  private String nome;

  @Column(nullable = false, length = 150)
  @NotBlank(message = "Tipo é uma informação obrigatória.")
  private String tipo;

  @Column(nullable = false, length = 150)
  @NotBlank(message = "Preço é uma informação obrigatória.")
  private String preco;

  @Column(nullable = false)
  @Lob
  @NotBlank(message = "Texto é uma informação obrigatória.")
  private String texto;

  @Column(nullable = false)
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @NotNull(message = "Data é uma informação obrigatória.")
  private Date data;



  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getPreco() { return preco; }

  public void setPreco(String preco) { this.preco = preco; }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

}




