/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.curillo.evaluacion3M5A.repository;

import com.curillo.evaluacion3M5A.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Bryan
 */
public interface profesorRepository extends MongoRepository<Profesor, Long> {

}
