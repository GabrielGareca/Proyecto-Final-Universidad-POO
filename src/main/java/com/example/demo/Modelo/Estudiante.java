package com.example.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Estudiante extends Base {
    @Basic
    private int dni;
    private int aspiranteAGrado;
    private String nombre;
    private String apellido;



    @ManyToOne
    @JsonIgnore
    private ProyectoDeGrado proyectoDeGrado;

    @ManyToOne
    @JsonIgnore
    private EjecucionDelProyecto ejecucionDelProyecto;

    @OneToMany
    @JsonIgnore
    private List<PersonalDocente> personalDocente;

    @ManyToMany(mappedBy = "estudiante")
    @JsonIgnore
    private List<Universidad>universidad;

    @ManyToMany(mappedBy = "estudiante")
    @JsonIgnore
    private List<Soluciones>soluciones;

}
