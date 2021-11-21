package com.many.tablasunidas.models;


import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="usuarios")

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;

    @ManyToMany(mappedBy = "usuarios", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<ProductoModel> productos;
    
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

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
