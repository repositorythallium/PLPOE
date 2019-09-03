package br.plataformalancamento.pontoeletronico.repository;

import java.util.List;

public interface BaseInterfaceRepository<T> {
	public T persist(T entity);
	public T delete(T entity);
	public T update(T entity);
	public List<T> findAll();
	public T findOne(Long codigo);
	public T findOne(String nome);
}
