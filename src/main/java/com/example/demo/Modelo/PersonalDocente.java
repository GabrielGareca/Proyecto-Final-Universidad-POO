package com.example.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class PersonalDocente extends Base{
    @Basic
    private int dni;
    private String conocimiento;
    private String experiencia;
    private String nombre;
    private String apellido;
    private int trayectoria;

    @ManyToOne
    @JsonIgnore
    private EjecucionDelProyecto ejecucionDelProyecto;

    @ManyToOne
    @JsonIgnore
    private Estudiante estudiante;

    @ManyToOne
    @JsonIgnore
    private Recopilacion recopilacion;

    @ManyToMany(mappedBy="personalDocente")
    @JsonIgnore
    private List<Universidad> universidad = new ArrayList();

}
