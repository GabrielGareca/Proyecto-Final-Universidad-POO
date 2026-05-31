package com.example.demo.Servicios;

import com.example.demo.Modelo.Estudiante;
import com.example.demo.Repositorio.BaseRepository;
import com.example.demo.Repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl extends BaseServiceImpl<Estudiante, Long> implements EstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(BaseRepository<Estudiante, Long> baseRepository, EstudianteRepository estudianteRepository) {
        super(baseRepository);
        this.estudianteRepository = estudianteRepository;
    }
    @Override
    public Object search(String filtro) throws Exception {
        return null;
    }
}
