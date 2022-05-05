package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name= "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long Id;
	
	@NotNull
	public String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL )
	@JsonIgnoreProperties("categoria")
	public List<ProdutosModel> produtosmodel;
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<ProdutosModel> getProdutosmodel() {
		return produtosmodel;
	}
	public void setProdutosmodel(List<ProdutosModel> produtosmodel) {
		this.produtosmodel = produtosmodel;
	}
	
}
