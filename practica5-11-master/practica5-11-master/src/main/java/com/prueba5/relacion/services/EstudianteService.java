package com.prueba5.relacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba5.relacion.repositories.*;
import com.prueba5.relacion.models.*;
import java.util.ArrayList;

@Service
public class EstudianteService {
    
    @Autowired
    EstudianteRepository estudianteRepository;

    public ArrayList<EstudianteModel> getEstudiantes() {
        return (ArrayList<EstudianteModel>) estudianteRepository.findAll();
    }
}
