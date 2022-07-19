package com.generation.farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.farmacia.model.Categoria;


@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);


	public Object findAllByDescricaoContainingIgnoreCase(String tipo);
}