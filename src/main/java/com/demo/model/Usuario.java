package com.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String direccion;
    private String email;


}
