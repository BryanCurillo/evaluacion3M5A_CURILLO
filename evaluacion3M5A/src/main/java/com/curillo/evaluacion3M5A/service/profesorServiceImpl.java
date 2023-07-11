/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curillo.evaluacion3M5A.service;

import com.curillo.evaluacion3M5A.model.Profesor;
import com.curillo.evaluacion3M5A.repository.profesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan
 */
@Service
public class profesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements GenericService<Profesor, Long> {

    @Autowired
    profesorRepository repository;

    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return repository;
    }

}
