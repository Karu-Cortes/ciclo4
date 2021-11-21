//es una forma de crear tablas desde VSC a MYSQL 

package com.example.practica0411.models;

import javax.persistence.*;

@Entity
@Table(name="personas")
public class PersonaModel {

    @Id  //define la llave primaria
    @GeneratedValue(strategy=GenerationType.IDENTITY) // se identifica como variable autoincrementable 
    @Column(unique = true,nullable = false) //unique sería que es un valor único 

    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public Integer getEdad(){
        return edad;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }


}
