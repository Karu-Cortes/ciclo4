package com.prueba5.relacion.controllers;

import java.util.ArrayList;

import com.prueba5.relacion.models.EstudianteModel;
import com.prueba5.relacion.services.EstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    EstudianteService estudianteService;

    @GetMapping
    public ArrayList<EstudianteModel> traerEstudiantes(){
        return estudianteService.getEstudiantes();
    } 
}
