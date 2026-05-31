package com.example.demo.Servicios;

import com.example.demo.Modelo.Universidad;
import com.example.demo.Repositorio.BaseRepository;
import com.example.demo.Repositorio.UniversidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversidadServiceImpl extends BaseServiceImpl<Universidad, Long> implements UniversidadService{

    @Autowired
    UniversidadRepository universidadRepository;

    public UniversidadServiceImpl(BaseRepository<Universidad, Long> baseRepository, UniversidadRepository universidadRepository) {
        super(baseRepository);
        this.universidadRepository = universidadRepository;
    }
    @Override
    public Object search(String filtro) throws Exception {
        return null;
    }
}
