package br.com.findpecas.dao;

import java.util.List;

public interface IDAOGenerico<T> {
	
	void adicionar(T t);
	void editar(T t);
	List<T> listar();
	T buscarPorId(Integer id);
	void excluir(T t);
	

}
