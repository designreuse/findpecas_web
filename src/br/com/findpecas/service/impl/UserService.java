package br.com.findpecas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.findpecas.dao.IUserDAO;
import br.com.findpecas.service.IUserService;

@Service("userServiceImpl")
public class UserService implements IUserService {

	@Autowired
	private IUserDAO userDao;
}
