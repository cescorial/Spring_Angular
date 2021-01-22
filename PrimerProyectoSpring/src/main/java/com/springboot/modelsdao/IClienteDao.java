package com.springboot.modelsdao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long> {

}
