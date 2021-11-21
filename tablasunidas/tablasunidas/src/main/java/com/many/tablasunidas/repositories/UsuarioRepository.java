package com.many.tablasunidas.repositories;

import com.many.tablasunidas.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long>  {
    
}
