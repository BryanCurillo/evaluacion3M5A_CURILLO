/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curillo.evaluacion3M5A.service;

import com.curillo.evaluacion3M5A.model.Departamento;
import com.curillo.evaluacion3M5A.repository.departamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan
 */
@Service
public class departamentoServiceImpl extends GenericServiceImpl<Departamento, Long> implements GenericService<Departamento, Long> {

    @Autowired
    departamentoRepository repository;

    @Override
    public CrudRepository<Departamento, Long> getDao() {
        return repository;
    }

}
