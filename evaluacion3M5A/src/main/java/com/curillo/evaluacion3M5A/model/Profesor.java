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
//@Document(collection = "Profesor")
@Data
public class Profesor {

    @Id
    private Long prof_Id;
    private Long depto_Id;
    private String direccion;
    private String Telefono;

    private List<Curso> cursos;

}
