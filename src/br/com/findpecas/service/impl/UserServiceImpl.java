package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.findpecas.dao.IUserDAO;
import br.com.findpecas.service.IUserService;

@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements IUserService {
	// ATRIBUTOS ------------------
	
	@Autowired
	private IUserDAO userDao;
	
	// MÉTODOS ------------------
	
}
