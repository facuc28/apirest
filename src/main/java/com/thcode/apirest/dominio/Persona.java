package com.thcode.apirest.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Persona")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Persona implements Serializable {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_persona;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String documento;
}
