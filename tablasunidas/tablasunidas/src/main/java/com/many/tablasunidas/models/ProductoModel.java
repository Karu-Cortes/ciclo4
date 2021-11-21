package com.many.tablasunidas.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="productos")

public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String nombre;
    private String descripcion;
    private Integer cantidad;

    
    @ManyToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
    private List<UsuarioModel> usuarios;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
