package br.com.findpecas.service;

import java.util.List;

import br.com.findpecas.model.Busca;

public interface IBuscaService {
	
	/**
	 * M�todo que adiciona uma busca 
	 * no banco de dados.
	 * 
	 * @param busca
	 */
	void adicionar(Busca busca);
	
	/**
	 * M�todo respons�vel por editar uma busca salva no 
	 * banco. A busca s� pode ser editada at� que receba
	 * o primeiro or�amento de alguma empresa.
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
