package com.springboot.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.entity.Cliente;
import com.springboot.modelsdao.IClienteDao;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	

	public List<Cliente> findAll() {
		
		return (List<Cliente>)clienteDao.findAll();
	}



	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}



	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}



	public void delete(Long id) {
		clienteDao.deleteById(id);	
	}
	

}
