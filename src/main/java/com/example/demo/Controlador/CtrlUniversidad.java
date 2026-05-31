package com.example.demo.Controlador;

import com.example.demo.Modelo.Universidad;
import com.example.demo.Servicios.UniversidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/universidad")
public class CtrlUniversidad extends BaseControllerImpl<Universidad, UniversidadServiceImpl, Long>{

    public CtrlUniversidad(UniversidadServiceImpl servicio) {
        super(servicio);
    }
}
