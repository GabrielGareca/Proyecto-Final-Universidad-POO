package com.example.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class ProyectoDeGrado extends Base {
    @Basic
    private String titulo;
    private String alcance;
    private int costo;
    private String objetivo;
    private String planDelProyecto;
    private int tiempoDeRealizacion;
    private int viabilidad;

    @OneToOne
    @JsonIgnore
    private Soluciones soluciones;

    @OneToOne
    @JsonIgnore
    private EjecucionDelProyecto ejecucionDelProyecto;

    @OneToMany(mappedBy = "proyectoDeGrado")
    @JsonIgnore
    private List<Estudiante> estudiante = new ArrayList();

}
