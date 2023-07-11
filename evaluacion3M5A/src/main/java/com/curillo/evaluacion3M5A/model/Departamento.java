/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curillo.evaluacion3M5A.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Bryan
 */
@Document(collection = "Departamento")
@Data
public class Departamento {

    @Id
    private Long depto_Id;
    private String nombre;
    private String director;
    private String descripcion;

    private List<Profesor> profesores;

}
