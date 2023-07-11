/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curillo.evaluacion3M5A.controller;

import com.curillo.evaluacion3M5A.service.departamentoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curillo.evaluacion3M5A.model.Departamento;

/**
 *
 * @author Bryan
 */
@RestController
@RequestMapping("/api/dpto")
public class departamentoController {

    @Autowired
    departamentoServiceImpl service;
    
    @GetMapping("/listar")
    public ResponseEntity<List<Departamento>> listar() {
        return new ResponseEntity<>(service.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Departamento> crear(
            @RequestBody Departamento d) {
        return new ResponseEntity<>(service.save(d),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Departamento> actualizar(@PathVariable Long id, @RequestBody Departamento d) {
        Departamento dptoEncontrado = service.findById(id);
        if (dptoEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                dptoEncontrado.setNombre(d.getNombre());
                dptoEncontrado.setDescripcion(d.getDescripcion());
                dptoEncontrado.setDirector(d.getDirector());
                dptoEncontrado.setProfesores(d.getProfesores());
                return new ResponseEntity<>(service.save(d), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Departamento> eliminar(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
