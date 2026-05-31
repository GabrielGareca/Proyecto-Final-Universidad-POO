package com.example.demo.Controlador;

import com.example.demo.Modelo.Estudiante;
import com.example.demo.Servicios.EstudianteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/estudiantes")
public class CtrlEstudiante extends  BaseControllerImpl<Estudiante, EstudianteServiceImpl, Long> {

    public CtrlEstudiante(EstudianteServiceImpl servicio) {

        super(servicio);
    }
}
