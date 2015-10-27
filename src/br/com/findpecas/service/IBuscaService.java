package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Busca;

public interface IBuscaService {
	
	/**
	 * Método que adiciona uma busca 
	 * no banco de dados.
	 * 
	 * @param busca
	 */
	void adicionar(Busca busca);
	
	/**
	 * Método responsável por editar uma busca salva no 
	 * banco. A busca só pode ser editada até que receba
	 * o primeiro orçamento de alguma empresa.
	 * 
	 * @param busca
	 */
	void editar(Busca busca);
	
	/**
	 * Consulta uma busca por seu id.
	 * 
	 * @param id
	 * @return Busca
	 */
	Busca buscarPorId(Integer id);
	
	/**
	 * Exclui uma busca salva no banco.
	 * 
	 * @param busca
	 */
	void excluir(Busca busca);
	
}
