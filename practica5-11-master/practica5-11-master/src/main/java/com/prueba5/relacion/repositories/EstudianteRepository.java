package com.prueba5.relacion.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.*;
import com.prueba5.relacion.models.*;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel,Long>{
    
}
