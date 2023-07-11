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
//@Document(collection = "Curso")
@Data
public class Curso {
    @Id
    private Long curso_Id;
    private Long prof_Id;
    private String nombre;
    private String nivel;
    private String descripcion;

}
