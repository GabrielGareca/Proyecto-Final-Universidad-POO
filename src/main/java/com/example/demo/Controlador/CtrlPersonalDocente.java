package com.example.demo.Controlador;

import com.example.demo.Modelo.Estudiante;
import com.example.demo.Modelo.PersonalDocente;
import com.example.demo.Servicios.EstudianteServiceImpl;
import com.example.demo.Servicios.PersonalDocenteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/docentes")
public class CtrlPersonalDocente extends  BaseControllerImpl<PersonalDocente, PersonalDocenteServiceImpl, Long> {
    public CtrlPersonalDocente(PersonalDocenteServiceImpl servicio) {
        super(servicio);
    }
}
