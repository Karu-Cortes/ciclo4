package com.many.tablasunidas.repositories;

import com.many.tablasunidas.models.ProductoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel,Long> {
    
}
