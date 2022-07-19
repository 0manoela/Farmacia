package com.generation.farmacia.farmacia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
	@NotNull
	@Size(min = 5,max =100,message="no minimo 5 letras e no maximo 100 letras")
 private String nome;
	@NotNull
 private double preco;
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataVencimento = new java.sql.Date(System.currentTimeMillis());
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categorias;
	
	@NotNull
	@Size(min = 5,max =500,message="no minimo 5 letras e no maximo 500 letras")
 private String provedores;

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Categoria getCategorias() {
		return categorias;
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}

	public String getProvedores() {
		return provedores;
	}

	public void setProvedores(String provedores) {
		this.provedores = provedores;
	}
}