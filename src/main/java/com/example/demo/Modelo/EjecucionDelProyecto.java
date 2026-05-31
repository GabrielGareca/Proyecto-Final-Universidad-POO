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
public class EjecucionDelProyecto extends Base{
    @Basic
    private String proyecteDeGradoTerminado;
    private int recursosDisponibles;


    @OneToOne
    @JsonIgnore
    private Resultados resultados = new Resultados();


    @OneToMany
    @JsonIgnore
    private List<Estudiante> estudiante = new ArrayList();


    @OneToMany
    @JsonIgnore
    private List<PersonalDocente>personalDocente = new ArrayList();

}
