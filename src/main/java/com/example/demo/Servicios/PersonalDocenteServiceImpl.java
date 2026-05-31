package com.example.demo.Servicios;

import com.example.demo.Modelo.PersonalDocente;
import com.example.demo.Repositorio.BaseRepository;
import com.example.demo.Repositorio.PersonalDocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDocenteServiceImpl extends BaseServiceImpl<PersonalDocente, Long> implements PersonalDocenteService {

    @Autowired
    private PersonalDocenteRepository personalDocenteRepository;

    public PersonalDocenteServiceImpl(BaseRepository<PersonalDocente, Long> baseRepository, PersonalDocenteRepository personalDocenteRepository) {
        super(baseRepository);
        this.personalDocenteRepository = personalDocenteRepository;
    }
    @Override
    public Object search(String filtro) throws Exception {
        return null;
    }
}
