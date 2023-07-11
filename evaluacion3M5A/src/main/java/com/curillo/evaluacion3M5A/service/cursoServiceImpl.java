/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curillo.evaluacion3M5A.service;

import com.curillo.evaluacion3M5A.model.Curso;
import com.curillo.evaluacion3M5A.repository.cursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan
 */
@Service
public class cursoServiceImpl extends GenericServiceImpl<Curso, Long> implements GenericService<Curso, Long> {

    @Autowired
    cursoRepository repository;

    @Override
    public CrudRepository<Curso, Long> getDao() {
        return repository;
    }
}
